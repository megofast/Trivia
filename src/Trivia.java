import java.util.Scanner;

public class Trivia {
    public static void main(String args[]) {
        String questions[] = new String[5];
        String answers[] = new String[5];
        Scanner scan = new Scanner(System.in);
        String userAnswer;
        int x, correct = 0;

        initializeQA(questions, answers);

        for (x = 0; x < 5; x++) {
            System.out.print(questions[x] + "  ");
            userAnswer = scan.next();

            if (checkAnswer(answers[x], userAnswer)) {
                // The user entered the correct answer!
                System.out.println("Correct!!!");
                correct = correct + 1;
            } else {
                System.out.println("Incorrect...");
            }
        }

        // Tell the user how many questions they got right
        System.out.println("You got " + correct + " answers correct!");

    }

    public static boolean checkAnswer(String answer, String userAnswer) {
        if (answer.equalsIgnoreCase(userAnswer)) {
            return true;
        } else {
            return false;
        }
    }

    public static void initializeQA(String questions[], String answers[]) {
        questions[0] = "What color is the sky?";
        questions[1] = "What color is grass typically?";
        questions[2] = "what animal is black/white and gives us milk?";
        questions[3] = "What insects produce honey?";
        questions[4] = "What are the oceans made out of?";
        answers[0] = "blue";
        answers[1] = "green";
        answers[2] = "cow";
        answers[3] = "bees";
        answers[4] = "water";
    }
}
