import java.util.Scanner;

public class oddoreven {

    public static void main(String[] args) {

        System.out.println("Please input a number to check if it is odd or even: ");

        int userNumber = 0;

        Scanner scan= new Scanner(System.in);
        userNumber = scan.nextInt();

        if (userNumber % 2 == 0)
        {
            System.out.println(userNumber+" is an even number.");
        }
        else
        {
            System.out.println(userNumber+" is an odd number.");
        }

    }

}
