package primenumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {
	
	PrimeCheck obj=new PrimeCheck();
	
	
	@Test
	public void ifPrimeNumberGivenThenShouldReturnTrue()
	{
		assertEquals(true,obj.CheckPrime(23));
	}
	
	@Test
	public void ifNotPrimeNumberGivenThenShouldReturnFalse()
	{
		assertEquals(false,obj.CheckPrime(25));
	}

}
