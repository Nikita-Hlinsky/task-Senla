package tasks;

public class ReplacementTask {

    static void replacement(String word){
        word = word.replaceAll("\\d","");
        System.out.println(word);
    }
}
