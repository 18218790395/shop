package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.ListService;
import service.UserService;
import entity.Product;
import entity.User;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private ListService listService;

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping("toLogin")
	public ModelAndView toLogin(User user, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		User loginuser = userService.login(user);
		if (loginuser == null) {
			mv.addObject("msg", "用户名或密码错误");
			mv.setViewName("login");
		} else {
			session.setAttribute("user", loginuser);
			List<Product> products = listService.list();
			mv.addObject("products", products);
			mv.setViewName("index");
		}
		return mv;
	}

	@RequestMapping("regist")
	public String regist() {
		return "regist";
	}

	@RequestMapping("checkName")
	public ModelAndView checkName(User user) {
		ModelAndView mv = new ModelAndView();
		User registeruser = userService.checkName(user);
		if (registeruser != null) {
			mv.addObject("msg", "用户名已存在");
			mv.setViewName("regist");
		} else {
			userService.register(user);
			mv.setViewName("login");
		}
		return mv;
	}

	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		List<Product> products = listService.list();
		mv.addObject("products", products);
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/product/list";
	}

}
