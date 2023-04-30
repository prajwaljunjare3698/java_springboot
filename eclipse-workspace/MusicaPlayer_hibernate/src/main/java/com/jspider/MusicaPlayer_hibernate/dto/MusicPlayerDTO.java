package com.jspider.MusicaPlayer_hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "MusicPlayer")
public class MusicPlayerDTO {
	
	// used GenerationType IDENTITY for giving unique key 
	// to each record in table
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "song_id")
	private int id;
	
	@Column(name = "song_name")
	private String name;
	
	@Column(name = "singer_name")
	private String singer;
	
	@Column(name = "song_length")
	private double length;
}
