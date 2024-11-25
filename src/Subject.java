public class Subject {
    private final String subject;
    public Subject (String subject){
        this.subject=subject;
    }
    // assigns number to subject
    public int getSubject (){
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
                return "\nYou walk into your room with your new bag of chips and find a stack of cards on the table...\nSome are arranged in an interesting way\nThey form a 3 by 3 card display\nWhat is 3*3?";
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
                return "\nYou grab your chocolate bar and rush to get on the school bus...\nYou are on a school trip to the museum to learn about U.S history\nWhen the class gets there, the tour guide ushers you to see a document\nWhen was The Declaration of Sentiments written?";
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
                return "\nYou get some donuts to bring to your friend's house\nYou're going to your friend's house to experience Dia de los Muertos for the first time\nAs you are walking there however, you accidentally drop the donuts\nTranslate: Enojado";
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
                    return isCorrect + "\nAfter figuring out how many of the strange cards there are, the cards all magically split up into two groups";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 9";
                    return isCorrect+ "\nSuddenly, two of the cards from the center shrivelled up, and the remaining cards changed colors";
                }
            }
            if (q==2){
                if (answer.equals("7")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nOne group of 2 cards were gold, and the 5 left were silver.\nSome of the cards had some familiar numbers on them when flipped over.";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 7";
                    return isCorrect+ "\nThe 2 gold cards shrivelled up and disappeared\nLeaving 5 silver cards\nYou pick up one of the cards and see a circle drawn on it";
                }
            }
            if (q==3){
                if (answer.equals("3.14")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nPi? I love pie.\nSuddenly all of the cards flip over to become a drawing of a warm apple pie\nYou can almost smell it";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 3.14";
                    return isCorrect+ "\nThe circle looks a little peculiar.\nWith a closer look you see that it has a code in the center of it\nMaybe it's for that one mysterious locked box in your room\nthat you never thought to open before this bag of chips that you for some reason have";
                }
           }
            if (q==4){
                if (answer.equals("y2-y1/x2-x1")){
                    isCorrect = "\nCorrect!";
                    return isCorrect + "\nFor some reason, the slope formula in expanded form was the code to opening the mysterious box in your room\nLooking into the box, you find something...";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: y2-y1/x2-x1";
                    return isCorrect + "\nGuess that wasn't the code\nMaybe this box was meant to stay locked";
                }
            }
        }

        //Checks History questions
        if (subject==2){
            if (q ==1){
                if (answer.equals("1848")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nThe tour guide was excited to hear that you recognized the document\nShe got so excited that she couldn't stop going on and on about women's rights movements throughout history\nThankfully, your friend pulls you aside just in time to go get lunch";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 1848";
                    return isCorrect+ "\nThe tour guide could tell that no one really cared to learn about the document (she definitely shed a few tears after) so she decided to move on\nShe decided to move on to the Declaration of Independence instead and the Hall of Presidents";
                }
            }
            else if (q ==2){
                if (answer.equals("andrew jackson")){
                    isCorrect = "\nCorrect!";
                    return isCorrect + "\nTurns out the president was gifted a 1400 pound cheese when he was re-elected\nYou decide to pass on that cheeseburger for lunch\nThe whole class regathers, but you decide to explore on your own\nYou find an intriguing painting";
                }
                else {
                    isCorrect = "\nIncorrect\nThe correct answer was: Andrew Jackson";
                    return isCorrect + "\nUnfortunately, one of the staff thought that your name was Andrew Jackson and thought that they should gift you a 1400 pound wheel of cheese\nOr maybe you like cheese\nEither way you have to wheel this around for the rest of the trip\nEventually you bump into a painting you couldn't see behind the wheel of cheese";
                }
            }
            else if (q==3){
                if (answer.equals("1861")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+"\nYou recognized the painting from the Civil War\nYou admire the craftsmanship for a while\nAs you turn to go back you catch a glimpse of one of the soldiers winking at you\nMaybe it was all in your head";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: 1861";
                    return isCorrect+"\nYou didn't recognize the painting thinking that it was from a movie or something\nAs you turn away from the painting you see something shiny out of the corner of your eye\nAll of sudden something tackles you from behind...a soldier?\nFrom the painting?\nNot knowing what to do you stop drop and roll\nThankfully, another soldier comes out of the painting and drags the one on top of you back into the painting\nMaybe he just wasn't having a good day";
                }
            }
            else if (q ==4){
                if (answer.equals("jamestown")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nWhen you catch up with your class you find them learning about the colonies\nSince you were able to sneak in and answer the question correctly, the teacher didn't notice you ever slipped away";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: Jamestown";
                    return isCorrect+"\nYour teacher got suspicious that you weren't paying attention and decided that you should get homework today based on the trip";
                }

            }
        }

        //Checks Spanish questions
        if (subject==3){
            if (q==1){
                if (answer.equals("angry")||answer.equals("mad")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nYou decide to not be mad, and find yourself passing by a bakery\nFrom the bakery you buy wonderful croissants instead, which you know are your friend's favorite\nStaying calm, you carry on to your friends house, passing by the river";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: angry OR mad";
                    return isCorrect+ "\nYou get furious and get mad at yourself for being so clumsy\nHearing the ruckus, a baker from the nearby bakery comes over to see what is wrong\nAfter seeing the donuts he instantly understands and is disappointed by the waste as well\nTo help, he hands you a box of fresh muffins which you get to take to you friend's house instead!\nAs you continue on the journey you realize you have to pass by the river";
                }
            }
            else if (q ==2){
                if (answer.equals("cold")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nYou shiver from the cold but remember that you brought your friend coat in yor bag which you forgot to give back last time you saw them months ago\nIm sure they'll understand why you needed it for so long";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: cold";
                    return isCorrect+ "\nFreezing in the cold, you decide to thug it out and speed walk the rest of the way there\nHopefully you don't slip or crash into something, you can risk dropping the dessert again";
                }
            }
            else if (q ==3){
                if (answer.equals("tree")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nOn your way, you get to tak a moment to enjoy the beautiful colors of the trees\nMother nature really is talented\nLook! In the water!";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: tree";
                    return isCorrect+ "\nAs you rush to get there in time, you did not notice the tree right in front of you and crash right into it\nThankfully the baked goods survived and yoy are only a little scraped up and embarrassed!\nThe thought reminds you of a childhood friend";
                }
            }
            else if (q == 4){
                if (answer.equals("fish")){
                    isCorrect = "\nCorrect!";
                    return isCorrect+ "\nSimilar to your childhood pet, you see fish jumping in and out of the river!\nOf course your fish never survived long enough to become so big, being a surprisingly clumsy fish\nBut still, what a wholesome, nostalgic thought!\nYou start to see your friend's house in the distance";
                }
                else{
                    isCorrect = "\nIncorrect\nThe correct answer was: fish";
                    return isCorrect+ "\nYou remember only how your pet fish left you after you thought it would be a good idea to take your fish on a walk\nFeeling saddened all of sudden by it's memory, you decide to quickly move one\nYou realize you are almost there";
                }
            }
        }

        return isCorrect;
    }
}