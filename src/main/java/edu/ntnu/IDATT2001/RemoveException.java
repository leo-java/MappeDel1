package edu.ntnu.IDATT2001;

public class RemoveException extends Exception{
    private static final long serialVersionUID = 1L;
    public RemoveException(String RemoveExceptionText){
        super("Could not remove " + RemoveExceptionText + ". \n");
    }
}
