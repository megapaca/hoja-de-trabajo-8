
/*
Universidad del Valle de Guatemala
Algoritmos y estructuras de 
Kimberly Guzman, 13642
Alejandro Saucedo,13167
Estib Soto, 13398
Juan Carlos Jiménez, 13068
*/

public class SplayTreeSet implements WordSet
{
	private SplayTree<Word> base;
	
	public SplayTreeSet()
	{
		base = new SplayTree<Word>();
	}
	
	public Word get(Word Lord)
	{
		return base.get(Lord);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}