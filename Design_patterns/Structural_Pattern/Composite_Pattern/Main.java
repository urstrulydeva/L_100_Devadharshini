package Design_patterns.Structural_Pattern.Composite_Pattern;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("document.docx");
        File file2 = new File("photo.png");

        Folder folder1 = new Folder("Documents");
        folder1.addItem(file1);

        Folder folder2 = new Folder("Pictures");
        folder2.addItem(file2);

        Folder rootFolder = new Folder("Users");
        rootFolder.addItem(folder1);
        rootFolder.addItem(folder2);

        // Just one call, but it prints everything inside
        rootFolder.showDetails();
    }
}

