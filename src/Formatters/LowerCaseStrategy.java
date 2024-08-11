package Formatters;

public class LowerCaseStrategy implements  TextFormattingStrategy{

    @Override
    public String format(String text) {
        System.out.println("Lower Case Formatting");
        return text.toLowerCase();
    }
}
