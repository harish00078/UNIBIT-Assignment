import java.util.Scanner;

public class CheckPrime {

  public static void main(String[] args) {
    // use scanner to get (input) from the (user):
    Scanner scanner = new Scanner(System.in);

    System.out.println("please enter the Number: ");

    // we need to use (nextInt) method.
    // here because we want the interger input from the (user):
    int N = scanner.nextInt();

    // we use the boolean here to repersent the output of our code:
    // because in this code we will only get the two outputs:
    // so we can gave those two output values to the (true) and (false):

    // IMP => we are creating the function differently to check:
    // that the input we get is have prime number or not in it:
    boolean isPrime = isPrime(N);

    // here we write output statement conditions:
    // acc to our function's output:
    // like = if we have (true) condition.then means our input is prime-number:
    // if we get (false):then it means that we did not have prime-number in our output:
    if (isPrime) {
      System.out.println("Prime");
    } else {
      System.out.println("NotPrime");
    }
  }

  // here we the function or method to the number
  // we get as input from the use is prime or not:
  private static boolean isPrime(int number) {
    // we also need to check the base condition first:
    if (number <= 1) {
      return false;
    }

    // after that we will write code for checking the number is prime or not:

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false; // If the number is divisible by any number other than 1 and itself, it's not prime
      }
    }

    return true; // If no divisors other than 1 and itself are found, the number is prime
  }
}
