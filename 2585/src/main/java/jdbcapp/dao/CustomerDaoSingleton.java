package jdbcapp.dao;

import java.sql.Date;
import java.sql.SQLException;

import jdbcapp.dto.Customer;
import jdbcapp.util.DBConnSingleton;
import jdbcapp.util.DBConnectionUtil;

public class CustomerDaoSingleton {
	public void addCustomerUsingSP(Customer customer) {
		try {
			java.sql.CallableStatement cstmt = DBConnSingleton.getInstance().prepareCall("{call add_customer(?,?,?,?,?)}");
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
}
