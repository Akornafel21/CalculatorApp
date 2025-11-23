package uebung4.exceptions;

/**
 * Wird geworfen, wenn eine ID bereits vergeben ist.
 */
public class DuplicateIdException extends RuntimeException {
    public DuplicateIdException(String message) {
        super(message);
    }
}
