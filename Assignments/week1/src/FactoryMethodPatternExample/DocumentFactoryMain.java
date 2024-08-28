package FactoryMethodPatternExample;

import java.util.Scanner;

public class DocumentFactoryMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please specify the document type");
        String string=sc.nextLine();
        DocumentFactory document=new DocumentFactory();
        Document doc= document.DocumentFactory(string);
        doc.display();

    }
}
