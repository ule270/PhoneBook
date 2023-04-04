package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {
    Map<String, List<String>> phonebook;
//    key string, value List<String>phoneNumbers
    List<String> phoneNumbers;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = new LinkedHashMap<>(map.size());
        this.phonebook.putAll(map);
    }
    public PhoneBook() {
        this.phonebook = new LinkedHashMap<>();
        this.phoneNumbers = new ArrayList<>();
    }

//    adds an entry to the composite associate data type
    public void add(String name, String phoneNumber) {
        this.phonebook.put(name, this.phoneNumbers);
    }

//    adds many phone numbers to a single name entry
    public void addAll(String name, String... phoneNumbers) {
        for (int i = 0; i < phoneNumbers.length; i ++) {
            this.phonebook.put(name, Arrays.asList(phoneNumbers));
        }
    }

//    removes an entry to the composite associate data type
    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return this.phonebook.containsKey(name);
    }

//    returns a phone number for the respective input name
    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }

//    returns a name for the respective input phoneNumber
    public String reverseLookup(String phoneNumber)  {
        return this.phonebook.get(phoneNumber).toString();
    }

//    returns a list of all names in this PhoneBook
    public List<String> getAllContactNames() {
        List<String> contacts = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
             contacts.add(entry.getKey());
        }
        return contacts;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}
