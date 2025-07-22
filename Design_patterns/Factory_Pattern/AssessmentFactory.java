package Design_patterns.Factory_Pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AssessmentFactory {
    private static final Map<String, Supplier<Assessment>> registry = new HashMap<>();

    static {
        registry.put("beginner", MCQAssessment::new);
        registry.put("intermediate", ShortAnswerAssessment::new);
        registry.put("advanced", CaseStudyAssessment::new);
    }

    public static Assessment createAssessment(String level) {
        Supplier<Assessment> supplier = registry.get(level.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Invalid level: " + level);
    }
}
