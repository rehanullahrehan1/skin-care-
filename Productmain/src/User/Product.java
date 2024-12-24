package User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class Product {

    private static final String DatabaseConnector = null;
	private int id;
    private String name;
    private String ingredients;
    private int quantity;
    private LocalDate expiryDate;
    private LocalDate mfgDate;
    private double price;

    public Product(int id, String name, String ingredients, int quantity,
                   LocalDate expiryDate, LocalDate mfgDate, double price) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.mfgDate = mfgDate;
        this.price = price;
    }

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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDate getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(LocalDate mfgDate) {
        this.mfgDate = mfgDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

public void addProduct(Product product) {
    String sql = "INSERT INTO products (id, name, ingredients, quantity, expiry_date, mfg_date, price) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    try (Connection conn =JdbcConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setInt(1, product.getId());
        pstmt.setString(2, product.getName());
        pstmt.setString(3, product.getIngredients());
        pstmt.setInt(4, product.getQuantity());
        pstmt.setDate(5, java.sql.Date.valueOf(product.getExpiryDate()));
        pstmt.setDate(6, java.sql.Date.valueOf(product.getMfgDate()));
        pstmt.setDouble(7, product.getPrice());

        pstmt.executeUpdate();
        System.out.println("Product added successfully!");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

public String getCategory() {
	 String category = "facewash";
	 return category;
}

public static Object stream() {
	// TODO Auto-generated method stub
	return null;
}


}
