package DAO;

import POJO.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    public Employee findBuId(int id);
    public List<Employee> getAllObjectInEmployee ();
    public void addToEmployee(Employee employee);
    public void updateByIdEmployee(int id, Employee employee);
    public void deleteEmployee(Employee employee);
}

