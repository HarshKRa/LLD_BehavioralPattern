package commands;

import Formatters.TextFormattingStrategy;
import actors.TextEditor;

public class FormatTextCommand implements TextEditorCommand{

    private TextFormattingStrategy textFormattingStrategy;

    private TextEditor textEditor;

    private  String textToFormat;

    public FormatTextCommand(TextFormattingStrategy textFormattingStrategy, TextEditor textEditor, String textFormat) {
        this.textFormattingStrategy = textFormattingStrategy;
        this.textEditor = textEditor;
        this.textToFormat = textFormat;
    }

    @Override
    public void execute() {
        System.out.println("Formatting The Text");
        String formattedText = textFormattingStrategy.format(textToFormat);
        textEditor.setCurrentText(formattedText);
    }
}
