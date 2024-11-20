
public class StoryLine {
    Subject m = new Subject();

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
        String script1 = "\nblah blah blah\n";
        return script1 + m.getMath(num);
    }
    public String historyLine(int num){
        String script1 = "\nblah blah blah\n";
        return script1+ m.getHistory(num);
    }
    public String spanishLine(int num){
        String script1 = "\nblah blah blah\n";
        return script1 + m.getSpanish(num);
    }
}