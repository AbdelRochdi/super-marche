package com.rochdi.supermarche;

import java.util.HashMap;

public class Chariot {

	private HashMap <Article, Integer> achats = new HashMap <Article, Integer>(); 
	
	public void remplir(Article article, int quantite) {
		
		this.achats.put(article, quantite);
		
	}

	public HashMap<Article, Integer> getAchats() {
		return achats;
	}

	public void setAchats(HashMap<Article, Integer> achats) {
		this.achats = achats;
	}
	
	
	
}
