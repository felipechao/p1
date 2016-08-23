/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Escuela
 */
public class Test {
    public static void main(String[] args) {
        ConcreateAggregate listaPalabras = new ConcreateAggregate();
        
        listaPalabras.add ("Libro");
        listaPalabras.add ("Revista");
        listaPalabras.add("Periodico");
        listaPalabras.add("Comic");
        
        for (Iterator i = listaPalabras.createIterator()) i.aiDone();{
        System.out.println("Palabra:"+ i.next);
    }
    }
    
    
}
