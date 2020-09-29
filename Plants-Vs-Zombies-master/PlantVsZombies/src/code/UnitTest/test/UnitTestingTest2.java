package code.UnitTest.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import code.UnitTest.main.*;

public class UnitTestingTest2 {
	UnitTesting t;
	//UnitTesting2 m;
	//UnitTesting t2;

	@Before
	public void setUp() throws Exception {
		t=new UnitTesting();
		//m=Mockito.mock(UnitTesting2.class);
		//t2=new UnitTesting(m);
	}

	@Test
	public void testAverage() {
		assertEquals(7.5, t.average(5.0, 10.0),0.01);
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, t.add(2, 3));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(1, t.subtract(3, 2));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(6, t.multiply(3, 2));
	}
	
	@Test
	public void testDevide() {
		assertEquals(5.0, t.divide(10.0, 2.0),0.01);
	}
	
	@Test
	public void testIfEqual() {
		assertEquals(true, t.ifEqual(5, 5));
	}
	
	/*@Test
	public void testSave() {
		t2.setName("Test");
		Mockito.verify(m).setName("Test");
	}*/
	
	

}
