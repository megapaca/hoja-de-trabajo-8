
/*
Universidad del Valle de Guatemala
Algoritmos y estructuras de 
Kimberly Guzman, 13642
Alejandro Saucedo,
Estib Soto, 
Juan Carlos Jiménez, 
*/



import java.util.HashMap;
class HashTreeSet implements WordSet{

    private HashMap<String,String> hash;
   
    public HashTreeSet(){
        hash = new HashMap();
    }
   
    @Override
    public void add(Word wordObject) {
        hash.put(wordObject.getWord(),wordObject.getType());
    }

    @Override
    public Word get(Word word) {
        if(!hash.containsKey(word.getWord())){
            return null;
        }
        return new Word(word.getWord(),hash.get(word.getWord()));
    }
}

