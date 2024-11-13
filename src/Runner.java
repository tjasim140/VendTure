import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StoryLine n = new StoryLine();
        Subject m = new Subject();
        System.out.println("Welcome! What subject?: ");
        String x = s.nextLine();
        String continueS = "";
        System.out.println("...");//placeholder for script
        while (!continueS.equals("no")) {
            n.choice(m.randomSubject());
            System.out.println("Would you like to try again?");
            continueS = s.nextLine();
        }
    }
}
