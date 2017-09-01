package homework2_3;
// Homework 2_3

public class Fan {
	
	public static void main(String[] args){
	    Fan myfan1 = new Fan(3, true, 10, "Yellow");
	    Fan myfan2 = new Fan(2, false, 5, "bulue");
	    System.out.println(myfan1.toString());
	    System.out.println(myfan2.toString());

	}

	private int speed; // 1 is SLOW, 2 is MEDIUM, 3 is FAST
	private boolean weather;
	private double radius;
	private String color;
	
	public Fan(){
		this.speed = 1; 
		this.weather = false;
		this.radius = 5;
		this.color = "blue";
	}
	
	public Fan(int speed, boolean x, double radius, String y){
		this.speed = speed; 
		this.weather = x;
		this.radius = radius;
		this.color = y;
	}
	
	
	public void set_speed(int x){
		if (x==1 || x==2 || x==3){
			this.speed = x;
		} else {
		    System.out.println("Invalid Speed Input");
		}
	}
	
	public int get_speed(){
		return this.speed;
	}
	
	
	public void set_weather(boolean x){
		if (x==true || x==false){
			this.weather = x;
		} else {
		    System.out.println("Invalid Weather Input");
		}
	}
	
	public boolean get_weather(){
		return this.weather;
	}
	
	public void set_radius(double x){
		if (x>0){
			this.radius = x;
		} else {
		    System.out.println("Invalid radius Input");
		}
	}
	
	public double get_radius(){
		return this.radius;
	}
	
	
	public void set_color(String x){
		this.color = x;
	}
	
	public String get_color(){
		return this.color;
	}
	
	@Override
	public String toString(){
		if (this.weather == true){
			return "The fan is on. The speed is " + this.speed + " and the color is " + this.color + " and the radius is " + this.radius;
		} else {
			return "The fan is iff. The speed is " + this.speed + " and the color is " + this.color + " and the radius is " + this.radius;
		}
		
	}
	
}
