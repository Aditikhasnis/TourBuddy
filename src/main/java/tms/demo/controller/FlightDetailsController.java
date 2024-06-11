package tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tms.demo.model.Flight;
import tms.demo.repository.FlightRepository;

import java.util.List;

@Controller
public class FlightDetailsController {

    private final FlightRepository flightRepository;

    public FlightDetailsController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @GetMapping("/flight-details")
    public String getFlightDetails(@RequestParam String destination, Model model) {
        List<Flight> flights = flightRepository.getFlightsByDestination(destination);
        model.addAttribute("destination", destination);
        model.addAttribute("flights", flights);
        return "flight-details";
    }
}
