package edu.dmacc.spring.vehicleaskelandgoehring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


@Controller
public class RenterController {
	@Autowired RenterDao dao;

//Renter Entry Form
@RequestMapping(value = "/form")
public ModelAndView renter() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("renterForm");
	modelAndView.addObject("renter", new Renter());
	//Add state drop down logic here and above?
	return modelAndView;
}

//Vehicle Entry Form
@RequestMapping(value = "/vehicleForm")
public ModelAndView vehicle() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("vehicleForm");
	modelAndView.addObject("vehicle", new Vehicle());
	return modelAndView;
}

@RequestMapping(value = "/renterForm")
public ModelAndView renter1() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("renterform");

	return modelAndView;
}

//Home page with links to renter and vehicle
@RequestMapping(value = "/home")
public ModelAndView main() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("rentalHome");
	
	return modelAndView;
}

//Renter result page
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

//Renter view all renters page
@RequestMapping(value = "/viewAllRenters")
public ModelAndView viewAll() {
	ModelAndView modelAndView = new ModelAndView();
	List<Renter> allRenters = dao.getAllRenters();
	modelAndView.setViewName("viewAllRenters");
	modelAndView.addObject("all", allRenters);
	return modelAndView;
}

@Bean
public RenterDao dao() {
	RenterDao bean = new RenterDao();
	return bean;
}


}
