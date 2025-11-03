package uebung4.exceptions;

/**
 * Wird geworfen, wenn eine ID bereits vergeben ist.
 */
public class DuplicateIdException extends Exception {
    public DuplicateIdException(String message) {
        super(message);
    }
}
