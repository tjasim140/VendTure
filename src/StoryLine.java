import java.util.Scanner;
public class StoryLine {
    // takes the subject the user chose and returns corresponding questions and answer checks by calling other methods
    public void choice (String subject){
        Scanner s = new Scanner(System.in);
        Subject m = new Subject();
        int b = m.getSubject(subject);
        if (b == 1){
            String line = "1234";
            for (int i = 0; i<=line.length()-1;i++) {
                int y = (int) (Math.random()* line.length()+1);//fix random after number q gets removed
                mathLine(y);
                line = line.substring(0, y) + (y);
                System.out.println("Answer: ");
                String ans = s.nextLine();
                m.answer(b, y,ans);
            }
        }
        if (b == 2){
            String line = "1234";
            for (int i = 0; i<=line.length()-1;i++) {
                int y = (int) (Math.random() * line.length() + 1);
                historyLine(y);
                line = line.substring(0, y) + (y);
                System.out.println("Answer: ");
                String ans = s.nextLine();
                m.answer(b, y,ans);
            }
        }
        if (b == 3){
            String line = "1234";
            for (int i = 0; i<=line.length()-1;i++) {
                int y = (int) (Math.random() * line.length() + 1);
                otherLine(y);
                line = line.substring(0, y) + (y);
                System.out.println("Answer: ");
                String ans = s.nextLine();
                m.answer(b,y,ans);
            }
        }
    }
    public String mathLine(int num){
        String script1 = "blah blah blah";
        Subject n = new Subject();
        return script1+n.getMath(num);
    }
    public String historyLine(int num){
        String script1 = "blah blah blah";
        Subject n = new Subject();
        return script1+n.getHistory(num);
    }
    public String otherLine(int num){
        String script1 = "blah blah blah";
        Subject n = new Subject();
        return script1+n.getOther(num);
    }
}