package backtracking;


public class Sudoku {
	 
	/* 
	 * solve a sudoku using backtracking
	 */

	public static void main(String[] args) {
		int[][] grid = {
				{0,0,0,1,2,0},
				{0,2,1,0,3,0},
				{0,5,0,0,0,6},
				{3,0,0,0,5,1},
				{2,1,0,4,0,0},
				{0,0,6,5,0,0}
			};
		solve(grid, 0, 0);
	}
	
	static void solve(int[][] grid, int cr, int cc)
	{
		// ordering of the if statements matter
		if(cc==grid[0].length) {
			cc=0;cr++;// move to next row 
		}
		if(cr==grid.length) {
			display(grid);
			return; // solution found return
		}
		if(grid[cr][cc]!=0) {
			solve(grid, cr, cc+1);
		}
		// if cell is already filled
		// if cell is not already filled then
		else {
			for(int val=1; val<=6; val++) {
				// check if we can put this number
				if(isItSafe(grid, cr, cc, val)==true) {
					grid[cr][cc]=val; // set the value
					solve(grid, cr, cc+1);
					grid[cr][cc]=0; // backtrack
				}
				
			}
		}
	}
	private static void display(int[][] grid) {
			
			for(int i=0; i<grid.length; i++) {
				for(int j=0; j<grid[0].length; j++) {
					System.out.print(grid[i][j]+" ");
				}
				System.out.println();
			}
		}

// this method will check if we can place correct value or not
	private static boolean isItSafe(int[][] grid, int cr, int cc, int val) {
		
		// checking the current row
		for(int i=0; i<grid.length ; i++) {
			if(grid[cr][i]==val) return false;
		}
		// checking the current col
		for(int i=0; i<grid[0].length; i++) {
			if(grid[i][cc]==val) return false;
		}
		// checking the n*n box
		// how to get the start index of n*n box
		// below calculation is for 2*3 box
		int sr=cr-cr%2;
		int sc=cc-cc%3;
		for(int i=sr; i<sr+2; i++)
			for(int j=sc; j<sc+3; j++)
				if(grid[i][j]==val) return false;
		return true;
	}
}
