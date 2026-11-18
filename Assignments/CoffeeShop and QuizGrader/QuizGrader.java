public class QuizGrader {
    public static void main(String[] args) {
                // Tamang sagot sa quiz
                char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};

                // Sagot ng estudyante
                char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

                // Nagsisimula sa zero ang bilang ng correct answers
                int correctCount = 0;

                // Inuulit ang bawat question
                for (int i = 0; i < answerKey.length; i++) {

                    // Chine-check kung tama ang sagot
                    if (answerKey[i] == studentAnswers[i]) {

                        // Dinadagdagan ng isa ang correct answers
                        correctCount++;

                    } else {

                        // Ipinapakita kung anong question ang mali
                        System.out.println("Question " + (i + 1) + " is incorrect.");
                    }
                }

                // Kinukuha ang percentage ng score
                double scorePercentage = (double) correctCount / answerKey.length * 100;

                // Ipinapakita ang resulta
                System.out.println("\n--- Quiz Results ---");
                System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
                System.out.println("Score: " + scorePercentage + "%");

                // Chine-check kung pasado o bagsak
                if (scorePercentage >= 70) {
                    System.out.println("Result: PASS");
                } else {
                    System.out.println("Result: FAIL");
                }
            }
        }
