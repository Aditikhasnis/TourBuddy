// package tms.demo.repository;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;

// import org.springframework.stereotype.Repository;

// import tms.demo.model.BookingDetails;

// @Repository
// public class BookingDetailsRepository {

// private static final String URL = "jdbc:mysql://localhost:3306/tms";
// private static final String USERNAME = "root";
// private static final String PASSWORD = "Dbms1234$";

// public void saveBookingDetails(BookingDetails bookingDetails) {
// String sql = "INSERT INTO booking_details (package_name, number_of_people,
// name, age, gender, location) VALUES (?, ?, ?, ?, ?, ?)";

// try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
// PreparedStatement stmt = conn.prepareStatement(sql)) {

// stmt.setString(1, bookingDetails.getPackageName());
// stmt.setInt(2, bookingDetails.getNumberOfPeople());
// stmt.setString(3, bookingDetails.getName());
// stmt.setInt(4, bookingDetails.getAge());
// stmt.setString(5, bookingDetails.getGender());
// stmt.setString(6, bookingDetails.getLocation());

// stmt.executeUpdate();
// } catch (SQLException e) {
// e.printStackTrace();
// // Handle exceptions
// }
// }
// }
