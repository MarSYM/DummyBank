package gec.scf.DummyBank;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/holidays") 
public class testcon {
@RequestMapping
(value = "/", method = RequestMethod.GET) 
public String helloHoliday() { return "Hello, Holiday"; }
}
