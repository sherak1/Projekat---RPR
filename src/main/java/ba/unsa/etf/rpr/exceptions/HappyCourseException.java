
package ba.unsa.etf.rpr.exceptions;

/**
 * User defined Exception - HappyCourseException
 */
public class HappyCourseException extends Exception {
    public HappyCourseException(String message, Exception reason) {
        super(message, reason);
    }

    public HappyCourseException(String message) {
        super(message);
    }
}