

//Array: Prints fixed-size, single or multi-dimensional collections.

package DSA;

public class ArrayExample {

    public static void main(String[] args) {
        // Declaration and initialization
        int[] array = {10, 20, 30, 40, 50};

        // Accessing an element by index
        System.out.println("First element: " + array[0]); // Output: 10

        // Iterating over the array
        // for (int num : array) {
        //System.out.println("Number: " + num);
        for (int i = 0; i < array.length; i++)
            System.out.println("Number: " + array[i]);


        // Declaration and initialization
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing an element by row and column
        System.out.println("Element at (1,2): " + matrix[1][2]); // Output: 6

        // Iterating over the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("row "+(i+1)+" : column "+(j+1)+" : "+matrix[i][j]+" \n");
            }
        }
    }
}
