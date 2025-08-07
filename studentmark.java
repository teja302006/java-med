public class StudentGrade {
    public static void main(String[] args) {
        int m1 = 90, m2 = 91, m3 = 92, m4 = 93;
        int total = m1 + m2 + m3 + m4;
        double agg = total / 4.0;
        String grade = (agg > 75) ? "Distinction" :
                       (agg >= 60) ? "First Division" :
                       (agg >= 50) ? "Second Division" :
                       (agg >= 40) ? "Third Division" : "Fail";
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + agg);
        System.out.println("Grade = " + grade);
    }
}
