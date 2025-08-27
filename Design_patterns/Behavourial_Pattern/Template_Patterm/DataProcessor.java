package Design_patterns.Behavourial_Pattern.Template_Patterm;

public abstract class DataProcessor {

    // The template method — do not override.
    public final void process() {
        readData();
        processData();
        saveData();
    }

    // Steps to be defined by subclasses
    protected abstract void readData();
    protected abstract void processData();

    // Fixed step shared by all implementations
    private void saveData() {
        System.out.println("Saving processed data...");
    }
}
