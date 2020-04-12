package com.rentacar.rental;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyServiceController {

	@RequestMapping(value = "/")
	private String getDate() {

		System.out.println("Got request");
		return "myview";
	}
}
