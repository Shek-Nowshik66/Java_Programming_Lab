interface Cricket {
	void hitSix();
	void play();
}

interface Running {
	void run();
	void play();
}

public class MultiInter implements Cricket, Running{
	@Override
	public void hitSix() {
		System.out.println("Sixer");
	}
	
	@Override
	public void run() {
		System.out.println("Runner");
	}
	
	@Override
	public void play() {
		System.out.println("Player");
	}

	public static void main(String[] args) {
		MultiInter obj = new MultiInter();
		obj.hitSix();
		obj.run();
		obj.play();
	}
}