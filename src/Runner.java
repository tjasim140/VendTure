//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        //new MyFrame();
        Scanner s = new Scanner(System.in);
        StoryLine n = new StoryLine();
        Subject m = new Subject();
        String continueS = "";
        while (!continueS.equals("no")) {
            System.out.println("Welcome!\nTo start, type Math, History, or Spanish. If you don't know what to choose, type random!: ");
            String x = s.nextLine().toLowerCase();//button
            System.out.println("You chose: "+x);
            int y = m.getSubject(x);
////            String line = "1234";
////            for (int i = line.length()-1; i>0;i--){
////            int num = (int) (Math.random()*(line.length()-1) + 1);
////            num = Integer.parseInt(String.valueOf(line.charAt(num)));
////            line = line.substring(0, line.indexOf(num)) + line.substring(line.indexOf(num) + 1
            int score = 0;
            for (int i=1; i<=4;i++){
                String choice = n.choice(y,i);
                System.out.println(choice);
                System.out.println("\nAnswer: ");
                String ans = s.nextLine().toLowerCase();
                String reply = m.answer(y, i, ans);
                if ((reply).contains("Correct!")) {
                    score++;
                }
                System.out.println(reply);
            }

            System.out.println("\nYou got "+score+"/4 correct!");
            System.out.println("Would you like to try again?: ");
            continueS = s.nextLine();
            continueS = continueS.toLowerCase(Locale.ROOT);
        }
    }
}