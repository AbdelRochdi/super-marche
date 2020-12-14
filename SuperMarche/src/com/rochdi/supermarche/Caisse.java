package com.rochdi.supermarche;

public class Caisse {
	private int numero;
	private double montantInitial;
	private double montantChariot;
	
	public Caisse(int numero, double montantInitial) {
		this.numero = numero;
		this.montantInitial = montantInitial;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getMontantInitial() {
		return montantInitial;
	}

	public void setMontantInitial(double montantInitial) {
		this.montantInitial = montantInitial;
	}
	
	public void scanner(Chariot chariot) {
		this.montantChariot = 0;
		System.out.println("------------------------------------");
		for (Article article : chariot.getAchats().keySet()) {
			this.montantInitial += (chariot.getAchats().get(article)*article.getPrix());
			this.montantChariot += (chariot.getAchats().get(article)*article.getPrix());
			System.out.println(article.getNom() + " : " + article.getPrix() + " x " + chariot.getAchats().get(article)+ " = " +
					chariot.getAchats().get(article)*article.getPrix()+"DH");
		}
		System.out.println("Total à payer :"+this.montantChariot+"DH");
		System.out.println("------------------------------------");
		
	}
	
	public void montantTotal() {
		System.out.println("La caisse numéro " + this.numero + " a encaissé : " + this.montantInitial);
	}
	
	
	
}
