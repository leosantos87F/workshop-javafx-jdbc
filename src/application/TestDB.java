package application;

import java.sql.Connection;

import db.DB;

public class TestDB {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		System.out.println("DB Connected!");
		DB.closeConnection();
		System.out.println("DB Disconnected!");
		
	}

}
