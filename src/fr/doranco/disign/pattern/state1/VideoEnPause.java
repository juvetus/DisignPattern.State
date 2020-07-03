package fr.doranco.disign.pattern.state1;

public class VideoEnPause implements EtatVideo{



	@Override
	public void action(Video1 video1) {
		System.out.println("La video est en pause");
	}

	
}
