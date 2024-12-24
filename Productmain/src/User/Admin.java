package User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
public class Admin extends User {
	
	    public Admin(int id, String name, String password, String gender, String email, LocalDate dob) {
	        super(id, email, email, email, email, dob);
	    }

	    // Functions for authorization and content management
	    public void addAuthorization(User user) {
	        
	        try (Connection conn = JdbcConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Authorizations (admin_id, user_id) VALUES (?, ?)")) {
	            pstmt.setInt(1, this.getId()); // Assuming getId() returns the admin's ID
	            pstmt.setInt(2, user.getId()); // Assuming getId() returns the user's ID
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void removeAuthorization(User user) {
	        // Logic to revoke authorization
	        // Database interaction to remove authorization
	        try (Connection conn = JdbcConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement("DELETE FROM Authorizations WHERE admin_id = ? AND user_id = ?")) {
	            pstmt.setInt(1, this.getId()); // Assuming getId() returns the admin's ID
	            pstmt.setInt(2, user.getId()); // Assuming getId() returns the user's ID
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void addContent(String content) {
	        // Logic to add content
	        // Database interaction to add content
	        try (Connection conn = JdbcConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Content (admin_id, content) VALUES (?, ?)")) {
	            pstmt.setInt(1, this.getId()); // Assuming getId() returns the admin's ID
	            pstmt.setString(2, content);
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void removeContent(String content) {
	       
	        try (Connection conn = JdbcConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement("DELETE FROM Content WHERE admin_id = ? AND content = ?")) {
	            pstmt.setInt(1, this.getId()); // Assuming getId() returns the admin's ID
	            pstmt.setString(2, content);
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void updateContent(String content) {
	       
	        try (Connection conn = JdbcConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement("UPDATE Content SET content = ? WHERE admin_id = ?")) {
	            pstmt.setString(1, content);
	            pstmt.setInt(2, this.getId()); // Assuming getId() returns the admin's ID
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    // Additional methods for admin functionalities
	    // ...
	}


