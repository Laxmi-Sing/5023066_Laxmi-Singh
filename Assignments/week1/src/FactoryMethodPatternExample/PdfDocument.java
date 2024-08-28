package FactoryMethodPatternExample;

public class PdfDocument implements Document{

    @Override
    public void display() {
        System.out.println("This is a pdf document file");
    }
}
