
public class StoryLine {
    private String x;
    private Subject m = new Subject(x);
    public StoryLine(String x){
        Subject m;
        this.x=x;
    }

    // takes the subject the user chose and returns corresponding questions and answer checks by calling other methods
    public String choice (int subject,int num){
        if (subject == 1){
            return m.getMath(num);
        }
        if (subject == 2){
            return m.getHistory(num);
        }
        if (subject == 3){
            return m.getSpanish(num);
        }
        return "";
    }
}