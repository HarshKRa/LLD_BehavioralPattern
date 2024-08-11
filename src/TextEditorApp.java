import Formatters.TextFormattingStrategy;
import Formatters.UpperCaseStrategy;
import actors.TextEditor;
import commands.FormatTextCommand;
import commands.TextEditorCommand;
import observers.TextConsoleObservers;
import observers.TextEditorObserver;

public class TextEditorApp {
    public static void main(String[] args) {


        // Need to create the Text Editor
        TextEditor textEditor = new TextEditor();

        // Text Editor observers
        TextEditorObserver observer = new TextConsoleObservers();

        // Register all the observer with the text Editor
        textEditor.registerObserver(observer);

        textEditor.setCurrentText("Hello Student");

        // Formatters

        TextFormattingStrategy upperCaseStrategy = new UpperCaseStrategy();

        // Command to create the text

        TextEditorCommand command = new FormatTextCommand(upperCaseStrategy,textEditor,"Hello Students");


        command.execute();

        textEditor.notifyObserver();
    }
}
