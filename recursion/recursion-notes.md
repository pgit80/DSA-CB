~ Head Recursion- Recursion laut ke aane ke baad koi na koi kaam hoga
* factorial with head recursion->
int fact(int n, int ans){
	if(n==0) return ans;
	return (n-1, n*ans);
}

~ Tail Recursion- Recursion se lautne ka baad koi kaam nahi hona hai
* factorial with tail recursion->
int fact(int n){
	if(n==0) return 1;
	return n*fact(n-1);
}

* Single recursion ques-
1. Factorial
2. Print N
3. Power
4. First Occurance
5. Last Occurance

* Double Recursion Ques-
1. Fibonacci
- Print all Subsequences


* Subsequence and Substring
- both are made by picking characters in forward moving in string but `substring` is 
  mandatory continuous and subsequence is need not to be continuous. 
  
  lexicographic counting-> number that will come first in dictionary order ex.
  3047 and 3039; 3039 will come before 3047. 
  also 4 will come after 339
  means length doesn't matter in lexicographic order