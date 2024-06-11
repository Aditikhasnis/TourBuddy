package tms.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tms.demo.model.Hotel;
import tms.demo.repository.HotelRepository;

@Controller
public class HotelController {

    private final HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/book-hotel")
    public String showHotelBookingForm(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "book-hotel";
    }

    @PostMapping("/book-hotel")
    public String bookHotel(@RequestParam("hotelName") String hotelName,
                            @RequestParam("persons") int persons,
                            @RequestParam("days") int days,
                            @RequestParam("ac") boolean ac,
                            @RequestParam("foodIncluded") boolean foodIncluded,
                            RedirectAttributes redirectAttributes) {

        // Calculate total price based on the selected options
        double totalPrice = calculateTotalPrice(hotelName, persons, days, ac, foodIncluded);

        // Create a Hotel object with the details
        Hotel hotelBooking = new Hotel();
        hotelBooking.setHotelName(hotelName);
        hotelBooking.setPersons(persons);
        hotelBooking.setDays(days);
        hotelBooking.setAc(ac);
        hotelBooking.setFoodIncluded(foodIncluded);
        hotelBooking.setTotalPrice(totalPrice);
        
        // Save the hotel booking to the database
        hotelRepository.addHotel(hotelBooking);

        redirectAttributes.addFlashAttribute("message", "Booking successful!");

        return "redirect:/payment";
    }


    private double calculateTotalPrice(String hotelName, int persons, int days, boolean ac, boolean foodIncluded) {
        // You can implement your logic to calculate the total price based on the selected options
        // This is just a placeholder implementation
        double basePrice = 100.0; // Base price per day
        double acCharge = ac ? 50.0 : 0.0; // Additional charge for AC
        double foodCharge = foodIncluded ? 30.0 : 0.0; // Additional charge for food

        return (basePrice * days + acCharge + foodCharge) * persons;
    }
}