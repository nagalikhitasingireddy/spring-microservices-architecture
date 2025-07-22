package com.example.order.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
@Entity
public class Orders {

	@Id
	@GeneratedValue
	private int id;
	private int Pid;
	private int Uid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public Orders(int id, int pid, int uid) {
		super();
		this.id = id;
		Pid = pid;
		Uid = uid;
	}
	public Orders() {
		super();
	}
	
	
}
