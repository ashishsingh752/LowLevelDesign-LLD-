package behavioraldesignpattern.mementoDesignPattern;

// 1. Memento (Immutable snapshot)
public class EditorMemento {
    private final String content;
    private final int cursorPosition;

    // Package-private constructor - only Originator can create it
    EditorMemento(String content, int cursorPosition) {
        this.content = content;
        this.cursorPosition = cursorPosition;
    }

    // Only Originator can access these
    String getContent() { return content; }
    int getCursorPosition() { return cursorPosition; }
}
