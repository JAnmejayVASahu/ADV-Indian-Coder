import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quizeProject {

    static class Question {
        String question;
        String[] options;
        int correctOption;

        Question(String question, String[] options, int correctOption) {
            this.question = question;
            this.options = options;
            this.correctOption = correctOption;
        }
    }

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        System.err.println();
        questions.add(new Question("What is the capital of France?", new String[]{"A. Berlin", "B. Paris", "C. Rome"}, 1));
        questions.add(new Question("Which programming language is this quiz written in?", new String[]{"A. Java", "B. Python", "C. C++"}, 0));
        questions.add(new Question("is javais pure oops?", new String[]{"A. Yes", "B. No"}, 0));
        questions.add(new Question("This project for -> ", new String[]{"A. ADv Coder", "B. Micrsoft", "C. Google"}, 0));
        
        int score = conductQuiz(questions);

        System.out.println("Quiz completed! Your score: " + score + " out of " + questions.size());
    }

    private static int conductQuiz(List<Question> questions) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);

            System.out.println("Question " + (i + 1) + ": " + currentQuestion.question);
            for (String option : currentQuestion.options) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer - 1 == currentQuestion.correctOption) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + currentQuestion.options[currentQuestion.correctOption] + "\n");
            }
        }
        scanner.close();

        return score;
    }
}
