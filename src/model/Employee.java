package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Employee extends User {

	public Employee(int id, String name, Date dob) {
		super(id, name, dob);

	}

	public Employee() {
		super(-1, "", null);
	}

	public Employee(ResultSet set) throws SQLException {
		super(set.getInt("id"), set.getString("first_name"), set.getDate("dob"));
	}

	Employee copy(String name, Date dob) {
		return new Employee(this.getId(), name == null ? this.getName() : name, dob == null ? this.getDob() : dob);
	}

}