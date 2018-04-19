package es.blog.springBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String getIndexPage() {
		return "rp-app/index.html";
	}
}
