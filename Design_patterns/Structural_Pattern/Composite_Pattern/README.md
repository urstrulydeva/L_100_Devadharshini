Composite Pattern – Folder & File Example

This project demonstrates the Composite Design Pattern in Java using a real-life example of folders and files.

The Composite Pattern allows us to treat individual objects (Files) and groups of objects (Folders) uniformly.

How to Compile & Run

Open terminal and go to the src folder (root level, above Design_patterns).

cd src


Compile all .java files:

javac Design_patterns/Structural_Pattern/Composite_Pattern/*.java


Run the program using the full package name:

java Design_patterns.Structural_Pattern.Composite_Pattern.Main

Explanation

File → A simple object (leaf).

Folder → A composite object that can hold files or other folders.

Main → Demonstrates how calling showDetails() on the root folder automatically prints all nested files and folders.

This shows how the Composite Pattern lets you treat both single objects (File) and collections (Folder) the same way.