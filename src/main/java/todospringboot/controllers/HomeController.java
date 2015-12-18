package todospringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
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
	public String todoIndex() {
		return "/todolist-index.html";
	}

	@RequestMapping(value = "/todolist/create", method = RequestMethod.GET)
	public String todoCreate() {
		return "/todolist-create.html";
	}
	@RequestMapping(value = "/todolist/update", method = RequestMethod.GET)
	public String todoUpdate() {
		return "/todolist-update.html";
	}
	@RequestMapping(value = "/todolist/delete", method = RequestMethod.GET)
	public String todoDelete() {
		return "/todolist-delete.html";
	}
}
