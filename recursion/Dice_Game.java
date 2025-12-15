package recursion;

public class Dice_Game {
	/*
	 ***************************************************************************
	 * we have a 3 faced dice with values 1,2,3 on it.                         *
	 * we are at a board numbered 0 to n let's say.                            *
	 * we will move steps as per dice face comes after play                    *
	 * I want to know all the no. of ways to reach 0->n.                       *                                             *
	 * Ex- for n=4.                                                            *
	 * possible steps are- 1111, 112, 121, 211, 22, 13, 31                     *
	 ***************************************************************************
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diceGame("", 3, 0);
	}
	static void diceGame(String ans, int target, int curr) {
		// if we reached target then print the ans
		if(curr==target) {
			System.out.print(ans+" ");
		}
		// no need to move beyond target
		if(curr>target) {
			return;
		}
		/*
		 * we have 3 choices to move at every step so we'll have 3 recursive calls
		 */
//		diceGame(ans+"1", target, curr+1);
//		diceGame(ans+"2", target, curr+2);
//		diceGame(ans+"3", target, curr+3);
		// we can do these calls in a loop
		for(int i=1; i<=3; i++) {
			diceGame(ans+i, target, curr+i);
		}
	}

}
