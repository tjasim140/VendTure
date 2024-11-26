/**
 * The PrintVend class represents a vending machine, consisting of strings that make up how it looks
 **/
public class PrintVend {
    /**
     * Constructor for the PrintVend class. This creates a new instance of a PrintVend vending machine not having any parameters
     */
    PrintVend(){
    }

    /**
     * The printMachine method of the PrintVend class. This will return a concatenated string that when printed will look like a vending machine
     *
     * @return Returns strings that when printed look like a vending machine with subjects
     */
    public String printMachine() {
        String a = ("\n _________________________ ");
        String b = ("\n|        VendTure         |");
        String c = ("\n|         Machine         |");
        String d = ("\n|_________________________|");
        String e = ("\n|  [1]   |  [2]  |  [3]   |");
        String f = ("\n|  Math  |History|Spanish |");
        String g = ("\n|________|_______|________|");
        String h = ("\n|  [4]   |  [5]  |  [6]   |");
        String i = ("\n| random |       |        |");
        String j = ("\n|________|_______|________|");
        String k = ("\n|  [7]   |  [8]  |  [9]   |");
        String l = ("\n|        |       |        |");
        String m = ("\n|________|_______|________|");
        String n = ("\n|_________________________|\n\n");
        return a+b+c+d+e+f+g+h+i+j+k+l+m+n;
    }
}
