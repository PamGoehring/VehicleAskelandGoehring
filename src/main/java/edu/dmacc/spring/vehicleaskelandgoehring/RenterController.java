package edu.dmacc.spring.vehicleaskelandgoehring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class RenterController {
	@Autowired RenterDao dao;
	
@RequestMapping(value = "/form")
public ModelAndView renter() {
	ModelAndView modelAndView = new ModelAndView();
	
	modelAndView.setViewName("renterForm");
	modelAndView.addObject("renter", new Renter());
	
	return modelAndView;
}

@RequestMapping(value = "/result")
public ModelAndView processUser(Renter renter) {
	System.out.println("In processRenter");
	ModelAndView modelAndView = new ModelAndView();
	dao.insertRenter(renter);
	System.out.println("Value in getfirstName"+ renter.getFirstName());
	modelAndView.setViewName("renterResult");
	modelAndView.addObject("r", renter);
	return modelAndView;
}


}
