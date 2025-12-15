package recursion;

public class Maze_Path {

	/*
	 ***************************************************************************
	 * we have a m*n grid and we are standing at (0,0) we want to move from this 
	 * point to (m-1*n-1) i.e. last grid in bottom right corner. We can move 
	 * one grid horizontal right or one grid vertical down. Tell how many ways
	 * possible to reach the destination(m-1, n-1) from start(0,0).
	 * --------------------
	 * | *|   |   |   |   |
	 * |  |   |   |   |   |
	 * |  |   |   |   |   |
	 * |  |   |   |   |  *|
	 * |------------------|
	 * ex- for a 3*3 matrix ways can be VVHH, VHVH, HHVV, HVHV, VHHV, HVVH
	 * 
	 * Approach:-
	 * we have two choices to choose from Veritcal(V) either Horizontal(H) so,
	 * 2 recursive calls will be made one for V and 2nd for H
	 ***************************************************************************
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3, col=3;
		int[][] maze = new int[row][col];
		printMazePath(maze, 0, 0, row-1, col-1, "");
	}
	static void printMazePath(int[][] maze, int m, int n, int row, int col,  String path) {
		if(m==row && n==col) {
			System.out.println(path+ " ");
			return;
		}
		if(m>row || n>col) return; // not needed but we can write this as return case
		// vertical down move
		if(m<row) // agar row se bahar gaye to jahanumm me chale jayenge
		printMazePath(maze, m+1, n, row, col, path+"V");
		// horizontal right move
		if(n<col) // agar col se bahar gaye to narak me chale jayenge
		printMazePath(maze, m, n+1, row, col, path+"H");
	}
}
