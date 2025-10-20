package dao;

import model.Sorder;

public interface SorderDao {
	//create
	void insert(Sorder order);  
			
	//read
	String selectAll();  
}
