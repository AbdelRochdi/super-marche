package com.rochdi.supermarche;

public class Article {

	private String nom;
	private double prix;
	private boolean solde;
	
	public Article(String nom, double prix, boolean solde) {
		this.nom = nom;
		this.prix = prix;
		this.solde = solde;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public boolean isSolde() {
		return solde;
	}

	public void setSolde(boolean solde) {
		this.solde = solde;
	}
	
	public void afficher() {
		if (this.solde == true) {
			System.out.println(this.nom + " : " + this.prix + "DH" + " (en solde)" );
		}else {
			System.out.println(this.nom + " : " + this.prix + "DH" + " (non soldé)" );
		}
	}
	

	
	
	
	
	
}
