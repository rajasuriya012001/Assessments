package com.vast.testass1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDao {

	private static final String DB_DRIVER_ClASS = "org.postgresql.Driver";
	private static final String DB_URL = "jdbc:postgresql://Localhost:5432/vastpro";
	private static final String DB_USER = "postgres";
	private static final String DB_PASSWORD = "postgres";
	public static String INSERT="insert into Employee1 (id,emp_id,name,age,designation,phone_number,salary) values(?,?,?,?,?,?,?)";
	public static String UPDATE="update Employee1 salary=?,designations=? where empId=?";
	public static String DELETE="delete from Employee1 where empId=?";
	

	public static Connection getConnection() throws SQLException {

		try {
			Class.forName(DB_DRIVER_ClASS);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return connection;

	}
	public  static int insertEmployee(Employee e) throws SQLException {
		int status = 0;
	
		try {
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps =con.prepareStatement(INSERT);
			ps.setInt(1, e.getId());
			ps.setInt(2,e.getEmp_id());
			ps.setString(3, e.getName());
			ps.setInt(4, e.getAge());
			ps.setString(5, e.getDesignation());
			ps.setInt(6,  e.getPhoneNumber());
			ps.setInt(7, e.getSalary());
			status=ps.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return status;
	}
	public static int update(Employee e) {
		int status = 0;
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement(UPDATE);
			ps.setInt(1, e.getSalary());
			ps.setString(2, e.getDesignation());
			ps.setInt(3, e.getEmp_id());
			;
			ps.setInt(5, e.getId());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement(DELETE);
			ps.setInt(1,id);
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	
	
}
