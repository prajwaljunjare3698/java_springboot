package com.jspider.onettomany.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "T_Sectors")
public class SectorsDTO {
	
	@Id
	@Column(name = "sector_id")
	private int id;
	
	@Column(name = "sector_name")
	private String name;
	
}
