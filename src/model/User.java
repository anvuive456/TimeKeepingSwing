package model;

import java.util.Date;

public abstract class User {
	private final int id;
	private final String name;
	private final Date dob;

	User(int id, String name, Date dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

}
