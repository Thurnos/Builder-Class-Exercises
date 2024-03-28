package org.example;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {


        Date date = new Date(123, 5, 7);
        Book book1 = new Book("Ivan",12,234,"Da",date);
        Book book2 = new Book("Ivan1",12,234,"Da",date);
        Book book3 = new Book("Ivan2",12,234,"Da",date);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Book.printAll(books);

        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);

        PrintAll.printAll(integers);



//        int a = 5;
//        Function<Integer, Integer> lambda = (x) -> a + x;
//
//        int result = lambda.apply(10); // Applying the lambda expression to the argument 10
//        System.out.println("Result: " + result); // Output: Result: 15
//
//
//        File myfile = new File("C:\\Users\\Svilen-PC\\Desktop\\mathi//myFile.txt");
//        try{
//            myfile.createNewFile();
//        }catch (IOException ioe){
//
//        }
//
//
//
//
//        new File("myDir").mkdir();
//
//
//        FilenameFilter filter= (file,fileName) ->{
//            return fileName.contains(".");
//        };
//        String[] contents = new File(".").list(filter);
//        for(String file:contents){
//            System.out.println(file);
//        }
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
