package org.example;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        File myfile = new File("C:\\Users\\Svilen-PC\\Desktop\\mathi//myFile.txt");
        try{
            myfile.createNewFile();
        }catch (IOException ioe){

        }




        new File("myDir").mkdir();


        FilenameFilter filter= (file,fileName) ->{
            return fileName.contains(".");
        };
        String[] contents = new File(".").list(filter);
        for(String file:contents){
            System.out.println(file);
        }
//        Book book1 = new Book("Ivan",23);
//        Book book2 = new Book("Ivan",24);
//        Book book3 = new Book("Ivan",25);
//        Book book4 = new Book("Ivan",26);
//
//        HashMap<String , Integer> teles = new HashMap<>();
//        teles.put("Ivan",2345);
//        teles.put("Andrei",2345);
//        System.out.println(teles);
//
//        if(teles.containsValue(2345)){
//            System.out.println("Da");
//        }

//
//        LinkedList<String> myList = new LinkedList();
//
//        myList.add("IMAGINE");
//        myList.push("ZASHTO");
//        myList.add(1,"C");
////        for(String i:myList){
////            System.out.println(i);
////        }
//        myList.forEach(System.out::println);

//
//        CountingTask countingTask = new CountingTask();
//
//        // Create two threads
//        Thread thread1 = new Thread(countingTask);
//        Thread thread2 = new Thread(countingTask);
//
//        // Start both threads
//        thread1.start();
//        thread2.start();
//

    }
    }
