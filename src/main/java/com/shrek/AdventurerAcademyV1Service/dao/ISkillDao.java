package com.shrek.AdventurerAcademyV1Service.dao;

import com.shrek.AdventurerAcademyV1Service.model.Skill;

import java.util.List;

public interface ISkillDao extends IGenericDao<Skill> {
	
	public List<Skill> getAllSkills();
	
	public Skill getSkill(Long id);
	
	public Skill addSkill(Skill skill);
	
	public Skill updateSkill(Skill skill);
	
	public void deleteSkill(Skill skill);
	
}
