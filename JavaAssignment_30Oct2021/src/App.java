public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        AssignmentQuestions assignment = new AssignmentQuestions();
        try {
            // assignment.insertEmployee("simran rajput", "simran@gmail.com", "9354860981",
            // 15000, "1998/04/15",
            // "simranrajput12345");
            // System.out.println(assignment.getAllEmployees());
            // System.out.println(assignment.getEmployeeById(4).getFullName());
            // System.out.println(assignment.getEmployeesDOBwise("1998-01-01", "2021-01-01").get(3).getFullName());
            // System.out.println(assignment.getEmployeesSalaryWise('=', 20000).size());
            // System.out.println(assignment.getEmployeesSalaryWise('=', 20000).get(0).getFullName());
            System.out.println(assignment.ForgetPassword("newPassword", 2));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
