import java.util.Scanner;

public class NumberToString {

  // here we are creating the problem:
  // through which we will convert the (number) into the (string):
  // acc to the multiples we get form our input-number and those numbers get matches with our problem  conditions:
  // for-ex; if the input-number is 3, then the output will be "Fizz" and etc:

  public static void main(String[] args) {

    // we are using the (scanner) method of (java) to get the (number-input) from (user):

    Scanner scanner = new Scanner(System.in);

    // here we gave some output to the (user):
    // so that (users) knows they need to gave some input to this program:
    System.out.println("please Enter Number: "); 

    // here we are getting the (number-input) from the (user):
    // for getting the number from the (user):
    // we will use the (nextInt) method of the (Scanner) function:
    int N = scanner.nextInt();

    // after getting the number input from the (user):
    // we need to run the (for-loop) on that number from (1) to (number of input) we get:


    for (int i = 1; i <= N; i++) {

      // Under the for-loop:we will first write our Base-condition of problem:
      if ( i % 3 == 0 && i % 5 == 0){
        System.out.println("fizzBuzz");
      }
      // after the base condition:we will create the code for our problem:
      else if (i % 3 == 0){
        System.out.println("fizz");
      }else if(i % 5 == 0){
        System.out.println("BUzz");
      }else{
        // Important part of problem:
        // if user input-number did not match.
        // with any of the uper condition.then we need to print the Input-number.
        // acc to our for-loop sequence:

        System.out.println(i);
      }

    }
  }
}
