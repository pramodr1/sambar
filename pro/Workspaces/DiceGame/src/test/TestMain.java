package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestMain {
	
	@Test
	public void test() {
		
	
		Sides sides = new Sides(1,1,1);
		assertEquals(sides.getPoints(sides), new Integer(1000));
		
		sides = new Sides(1,2,3,4,5);
		assertEquals(sides.getPoints(sides), new Integer(140));

		
		sides = new Sides(1,1,1,2,2);
		assertEquals(sides.getPoints(sides), new Integer(1000));

		
		sides = new Sides(5,4,5,4,5);
		assertEquals(sides.getPoints(sides), new Integer(580));
		
		sides = new Sides(4,4,4,4,4);
		assertEquals(sides.getPoints(sides), new Integer(480));
		
		sides = new Sides(1,5,5,5,1);
		assertEquals(sides.getPoints(sides), new Integer(700));
		
		sides = new Sides(2,2,2,2,2);
		assertEquals(sides.getPoints(sides), new Integer(200));
		
		sides = new Sides(1,1);
		assertEquals(sides.getPoints(sides), new Integer(200));
		
		sides = new Sides(1);
		assertEquals(sides.getPoints(sides), new Integer(0));
		
	}

}
