package basic;

public class Pattern_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. print this: x x x x x
//		int i = 0;
//		while(i++<5) System.out.print("x ");
		
		/*2. print this
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *	 
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) System.out.print("* ");
			System.out.println();	}
*/
		/*
		 *3. Print :
			 * 
			 * *
			 * * *
			 * * * *
			 * * * * *
			 // jo sa row utne star
		 */
//		int row = 1;
//		int star = 1;
//		while(row<=5) {
//			int i=1;
//			star=row; // jis no. ka row utne star!!!
//			while(i<=star) {
//				System.out.print("* ");
//				i++;
//			}
//			// next row prep
//			row++;
//			System.out.println();
//		}
		/*
		 *4. Print :
		 	* * * * *
		 	* * * *
		 	* * *
		 	* *
		 	* 
		 */
//		int row = 1;
//		int star = 5;
//		while(row<=5) {
//			int i=1;
//			 // jis no. ka row utne star!!!
//			while(i<=star) {
//				System.out.print("* ");
//				i++;
//			}
//			// next row prep
//			row++;
//			star--;
//			System.out.println();
//			
//		}
		/*
		 *Print :
		 	         *
		 	       * *
		 	     * * *
		 	   * * * *
		 	 * * * * *
		 */
//		int n=5;
//		int row=1;
//		int star=1; // agar i star hai
//		int space = n-1; // to n-i space hai
//		while(row<=n) {
//			// space ke liye phle kaam krna hai
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			// star ka kaam
//			int j=1;
//			while(j<=star) {
//				System.out.print("* ");
//				j++;
//			}
//			// next row ki prep
//			star++;
//			space--;
//			row++;
//			// print new line
//			System.out.println();
//		}
		/*
		 *5. Print :
		 	         *
		 	        * *
		 	       * * *
		 	      * * * *
		 	     * * * * *
		 */
//		int n=5;
//		int row=1;
//		int star=1; // agar i star hai
//		int space = n-1; // to n-i space hai
//		while(row<=n) {
//			// space ke liye phle kaam krna hai
//			int i=1;
//			while(i<=space) {
//				System.out.print("  ");
//				i++;
//			}
//			// star ka kaam
//			int j=1;
//			while(j<=star) {
//				System.out.print("* ");
//				j++;
//			}
//			// next row ki prep
//			star++;
//			space--;
//			row++;
//			// print new line
//			System.out.println();
//		}
		
		/*
		 *5. Print :
		 	        * * * * *
		 	          * * * *
		 	            * * *
		 	              * *
		 	                * 
		 */
		
//		int n=5;
//		int row=1;
//		int star=n; // agar i star hai
//		int space = 0; // to n-i space hai
//		while(row<=n) {
//			// star ke liye phle kaam krna hai
//			int j=1;
//			while(j<=space) {
//				System.out.print("  ");
//				j++;
//			}
//			int i=1;
//			while(i<=star) {
//				System.out.print("* ");
//				i++;
//			}
//			// star ka kaam
//			// next row ki prep
//			star--;
//			space++;
//			row++;
//			// print new line
//			System.out.println();
//		}
		
		/*
		 Print :
		 	   *             *
		 	   * *         * *
		 	   * * *     * * *
		 	   * * * * * * * *             
		 */
		
		int n=5;
		int row=1;
		int star = 1;
		int space = 2*n-3;
		
		while(row<=n) {
			// print *
			int i=1; 
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			// print space
			int j=1; 
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			// print *
			int k=1;
			if(row==n) k=2;// to manage the last extra star
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			// next row prep
			star++;
			space-=2;
			row++;
			System.out.println();
			// problem ? last row me extra star aa rha hai
		}
		
		/*
		 *6. Print :
		 	        * * * * *
		 	        *       *
		 	        *       *
		 	        *       *
		 	        * * * * *
		 */
	}

}
