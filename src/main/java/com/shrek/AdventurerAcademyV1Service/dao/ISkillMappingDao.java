package com.shrek.AdventurerAcademyV1Service.dao;

import com.shrek.AdventurerAcademyV1Service.model.SkillMapping;

import java.util.List;

public interface ISkillMappingDao extends IGenericDao<SkillMapping> {
	
	public List<SkillMapping> getAllSkillMappings();
	
	public SkillMapping getSkillMapping(Long id);
	
	public SkillMapping addSkillMapping(SkillMapping SkillMapping);
	
	public SkillMapping updateSkillMapping(SkillMapping skillMapping);
	
	public void deleteSkillMapping(SkillMapping skillMapping);
	
}
