/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twentyone.exceptions;

/**
 *

 */
public class TwentyOneException extends Exception {

    public TwentyOneException() {
    }

    public TwentyOneException(String message) {
        super(message);
    }

    public TwentyOneException(String message, Throwable cause) {
        super(message, cause);
    }

    public TwentyOneException(Throwable cause) {
        super(cause);
    }
    
}
