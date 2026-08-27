import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class InventoryService {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory";
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "password123";

    public void loadProducts(List<Integer> productIds) {

        for (Integer productId : productIds) {

            try {
                Connection connection = DriverManager.getConnection(
                    DB_URL,
                    DB_USER,
                    DB_PASSWORD
                );

                PreparedStatement statement = connection.prepareStatement(
                    "SELECT id, name, quantity FROM products WHERE id = ?"
                );

                statement.setInt(1, productId);

                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    System.out.println(
                        resultSet.getInt("id") + " - " +
                        resultSet.getString("name") + " - " +
                        resultSet.getInt("quantity")
                    );
                }

            } catch (Exception e) {
                System.out.println("Database error");
            }
        }
    }

    public void loadInventory(List<Integer> productIds) {

        for (Integer id : productIds) {

            try {
                Connection connection = DriverManager.getConnection(
                    DB_URL,
                    DB_USER,
                    DB_PASSWORD
                );

                PreparedStatement statement = connection.prepareStatement(
                    "SELECT stock FROM inventory WHERE product_id = ?"
                );

                statement.setInt(1, id);

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    System.out.println("Stock: " + resultSet.getInt("stock"));
                }

            } catch (Exception e) {
                System.out.println("Inventory lookup failed");
            }
        }
    }
}