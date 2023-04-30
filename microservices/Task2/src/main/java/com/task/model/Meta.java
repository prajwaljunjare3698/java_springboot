package com.task.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mid;
    private Long schemecode;
    private String	fundhouse;
    private String	schemetype;
    private String	schemecategory;
    private String	schemename;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Data> data;
	
	

}
