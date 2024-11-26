/**
 * Creates subject object to call methods within StoryLine class to be organized by user input
 * the StoryLine class represents a StoryLine that can be created based on a given subject, either Math, History, or Spanish
 **/
public class StoryLine {
    private String subject;
    private final Subject subInt = new Subject(subject);

    /**
     *Constructor for the StoryLine class, creating a new instance of a StoryLine given the below parameter
     * @param subject represents the subject which the questions will be related to, which the user wants to study
     */
    public StoryLine(String subject){
        Subject subInt;
        this.subject=subject;
    }

    /**
     * The choice method for the StoryLine class
     * This method will return corresponding questions and answer checks by calling other methods
     * @param subject represents the subject that the user wants to answer questions of
     * @param num represents the question number that has to be returned
     * @return returns the method getMath, getHistory, or getSpanish from Subject class object subInt as a string, formatting and returning questions
     */
    public String choice (int subject,int num){
        if (subject == 1){
            return subInt.getMath(num);
        }
        if (subject == 2){
            return subInt.getHistory(num);
        }
        if (subject == 3){
            return subInt.getSpanish(num);
        }
        return "";
    }
}