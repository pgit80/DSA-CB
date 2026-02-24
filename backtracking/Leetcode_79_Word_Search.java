
package backtracking;


/*
 ****************************************************************************
 * given a m*n grid of characters board and a string word, return true if
 * the word exists in the grid. Either in horizontally adjacent cells or
 * in vertically adjacent cell or in combination of both. Same letter cell
 * can't be used more than once. 
 ****************************************************************************
 */
public class Leetcode_79_Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char[][]board = {{'A', 'B', 'C', 'D', 'E'},{'S', 'F', 'C', 'S'},{'A', 'D', 'E', 'E'}};
		 String word = "ABCCED";
		 // start recursion when we get the first character of the word in the board
		 for(int i=0; i<board.length; i++) {
			 for(int j=0; j<board[0].length; j++) {
				 if(word.charAt(0)==board[i][j]) {
					 boolean ans = wordSearch(board, i, j, word, 0);
					 if(ans) {
						 System.out.println(ans);
						 return;
					 }
				 }
			 }
		 }
		 System.out.println(false);
	}

	private static boolean wordSearch(char[][] board, int cr, int cc, String word, int idx) {
		// TODO Auto-generated method stub
		// base case
		if(idx==word.length()) return true;
		if(cr<0||cc<0 ||cr>=board.length || cc>=board[0].length || word.charAt(idx)!=board[cr][cc] ) {
			return false;
			
		}
		// these two index arrays are for traversal in board in four directions...
		// cell blocked	
		board[cr][cc]='*';
		int[] r= {-1, 1, 0, 0};
			int[] c= {0, 0, -1, 1};
			
			for(int i=0; i<r.length; i++) {
				
				boolean ans =wordSearch(board, cr+r[i], cc+c[i], word, idx+1);
				if(ans) return true;
			}
			// cell undo
			board[cr][cc]= word.charAt(idx);
			return false;
	}

}
