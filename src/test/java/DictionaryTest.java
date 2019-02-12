import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DictionaryTest {

    private Dictionary dictionary;

    @Before
    public void before(){
        dictionary = new Dictionary("Oxford English");
        dictionary.defineWord("a", "The first letter of the alphabet");
    }

    @Test
    public void can_get_name(){
        assertEquals("Oxford English", dictionary.getName());
    }

    @Test
    public void can_get_number_of_words(){
        assertEquals(1, dictionary.getNoOfWords());
    }

    @Test
    public void can_add_definition(){
        dictionary.defineWord("b", "The second letter of the alphabet");
        assertEquals(2, dictionary.getNoOfWords());
    }

    @Test
    public void can_get_definition(){
        String definitionOfA = dictionary.getDefinition("a");
        assertEquals(definitionOfA, "The first letter of the alphabet");
    }

    @Test
    public void can_clear_word_list(){
        dictionary.clearWordList();
        assertEquals(0, dictionary.getNoOfWords());
    }

    @Test
    public void can_find_out_if_word_is_defined__is_defined(){
        assertTrue(dictionary.isWordDefined("a"));
    }

    @Test
    public void can_find_out_if_word_is_defined__is_not_defined(){
        assertFalse(dictionary.isWordDefined("z"));
    }

    @Test
    public void can_get_array_of_defined_words(){
        dictionary.defineWord("b", "The second letter of the alphabet");
        ArrayList<String> definedWords = dictionary.getDefinedWords();
        assertEquals("a", definedWords.get(0));
        assertEquals("b", definedWords.get(1));
    }

    @Test
    public void can_get_array_of_definitions(){
        dictionary.defineWord("b", "The second letter of the alphabet");
        ArrayList<String> definitions = dictionary.getDefinitions();
        assertEquals("The first letter of the alphabet", definitions.get(0));
        assertEquals("The second letter of the alphabet", definitions.get(1));
    }





}
