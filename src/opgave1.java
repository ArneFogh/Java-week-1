import java.util.Scanner;

public class opgave1 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner ageSc = new Scanner(System.in);
        int inputAge = ageSc.nextInt();
        age = inputAge;
        if (age > 17){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}
