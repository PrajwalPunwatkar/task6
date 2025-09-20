import java.sql.*;

public class JDBCExample {

    // Database credentials
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";       // replace with your username
    private static final String PASSWORD = "password"; // replace with your password

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1. Connect to database
            conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Connected to database!");

            // 2. Insert a user
            String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, "Prajwal");
            pstmt.setString(2, "prajwal@example.com");
            int rowsInserted = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

            pstmt.close(); // Close insert statement

            // 3. Fetch users
            String selectSQL = "SELECT * FROM users";
            pstmt = conn.prepareStatement(selectSQL);
            rs = pstmt.executeQuery();
            System.out.println("Users in DB:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println(id + " | " + name + " | " + email);
            }

            // 4. Update a user
            String updateSQL = "UPDATE users SET email=? WHERE name=?";
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, "newemail@example.com");
            pstmt.setString(2, "Prajwal");
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);

            // 5. Delete a user
            String deleteSQL = "DELETE FROM users WHERE name=?";
            pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setString(1, "Prajwal");
            int rowsDeleted = pstmt.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. Close resources
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                System.out.println("Resources closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
