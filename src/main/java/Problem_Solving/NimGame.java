
//292. Nim Game (LeetCode)

package Problem_Solving;

public class NimGame {

    public boolean canWinNim(int n) {

//if n%4==0, the first player will always lose if the second player plays optimally. This is because:
        //No matter how many stones (1, 2, or 3) the first player removes, the second player can always adjust to make the remaining stones a multiple of 4.
        //Example: If n=8, and you remove 1 stone (leaving 7), your opponent removes 3 stones (leaving 4). The process repeats until you lose.
        //if n%4!=0, the first player can always win by making the number of remaining stones a multiple of 4 for the second player.


        if(n%4==0)
            return false;

        return true;


        //return n%4!=0;


    }

    public static void main(String[] args){
        NimGame solution = new NimGame();

        boolean result =solution.canWinNim(4);
        System.out.println(result);

    }
}
