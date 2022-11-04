package com.hotel.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long room_id;
	
	@OneToOne
	@JoinColumn(name="category")
	private Category category;
	
	@Column(name="room_number")
	private String number;
	
	@Column(name="status")
	private String status;
	
	@Column(name="floor_number")
	private int floorNumber;
	
	

	public Room() {
		
	}

	public long getId() {
		return room_id;
	}

	public void setId(long id) {
		this.room_id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Room(Category category, String number,String status,int floorNumber) {
	
		this.category = category;
		this.number = number;
		this.status = status;
		this.floorNumber=floorNumber;
		
	}
}
