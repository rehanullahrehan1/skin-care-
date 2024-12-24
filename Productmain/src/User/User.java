package User;

	import java.time.LocalDate;

	public class User {
	    private int id;
	    private String name;
	    private String password;
	    private String gender;
	    private String email;
	    private LocalDate dob;

	    public User(int id, String name, String password, String gender, String email, LocalDate dob) {
	        this.id = id;
	        this.name = name;
	        this.password = password;
	        this.gender = gender;
	        this.email = email;
	        this.dob = dob;
	    }

	    // Getters and setters for user attributes
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public LocalDate getDob() {
	        return dob;
	    }

	    public void setDob(LocalDate dob) {
	        this.dob = dob;
	    }

	    // Other methods for user functionalities
	    // For example, methods to update user information, change password, etc.
	    // ...

	    // Method to update user's password
	    public void updatePassword(String newPassword) {
	        this.password = newPassword;
	        System.out.println("Password updated successfully!");
	    }

	    // Method to update user's email
	    public void updateEmail(String newEmail) {
	        this.email = newEmail;
	        System.out.println("Email updated successfully!");
	    }

	    // Additional methods based on specific user functionalities
	    // ...
	}


