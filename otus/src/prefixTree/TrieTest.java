package prefixTree;

public class TrieTest {

    public static void main(String[] args) {
        Trie obj = new Trie();
        String word = "abc";
        obj.insert(word);
        obj.insert("abcde");
        obj.insert("word");
        System.out.println(obj.search(word));
        System.out.println(obj.startsWith(word));
    }
}
