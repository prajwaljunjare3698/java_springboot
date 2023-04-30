package com.jspider.onettomany.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Company")
public class CompanyDTO {

	@Id
	@Column(name = "register_id")
	private int id;
	
	@Column(name = "Company_Name")
	private String name;
	
	private String headquarter;
	
	@OneToMany
	@Column(name = "Companies_sectors")
	private List<SectorsDTO> sectors;
}
