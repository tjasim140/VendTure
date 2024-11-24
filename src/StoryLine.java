
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
            return mathLine(num);
        }
        if (subject == 2){
            return historyLine(num);
        }
        if (subject == 3){
            return spanishLine(num);
        }
        return "";
    }

    public String mathLine(int num){
        String script1 = "\nYou walk into your room with your new bag of chips and find a stack of cards on the table...\n";
        return script1 + m.getMath(num);
    }
    public String historyLine(int num){
        String script1 = "\nYou grab your chocolate bar and rush to get on the school bus...\n";
        return script1+ m.getHistory(num);
    }
    public String spanishLine(int num){
        String script1 = "\nYou get some donuts to bring to your friend's house\n";
        return script1 + m.getSpanish(num);
    }

}