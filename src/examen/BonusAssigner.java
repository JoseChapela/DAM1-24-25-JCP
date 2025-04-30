package examen;

public class BonusAssigner {
    public static String assignBonus(int employeeNumber, int months, boolean isExecutive) {
        if (employeeNumber < 1 || employeeNumber > 999) {
            throw new IllegalArgumentException("Número de empregado non válido");
        }

        boolean hasSeniority = months >= 12;

        if (isExecutive && hasSeniority) return "P1";
        if (!isExecutive && hasSeniority) return "P2";
        if (isExecutive && !hasSeniority) return "P3";
        return "P4";
    }
}
