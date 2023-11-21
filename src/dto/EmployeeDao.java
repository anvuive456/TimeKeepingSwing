package dto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.Connector;
import model.Employee;
import model.User;

public class EmployeeDao implements BaseDao<Employee> {
	final Connector conn = Connector.getInstance();

	@Override
	public List<Employee> getAll() {
		List<Employee> employees = List.of();

		try {
			PreparedStatement stm = conn.getConnection().prepareStatement("select * from employee");
			ResultSet result = stm.executeQuery();

			while (result.next()) {
				Employee employee = new Employee(result);

				employees.add(employee);
			}

			return employees;
		} catch (SQLException e) {
			e.printStackTrace();

			return employees;
		}
	}

	@Override
	public Employee getDetail(int id) {
		try {
			PreparedStatement stm = conn.getConnection().prepareStatement("select * from employee where id =?");
			stm.setInt(1, id);
			ResultSet result = stm.executeQuery();
			if (result.first()) {
				return new Employee(result);
			}
			return null;

		} catch (SQLException e) {
			return null;
		}
	}

	@Override
	public Employee add(Employee data) {
		try {
			PreparedStatement stm = conn.getConnection()
					.prepareStatement("insert into employee(first_name, last_name, dob) values(?,?,?)");
			stm.setString(1, data.getName());
			stm.setString(2, data.getName());
			stm.setDate(3, new java.sql.Date(data.getDob().getTime()));

			stm.executeUpdate();
			return data;
		} catch (SQLException e) {
			return null;
		}
	}

	@Override
	public void delete(int id) {

	}
}
