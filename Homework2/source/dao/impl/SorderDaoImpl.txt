package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.SorderDao;
import model.Sorder;
import util.DbConnection;

public class SorderDaoImpl implements SorderDao{

	public static void main(String[] args) {
		Sorder o=new Sorder("haveaniceday",3,22,11,33);
		new SorderDaoImpl().insert(o);
		
		System.out.println(new SorderDaoImpl().selectAll());
		
		System.out.println(o+"\t"+o.getId()+
				"\t"+o.getUsername()+
				"\t"+o.getYoyo()+
				"\t"+o.getCandy()+
				"\t"+o.getCar()+
				"\t"+o.getBall());
	}
private static Connection conn=DbConnection.getDb();
	
	//create
	public void insert(Sorder sorder) {
		String sql="insert into sorder(username,yoyo,candy,car,ball) "
				+ "values(?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, sorder.getUsername());
			ps.setInt(2, sorder.getYoyo());
			ps.setInt(3, sorder.getCandy());
			ps.setInt(4, sorder.getCar());
			ps.setInt(5, sorder.getBall());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	//select
	public String selectAll() {
		String sql="select * from sorder";
		String show=" ";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				show=show+"id:"+rs.getInt("id")+		
				"\t帳號:"+rs.getString("username")+
				"\t溜溜球:"+rs.getInt("yoyo")+
				"\t跳跳糖:"+rs.getInt("candy")+
				"\t小汽車:"+rs.getInt("car")+
				"\t彈跳球:"+rs.getInt("ball")+"\n";
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return show;
	}
}
