//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StoryLine n = new StoryLine();
        Subject m = new Subject();
        String continueS = "";
        while (!continueS.equals("no")) {
            System.out.println("Welcome! What subject?: ");
            String x = s.nextLine();
            int y = m.getSubject(x);
            String line = "1234";
            for (int i = line.length()-1; i>0;i--){
            int num = (int) (Math.random()*(line.length()-1) + 1);
            num = Integer.parseInt(String.valueOf(line.charAt(num)));
            line = line.substring(0, line.indexOf(num)) + line.substring(line.indexOf(num) + 1);
            String choice = n.choice(x, num);
            System.out.println(choice);
            int question = Integer.parseInt(choice.substring(0, 1));
            System.out.println("Answer: ");
            String ans = s.nextLine();
            System.out.println(m.answer(y, question, ans));
        }

            System.out.println("Would you like to try again?: ");
            continueS = s.nextLine();
    }
        }
    }