public class MySleep {
	static public void sleep(long milliseconds) {
		long first = System.currentTimeMillis();
		long second = System.currentTimeMillis();
		while(second<=first+milliseconds) {
			second = System.currentTimeMillis();
		}
	}
}