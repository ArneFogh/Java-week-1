import java.util.Scanner;

public class opgave4 {
    public static void main(String[] args) {

        Scanner nameSc = new Scanner(System.in);

        System.out.println("Enter your full name here, you can only add 3 names");

        String fullName = nameSc.nextLine();

        //For at kunne fortælle Java at denne string skal være et array skal vi
        //derfor tilføje [] efter variablen String
        String[] nameSplitter = fullName.split(" ");

        //For at fortælle Java at det kun er det første bogstav i navnet vi vil have,
        //skal vi fortælle den at den skal finde det bogstav på index 0, og at den skal stoppe på index 1
        String firstName = nameSplitter[0].substring(0,1);

        String secondName = nameSplitter[1].substring(0,1);

        //Her fortæller vi bare Java at den skal sætte hele navnet ind i variablen "lastName"
        //for at få hele efternavnet
        String lastName = nameSplitter[2];

        //Her fortæller jeg den at den skal printe den system input som den har fået ud,
        //efter den har omdannet det til initialer og sat punktum efter
        System.out.println(firstName + ". " + secondName + ". " + lastName + ".");
    }
}
