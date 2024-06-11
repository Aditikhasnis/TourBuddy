package tms.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tms.demo.model.Hotel;

@Repository
public class HotelRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/tms2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "aditi031078";

    public List<Hotel> getAllHotels() {
        List<Hotel> hotels = new ArrayList<>();
        String sql = "SELECT * FROM hotels";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String hotelName = rs.getString("hotel_name");
                int persons = rs.getInt("persons");
                int days = rs.getInt("days");
                boolean ac = rs.getBoolean("ac");
                boolean foodIncluded = rs.getBoolean("food_included");
                double totalPrice = rs.getDouble("total_price");

                Hotel hotel = new Hotel();
                hotel.setHotelName(hotelName);
                hotel.setPersons(persons);
                hotel.setDays(days);
                hotel.setAc(ac);
                hotel.setFoodIncluded(foodIncluded);
                hotel.setTotalPrice(totalPrice);
                
                hotels.add(hotel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        }

        return hotels;
    }
    
    public void addHotel(Hotel hotel) {
        String sql = "INSERT INTO hotels (hotel_name, persons, days, ac, food_included, total_price) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, hotel.getHotelName());
            stmt.setInt(2, hotel.getPersons());
            stmt.setInt(3, hotel.getDays());
            stmt.setBoolean(4, hotel.isAc());
            stmt.setBoolean(5, hotel.isFoodIncluded());
            stmt.setDouble(6, hotel.getTotalPrice());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        }
    }
}
