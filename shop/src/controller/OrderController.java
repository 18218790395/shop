package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.CartService;
import service.OrderService;
import entity.Cart;
import entity.Order;
import entity.Orderandcart;

@Controller
@RequestMapping("order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private CartService cartService;

	@RequestMapping("success")
	public String success(Order order, Orderandcart orderandcart,
			HttpSession session) {
		Random ran = new Random();
		int num = ran.nextInt(1000000000);
		String id = "16246776" + num;
		SimpleDateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd ");
		order.setId(id);
		order.setDate(dateFormat.format(new Date()));
		orderService.addOrder(order);

		List<Cart> carts = cartService.list();
		for (Cart c : carts) {
			orderandcart.setId(id);
			orderandcart.setName(c.getName());
			orderandcart.setNum(c.getNum());
			orderandcart.setPrice(c.getPrice());
			orderService.addOrderandcart(orderandcart);
		}
		session.setAttribute("num", id);
		return "success";
	}

	@RequestMapping("order_list")
	public ModelAndView order_list() {
		ModelAndView mv = new ModelAndView("order_list");
		List<Order> orders = orderService.list();
		mv.addObject("orders", orders);
		return mv;
	}

	@RequestMapping("order_detail")
	public ModelAndView order_detail(Orderandcart id, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		List<Orderandcart> orderandcarts = orderService.order_detail(id);
		double price = 0;
		for (Orderandcart orderandcart : orderandcarts) {
			price = price + orderandcart.getPrice();
		}
		session.setAttribute("price", price);
		mv.addObject("orderandcarts", orderandcarts);
		mv.setViewName("order_detail");
		return mv;
	}

}
