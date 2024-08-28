package FactoryMethodPatternExample;

public class WordDocument implements Document{
    @Override
    public void display() {
        System.out.println("This is a word document file");
    }


}
