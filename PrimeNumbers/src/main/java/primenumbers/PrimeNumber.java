package primenumbers;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int NumOfThreads = 2;
		for (int i = 0; i < NumOfThreads; i++) {
			Thread ThrObj = new Thread(new PrimeCheck());
			ThrObj.start();
		}
	}
}

class PrimeCheck implements Runnable{
	public synchronized void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thread" + Thread.currentThread().getName() + " ->  array size: ");

		int ArraySize = scanner.nextInt();
		int [] ArrayValues = new int[ArraySize]; 

		for (int i = 0; i < ArrayValues.length; i++) {
			ArrayValues[i] = i   ;
		}

		System.out.println("Printing prime numbers "+ Thread.currentThread().getName());

		for (int i = 0; i < ArrayValues.length; i++) {
			if (CheckPrime(ArrayValues[i]  + 1  )) {
				System.out.println(ArrayValues[i] );
			}
		}
		System.out.println("Runtime of thread, " + Thread.currentThread().getName() +" is " + System.currentTimeMillis());
		scanner.close();
	}

	boolean CheckPrime(int number) {
		// TODO Auto-generated method stub
		if (number <= 1) {
			return false;
		}

		int IterationValue = 2;
		while (IterationValue < number / 2) {
			if ((number % IterationValue) == 0) {
				return false;
			}
			IterationValue++;
		}
		return true;
	}
}
