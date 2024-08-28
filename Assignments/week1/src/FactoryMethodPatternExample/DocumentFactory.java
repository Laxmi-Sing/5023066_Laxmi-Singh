package FactoryMethodPatternExample;

public class DocumentFactory {
    public Document DocumentFactory(String type){
        if(type.equalsIgnoreCase("word")){
            return new WordDocument();
        }
        else if(type.equalsIgnoreCase("pdf")){
            return new PdfDocument();
        }
        else if(type.equalsIgnoreCase("excel")){
            return new ExcelDocument();
        }
        return new PdfDocument();
    }
}
