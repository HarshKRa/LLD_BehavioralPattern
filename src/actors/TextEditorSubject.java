package actors;

import observers.TextEditorObserver;

public interface TextEditorSubject {

    // Register the observers
    void registerObserver(TextEditorObserver observer);

    // Remove the observers
    void removeObserver(TextEditorObserver observer);

    // Notify the observers
    void notifyObserver();
}
