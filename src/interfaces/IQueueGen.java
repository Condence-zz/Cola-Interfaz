/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import excepciones.QueueException;

 
public interface IQueueGen<E> { 
    /**
     * Retorna true si esta llena o false si hay espacio.
     * 
     * @return <ul>
     *          <li> true: Si el arreglo esta lleno</li>
     *          <li> false: Si esta vacio o con espacio</li>
     *         </ul>
     */
    public boolean full();
    /**
     * Devuelve true si esta colección no contiene elementos.
     * 
     * @return <ul>
     *          <li>true: si se encuentra vacio</li>
     *          <li>false: si hay algun espacio</li>
     *         </ul>
     */
    public boolean empty();
    /**
     * Inserta el elemento especificado en esta cola.
     * 
     * @param elemento agrega un elemento al arreglo
     * @throws QueueException Si el elemento no cabe 
     */ 
    public void enqueue(E elemento) throws QueueException;
    /**
     * Recupera y elimina al primero de la cola.  
     * 
     * @return Extrae un dato del frente de la cola.
     * @throws QueueException Si esta cola está vacía.
     */
    public E dequeue() throws QueueException;
    /**
     * Inspecciona, sin extraer el dato del frente de la cola. 
     * 
     * @return El primero en cola, o null si está vacía.
     * @throws QueueException Si la cola está vacía, la función lanza una excepción
     */
    public E peek() throws QueueException;
    /**
     * Devuelve una representación de cadena del objeto.
     * 
     * @return Devuelve una representación de cadena del objeto.
     */ 
    @Override
    public String toString();
    
}