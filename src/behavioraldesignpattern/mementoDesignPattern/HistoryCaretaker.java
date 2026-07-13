package behavioraldesignpattern.mementoDesignPattern;

import java.util.Stack;

public class HistoryCaretaker {
    private Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            EditorMemento previousState = history.pop();
            editor.restore(previousState);
        } else {
            System.out.println("Nothing to undo!");
        }
    }
}
