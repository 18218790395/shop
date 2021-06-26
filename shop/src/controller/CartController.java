package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.CartService;
import entity.Cart;

@Controller
@RequestMapping("cart")
public class CartController {

	@Autowired
	private CartService cartService;

	@RequestMapping("list")
	public ModelAndView list(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		List<Cart> carts = cartService.list();
		double price = 0;
		for (Cart cart: carts){
			price = price + cart.getPrice();
		}
		mv.addObject("carts", carts);
		mv.setViewName("cart");
		session.setAttribute("price", price);
		return mv;
	}

	@RequestMapping("updateCart")
	public String updateCart(Cart id) {
		cartService.updateCart(id);
		return "redirect:/cart/list";
	}

	@RequestMapping("deleteCart")
	public String deleteCart(Cart id) {
		cartService.deleteCart(id);
		return "redirect:/cart/list";
	}

	@RequestMapping("clearCart")
	public String clearCart() {
		cartService.clearCart();
		return "redirect:/cart/list";
	}

	@RequestMapping("addCart")
	public String addCart(Cart cart) {
		cartService.addCart(cart);
		return "redirect:/user/index";
	}
	
	@RequestMapping("order")
	public ModelAndView order(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		List<Cart> carts = cartService.list();
		double price = 0;
		for (Cart cart: carts){
			price = price + cart.getPrice();
		}
		mv.addObject("carts", carts);
		mv.setViewName("order");
		session.setAttribute("price", price);
		return mv;
	}
	
}
