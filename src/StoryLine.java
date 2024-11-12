public class StoryLine {
    public void choice (int subject){
        if (subject == 1){

        }
    }
    public String mathLine(int num){
        String script1 = "blah blah blah";
        int question = (int)(Math.random()*4+1);
        Subject n = new Subject();
        return script1+n.getMath(question);
    }
    public String historyLine(int num){
return "";
    }
    public String otherLine(int num){
return "";
    }
}
