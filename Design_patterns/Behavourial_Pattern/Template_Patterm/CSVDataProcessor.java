package Design_patterns.Behavourial_Pattern.Template_Patterm;

public class CSVDataProcessor extends DataProcessor {

    @Override
    protected void readData() {
        System.out.println("Reading data from CSV...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV data (validate rows, parse columns)...");
    }
}
