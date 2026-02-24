package backtracking;


/*
 ****************************************************************************
 * we are given an M*N grid. Each cell (i,j) in grid is either blocked or 
 * empty. The rat can move left, right, up or down from current position
 * if move is availabe or cell is not blocked. Initially rat is at position
 * (0,0) it want to reach position (N,M) to eat the cheese. These exists a 
 * unique path in the grid, help the rat to find the path to eat the cheese.
 * 
 * Input- 
 * 5 4
 * OXOO
 * OOOX
 * XOXO
 * XOOX
 * XXOO
 * O means empty and X means blocked
 * 
 * output-  
 * 1000
 * 1100
 * 0100
 * 0110
 * 0011
 * 1 means path, 0 means not path
 * 
 * Approach- 
 * 1. Take the input of the grid
 * 2. 4 direction to kitni recursive calls?
 ****************************************************************************
 */

public class Rat_And_Cheese {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5, col=4;
		char[][] grid = {
				{'O','X','O','O'},
				{'O','O','O','X'},
				{'X','O','X','O'},
				{'X','O','O','X'},
				{'X','X','O','O'}
		};
		
		int[][] ans = new int[row][col];
		
		findRatPath(0, 0, grid,ans);
		if(hit==0) System.out.println("No path Exists");
	}
//	c_row -> current row and d_row -> destination row
	
	// agar ek bhi baar base case hit nahi hua iska matlab no path exists
	static int hit = 0;
	static void findRatPath(int c_row, int c_col, char[][] grid, int[][]ans ) {
		// base case
		if(c_row == grid.length-1 && c_col == grid[0].length-1 && grid[c_row][c_col]!='X') {
			ans[c_row][c_col]=1; // for destination point
			display(ans);
			hit=1;// to know if path exists
			return;
		}
		
		// handle out of bound cases also and blocked cell also
		if(c_col<0 || c_row<0 || c_col>=grid[0].length || c_row>=grid.length || grid[c_row][c_col]=='X') {
			return;
		}
		grid[c_row][c_col]='X'; // do mark visited
		ans[c_row][c_col]=1;
		// recursive call for going right
		findRatPath(c_row, c_col+1, grid, ans);
		// recursive call for going left
		findRatPath(c_row, c_col-1, grid, ans);
		// recursive call for going down
		findRatPath(c_row+1, c_col, grid, ans);
		// recursive call for going up
		findRatPath(c_row-1, c_col, grid, ans);
		grid[c_row][c_col]='O'; // undo-> backtracking
		ans[c_row][c_col]=0;
	}
	
	public static void display(int[][]ans) {
		int row = ans.length;
		int col=ans[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++)
				System.out.print(ans[i][j]+" ");
			System.out.println();
		}
	}
}
