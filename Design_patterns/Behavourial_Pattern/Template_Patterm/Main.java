package Design_patterns.Behavourial_Pattern.Template_Patterm;


public class Main {
    public static void main(String[] args) {
        DataProcessor csv = new CSVDataProcessor();
        csv.process();

        System.out.println("---");

        DataProcessor json = new JSONDataProcessor();
        json.process();
    }
}

