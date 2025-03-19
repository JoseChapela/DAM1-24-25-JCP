package contornos;

public class AgeClassifier_FIXED {
    public static String classify(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Idade non válida");
        }
        if (age <= 12) {
            return "Infantil";
        } else if (age <= 17) {
            return "Adolescente";
        } else if (age < 65) { 
            return "Adulto";
        }
        return "Senior"; 
    }
}

