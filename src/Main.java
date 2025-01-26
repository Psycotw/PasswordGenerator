import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("inserisci la lunghezza della password: ");

        int passwordLenght = scanner.nextInt();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < passwordLenght; i++) {
            char randomChar = (char) (' ' + random.nextInt(95));
            passwordBuilder.append(randomChar);

        }
        String password = passwordBuilder.toString();

        //String CensuredPassword = password.replaceAll("[^ ]" , "*");

        System.out.println(password);
        //option
        //System.out.println(CensuredPassword);

        scanner.close();

    }
}