public class StoryLine {
    Subject m = new Subject();

    // takes the subject the user chose and returns corresponding questions and answer checks by calling other methods
    public String choice (String subject,int num){
        int b = m.getSubject(subject);
        if (b == 1){
                int y = (int) (Math.random()*3+1);
                return num + mathLine(num);
        }
        if (b == 2){
                int y = (int) (Math.random() *3 + 1);
               return num + historyLine(num);
        }
        if (b == 3){
                int y = (int) (Math.random() *3+ 1);
                return num + otherLine(num);
        }
        return "";
    }
    public String mathLine(int num){
        String script1 = "blah blah blah\n";
        return script1 + m.getMath(num);
    }
    public String historyLine(int num){
        String script1 = "blah blah blah\n";
        return script1+m.getHistory(num);
    }
    public String otherLine(int num){
        String script1 = "blah blah blah\n";
        return script1+m.getOther(num);
    }
}