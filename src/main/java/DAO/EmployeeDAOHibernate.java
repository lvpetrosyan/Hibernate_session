package DAO;

import POJO.Employee;
import UTIL.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDAOHibernate implements EmployeeDao {
    @Override
    public Employee findBuId(int id) {
        try(Session session= HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            return session.get(Employee.class, id);
        }
    }

    @Override
    public List<Employee> getAllObjectInEmployee() {
        try(Session session= HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            return session.createQuery("from Employee ").list();
        }
    }

    @Override
    public void addToEmployee(Employee employee) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(employee);
        tx1.commit();
        session.close();

    }

    @Override
    public void updateByIdEmployee(int id, Employee employee) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        employee.setId(id);
        session.update(employee);
        tx1.commit();
        session.close();
    }

    @Override
    public void deleteEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction tx1 = session.beginTransaction();
            session.delete(employee);
            tx1.commit();
        }
    }
}
