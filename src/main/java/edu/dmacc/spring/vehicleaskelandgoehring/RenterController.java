package edu.dmacc.spring.vehicleaskelandgoehring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


@Controller
public class RenterController {
	@Autowired RenterDao dao;
	
@RequestMapping(value = "/form")
public ModelAndView renter() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("renterForm");
	modelAndView.addObject("renter", new Renter());
	//Add state drop down logic here and above?
	return modelAndView;
}

@RequestMapping(value = "/renterForm")
public ModelAndView renter1() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("renterform");

	return modelAndView;
}
	
@RequestMapping(value = "/home")
public ModelAndView main() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("rentalHome");
	
	return modelAndView;
}

@RequestMapping(value = "/result")
public ModelAndView processRenter(Renter renter) {
	System.out.println("In processRenter");
	ModelAndView modelAndView = new ModelAndView();
	dao.insertRenter(renter);
	System.out.println("Value in getfirstName"+ renter.getFirstName());
	modelAndView.setViewName("renterResult");
	modelAndView.addObject("r", renter);
	return modelAndView;
}

@Bean
public RenterDao dao() {
	RenterDao bean = new RenterDao();
	return bean;
}


}
