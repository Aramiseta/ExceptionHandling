package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Executable;

public class Main {

    public static void openFile(){
    //handling FileNotFoundException
        try {
            File file = new File("file.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            } catch(FileNotFoundException e){
            System.out.printf("Error catched: %s /n", e);
        }

    }

    public static void main(String[] args) {
    // handling runtime exception
	try{
	    System.out.println(15/0);
    } catch(ArithmeticException e){
	    System.out.printf("Runtime exception %s\n", e);
    }
	openFile();

    }
}
