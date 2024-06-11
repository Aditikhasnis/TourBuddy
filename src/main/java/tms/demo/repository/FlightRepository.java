package tms.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tms.demo.model.Flight;

@Repository
public class FlightRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/tms2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "aditi031078";

    public List<Flight> getFlightsByDestination(String destination) {
        List<Flight> flights = new ArrayList<>();
        String sql = "SELECT * FROM flights WHERE destination = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, destination);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String airline = rs.getString("airline");
                    String flightNumber = rs.getString("flight_number");
                    String departure = rs.getString("departure");
                    String arrival = rs.getString("arrival");
                    String duration = rs.getString("duration");

                    Flight flight = new Flight(airline, flightNumber, departure, arrival, duration);
                    flights.add(flight);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        }

        return flights;
    }
}
