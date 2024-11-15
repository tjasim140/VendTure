//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StoryLine n = new StoryLine();
        System.out.println("Welcome! What subject?: ");
        String x = s.nextLine();
        Subject m = new Subject();
        String continueS = "";
       System.out.println("...");//placeholder for script
        while (!continueS.equals("no")) {
            continueS = "";
            int y = m.getSubject(x);
            System.out.println(n.choice(x));
            String choice = n.choice(x);
            int question = Integer.parseInt(choice.substring(0,1));
            System.out.println("Answer: ");
            String ans = s.nextLine();
            System.out.println(y);
            System.out.println(question);
            System.out.println(ans);
            System.out.println(m.answer(y,question-3,ans));
            System.out.println("Would you like to try again?: ");
            continueS = s.nextLine();
            System.out.println("Welcome! What subject?: ");
            x = s.nextLine();
            }
        }
    }