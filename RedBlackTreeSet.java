
/*
Universidad del Valle de Guatemala
Algoritmos y estructuras de 
Kimberly Guzman, 13642
Alejandro Saucedo,13167
Estib Soto, 13398
Juan Carlos Jiménez, 13068
*/

public class RedBlackTreeSet implements WordSet{
   //-----------------------------------------------------------------------
    private RedBlackTree<Word> rbt;
   
    //------------------------------------------------------------------------
    // M�todos
    //------------------------------------------------------------------------

    /*
     * Constructor que crea la nueva implementaci�n a utilizar.
     * @pre: -
     * @post: Se construye la implementaci�n.
     */
    public RedBlackTreeSet(){
        rbt = new RedBlackTree<Word>();
    }

    /*
     * M�todo que agrega una nueva palabra al conjunto.
     * pre: -
     * post: Se agrega la palabra.
     * parametros wordObject
     */
    @Override
    public void add(Word wordObject) {
        rbt =rbt.add(wordObject);
    }

    /*
     * M�todo que obtiene y determina si existe una palabra en el conjunto.
     * pre: La palabra debe existir.
     * post: Se regresa la palabra.
     * parametros word
     * return word
     */
    @Override
    public Word get(Word word){
        return rbt.get(word);      
    }
   
}
