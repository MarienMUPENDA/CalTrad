package com.caltrad;

import com.caltrad.core.analyse.lex.UniteLexicale;
import com.caltrad.core.analyse.synt.Production;
import com.caltrad.core.analyse.lex.Scanner;
import com.caltrad.core.analyse.lex.Categorie;
import com.caltrad.core.trad.Cible;

public class caltrad {
	public static void main(String[] args) {
		Scanner anaLex=new Scanner("test2.txt");
		Production parser=new Production();
		Cible cib=new Cible();
		parser.lireProduction();
		parser.setNullable();
		parser.Premiercalcul();
		parser.calculSuivant();
		parser.calculPremierRegles();
		parser.remplirTableAnalyse();
		parser.afficher();
		parser.initialiserPile();

		//System.out.println(anaLex);
		UniteLexicale ul=null;
		String valeurC=null;
		int i=0;
		boolean b=true;
		while(b){
			ul=anaLex.lexemeSuivant();
			
			if(ul.getulmc().equals(Categorie.EOF)){
				//System.out.println(" l'élément avant d'entree dans le parser est :"+ul.getulmc());
				anaLex.lexemeSuivant();
				//System.out.println("affiche les éléments de ul rencontré");
				//System.out.println("le fichier touche à sa fin et la syntaxe est correcte !!!");
				b=false;
			}
			else	{	
				//System.out.println(" l'élément avant d'entree dans le parser est :"+ul.getulmc());
				parser.analyserSyntaxe(ul.getulmc());
				//System.out.println("affiche les éléments de ul rencontrés");
				//System.out.println(ul.getulmc());
				//System.out.println("c'est le tours de lexeme"+ul.getlexem());
				
				cib.tablelexmc(ul.getlexem().toString());
				
			}
		}
		
		cib.cl_valeur();
		valeurC=cib.cpc();
		cib.affichage("affiche ça aussi 0902281075 ");
		System.out.println("l'équivalent de l'algo en c est : ");
		System.out.println("............................................ ");
		System.out.println(valeurC);
		
		
		}
		
	
		
			
	}



