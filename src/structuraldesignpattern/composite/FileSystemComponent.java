package structuraldesignpattern.composite;

// 1. Component Interface
public interface FileSystemComponent {
    void showDetails(int indent);
    long getSize();
    String getName();
}
