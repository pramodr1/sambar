package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sides {
	
	List<Integer> sides;
	Integer points=0;

	private Integer get(Integer i) {
		return sides.get(i);
	}

	/**
	 * 
	 * STEP 1:
	 * 
	 * Get points for each sequence identified in result...
	•	Ones [1,1,1]   => 1000 points
	•	Twos [2,2,2]   => 200
	•	Threes [3,3,3] => 300
	•	Fours [4,4,4]   => 400
	•	Fives [5,5,5]   => 500
	•	Sixes [6,6,6]   => 600

	 */
	public Integer getPoints() {
		
		if (match(new Sides(1,1,1)) == 0) {
			remove(new Sides(1,1,1));
			points=1000;
		} else if (match(new Sides(2,2,2)) == 0) {
			points=200;
			remove(new Sides(2,2,2));
		} else if (match(new Sides(3,3,3)) == 0) {
			remove(new Sides(3,3,3));
			points=300;
		} else if (match(new Sides(4,4,4)) == 0) {
			remove(new Sides(4,4,4));
			points=400;
		} else if (match(new Sides(5,5,5)) == 0) {
			remove(new Sides(5,5,5));
			points=500;
		} else if (match(new Sides(6,6,6)) == 0) {
			remove(new Sides(6,6,6));
			points=600;
		}
		
		/* STEP 2:
		After removing the matching sequence
		Calculate the remaining points
		
		•	Ones => 100 points each
		•	Fours => 40 each
		•	Any other roll (2s, 3s, 5s, 6s) => 0 each
		 */
	
		for (int i=0;i<size();i++) {
				
			switch(get(i)) {
			case 1:
				points+=100;
				break;
			case 4:
				points+=40;
				break;
			default:
				points+=0;
				break;
			}
			
		}
		
		return points;
		
	}
	
	/**
	 * Remove sublist [1,1,1] from the input after points calculated.
	 */

	private void remove(Sides sides2) {
		int idx = Collections.indexOfSubList(this.sides, sides2.sides);
		if ( idx >= 0) {
			for (int i=idx;i<idx+3;i++) {
				sides.remove(idx);
			}
		}
	}
	
	public Sides(Integer... i) {
		sides = new ArrayList<>();
		for (int ii = 0;ii<i.length;ii++)
			sides.add(i[ii]);
		
		Collections.sort(sides);
	}
	
	private Integer size() {
		return sides.size();
	}
	

	public String toString() {
		return ""+sides+"\n"+points;
	}
	
	/**
	 * Check if the input has a sequence in it.- [1,1,1]  [2,2,2] etc..
	 * If yes, return 0, else 1
	 * @param s
	 * @return
	 */
	private Integer match(Sides s) {
		
		if (this.sides.size()>=3) {
			/**
			 * shift the pattern in the main list. Shift the pointer to right and try matching again..
			 * for instance [1,1,1] to be matched in [2,1,1,1], needs a right shift.
			 */
			for (int i=0;i<=(this.size()-3);i++) {
				if (s.sides.subList(0, 3).equals(this.sides.subList(i, i+3))) {
					return 0;
				} 
			}
		}
		
		return 1;
	}
	
}


