import java.util.*;

class TestDriver {
    public static void main(String[] args) {
    HashTable<String, Integer> hashTable = new HashTable<>(10);

        System.out.println("Size of the table: " + hashTable.size());
        System.out.println("Is the table empty?: " + hashTable.isEmpty());
        hashTable.remove("a");
        hashTable.remove("b");
        hashTable.get("Get key c: " + hashTable.get("c"));
        hashTable.put("d", 1);
        hashTable.put("e", 2);
        System.out.println("Size: " + hashTable.size());
        System.out.println("Is the table empty?: " + hashTable.isEmpty());
        System.out.println("Is the key c in the table?: " + hashTable.contains("c"));
        System.out.println("Is the key 'd' in the table?: " + hashTable.contains("d"));
        System.out.println("Is the key 'e' in the table?: " + hashTable.contains("e"));
        hashTable.put("f", 3);
        hashTable.put("g", 4);
        hashTable.put("h", 5);
        hashTable.put("i", 6);
        System.out.println("Size: " + hashTable.size());
        hashTable.remove("f");
        System.out.println("Size: " + hashTable.size());
        hashTable.remove("g");
        System.out.println("Size : " + hashTable.size());
        hashTable.remove("a");
        
        hashTable.remove("h");
        hashTable.remove("i");
        hashTable.remove("e");
        hashTable.remove("d");
        System.out.println("Size: " + hashTable.size());
        System.out.println("Is the table empty?: " + hashTable.isEmpty());

    }
}