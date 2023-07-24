import DAO.EmployeeDAOHibernate;

public class Application {
    public static void main(String[] args) {
        EmployeeDAOHibernate employeeDAOHibernate =  new EmployeeDAOHibernate();
    //    System.out.println(employeeDAOHibernate.findBuId(45));
        System.out.println(employeeDAOHibernate.getAllObjectInEmployee());

    }
}
