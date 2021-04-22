package ejemplo01;

public class Hilo2 implements Runnable{

	@Override
	public void run() {
		for (int x=1; x<=10; x++) {
			if(x%2!=0) {
			System.out.println(x);
		}
		}
		System.out.println("_______________");
	}
}
