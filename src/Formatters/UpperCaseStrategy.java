package Formatters;

public class UpperCaseStrategy  implements  TextFormattingStrategy{

    @Override
    public String format(String text) {
        System.out.println("UpperCase Formatting");
        return text.toUpperCase();
    }
}
