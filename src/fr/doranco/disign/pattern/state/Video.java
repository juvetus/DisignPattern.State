package fr.doranco.disign.pattern.state;

public class Video {
	
	private String etat = "";
	
	
	public void setEtat(String  etat) {
		 this.etat = etat;
	}
	
	public void action() {
		if(etat.equalsIgnoreCase("PLAY")) {
			System.out.println("La video est en lecture");
		}else if(etat.equalsIgnoreCase("Pause")) {
			System.out.println("La video est en pause");
		}else if(etat.equalsIgnoreCase("RetourAuDebut"));{
			System.out.println("La video retourne au debut");
		
	
		}
	}
}
