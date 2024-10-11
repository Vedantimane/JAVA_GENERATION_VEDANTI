import java.util.List;
import java.util.ArrayList;

public class Hashing 
{ }

class Node
{
    int key;
    int value;

// Node constructor
    Node(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
}

class HashTable
{
    private int size;
// Creating a list of lists of nodes (key, value)
    private List<List<Node>> table;

// HashTable constructor
    HashTable(int size)
    {
        this.size = size;
        this.table = new ArrayList<>(size);
// Adding an empty list for each index (bucket)
        for (int i = 0; i < size; i++)
        {
            table.add(new ArrayList<>());
        }
    }

// Hash function to calculate index
    public int Hashfunction(int key)
    {
        System.out.println("The index for the key: " + key + " is ===> " + key % size);
        return key % size;
    }

// Insert key and value into hash table
    public void Insert(int key, int value)
    {
        int index = Hashfunction(key);
        List<Node> list = table.get(index);
        list.add(new Node(key, value));
    }

// Search for the value of a given key
    int Search(int key)
    {
        int index = Hashfunction(key);
        List<Node> list = table.get(index);
        for (Node node : list)
        {
            if (node.key == key)
            {
                return node.value;
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) 
    {
        int tablesize = 5;
        HashTable ht = new HashTable(tablesize);

// Insert some key-value pairs
        ht.Insert(5, 300);
        ht.Insert(9, 600);
        ht.Insert(33, 100);

// Search for a key
        
        int searchKey = 33;
        int result = ht.Search(searchKey);
        if (result != -1) 
        {
            System.out.println("Key " + searchKey + " found with value: " + result);
        }

         else 
        {
            System.out.println("Key " + searchKey + " not found.");
        }
    }
}
