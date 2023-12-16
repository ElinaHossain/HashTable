# HashTable

## Overview
This Java program implements a simple hash table and provides a command-line interface for users to interact with the hash table. The hash table supports basic operations such as inserting key-value pairs, removing pairs, getting values, checking key existence, and querying the table's status (empty or size). The hash table handles collisions by not allowing multiple entries for the same key.

## What Does the Program Do?
The program allows users to perform the following operations on the hash table:
- Insert a Pair: Insert a key-value pair into the hash table.
- Remove a Pair: Remove a key-value pair from the hash table.
- Get a Value: Retrieve the value associated with a given key from the hash table.
- Search for a Key: Check if a key exists in the hash table.
- Check if List is Empty: Determine whether the hash table is empty.
- Size: Retrieve the current size (number of key-value pairs) of the hash table.

## What I Learned
- Implementation of a basic hash table with a linear probing approach for handling collisions.
- Utilization of generics to create a flexible and reusable hash table data structure.
- Operations such as insertion, removal, retrieval, and key existence check in the context of a hash table.

## How Could I Improve It?
- Handling Collisions: Implement more sophisticated collision resolution techniques, such as chaining or open addressing with double hashing.
- Resizable Hash Table: Allow the hash table to dynamically resize itself when the number of pairs exceeds a certain threshold, ensuring better efficiency.
- Generic Type Bounds: Restrict the generic types to extend Comparable or use a separate hash function interface to ensure compatibility with various key types.
- Exception Handling: Implement proper exception handling for cases where users attempt to perform operations on a null key or null value.
- Documentation: Enhance code comments to explain complex logic or algorithms, providing clarity for future developers or contributors.
