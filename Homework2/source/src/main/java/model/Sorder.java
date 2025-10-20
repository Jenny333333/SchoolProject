package model;

public class Sorder {
	private Integer id;
	private String username;
	private Integer yoyo;
	private Integer candy;
	private Integer car;
	private Integer ball;
	
	
	public Sorder(String username, Integer yoyo, Integer candy, Integer car, Integer ball) {
		super();
		this.username = username;
		this.yoyo = yoyo;
		this.candy = candy;
		this.car = car;
		this.ball = ball;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Integer getYoyo() {
		return yoyo;
	}


	public void setYoyo(Integer yoyo) {
		this.yoyo = yoyo;
	}


	public Integer getCandy() {
		return candy;
	}


	public void setCandy(Integer candy) {
		this.candy = candy;
	}


	public Integer getCar() {
		return car;
	}


	public void setCar(Integer car) {
		this.car = car;
	}


	public Integer getBall() {
		return ball;
	}


	public void setBall(Integer ball) {
		this.ball = ball;
	}

	
}
