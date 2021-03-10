package edu.ntnu.IDATT2001;

/**
 * The type Remove exception.
 */
public class RemoveException extends Exception{
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Remove exception.
     *
     * @param RemoveExceptionText the remove exception text
     */
    public RemoveException(String RemoveExceptionText){
        super("Could not remove " + RemoveExceptionText + ". \n");
    }
}
