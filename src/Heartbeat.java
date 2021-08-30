
public class Heartbeat {

	public Heartbeat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds = 0;
		while (true) {
		try {
			Thread.sleep(1000);
			seconds += 1;
			System.out.println(seconds + " seconds have passed.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
