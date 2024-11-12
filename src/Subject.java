public class Subject {
    // assigns number to subject
    public int getSubject (String subject){
        if (subject.equals("math")){
            return 1;
        }
        if (subject.equals("history")){
            return 2;
        }
        if (subject.equals("something")){
            return 3;
        }
        if (subject.equals("random")){
            return randomSubject();
        }
        return 0;
    }
    //chooses random subject
    public int randomSubject (){
        return (int) (Math.random()*3+1);
    }
    //returns question
    public String getMath(int ran){
        String line = "1234";
        String ranS = ""+ran;
        for (int i=1; i <= line.length();i++){
            if (ranS.equals("1")){
                return "q";
            }
            if (ranS.equals("2")){
                return "q1";
            }
            if (ranS.equals("3")){
                return "q2";
            }
            if (ranS.equals("4")){
                return "q3";
            }
            line = line.substring(0,ran)+(ran);
        }
        return "";
    }
    public String getHistory(int ran){
        String line = "1234";
        String ranS = ""+ran;
        for (int i=1; i <= line.length();i++){
            if (ranS.equals("1")){
                return "q";
            }
            if (ranS.equals("2")){
                return "q1";
            }
            if (ranS.equals("3")){
                return "q2";
            }
            if (ranS.equals("4")){
                return "q3";
            }
        }
        return "";
    }
    public String getOther(int ran){
        String line = "1234";
        String ranS = ""+ran;
        for (int i=1; i <= line.length();i++){
            if (ranS.equals("1")){
                return "1.q";
            }
            if (ranS.equals("2")){
                return "2.q1";
            }
            if (ranS.equals("3")){
                return "3.q2";
            }
            if (ranS.equals("4")){
                return "4.q3";
            }
        }
        return "";
    }
    public String answer(int ran, String answer){
        if (ran == 1){
            if (answer.equals("...")){
                return "Correct!";
            }
            else{
                return "Incorrect";
            }
        }
        if (ran == 2){
            if (answer.equals("...")){
                return "Correct!";
            }
            else{
                return "Incorrect";
            }
        }
        if (ran == 3){
            if (answer.equals("...")){
                return "Correct!";
            }
            else{
                return "Incorrect";
            }
        }
        if (ran == 4){
            if (answer.equals("...")){
                return "Correct!";
            }
            else{
                return "Incorrect";
            }
        }
        return "";
    }
}


