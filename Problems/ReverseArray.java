
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        // we use (Scanner) function for getting the input from the (user):
        Scanner scanner = new Scanner(System.in);

        // here we write the print statement for the (user):
        //  so the (users) know that they need to enter the size of the (array):
        System.out.println("Please enter the size of the array: ");

        // we will get the size of the (array) in the (size) interger:
        int size = scanner.nextInt();

        // after that we need to create the (array) acc to the (size) of the (input):
        // which we are getting from the (user):

        // IMP = for creating the (array) we need to use the (new) method.
        // and with that method we need to define the (data-type).
        //  and after we can simply use the square-brackets ([]):
        // because the square-brackets repersents the (array):
        // and with in that square-brackets.we can repersent the  (size) of the array:
        // IMP = we also need to store this array in the variable:because other wise it will get removed in the java:
        // so for storing the array in the variable we need to repersent the square-brackets with variable:
        // so that the system knows this variable have a array values in it:

        int [] inputArray = new int[size];

        // after creating a empty array:
        // we need to get values for that array from the user:
        // so for doing that we need print the statement:
        // so the user knows that they need to gave input of the numbers:
        // acc to the array size they have created:
        System.out.println("Enter the elements of the array: ");

        // for getting the values of the array from the user:
        // we need to use the for loop for that:
        // so that we can get the input value for the array from the user:
        for (int i =0;i < size;i++){
            System.out.println("Enter Element" + (i + 1) + "; ");
            // after getting the value from the user:
            // we need to put it into the (array):
            inputArray[i] = scanner.nextInt();
        }

        // when we are returning the reverse array to the user:
        // => first we will print its original array:
        System.out.println("Original Array: " + Arrays.toString(inputArray));

        // and then we will reverse the original array  of the user:
        // with the method which we have created:
        reverseArray(inputArray);

        // => second after reversing it. we will print it to the (user):
        System.out.println("Reverse Array: " + Arrays.toString(inputArray));



    }

    // here we create the method or function:
    // through which we will reverse the user given array:
    // here we are creating the (private) function:
    private static void reverseArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

  
}
