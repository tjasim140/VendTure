import java.util.Locale;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String continueS = "";
        while (!continueS.equals("no")) {
            System.out.println("Welcome to VendTure!\nA fun way to practice what you know\nTo start, type Math, History, or Spanish. If you don't know what to choose, type random!: ");
            String x = s.nextLine().toLowerCase();
            System.out.println("You chose: " + x);
            Subject m = new Subject(x);
            StoryLine n = new StoryLine(x);
            int y = m.getSubject();
            // If user does not enter valid subject, asks user to try again until valid subject is entered
            while (y == 0) {
                System.out.println("\n Sorry, that is not an option, try again!");
                System.out.println("\n\nTo start, type Math, History, or Spanish. If you don't know what to choose, type random: ");
                x = s.nextLine().toLowerCase();
                System.out.println("You chose: " + x);
                m = new Subject(x);
                n = new StoryLine(x);
                y = m.getSubject();
            }
            int score = 0;

            String isCorrect = "";
            for (int i = 1; i <= 4; i++) {
                String choice = n.choice(y,i);
                System.out.println(choice);
                System.out.println("\nAnswer: ");
                String ans = s.nextLine().toLowerCase();
                String reply = m.answer(y, i, ans);
                System.out.println(reply);
                if ((reply).contains("Correct!")) {
                    score++;
                }
                if (reply.contains("Correct!")&&i==4){
                    isCorrect = "true";
                }
            }

            Ending end = new Ending(score,y, isCorrect);
            System.out.println("\n"+end.ending(isCorrect));
            System.out.println("\nYou got " + score + "/4 correct!");
            System.out.println("\nWould you like to try again?: ");
            continueS = s.nextLine();
            continueS = continueS.toLowerCase(Locale.ROOT);
        }
    }
}