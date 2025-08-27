package Design_patterns.Behavourial_Pattern.Template_Patterm;


public class JSONDataProcessor extends DataProcessor {

    @Override
    protected void readData() {
        System.out.println("Reading data from JSON...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing JSON data (schema check, transform fields)...");
    }
}

