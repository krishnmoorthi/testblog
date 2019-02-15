/**
 * 
 */
package com.testblog.testblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author krishnamoorthi
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome() {
		return "home";
	}
}
