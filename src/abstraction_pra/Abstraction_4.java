package abstraction_pra;

abstract class instrument{
	void play() {
		
	}
	void tune() {
		
	}
}

class Glocknspiel extends instrument{
	void play() {
		System.out.println("ppp");
	}
	void tune() {
		System.out.println("qqq");
	}
}

class Violin extends instrument{
	void play () {
		System.out.println("eee");
	}
	void tune() {
		System.out.println("aqqqaa");
	}
}

public class Abstraction_4 {

	public static void main(String[] args) {
	
		Glocknspiel gh=new Glocknspiel();
		gh.play();
		gh.tune();
		
		Violin hg=new Violin();
		hg.play();
		hg.tune();

	}

}
