import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AssignmentQuestions {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/javaassignment06112021?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "sagarboss12345";
    private static final String INERT_USER_QUERY = "insert into employees(fullName, email, phone, salary, dob, password) values (?, ?, ?, ?, ?, ?)";
    private static final String GET_ALL_EMPLOYEES_QUERY = "SELECT * FROM employees";
    private static final String SELECT_EMPLOYEE_BY_ID = "SELECT * FROM employees WHERE id = ?";
    private static final String FILTER_EMPLOYE_ON_DOB = "SELECT * FROM employees WHERE dob BETWEEN ? AND ?";
    private static final String FILTER_EMPLOYEE_ON_SALARY = "SELECT * FROM employees WHERE salary ? ?";
    private static final String FORGOT_PASSWORD = "UPDATE employees SET password = ? WHERE id = ?";

    protected Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.jdbcUrl, this.jdbcUsername, this.jdbcPassword);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public void insertEmployee(String fullName, String email, String phone, int salary, String dob, String password)
            throws SQLException {
        try (Connection con = this.getConnection(); PreparedStatement ps = con.prepareStatement(INERT_USER_QUERY)) {
            ps.setString(1, fullName);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setLong(4, salary);
            ps.setString(5, dob);
            ps.setString(6, password);
            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ArrayList<Employee> getAllEmployees() throws SQLException {
        ArrayList<Employee> employees = new ArrayList<>();
        try (Connection con = this.getConnection();
                PreparedStatement ps = con.prepareStatement(GET_ALL_EMPLOYEES_QUERY)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String dob = rs.getString("dob");
                int salary = rs.getInt("salary");
                String password = rs.getString("password");
                Employee tempEmployee = new Employee(fullName, email, phone, dob, password, salary);
                employees.add(tempEmployee);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return employees;
    }

    public Employee getEmployeeById(int myId) throws SQLException {
        try (Connection con = this.getConnection();
                PreparedStatement ps = con.prepareStatement(SELECT_EMPLOYEE_BY_ID)) {
            ps.setInt(1, myId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String dob = rs.getString("dob");
                int salary = rs.getInt("salary");
                String password = rs.getString("password");
                Employee tempEmployee = new Employee(fullName, email, phone, dob, password, salary);
                return tempEmployee;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<Employee> getEmployeesDOBwise(String fromDate, String toDate) {
        ArrayList<Employee> employees = new ArrayList<>();
        try (Connection con = this.getConnection();
                PreparedStatement ps = con.prepareStatement(FILTER_EMPLOYE_ON_DOB)) {
            ps.setString(1, fromDate);
            ps.setString(2, toDate);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String dob = rs.getString("dob");
                int salary = rs.getInt("salary");
                String password = rs.getString("password");
                Employee tempEmployee = new Employee(fullName, email, phone, dob, password, salary);
                employees.add(tempEmployee);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return employees;
    }

    public ArrayList<Employee> getEmployeesSalaryWise(char sign, int amount) {
        ArrayList<Employee> employees = new ArrayList<>();
        try (Connection con = this.getConnection();
                PreparedStatement ps = con
                        .prepareStatement("SELECT * FROM employees WHERE salary " + sign + " " + amount)) {
            // ps.setString(1, Character.toString(sign));
            // ps.setCharacterStream(1, amount);
            // ps.setInt(2, amount);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String dob = rs.getString("dob");
                int salary = rs.getInt("salary");
                String password = rs.getString("password");
                Employee tempEmployee = new Employee(fullName, email, phone, dob, password, salary);
                employees.add(tempEmployee);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return employees;
    }

    public int ForgetPassword(String newPassword, int id) {
        try (Connection con = this.getConnection(); PreparedStatement ps = con.prepareStatement(FORGOT_PASSWORD)) {
            ps.setString(1, newPassword);
            ps.setInt(2, id);
            int rs = ps.executeUpdate();
            return rs;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

}
