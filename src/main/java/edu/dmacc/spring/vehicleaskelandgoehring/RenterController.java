package edu.dmacc.spring.vehicleaskelandgoehring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		List<Vehicle> allVehicles = vdao.getAllVehicles();
		modelAndView.setViewName("renterForm");
		modelAndView.addObject("renter", new Renter());
		modelAndView.addObject("states", states);
		modelAndView.addObject("allVehicles", allVehicles);
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
	@RequestMapping(value = "/renterResult")
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
	
	//Renter edit
	@RequestMapping(value = "/renterEditResult")
	public ModelAndView processEditRenter(Renter renter) {
		ModelAndView modelAndView = new ModelAndView();
		dao.editRenter(renter);
		modelAndView.setViewName("renterResult");
		modelAndView.addObject("r", renter);
		return modelAndView;
	}
	//Renter update and delete
	@RequestMapping(value = "/renterUpdate")
	public ModelAndView renterUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		String act = request.getParameter("doThisToRenter"); 
		ModelAndView modelAndView = new ModelAndView();
		 if (act.equals("Edit Selected Renter")) {
			String checkId = request.getParameter("renterId"); 
			System.out.println("id" + checkId);
			
			Integer tempId = Integer.parseInt(request.getParameter("renterId"));
			System.out.println("temp id " + tempId);
			Renter renterToEdit = dao.searchForRenterById(tempId);
			request.setAttribute("renterToEdit", renterToEdit);
			
			modelAndView.setViewName("editRenter");
			modelAndView.addObject("all", renterToEdit);		 
			 
		} else if (act.equals("Delete Selected Renter")) {
			String checkId = request.getParameter("renterId");
			System.out.println("id" + checkId);
			
			Integer tempId = Integer.parseInt(request.getParameter("renterId"));
			Renter renterToDelete = dao.searchForRenterById(tempId);

			dao.deleteRenter(renterToDelete); 
			 List<Renter> allRenters = dao.getAllRenters();
			 modelAndView.setViewName("viewAllRenters");
			 modelAndView.addObject("all", allRenters);  
		}
		 return modelAndView;
	}

	@RequestMapping(value = "/vehicleEditResult")
	public ModelAndView processEditVehicle(Vehicle vehicle) {
		ModelAndView modelAndView = new ModelAndView();
		vdao.editVehicle(vehicle);
		modelAndView.setViewName("vehicleResult");
		modelAndView.addObject("v", vehicle);
		return modelAndView;
	}
	
	@RequestMapping(value = "/vehicleUpdate")
	public ModelAndView vehicleUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		String act = request.getParameter("doThisToVehicle"); 
		ModelAndView modelAndView = new ModelAndView();
		 if (act.equals("Edit Selected Vehicle")) {
			String checkId = request.getParameter("vehicleId"); 
			System.out.println(checkId);
			Integer tempId = Integer.parseInt(request.getParameter("vehicleId"));
			System.out.println("temp id " + tempId);
			Vehicle vehicleToEdit = vdao.searchForVehicleById(tempId);
			request.setAttribute("vehicleToEdit", vehicleToEdit);
			
			modelAndView.setViewName("editVehicle");
			modelAndView.addObject("all", vehicleToEdit);		 
			 
		} else if (act.equals("Delete Selected Vehicle")) {
			String checkId = request.getParameter("vehicleId");
			System.out.println("id" + checkId);
			
			Integer tempId = Integer.parseInt(request.getParameter("vehicleId"));
			Vehicle vehicleToDelete = vdao.searchForVehicleById(tempId);

			vdao.deleteVehicle(vehicleToDelete); 
			 List<Vehicle> allVehicles = vdao.getAllVehicles();
			 modelAndView.setViewName("viewAllVehicles");
			 modelAndView.addObject("all", allVehicles);  
		}
		 return modelAndView;
	}
	
	
	// renter bean
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
