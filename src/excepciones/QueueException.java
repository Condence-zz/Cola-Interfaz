/**
 * QueueException.java
 */
package excepciones; 
public class QueueException extends RuntimeException {
    /**
     *  Constructor por omisión 
     */
    public QueueException() {
    }
    /**
     * Constructor con el mensaje de error.
     * 
     * @param msj Mensaje de error a mostrar.
     */
    public QueueException(String msj) {
        super(msj);
    }   
} 