public class Subject {

    // assigns number to subject
    public int getSubject (String subject){
        if (subject.contains("math")){
            return 1;
        }
        if (subject.contains("history")){
            return 2;
        }
        if (subject.contains("spanish")){
            return 3;
        }
        if (subject.contains("random")){
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
                return "What was the first colony of the U.S?";
            }
        return "";
    }
    public String getSpanish(int ran){
            if (ran==1){
                return "Translate: Enojado";
            }
            if (ran==2){
                return "Translate: Frio";
            }
            if (ran==3){
                return "Translate: Arbol";
            }
            if (ran==4){
                return "Translate: Pescado";
            }
        return "";
    }

    //Checks user input and returns weather the answer was correct or not
    public String answer(int subject,int q, String answer){
        String isCorrect ="";

        //Checks math questions
        if (subject==1){
            if (q ==1){
                if (answer.equals("9")){
                    isCorrect = "\nCorrect!";
                    return isCorrect + "\nAfter figuring out how many of the strange cards there are,...";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 9";
                    return isCorrect+ "\nblah blah blah";
                }
            }
            if (q==2){
                if (answer.equals("7")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nblah blah blah";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 7";
                    return isCorrect+ "\nblah blah blah";
                }
            }
            if (q==3){
                if (answer.equals("3.14")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nblah blah blah";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 3.14";
                    return isCorrect+ "\nblah blah blah";
                }
           }
            if (q==4){
                if (answer.equals("y2-y1/x2-x1")){
                    isCorrect = "\nCorrect!";
                    return isCorrect + "\nblah blah blah";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: y2-y1/x2-x1";
                    return isCorrect + "\nblah blah blah";
                }
            }
        }

        //Checks History questions
        if (subject==2){
            if (q ==1){
                if (answer.equals("1848")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nblah blah blah";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 1848";
                    return isCorrect+ "\nblah blah blah";
                }
            }
            else if (q ==2){
                if (answer.equals("andrew jackson")){
                    isCorrect = "\nCorrect!";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: Andrew Jackson";
                }
                return isCorrect+ "\nblah blah blah";
            }
            else if (q==3){
                if (answer.equals("1861")){
                    isCorrect = "\nCorrect!";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 1861";
                }
                return isCorrect+ "\nblah blah blah";
            }
            else if (q ==4){
                if (answer.equals("jamestown")){
                    isCorrect = "\nCorrect!";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: Jamestown";
                }
                return isCorrect+ "\nblah blah blah";
            }
        }

        //Checks Spanish questions
        if (subject==3){
            if (q==1){
                if (answer.equals("angry")||answer.equals("mad")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nblah blah blah";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: angry OR mad";
                    return isCorrect+ "\nblah blah blah";
                }
            }
            else if (q ==2){
                if (answer.equals("cold")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nblah blah blah";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: cold";
                    return isCorrect+ "\nblah blah blah";
                }
            }
            else if (q ==3){
                if (answer.equals("tree")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nblah blah blah";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: tree";
                    return isCorrect+ "\nblah blah blah";
                }
            }
            else if (q == 4){
                if (answer.equals("fish")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nblah blah blah";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: fish";
                    return isCorrect+ "\nblah blah blah";
                }
            }
        }

        return isCorrect;
    }
}