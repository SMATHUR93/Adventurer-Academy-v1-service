package com.shrek.AdventurerAcademyV1Service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import jakarta.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name="SKILL_MAPPING")
public class SkillMapping extends BaseEntity implements Serializable{

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	@JsonIgnoreProperties("skills")
	@LazyCollection(LazyCollectionOption.FALSE)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "SKILL_ID", referencedColumnName = "ID")
	private Skill skill;
	
	@Column(name="SKILL_LEVEL", nullable=true)
	private Integer skillLevel;

	public User getUser() {
		return user;
	}

	public void setUserId(User user) {
		this.user = user;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Integer getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(Integer skillLevel) {
		this.skillLevel = skillLevel;
	}

	public SkillMapping() {
		super();
	}

	public SkillMapping(User user, Skill skill, Integer skillLevel) {
		super();
		this.user = user;
		this.skill = skill;
		this.skillLevel = skillLevel;
	}
	
}
