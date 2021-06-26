package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.ListService;
import entity.Product;

@Controller
@RequestMapping("product")
public class ListController {

	@Autowired
	private ListService listService;

	@RequestMapping("list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("list");
		List<Product> products = listService.list();
		mv.addObject("products", products);
		return mv;
	}

}
