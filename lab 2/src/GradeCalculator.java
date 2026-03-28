public class GradeCalculator {
    public static void main(String[] args) {

        int[] scores = {95, 82, 70, 55, 40};

        for (int score : scores) {
            char grade;
            String message;

            if (score >= 90) {
                grade = 'A';
                message = "Excellent!";
            } else if (score >= 80) {
                grade = 'B';
                message = "very Good";
            } else if (score >= 70) {
                grade = 'C';
                message = "Good";
            } else if (score >= 50) {
                grade = 'D';
                message = "Needs improvement";
            } else {
                grade = 'F';
                message = "Failed";
            }
            System.out.println("Score: " + score + " -> Grade: " + grade + " (" + message + ")");
        }
    }
}