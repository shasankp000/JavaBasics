import java.util.Arrays;

public class array {



    public static void main(String[] args) {

        // initializing and declaring an array
        int[] arr = new int[5];

        // setting elements of an array
        arr[0] = 1;
        arr[1] = 2;

        // reading the elements of the array.

        System.out.println(Arrays.toString(arr));

        // declaring an array with already known elements
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr2));

       // Some array methods
        // getting the length of the array
        System.out.println("Length of array = " + arr2.length);

        // sorting the array in ascending order

        int[] arr3 = {3,1,5,2,8};

        System.out.println("Array before sorting: " + Arrays.toString(arr3));

        Arrays.sort(arr3);

        System.out.println("Array after sorting: " + Arrays.toString(arr3));

        // Multi-dimensional arrays
        int[][] arr4 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("A two dimensional array: " + Arrays.deepToString(arr4)); // to print the multidimensional array



    }

}
