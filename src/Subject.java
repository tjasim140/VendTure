public class Subject {
//    String subject;
//    // assigns number to subject
//    public Subject (String subject){
//        this.subject=subject;
//    }
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
            if (ran==1){
                return "What is 3*3?";
            }
            if (ran==2){
                return "What is 2+5?";
            }
            if (ran==3){
                return "What are the first 3 digits of pi?";
            }
            if (ran==4){
                return "What is the slope formula?";
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
    public String answer(int subject,int ran, String answer){
        String isCorrect ="";
        if ((ran == 1)&&(subject==1)){
            if (answer.equals("9")){
                isCorrect = "Correct!";
                return isCorrect;
            }
            else{
                isCorrect = "Incorrect";
                return isCorrect;
            }
        }
        else if ((ran == 2)&&(subject==1)){
            if (answer.equals("7")){
                isCorrect = "Correct!";
                return isCorrect;
            }
            else{
                isCorrect = "Incorrect";
                return isCorrect;
            }
        }
        else if ((ran == 3)&&(subject==1)){
            if (answer.equals("3.14")){
               isCorrect = "Correct!";
                return isCorrect;
            }
            else{
                isCorrect = "Incorrect";
                return isCorrect;
            }
        }
        else if ((ran == 4)&&(subject==1)){
            if (answer.equals("y2-y1/x2-x1")){
                isCorrect = "Correct!";
                return isCorrect;
            }
            else{
                isCorrect = "Incorrect";
                return isCorrect;
            }
        }
        return isCorrect;
    }
}