package todospringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "/home.html";
	}

	@RequestMapping(value = "/about-us", method = RequestMethod.GET)
	public String about() {

		return "/about.html";
	}

	@RequestMapping(value = "/todolist/index", method = RequestMethod.GET)
	public String employeeIndex() {
		return "/todolist-index.html";
	}

	@RequestMapping(value = "/todolist/create", method = RequestMethod.GET)
	public String employeeCreate() {
		return "/todolist-create.html";
	}
	@RequestMapping(value = "/todolist/update", method = RequestMethod.GET)
	public String employeeUpdate() {
		return "/todolist-update.html";
	}
	@RequestMapping(value = "/todolist/delete", method = RequestMethod.GET)
	public String employeeDelete() {
		return "/todolist-delete.html";
	}
}
