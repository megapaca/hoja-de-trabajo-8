   // This is a implementation of splay trees, in Java.
// (c) 1996, 1997, 1998, 2001 duane a. bailey
// (c) 1998, 2001 duane a. bailey
/*
* 10 de Octubre del 2014
* María Isabel Fernández 13024
* Ana Bartra 13643
* Andrés Lainfiesta 13072
* Maria Gabriela López 13056
*/
import java.util.Iterator;
import java.util.Comparator;
import java.util.ArrayList;
/*
 * @version $Id: SplayTree.java 35 2007-08-09 20:38:38Z bailey $
 * @author, 2001 duane a. bailey
 */
public class SplayTree<E extends Comparable<E>>
{
    /**
     * Construct an empty search tree.
     *
     * @post construct a new splay tree
     * 
     */
	private ArrayList<Word> base;
    public SplayTree()
    {
		base = new ArrayList<Word>();
		
    }
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}