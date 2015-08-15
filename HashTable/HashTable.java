/*
 * HashTable.java
 *
 * Simple implementation of a hash table.
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class HashTable {
	private final static int TABLE_SIZE = 128;

	HashEntry[] table;

	HashTable() {
		table = new HashEntry[TABLE_SIZE];
		for (int i = 0; i < TABLE_SIZE; i++) {
			table[i] = null;
		}	
	}

	/**
	 * Get the value given the key.
	 * @param key - the key you wish to retrieve the value for.
	 * @return the value associated with the key.
	 */
	public int get(int key) {
		int hash = (key % TABLE_SIZE);
		while (table[hash] != null && table[hash].getKey() != key) {
			hash = (hash + 1) % TABLE_SIZE;
		}
		if (table[hash] == null) {
			return -1;
		} else {
			return table[hash].getValue(); 
		}
	}

	/**
	 * Insert a new key-value pair into the table. 
	 * @param key   - the key you want to insert.
	 * @param value - the value associated with the key you want to insert.
	 */
	public void put(int key, int value) {
		int hash = (key % TABLE_SIZE);
		while (table[hash] != null && table[hash].getKey() != key) {
			hash = (hash + 1) % TABLE_SIZE;
		}
		table[hash] = new HashEntry(key, value);
	}
}