package edu.dmacc.spring.vehicleaskelandgoehring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VehicleController {
	@RequestMapping(value ="/form")
		public ModelAndView vehicle() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("vehicleForm");
			modelAndView.addObject("vehicle", new Vehicle());
			return modelAndView;
	}
}
