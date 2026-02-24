package backtracking;
/*
 ****************************************************************************
 * There are a n*n chess board and we have to place n queens on the board such
 * that they don't kill each other. 
 * Standard chess rules apply in placing the queens.
 * A queen can move up, down, left, right, diagonally
 * we need to find all number of such ways that queens can be placed
 ****************************************************************************
 */
public class N_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4; // means 4*4 is grid size
		boolean [][] board = new boolean[n][n];
		nQueens(board, 0, n);
	}
	public static void nQueens(boolean [][]board, int row, int total_queens) {
		// base case
		if(total_queens == 0) {
			displaySol(board);
			return;
		}
		// no. of choices 
		for(int col=0; col<board.length; col++) {
			if(isItSafe(board, row, col)) {
				board[row][col]=true;
				nQueens(board, row+1, total_queens-1);
				board[row][col]=false;
			}
		}
	}
	private static boolean isItSafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// we need to check for each queen in only three directions
		// above the queen
		// left diagonal of the queen and right diagonal of the queen 
		// because below the queen there is no queen placed at the moment
		// also no need to check in current row
		// check the current col of the queen (above the queen)
		int r=row;
		while(r>=0) {
			if(board[r][col] == true) return false;
			r--;
		}
		// right diagonal
		r=row;
		int c=col;
		while(r>=0 && c<board.length) {
			if(board[r][c]==true) return false;
			r--;
			c++;
		}
		r=row;c=col;
		// left diagonal
		while(r>=0 && c>=0) {
			if(board[r][c]==true) return false;
			r--;c--;
		}
		return true;
	}
	public static void displaySol(boolean[][] board) {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
