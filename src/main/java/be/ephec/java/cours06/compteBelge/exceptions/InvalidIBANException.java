package be.ephec.java.cours06.compteBelge.exceptions;

public class InvalidIBANException extends Exception {
    public InvalidIBANException(String message) {
        super(message);
    }
}
