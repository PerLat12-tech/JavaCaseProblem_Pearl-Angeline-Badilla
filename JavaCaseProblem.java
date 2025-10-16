public class JavaCaseProblem {
     public static void main(String[] args) {
        String name = "PEARL ANGELINE BADILLA";
        String idNumber = "2024303364";
        int score = 87;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("------------------------------");
        System.out.println("Score: " + score + " → Grade: " + grade);
    }
    
}
