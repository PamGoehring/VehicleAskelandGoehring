package edu.dmacc.spring.vehicleaskelandgoehring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RenterController {
	
@RequestMapping(value="/form")
public ModelAndView user() {
	ModelAndView modelAndView = new ModelAndView();
	
	modelAndView.setViewName("renterForm");
	modelAndView.addObject("renter", new Renter());
	
	return modelAndView;
}


}
