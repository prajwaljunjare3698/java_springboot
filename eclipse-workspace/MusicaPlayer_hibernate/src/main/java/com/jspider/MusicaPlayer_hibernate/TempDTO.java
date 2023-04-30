package com.jspider.MusicaPlayer_hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TempDTO {

	@Id
	private int id;
	
	private String name;
	
	private String singer;
	
	private double length;
}
