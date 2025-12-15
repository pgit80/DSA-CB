package backtracking;

/*
 ****************************************************************************
 * There are 'q' number of queens, numbered as q0, q1, q2,... and
 * 'b' number of boxes, numbered as b0, b1, b2,...
 * we want to put a queen in a box respectively and print all the possible
 * permutations of this arrangement. 
 * 
 * Ex- if we've q=2, queens- q0, q1, and b=2, boxes- b0, b1, then
 * possible arrangement are-> (b0q0 b1q1), (b1q0 b0q1) we want to print these
 * arrangements   
 ****************************************************************************
 */

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=2;// total boxes
		int q=2; // total queens
		boolean[] board = new boolean[b];// a boolean array to track empty boxes
		permutation(board, q, 0, "");
	}
	// qpsf- a variable to track queens placed so far, initially 0.
	static void permutation(boolean[] board, int q, int qpsf, String ans){
		
		if(qpsf==q) {// if all queens placed return
			System.out.println(ans+" ");
			return; 
		}
		// recursive call for board
		for (int i = 0; i < board.length; i++) {
			if(board[i]==false)// means box is empty
			{
				board[i]=true;// put a queen
				permutation(board, q, qpsf+1, ans+"b"+i+"q"+qpsf+" ");
				board[i]=false; // remove the queen for next recursion
				// this is explicit undo call for backtracking
			}
		}
	}
}
