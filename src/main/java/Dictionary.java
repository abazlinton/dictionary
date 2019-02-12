import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> words;
    private String name;

    public Dictionary(String name){
        this.name = name;
        this.words = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getNoOfWords(){
        return this.words.size();
    }

    public void defineWord(String word, String definition){
        this.words.put(word, definition);
    }

    public String getDefinition(String word){
        return this.words.get(word);
    }

    public void clearWordList(){
        this.words.clear();
    }

    public boolean isWordDefined(String word){
        return this.words.containsKey(word);
    }

    public ArrayList<String> getDefinedWords(){
        ArrayList<String> definedWords = new ArrayList<>();
        for (String word : this.words.keySet() ){
            definedWords.add(word);
        }
        return definedWords;
    }

    public ArrayList<String> getDefinitions(){
        return new ArrayList<>(this.words.values());
    }

}
