package fr.doranco.disign.pattern.state1;

public class Video1 {
	
	private EtatVideo etatVideo;
	
	public void setState(EtatVideo newEtat) {
		this.etatVideo = newEtat;
	}
	
	public void action() {
		etatVideo.action(this);
	}

}
