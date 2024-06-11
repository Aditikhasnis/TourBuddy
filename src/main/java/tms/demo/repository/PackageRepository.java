package tms.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tms.demo.model.Package;

@Repository
public class PackageRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/tms2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "aditi031078";

    public List<Package> getAllPackages() {
        List<Package> packages = new ArrayList<>();
        String sql = "SELECT * FROM Packages";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Long id = rs.getLong("id");
                String packageName = rs.getString("package_name");
                double price = rs.getDouble("price");
                int persons = rs.getInt("persons");
                String customerName = rs.getString("customer_name");
                int customerAge = rs.getInt("customer_age");
                String gender = rs.getString("gender");

                Package pkg = new Package(id, packageName, price, persons, customerName, customerAge, gender);
                packages.add(pkg);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        }

        return packages;
    }

    public void addPackage(Package pkg) {
        String sql = "INSERT INTO Packages (package_name, price, persons, customer_name, customer_age, gender) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pkg.getPackageName());
            stmt.setDouble(2, pkg.getPrice());
            stmt.setInt(3, pkg.getPersons());
            stmt.setString(4, pkg.getCustomerName());
            stmt.setInt(5, pkg.getCustomerAge());
            stmt.setString(6, pkg.getGender());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        }
    }
}
