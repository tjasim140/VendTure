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
            System.out.println("Welcome!: ");
            String x = s.nextLine();//button
            int y = m.getSubject(x);
            int score = 0;
//            String line = "1234";
////            for (int i = line.length()-1; i>0;i--){
////            int num = (int) (Math.random()*(line.length()-1) + 1);
////            num = Integer.parseInt(String.valueOf(line.charAt(num)));
////            line = line.substring(0, line.indexOf(num)) + line.substring(line.indexOf(num) + 1);
//
            for (int i=1; i<=4;i++){
                String choice = n.choice(y,i);
                System.out.println(choice);
                System.out.println("\nAnswer: ");
                String ans = s.nextLine();
                System.out.println(m.answer(y, i, ans));
                if (m.answer(y, i,ans).equals("Correct!")){
                    score++;
                }
            }
            System.out.println("You got "+score+"/4 correct!");
            System.out.println("Would you like to try again?: ");
            continueS = s.nextLine();
        }
    }
}