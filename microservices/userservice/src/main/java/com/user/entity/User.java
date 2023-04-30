package com.user.entity;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
	
	@Id
	private String id;
	
	@Column(name = "name",length = 14)
	private String name;
	
	@Column(name = "email",length = 24)
	private String email;
	
	@Column(name = "about",length = 30)
	private String about;
	
	@Transient
	private ArrayList<Rating> rating = new ArrayList<Rating>();
}
