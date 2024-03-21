/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical2;

/**
 *
 * @author vladc
 */
import java.util.*;
public class Practical2{
    public static void main(String[] args) {
        System.out.println("Вариант 5");
        System.out.println("ФИО: Чугунов Владислав Владимирович");
        Scanner scanner = new Scanner(System.in);
        Dictionary dict = new Dictionary();
        dict.displaySortedDictionary();
        System.out.print("Enter 1-to delete, Enter 2- to add: ");
        int flag = scanner.nextInt();
        if (flag==1){
            System.out.print("Enter the  word you want delete: ");
            String dWord = scanner.next();
            dict.deleteWord(dWord);
            
        }else{
            System.out.print("Enter the new word: ");
            String newWord = scanner.next();
            System.out.print("Enter the translate:  ");
            String transWord = scanner.next();
            dict.addWord(newWord, transWord);
        }
    }
}