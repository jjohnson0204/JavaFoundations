package Chapter1;

public class PP1_2 {
    /*  Introduce the following errors, one at a time, into the program from Programming Project 1.1.
        Record any error messages that the compiler produces. Fix the previous error each time, before you introduce a new one.
        If no error messages are produced, ex-plain why. Try to predict what will happen before you make each change.
        a.change Test to test
        b.change Emergency to emergency
        c.remove the first quotation mark in the string
        d.remove the last quotation mark in the string
        e.change main to man
        f.change println to bogus
        g.remove the semicolon at the end of the println statement
        h.remove the last brace in the program
    */

    /*  a. class name change requires new java class to be created
        b. no error
        c. unclosed string literal
        d. unclosed string literal
        e. Error: Main method not found in class Chapter1.PP1_2, please define the main method as:
            public static void main(String[] args)
            or a JavaFX application class must extend javafx.application.Application
        f. cannot find string method bogus(java.lang.String)
        g. java: ';' expected
        h. java: reached end of file while parsing
    */
    public static void main(String[] args) {
        System.out.println("An emergency Broadcast");
    }
}