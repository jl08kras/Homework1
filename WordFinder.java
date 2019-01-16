
/**
 *
 * @author Julia Krasinski
 */
public class WordFinder
{

    /**
     * Constructor for objects of class WordFinder
     */
    public WordFinder()
    {

    }

    /**
     * 
     */
    public static boolean contains(String text, String target)
    {
        char[] text1 = new char[text.length()-1];
        char[] target1 = new char[target.length()-1];
        for(int i = 0; i < text.length(); i++) {
            text1[i] = text.charAt(i+1);
        }
        
        for(int i = 0; i < text.length(); i++) {
            target1[i] = target.charAt(i+1);
        }
        
        
        return false;
        }
    }
