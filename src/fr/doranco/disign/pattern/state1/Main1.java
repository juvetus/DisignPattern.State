package fr.doranco.disign.pattern.state1;



public class Main1 {

	public static void main(String[] args) {
		Video1 video1 = new Video1();
		video1.setState(new VideoEnLecture());
		video1.action();
		
		video1.setState(new VideoEnPause());
		video1.action();
		video1.setState(new RetourAuDebut());
		video1.action();
		
		video1.setState(new SeRendreAuMilieuDeLaVideo());
		video1.action();

	}

}
