import java.sql.*;

public class ConexionTest {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@//192.168.254.215:1521/orcl";
        String user = "ica555";
        String pass = "ica555";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement()) {
            System.out.println("Conexión exitosa!");
            ResultSet rs = st.executeQuery("SELECT USER FROM DUAL");
            if (rs.next()) System.out.println("Usuario conectado: " + rs.getString(1));
        } catch (SQLException e) {
            System.out.println("ERROR de conexión:");
            e.printStackTrace();
        }
    }
}

