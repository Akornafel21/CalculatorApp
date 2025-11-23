package uebung4.exceptions;

/**
 * Wird geworfen, wenn ein ungültiger Name übergeben wird.
 */
public class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
}