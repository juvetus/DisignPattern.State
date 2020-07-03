package fr.doranco.disign.pattern.state1;

public class RetourAuDebut implements EtatVideo {

	@Override
	public void action(Video1 video1) {
		System.out.println("Retour au debut de la video");
		
	}

}
