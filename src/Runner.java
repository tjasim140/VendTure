import java.util.Locale;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String continueS = "";
        new MyFrame();
        PrintVend machine = new PrintVend();
        System.out.println(machine.printMachine());
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

            //Sets initial score to 0
            int score = 0;
            //null string that will become a parameter for ending() method
            //if string is updated to "true" then a different set of strings are able to be returned based on the score count which is dependent on user input
            String isCorrect = "";

            //iterates 4 times so that every question per subject is asked and the users answer for each is checked
            for (int i = 1; i <= 4; i++) {
                String choice = n.choice(y,i);
                System.out.println(choice);
                System.out.println("\nAnswer: ");
                String ans = s.nextLine().toLowerCase();//makes answers not case-sensitive
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
            continueS = continueS.toLowerCase(Locale.ROOT);//allows user to continue or end program
        }
    }
}