
/*
Universidad del Valle de Guatemala
Algoritmos y estructuras de 
Kimberly Guzman, 13642
Alejandro Saucedo,13167
Estib Soto, 13398
Juan Carlos Jiménez, 13068
*/



     /** Clase Nodo **/
    public class SplayNode
     {    
         SplayNode left, right, parent;
         int element;
         
         
         /** Constructor **/
         public SplayNode()
         {
             this(0, null, null, null);
         }          
         /** Constructor **/
         public SplayNode(int ele)
         {
             this(ele, null, null, null);
         } 
         /** Constructor **/
         public SplayNode(int ele, SplayNode left, SplayNode right, SplayNode parent)
         {
             this.left = left;
             this.right = right;
             this.parent = parent;
             this.element = ele;         
         }    
     }