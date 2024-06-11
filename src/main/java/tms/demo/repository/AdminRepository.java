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
import tms.demo.model.Customer;
import tms.demo.model.Package;

@Repository
public class AdminRepository {

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
                Hotel hotel = new Hotel();
                hotel.setHotelName(rs.getString("hotel_name"));
                hotel.setPersons(rs.getInt("persons"));
                hotel.setDays(rs.getInt("days"));
                hotel.setAc(rs.getBoolean("ac"));
                hotel.setFoodIncluded(rs.getBoolean("food_included"));
                hotel.setTotalPrice(rs.getDouble("total_price"));
                hotels.add(hotel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hotels;
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM customers";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setUsername(rs.getString("username"));
                customer.setPassword(rs.getString("password"));  // Assuming password field is needed
                     customer.setName(rs.getString("name"));
                customer.setGender(rs.getString("gender"));
                customer.setCountry(rs.getString("country"));
                customer.setPhone(rs.getString("phone"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customers;
    }

    public List<Package> getAllPackages() {
        List<Package> packages = new ArrayList<>();
        String sql = "SELECT * FROM packages";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Package pack = new Package();
                pack.setId(rs.getLong("id"));
                pack.setPackageName(rs.getString("package_name"));
                pack.setPrice(rs.getDouble("price"));
                pack.setPersons(rs.getInt("persons"));
                pack.setCustomerName(rs.getString("customer_name"));
                pack.setCustomerAge(rs.getInt("customer_age"));
                pack.setGender(rs.getString("gender"));
                packages.add(pack);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return packages;
    }
}
