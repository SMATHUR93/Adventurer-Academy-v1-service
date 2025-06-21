package com.shrek.AdventurerAcademyV1Service.dao;

import com.shrek.AdventurerAcademyV1Service.model.Symbol;

import java.util.List;

public interface ISymbolDao extends IGenericDao<Symbol> {
	
	public List<Symbol> getAllSymbols();
	
	public Symbol getSymbol(Long id);
	
	public Symbol addSymbol(Symbol symbol);
	
	public Symbol updateSymbol(Symbol symbol);
	
	public void deleteSymbol(Symbol symbol);
	
}
