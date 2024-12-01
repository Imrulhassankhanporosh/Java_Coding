//70. Climbing Stairs (LeetCode)
package Problem_Solving;

public class ClimbingStairs {

    public int climbStairs(int n){

        //Fibonacci sequence

        if (n ==1)
            return 1;  // Base case
        if (n==2)
            return 2;  // Base case

        int first =1; // ways to reach step 1
        int second =2; // ways to reach step 1
        int current =0;


        for(int i=3;i<=n;i++){

            current=first+second; // Sum of the last two steps
            first=second; // Move the first pointer
            second=current; // Move the second pointer

        }
        return current;

    }

    public static void main(String[] args){
        ClimbingStairs solution = new ClimbingStairs();
        int result =solution.climbStairs(5);
        System.out.println(result);
    }
}
