package actors;

import observers.TextEditorObserver;

import java.util.ArrayList;
import java.util.List;

public class TextEditor implements  TextEditorSubject{

    List<TextEditorObserver> observerList = new ArrayList<>();

    private  String currentText = "";
    @Override
    public void registerObserver(TextEditorObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(TextEditorObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(TextEditorObserver observer : observerList){
            observer.updateString(this.currentText);
        }
    }

    public void setCurrentText(String currentText) {
        this.currentText = currentText;
    }
}
