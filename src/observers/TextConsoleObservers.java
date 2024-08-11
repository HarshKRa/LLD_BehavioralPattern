package observers;

public class TextConsoleObservers implements TextEditorObserver {
    @Override
    public void updateString(String text) {
        System.out.println("Text updated in console : " + text);
    }
}
