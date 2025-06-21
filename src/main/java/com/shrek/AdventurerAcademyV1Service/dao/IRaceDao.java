package com.shrek.AdventurerAcademyV1Service.dao;

import com.shrek.AdventurerAcademyV1Service.model.Race;

import java.util.List;

public interface IRaceDao extends IGenericDao<Race> {
	
	public List<Race> getAllRaces();
	
	public Race getRace(Long id);
	
	public Race addRace(Race race);
	
	public Race updateRace(Race race);
	
	public void deleteRace(Race race);
	
	
}
