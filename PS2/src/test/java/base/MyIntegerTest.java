package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {
	private int oddPrimeInt = 7;
	private int oddNonPrimeInt = 25;
	private int symmetricalNumber = 8;
	private MyInteger myOddPrimeInt = new MyInteger(oddPrimeInt);
	private MyInteger myOddNonPrimeInt = new MyInteger(oddNonPrimeInt);
	private MyInteger mySymmetricalNumber = new MyInteger(symmetricalNumber);
	@Test
	public void test() {
		assertTrue(mySymmetricalNumber.isEven());
		assertTrue(myOddPrimeInt.isOdd());
		assertFalse(myOddNonPrimeInt.isPrime());
		
		assertFalse(MyInteger.isEven(oddNonPrimeInt));
		assertTrue(MyInteger.isOdd(oddPrimeInt));
		assertTrue(MyInteger.isPrime(oddPrimeInt));
		
		assertFalse(MyInteger.isEven(myOddNonPrimeInt));
		assertFalse(MyInteger.isOdd(mySymmetricalNumber));
		assertTrue(MyInteger.isPrime(myOddPrimeInt));
	}
}
