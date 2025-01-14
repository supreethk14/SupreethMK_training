package springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.entity.Flight;
import springmvc.service.FlightService;

@Controller
@RequestMapping("/flights")
public class FlightController {

	@Autowired
	private FlightService flightService;
	
    @GetMapping
	public String home(Model model) {
    	 List<Flight> flights = flightService.getAllFlights();
         model.addAttribute("flights", flights);
		return "index";
	}
	
    @GetMapping("/add")
	public String showAddForm(Model model) {
//		model.addAttribute(null, model);
		return "addFlight";
	}
    
    @PostMapping("/add")
  	public String addFlight(@ModelAttribute Flight flight, Model model) {
//  		model.addAttribute(null, model);
    	flightService.insert(flight);
  		return "redirect:/flights";
  	}
    
    @GetMapping("/details/{id}")
    public String getFlight(@PathVariable("id") Integer id, Model model) {
        Flight flight = flightService.getFlightById(id);
        model.addAttribute("flight", flight);
        return "flightDetails";
    }
    
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Flight flight = flightService.getFlightById(id);
        model.addAttribute("flight", flight);
        return "editFlight";
    }

    @PostMapping("/edit/{id}")
    public String editFlight(@PathVariable("id") Integer id, @ModelAttribute("flight") Flight flight) {
        flight.setFlightId(id);
        flightService.saveFlight(flight);
        return "redirect:/flights";
    }

    @GetMapping("/delete/{id}")
    public String deleteFlight(@PathVariable("id") Integer id) {
        flightService.deleteFlight(id);
        return "redirect:/flights";
    }
}
