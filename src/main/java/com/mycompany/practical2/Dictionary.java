/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical2;
import java.util.*;
/**
 *
 * @author vladc
 */
public class Dictionary {
    private Map <String, List<String>> dictionary = new HashMap<>();
    public Dictionary() {
        dictionary.put("Apple", Arrays.asList("яблоко"));
        dictionary.put("Phone", Arrays.asList("телефон"));
        dictionary.put("Car", Arrays.asList("автомобиль"));
        dictionary.put("Knife", Arrays.asList("нож"));
        dictionary.put("Water", Arrays.asList("Вода"));
    }
    public void addWord(String word, String translation) {
        if (dictionary.containsKey(word)) {
            List<String> translations = dictionary.get(word);
            if (!translations.contains(translation)) {
                translations.add(translation);
            }
        } else {
            dictionary.put(word, new ArrayList<>(Arrays.asList(translation)));
        }
        displaySortedDictionary();
    }
    public void deleteWord(String word) {
        dictionary.remove(word);
        displaySortedDictionary();
    }
    public void displaySortedDictionary() {
        Map<String, List<String>> sortedDict = new TreeMap<>(dictionary);
        for (Map.Entry<String, List<String>> entry : sortedDict.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            System.out.println(String.join(", ", entry.getValue()));
        }
    }
}    

