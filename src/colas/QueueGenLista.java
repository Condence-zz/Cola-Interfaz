/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import excepciones.QueueException;
import interfaces.IQueueGen;
import java.util.*;

/**
 *
 * @author coond
 * @param <E>
 */ 
public class QueueGenLista<E> implements IQueueGen {  
    /**
     * Inicio de cola circular
     */
    private int front;
    /**
     * Final cola circular
     */
    private int rear; 
    /**
     * Tamaño de cola circular
     */
    public int tamCola ;
    public List<E> cola;
    /**
     * El constructor inicializa el inicio del objeto el final y el tamaño del objeto.
     * 
     * @param tamCola Establece el tamaño del objeto.
     */
    public QueueGenLista(int tamCola) {
        this.tamCola = tamCola;
        cola = new ArrayList<E>(tamCola);  
        front = -1;
        rear = -1;
    } 
    /**
     * Retorna true si esta llena o false si hay espacio.
     * 
     * @return <ul>
     *          <li> true: Si el arreglo esta lleno</li>
     *          <li> false: Si esta vacio o con espacio</li>
     *         </ul>
     */
    public boolean full() { 
        return cola.size() == tamCola;
    }
    /**
     * Devuelve true si esta colección no contiene elementos.
     * 
     * @return <ul>
     *          <li>true: si se encuentra vacio</li>
     *          <li>false: si hay algun espacio</li>
     *         </ul>
     */
    public boolean empty(){
        return (cola.size() == 0);
    }
    /**
     * Inserta el elemento especificado en esta cola.
     * 
     * @param elemento agrega un elemento al arreglo
     * @throws QueueException Si el elemento no cabe 
     */
    public void enqueue(E elemento) throws QueueException { 
        if(full() == true){ 
             throw new QueueException("La cola esta llena.. Elimine datos...");
        } else {
            if (empty()) {
                front = 0;
                rear = 0;
            } else {
                if (rear == tamCola - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            cola.add(elemento);
        }
    } 
    /**
     * Recupera y elimina al primero de la cola.  
     * 
     * @return Extrae un dato del frente de la cola.
     * @throws QueueException Si esta cola está vacía.
     */
    public E dequeue() throws QueueException { 
        E result = null;
        
        if(empty()==true){ 
            throw new QueueException("La cola esta vacia.. Inserte datos..."); 
        } else {  
            cola.remove(0); 
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                if (front == tamCola -1) {
                    front = 0;
                } else{
                    front++;
                }
            }
        } 
        return result; 
    }
    /**
     * Inspecciona, sin extraer el dato del frente de la cola. 
     * 
     * @return El primero en cola, o null si está vacía.
     * @throws QueueException Si la cola está vacía, la función lanza una excepción
     */
    public E peek() throws QueueException {
        if (!empty()) {
            return cola.get(front -1);
        } else {
            throw new QueueException("La cola esta vacia.. Inserte datos...");
        } 
    }
 
    /**
     * Devuelve una representación de cadena del objeto.
     * 
     * @return Devuelve una representación de cadena del objeto.
    */ 
    @Override
    public String toString() {
        String cadena = "";  
        if (!empty()) {
            cadena = cola.toString();  
        }
        return cadena;
    }   
     
    
}