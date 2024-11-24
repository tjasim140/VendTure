public class Ending {
    private int score;
    private String end;
    private int subject;
    private String isCorrect;
    public Ending (int score, int subject, String isCorrect){
        this.score=score;
        this.subject=subject;
        this.isCorrect=isCorrect;
    }
    public boolean isMajority(int score){
        return score > 2;
    }
    public String ending(String isCorrect){
        if (isMajority(score)){
            if (subject==1&&isCorrect.equals("true")){
                end = "Inside the box, you find a large ANYTHING YOU WANT pie\nIts becomes any flavor pie you want!\nCongrats!";
            }
            else if (subject==1&& isCorrect.isEmpty()){
                end =  "You decide to sit down and finish your bag of chips\nA few seconds later you hear your best friend downstairs\nThey bought cookies! Its not pie but it'll do\nKeep Practicing!";
            }
            else if (subject==2&&isCorrect.equals("true")){
                end = "Everyone was very impressed with how much you knew about history\nSo much so that they awarded you with the \"History Prodigy\" award\nBravo!";
            }
            else if (subject==2&& isCorrect.isEmpty()){
                end = "As a last minute resort, you start frantically reciting everything you know about U.S history\nBeing very impressed with how much you knew (or out of pity) the teacher decided to let it slide this one time\nJust make sure you know your colonies just in case!\nKeep Practicing!";
            }
            else if (subject==3&&isCorrect.equals("true")){
                end = "Being in a good mood the rest of the way, you knock on the door confidently\nYour friend and their mother open the door and greet you warmly\nYou were just in time for the celebration!\nGood Job!";
            }
            else if (subject==3&& isCorrect.isEmpty()){
                end = "Although you miss your fish, you won't let that stop you from having a good time\nYou get to your friends house and your friend opens the door\nYou are just in time for the even and get along with everyone being able to use your amazing spanish speaking skills!\nKeep Practicing!";
            }

        }
        else if (!isMajority(score)){
            if (subject==1&& isCorrect.equals("true")){
                end = "Inside the box you find...a key chain\n...\nYep just a keychain...\nOF A PIE\nThat's kinda cool\n I wonder what would've happened if so many cards didn't shrivel up\nKeep Practicing!";
            }
            else if (subject==1&&isCorrect.isEmpty()){
                end =  "You decide to just finish your bag of chips forever wondering what could have been in that box\nKeep Practicing!";
            }
            else if (subject==2&& isCorrect.equals("true")){
                end = "At the end of the trip, the decides to give out an optional extra credit assignment\nYou get excited think that tis will help your grade out a lot, but unfortunately you couldn't remember much other than something about cheese\nBetter luck next time I guess!\nKeep Practicing!";
            }
            else if (subject==2&&isCorrect.isEmpty()){
                    end = "You leave the trip stressed thinking about all of the work you have to do later\nNext time, you probably shouldn't sneak away from class and should become a history textbook\nBetter luck next time! Keep Practicing!";
            }
            else if (subject==3&& isCorrect.equals("true")){
                end = "After taking a picture of the fish since you know your fish would have loved them, you decide to finally get to your friend's place\nWhen you go to knock on the door, your friend's mom answers\nTurns out you go too distracted by the fish and missed all of the events\nNow your friend is upset at you\nMaybe next time if you don't get so caught up on the fish you could make it there in time\nKeep Practicing!";
            }
            else if (subject==3&&isCorrect.isEmpty()){
                end = "After shedding a few tears for your deceased fish you decide to make your way to your friends house\nYou walk up the steps and knock on the door\nAn old lady answers the door\nShe is not your friend's abuela\nTurns out you walked to the wrong house since your tears made it so hard to see where you were going \nThe old woman invites you in and starts telling you stories while you try not to accidentally step on one of her million cats that keep her company\nMaybe next time you will get to the right house on time\nKeep Practicing!";
            }
        }
        return end;
    }
}
