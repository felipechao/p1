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
public class ConcreateAggregate implements Aggregate {
    private String [] palabras;
    private int numPalabras;
    private int size = 10;
    public ConcreateAggregate (){
        palabras = new String[10];
    }
    public void add (String palabras){
        palabras numPalabras++ = palabra;
    }

    @Override
    public Iterator creatIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


class ComncreateIterator implements Iterator{
        
        int index = 0;
        @Override
        public Object firat() {
            return palabras;
        }

        @Override
        public Object next() {
            if( aiDone()){
                return palabras [index++]
            } 
            return null;
        }

        @Override
        public boolean iaDone() {
            if ( index >= numPalabras){
                false
            }
            return true;
        }
    @Override
    public Object currentItem
}

}   
}
