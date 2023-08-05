package jpaappwithannotations.dao;

import java.util.List;

import org.hibernate.Session;

import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jpaappwithannotations.entities.Department;
import jpaappwithannotations.utility.HibernateUtility;

public class DepartmentDAOImpl implements DepartmentDAO {
	Session session = HibernateUtility.getSessionFactory().openSession();
	//Retrieve
	@Override
	public List<Department> getAllDepartment() {
	//select * from department
	//Example of Hibernate Query Language

		return session.createQuery("select d from Department d",Department.class).getResultList();
	}

	//Retrieve by Primary Key
	@Override
	public Department getDepartmentById(Integer deptNo) {
		session.beginTransaction();
		Department dept = session.get(Department.class, deptNo);
		session.getTransaction().commit();
		return dept;
	}

	//Create -- add or insert  data in relational table
	@Override
	public void addDepartment(Department department) {
		session.beginTransaction();
		session.persist(department);
		session.getTransaction().commit();

	}

	@Override
	public Department updateDepartment(Department department) {
		 
		 return null;
	}

	@Override
	public void deleteDepartment(Integer deptNo) {
		// remove
				session.getTransaction().begin();
				Department d = new Department();
				d.setDeptNo(deptNo);
				session.delete(d);
				session.getTransaction().commit();

	}

	@Override
	public Department getDepartmentByName(String deptName) {
		TypedQuery<X> query=session.getNamedQuery("findDepartmentName");
		query.setParameter("name", deptName);
		Department department=(Department) query.getSingleResult();
		return department;
		return null;
	}

	@Override
	public Integer updateDepartmentUsingQuery(Department department) {
		String query ="Update Depratment SET deptName=:dName WHERE deptNO=:	dNO	";
				 session.getTransaction().begin();
		         Query q=session.createQuery(query);
		         q.setParamneter("dName",department.getDeptName());
		         q.setParameter("deptId",department.getDeptNO());
		 		int row=q.executeUpdate();
		 		session.getTransaction().commit();
		 		session.close();
		 		if(row>0) {
		 			return row;
		 		}
		
		return null;
	}

	@Override
	public void deleteDepartmentByName(String deptName) {
     String query="DELETE Department WHERE deptName=:dName";
     session.getTransaction().begin();
     Query q=session.createQuery(query);
     q.setParameter("dName", deptName);
     int row=q.executeUpdate();
     session.getTransaction().commit();
     
	}

}