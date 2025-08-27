package Design_patterns.Creational_Pattern.Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        Assessment beginner = AssessmentFactory.createAssessment("beginner");
        beginner.generate(); 

        Assessment advanced = AssessmentFactory.createAssessment("advanced");
        advanced.generate();
    }
}

