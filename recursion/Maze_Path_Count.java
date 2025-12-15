package recursion;

public class Maze_Path_Count {
//	static int pathCnt = 0; // static variable is not good practice
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3, col=2;
		int[][] maze = new int[row][col];
		int totalPath = printMazePath(maze, 0, 0, row-1, col-1, "");
		System.out.println(totalPath);
	}

	static int printMazePath(int[][] maze, int m, int n, int row, int col,  String path) {
		if(m==row && n==col) {
			System.out.println(path+ " ");
//			pathCnt++;
			return 1;
		}
		if(m>row || n>col) return 0; // not needed but we can write this as return case
		// vertical down move
//		if(m<row) // agar row se bahar gaye to jahanumm me chale jayenge
		int a = printMazePath(maze, m+1, n, row, col, path+"V");
		// horizontal right move
//		if(n<col) // agar col se bahar gaye to narak me chale jayenge
		int b = printMazePath(maze, m, n+1, row, col, path+"H");
		return a+b;
	}
}
