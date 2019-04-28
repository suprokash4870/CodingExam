package string.problems;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st= "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        System.out.println("Enter String: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] words = input.split(" ");

        HashMap <String,Integer> hm = new HashMap <String,Integer>();

            for(String  str : words){
                if(hm.get(str)!=null){
                    hm.put(str,hm.get(str)+1);
                }
                else{
                    hm.put(str,1);
                }
            }
            Set <String> str2 = hm.keySet();
            for(String str : str2){
                if(hm.get(str)>1){

                    System.out.println("Word: "+str+" repeated "+hm.get(str)+" times");
                }
            }

        }


    }




