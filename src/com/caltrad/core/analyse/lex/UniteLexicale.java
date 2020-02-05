package com.caltrad.core.analyse.lex;

public class UniteLexicale {
	private Categorie ulmc;
	private Object lexeme;
	
	/* le constructeur de la classe lexique
	 * initialise les attributs de la classe par les type d'unit� lexicale et 
	 *le type de lexeme pass� en parametre 
	 * */
	public UniteLexicale(Categorie categorie, Object lexem) {
	this.ulmc= categorie;
	this.lexeme=lexem;
	}
	// la m�thode retournant le mot cl� courant de la classe ou enumeration Unit�s lexicales mots cl�s
	public Categorie getulmc(){
		return  ulmc;
	}
	public Object getlexem(){
		return  lexeme;
	}
}
