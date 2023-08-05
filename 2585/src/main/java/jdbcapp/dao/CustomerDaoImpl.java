package jdbcapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.CallableStatement;

import jdbcapp.dto.Customer;
import jdbcapp.util.DBConnectionUtil;

public class CustomerDaoImpl implements CustomerDao {
	private int customerId;

	public Customer getCustomerByID(Integer customerId, Customer Customer) {
		try {
			PreparedStatement pstm=DBConnectionUtil.getDBConnection().prepareStatement("select *from customer where customer Id=? ");
					pstm.setInt(1, customerId);
			        ResultSet rs=pstm.executeQuery();
			        if(rs.next()) {
			        	Customer.setCustomerId(rs.getInt(1));
			        	Customer.setCustomerName(rs.getString("customerName"));
			        	Customer.setEmail(rs.getString("email"));
			        	Customer.setMobile(rs.getLong("mobile"));
			        	Customer.setBirthDate(rs.getDate(3).toLocalDate());

			        }}catch (SQLException e) {
						e.printStackTrace();
					}
					return Customer;
			        
		}
	
	
	
	

	public Integer addCustomer1(Customer customer) {
		int row = 0;
		try {
			PreparedStatement preparedStatement = DBConnectionUtil.getDBConnection()
			.prepareStatement("INSERT INTO CUSTOMER(CustomerId,CustomerName,BirthDate,Mobile,email) VALUES (?,?,?,?,?)");
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setDate(3, Date.valueOf(customer.getBirthDate()));
			preparedStatement.setLong(4, customer.getMobile());
			preparedStatement.setString(5, customer.getEmail());
			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;

	}

	public Integer updateCustomer(Customer customer) {
		int row = 0;
		try {
			PreparedStatement preparedStatement = DBConnectionUtil.getDBConnection()
			.prepareStatement("update  customer set customerName=?,BirthDate=?,Mobile=?,email=?");
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setDate(3, Date.valueOf(customer.getBirthDate()));
			preparedStatement.setLong(4, customer.getMobile());
			preparedStatement.setString(5, customer.getEmail());
			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
					 
			        
		}

	

	public Integer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteCustomer(Customer customer) {
		int row=0;
		try {
			PreparedStatement satm=DBConnectionUtil.getDBConnection().prepareStatement("delete *from customer where customer Id=? ");
					satm.setInt(1, customerId);
					row=satm.executeUpdate();
			        

			        }catch (SQLException e) {
						e.printStackTrace();
					}
					return row;
			        
		}
	public void addCustomerUsingSP(Customer customer) {
		try {
			java.sql.CallableStatement cstmt = DBConnectionUtil.getDBConnection().prepareCall("{call add_customer(?,?,?,?,?)}");
			cstmt.setInt(1, customer.getCustomerId());
			cstmt.setString(2, customer.getCustomerName());
			cstmt.setDate(3, Date.valueOf(customer.getBirthDate()));
			cstmt.setLong(4, customer.getMobile());
			cstmt.setString(5, customer.getEmail());
			cstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
