
package com.shrek.AdventurerAcademyV1Service.dao;

import com.shrek.AdventurerAcademyV1Service.model.Element;

import java.util.List;

public interface IElementDao extends IGenericDao<Element> {
	
	public List<Element> getAllElements();
	
	public Element getElement(Long id);
	
	public Element addElement(Element element);
	
	public Element updateElement(Element element);
	
	public void deleteElement(Element element);
	
}
