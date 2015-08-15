/*
 * HashEntry.java
 *
 * Simple class to be used in implementation of hash table.
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class HashEntry {
      private int key;
      private int value;
 
      HashEntry(int key, int value) {
            this.key = key;
            this.value = value;
      }     
 
      public int getKey() {
            return key;
      }

      public int getValue() {
            return value;
      }
}