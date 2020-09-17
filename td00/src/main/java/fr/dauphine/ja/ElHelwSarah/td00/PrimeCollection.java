package fr.dauphine.ja.ElHelwSarah.td00;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PrimeCollection {

	ArrayList<Integer> numbers;

	PrimeCollection() {
		numbers = new ArrayList<>();
	}

	public void initRandom(int n, int m) {
		for (int i = 0; i < n; i++) {
			numbers.add(ThreadLocalRandom.current().nextInt(0, m + 1));
		}
	}

	private boolean isPrime(int p) {
		for (int x = 2; x <= Math.sqrt(p); x++) {
			if (p % x == 0) {
				return false;
			}
		}
		return true;
	}

	public void printPrimes() {
		for (int n : numbers) {
			if (isPrime(n)) {
				System.out.println(n);
			}
		}
	}

	public static void main(String[] args) {
		PrimeCollection pc = new PrimeCollection();
		pc.initRandom(1, 1000);

		pc.printPrimes();

	}
}
