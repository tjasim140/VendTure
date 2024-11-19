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
            if (ran == 1){
                return "When was The Declaration of Sentiments written?";
            }
            if (ran==2){
                return "Who was the person with the giant cheese wheel?";
            }
            if (ran==3){
                return "When was the Civil War?";
            }
            if (ran==4){
                return "What is..";
            }
        return "";
    }
    public String getOther(int ran){
            if (ran==1){
                return "1";
            }
            if (ran==2){
                return "2";
            }
            if (ran==3){
                return "3";
            }
            if (ran==4){
                return "4";
            }
        return "";
    }

    //Checks user input and returns weather the answer was correct or not ***simplify if statements so it checks for subject first then for the question #
    public String answer(int subject,int ran, String answer){
        String isCorrect ="";

        //Checks math questions
        if ((ran == 1)&&(subject==1)){
            if (answer.equals("9")){
                isCorrect = "\nCorrect!";
                return isCorrect + "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        else if ((ran == 2)&&(subject==1)){
            if (answer.equals("7")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        else if ((ran == 3)&&(subject==1)){
            if (answer.equals("3.14")){
               isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        else if ((ran == 4)&&(subject==1)){
            if (answer.equals("y2-y1/x2-x1")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }

        //Checks History questions
        if ((ran == 1)&&(subject==2)){
            if (answer.equals("9")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        else if ((ran == 2)&&(subject==2)){
            if (answer.equals("7")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        else if ((ran == 3)&&(subject==2)){
            if (answer.equals("3.14")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        else if ((ran == 4)&&(subject==2)){
            if (answer.equals("y2-y1/x2-x1")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }

        //Checks Other questions
        if ((ran == 1)&&(subject==3)){
            if (answer.equals("9")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        else if ((ran == 2)&&(subject==3)){
            if (answer.equals("7")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        else if ((ran == 3)&&(subject==3)){
            if (answer.equals("3.14")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        else if ((ran == 4)&&(subject==3)){
            if (answer.equals("y2-y1/x2-x1")){
                isCorrect = "\nCorrect!";
                return isCorrect+ "\nblah blah blah";
            }
            else{
                isCorrect = "\nIncorrect";
                return isCorrect+ "\nblah blah blah";
            }
        }
        return isCorrect;
    }
}