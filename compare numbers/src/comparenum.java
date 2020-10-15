import java.util.Scanner;

public class comparenum {

    public static void main(String[] args) {

        //int firstNum = 0;
        //int secondNum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number for comparison");
        int firstNum = scan.nextInt();

        System.out.println("Please enter second number for comparison");
        int secondNum = scan.nextInt();

        if(firstNum>secondNum) {
            System.out.println("Your first number "+firstNum+" is larger than your second number "+secondNum);
        }
        else{
            System.out.println("Your second number "+secondNum+" is larger than your first number "+firstNum);
        }

    }

}
