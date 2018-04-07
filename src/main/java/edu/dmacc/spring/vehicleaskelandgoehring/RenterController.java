package edu.dmacc.spring.vehicleaskelandgoehring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@Controller
public class RenterController {
	@Autowired 	RenterDao dao;
	@Autowired 	VehicleDao vdao;

	private static final String[] vehicleTypes = { "Full-size Car", "Mid-size Car", "Mini-van", "SUV", "Truck" };

	private static final String[] states = { "AK", "AL", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID",
			"IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ",
			"NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV",
			"WI", "WY" };

	// Renter Entry Form
	@RequestMapping(value = "/form")
	public ModelAndView renter() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("renterForm");
		modelAndView.addObject("renter", new Renter());
		modelAndView.addObject("states", states);
		return modelAndView;
	}

	// Vehicle Entry Form
	@RequestMapping(value = "/vehicleForm")
	public ModelAndView vehicle() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("vehicleForm");
		modelAndView.addObject("vehicle", new Vehicle());
		modelAndView.addObject("vehicleTypes", vehicleTypes);
		return modelAndView;
	}

	@RequestMapping(value = "/renterForm")
	public ModelAndView renter1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("renterform");

		return modelAndView;
	}

	// Home page with links to renter and vehicle
	@RequestMapping(value = "/home")
	public ModelAndView main() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("rentalHome");

		return modelAndView;
	}

	// Renter result page
	@RequestMapping(value = "/result")
	public ModelAndView processRenter(Renter renter) {
		System.out.println("In processRenter");
		ModelAndView modelAndView = new ModelAndView();
		dao.insertRenter(renter);
		System.out.println("Value in getfirstName " + renter.getFirstName());
		modelAndView.setViewName("renterResult");
		modelAndView.addObject("r", renter);
		return modelAndView;
	}

	// Vehicle result page
	@RequestMapping(value = "/vehicleResult")
	public ModelAndView processVehicle(Vehicle vehicle) {
		System.out.println("In process Vehicle");
		ModelAndView modelAndView = new ModelAndView();
		vdao.insertVehicle(vehicle);
		System.out.println("Value in getVehicleType " + vehicle.getVehicleType());
		modelAndView.setViewName("vehicleResult");
		modelAndView.addObject("v", vehicle);
		return modelAndView;
	}

	// Renter view all renters page
	@RequestMapping(value = "/viewAllRenters")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Renter> allRenters = dao.getAllRenters();
		modelAndView.setViewName("viewAllRenters");
		modelAndView.addObject("all", allRenters);
		return modelAndView;
	}

	// Vehicle view all vehicles page
	@RequestMapping(value = "/viewAllVehicles")
	public ModelAndView viewAllVehicles() {
		ModelAndView modelAndView = new ModelAndView();
		List<Vehicle> allVehicles = vdao.getAllVehicles();
		modelAndView.setViewName("viewAllVehicles");
		modelAndView.addObject("all", allVehicles);
		return modelAndView;
	}

	@Bean
	public RenterDao dao() {
		RenterDao bean = new RenterDao();
		return bean;
	}

	// vehicle bean
	@Bean
	public VehicleDao vdao() {
		VehicleDao bean = new VehicleDao();
		return bean;
	}

}
