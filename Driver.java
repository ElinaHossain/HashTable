import java.util.*;

class Driver {

  private static HashTable<String, Integer> hashtable = new HashTable<>(10); 
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
  while (true) {
            System.out.println("Options:");
            System.out.println("0: Exit Application");
            System.out.println("1: Insert a pair");
            System.out.println("2: Remove a pair");
            System.out.println("3: Get a value");
            System.out.println("4: Search for a key");
            System.out.println("5: Check if list is empty");
            System.out.println("6: Size");
            
            System.out.print("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine(); 

            if (option == 0) {
            System.out.println("Exiting Application...");
            break;
            }
            else if (option == 1) {
            System.out.print("Enter a key to insert: ");
            String insertKey = sc.nextLine(); 
				System.out.print("Enter value for key " + insertKey + ": ");
				Integer value = sc.nextInt();
            sc.nextLine();
				hashtable.put(insertKey, value);
            }
            else if (option == 2) {
            System.out.println("Enter a key to remove: ");
            String removeKey = sc.nextLine();
            hashtable.remove(removeKey);
            }
            else if (option == 3) {
            System.out.print("Enter a key to get value: ");
            String getKey = sc.nextLine();
            Integer value = hashtable.get(getKey);
            System.out.println("Value for key " + getKey + ": " + value);
            }
            else if (option == 4) {
            System.out.print("Enter a key to check if it exists: ");
            String checkKey = sc.nextLine();
            boolean containsKey = hashtable.contains(checkKey);
            System.out.println("Contains key " + checkKey + ": " + containsKey);
            }
            else if (option == 5) {
            boolean empty = hashtable.isEmpty();
            System.out.println("Is the table empty? " + empty);
            }
            else if (option == 6) {
            int tableSize = hashtable.size();
            System.out.println("Table size: " + tableSize);
            }
            else {
            System.out.println("Invalid entry.");
            }
         }
      }
           
  }   