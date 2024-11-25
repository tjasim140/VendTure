
public class StoryLine {
    private String subject;
    private Subject subInt = new Subject(subject);
    public StoryLine(String subject){
        Subject subInt;
        this.subject=subject;
    }

    // takes the subject the user chose and returns corresponding questions and answer checks by calling other methods
    public String choice (int subject,int num){
        if (subject == 1){
            return subInt.getMath(num);
        }
        if (subject == 2){
            return subInt.getHistory(num);
        }
        if (subject == 3){
            return subInt.getSpanish(num);
        }
        return "";
    }
}