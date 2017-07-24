package com.angular.angular;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class Controller {
	Book book = new Book();
	
	@RequestMapping(value = "/print/{name_book}", method = RequestMethod.GET)
	public String setBook(@PathVariable String name_book){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
		book.setName(name_book);
		
		return "Book name is "+book.getName();
	}
}
