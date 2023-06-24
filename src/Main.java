import java.util.Scanner;

class PastPerfectQuiz {
    public static void main(String[] args) {
        String[] questions = {
                "1. Had she finished her homework before she went to the party?\n" +
                        "a) Yes, she had\n" +
                        "b) Yes, she has\n" +
                        "c) No, she did\n",
                "2. By the time I arrived, they ________ already ________ the movie.\n" +
                        "a) had, watched\n" +
                        "b) have, watched\n" +
                        "c) did, watch\n",
                "3. When I woke up, he ________ the breakfast.\n" +
                        "a) had cooked\n" +
                        "b) have cooked\n" +
                        "c) did cook\n",
                "4. The train ________ before we reached the station.\n" +
                        "a) had left\n" +
                        "b) have left\n" +
                        "c) did leave\n",
                "5. She ________ a lot of experience by the time she ________ her own company.\n" +
                        "a) had gained, started\n" +
                        "b) have gained, started\n" +
                        "c) did gain, start\n"
        };

        String[] answers = {"a", "a", "a", "a", "a"};
        int score = 0;
        int totalQuestions = questions.length;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Past Perfect Quiz!");
        System.out.println("Please answer the following questions. Enter 'q' at any time to quit.");

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals("q")) {
                System.out.println("Quiz aborted.");
                return;
            }

            while (!userAnswer.equals("a") && !userAnswer.equals("b") && !userAnswer.equals("c")) {
                System.out.println("Invalid input! Please enter a valid option (a, b, c) or 'q' to quit.");
                userAnswer = scanner.nextLine().toLowerCase();

                if (userAnswer.equals("q")) {
                    System.out.println("Quiz aborted.");
                    return;
                }
            }

            if (userAnswer.equals(answers[i])) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect!\n");
            }
        }

        double percentage = (double) score / totalQuestions * 100;
        System.out.println("Quiz complete! Your score is: " + percentage + "%");
    }
}
