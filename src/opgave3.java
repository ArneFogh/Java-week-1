import java.util.Scanner;

public class opgave3 {
    public static void main(String[] args) {
        Scanner evenOddSc = new Scanner(System.in);

        System.out.println("Enter a number:");

        int userInput = evenOddSc.nextInt();

        // Denne kode viser om tallet enten kan divideres med 2 eller er ligmed 0. "%" er divideringstegnet
        boolean isNumberEven = (userInput % 2 == 0);

        if (isNumberEven){
            System.out.println(userInput + " is even. True");
        }
        else {
            System.out.println(userInput + " is not even. False");
        }
    }
}
