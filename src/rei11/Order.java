package rei11;

import java.io.Serializable;

public class Order implements Serializable {

	private int orderninzu;
	private String seminar=null;
	
	
	public int getOrderninzu() {
		return orderninzu;
	}
	public void setOrderninzu(int orderninzu) {
		this.orderninzu = orderninzu;
	}
	public String getSeminar() {
		return seminar;
	}
	public void setSeminar(String seminar) {
		this.seminar = seminar;
	}



}
