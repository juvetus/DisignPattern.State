package fr.doranco.disign.pattern.state;

public class Main {

	public static void main(String[] args) {
		
		Video video = new Video();
		
		video.setEtat("Play");
		video.action();
		
		video.setEtat("Pause");
		video.action();
		
		video.setEtat("RetourAuDebut");
		video.action();

	}

}
