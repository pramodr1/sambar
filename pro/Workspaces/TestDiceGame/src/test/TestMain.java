package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestMain {
	
	@Test
	public void test() {
		
		
		Sides sides = new Sides(1,1,1);
		assertEquals(sides.getPoints(), new Integer(1000));
		
		sides = new Sides(2,2,2);
		assertEquals(sides.getPoints(), new Integer(200));

		sides = new Sides(3,3,3);
		assertEquals(sides.getPoints(), new Integer(300));

		sides = new Sides(4,4,4);
		assertEquals(sides.getPoints(), new Integer(400));

		sides = new Sides(5,5,5);
		assertEquals(sides.getPoints(), new Integer(500));

		sides = new Sides(6,6,6);
		assertEquals(sides.getPoints(), new Integer(600));

		sides = new Sides(1,2,3,4,5);
		assertEquals(sides.getPoints(), new Integer(140));

		
		sides = new Sides(1,1,1,2,2);
		assertEquals(sides.getPoints(), new Integer(1000));
		
		sides = new Sides(5,4,5,4,5);
		assertEquals(sides.getPoints(), new Integer(580));
		
		sides = new Sides(4,4,4,4,4);
		assertEquals(sides.getPoints(), new Integer(480));
		
		sides = new Sides(1,5,5,5,1);
		assertEquals(sides.getPoints(), new Integer(700));
		
		sides = new Sides(2,2,2,2,2);
		assertEquals(sides.getPoints(), new Integer(200));
		
		sides = new Sides(2,2,2,1,1);
		assertEquals(sides.getPoints(), new Integer(400));
		
		sides = new Sides(1,1,2,2,2);
		assertEquals(sides.getPoints(), new Integer(400));
		
		sides = new Sides(2,1,2,1,2);
		assertEquals(sides.getPoints(), new Integer(400));

		sides = new Sides(1,1);
		assertEquals(sides.getPoints(), new Integer(200));
		
		sides = new Sides(2,2);
		assertEquals(sides.getPoints(), new Integer(0));
		
		sides = new Sides(3,3);
		assertEquals(sides.getPoints(), new Integer(0));
		
		sides = new Sides(5,5);
		assertEquals(sides.getPoints(), new Integer(0));
		
		sides = new Sides(6,6);
		assertEquals(sides.getPoints(), new Integer(0));
		
		sides = new Sides(6,6,6,4,6);
		assertEquals(sides.getPoints(), new Integer(640));

		
		
	}

}
