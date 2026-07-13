package structuraldesignpattern.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {

        // Create files (Leaves)
        File file1 = new File("Design_Patterns.pdf", 2450);
        File file2 = new File("Strategy.java", 120);
        File file3 = new File("report.docx", 890);
        File image1 = new File("diagram.png", 3400);

        // Create folders (Composites)
        Folder rootFolder = new Folder("MyProject");
        Folder srcFolder = new Folder("src");
        Folder docsFolder = new Folder("documents");
        Folder testfolder = new Folder("I'm test folder");

        testfolder.add(file1);
        testfolder.showDetails(0);

        // Build the tree structure
        srcFolder.add(file2);

        docsFolder.add(file1);
        docsFolder.add(file3);

        rootFolder.add(srcFolder);
        rootFolder.add(docsFolder);
        rootFolder.add(image1);

        System.out.println("=== File System Structure (Composite Pattern) ===\n");

        System.out.println();
        // Client treats both File and Folder uniformly
//        rootFolder.showDetails(0);

        System.out.println("\nTotal Size of Project: " + rootFolder.getSize() + " KB");
    }
}