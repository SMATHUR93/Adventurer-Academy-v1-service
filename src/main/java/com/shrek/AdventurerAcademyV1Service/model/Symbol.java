package com.shrek.AdventurerAcademyV1Service.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="SYMBOL")
public class Symbol extends BaseEntity implements Serializable{

	@Column(name="NAME", nullable=true)
	private String name;
	
	@Column(name="DESCRIPTION", nullable=true)
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Symbol() {
		super();
	}

	public Symbol(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
}
