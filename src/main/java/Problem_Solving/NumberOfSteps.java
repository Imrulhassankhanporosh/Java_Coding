
// 1342. Number of Steps to Reduce a Number to Zero (LeetCode)

package Problem_Solving;

public class NumberOfSteps {

    public int numberSteps(int num){

        int count=0;

        while(num!=0)
        {
            if(num%2 ==0)
            {
                num=num/2;
            }
            else
            {
                num=num-1;
            }
            count++;
        }

        return count;
    }


    public static void main(String[] args) {
        NumberOfSteps steps = new NumberOfSteps();
        int result = steps.numberSteps(14);
        System.out.println(result);

    }
}
