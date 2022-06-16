import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class exam3 {
	public static void main(String args[]) {
		int[]s = new int[10];
		
		    Runnable r1 = () -> {
		        for (int i = 10; i >=0 ; i--)
		            System.out.println("첫 번째 스레드: " + i);
		    };
		    Runnable r2 = () -> {
		        for (int i = 10; i >=0 ; i--)
		            System.out.println("두 번째 스레드: " + i);
		    };


		    Executor executor = Executors.newCachedThreadPool();
		    executor.execute(r1);
		    executor.execute(r2);
	}
}