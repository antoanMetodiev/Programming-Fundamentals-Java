import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());
        int sequenceCounter = 0;
        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        int bestSubsequenceLength = 0;
        String bestSequence = "";

        String input = scanner.nextLine();
        while (!input.equals("Clone them!")) {
            sequenceCounter++;
            String[] dnaSequence = input.split("!");

            int currentSubsequenceLength = 0;
            int currentSubsequenceStart = -1;
            int currentSubsequenceSum = 0;
            for (int i = 0; i < dnaLength; i++) {
                int currentElement = Integer.parseInt(dnaSequence[i]);
                if (currentElement == 1) {
                    currentSubsequenceSum++;
                    if (currentSubsequenceStart == -1) {
                        currentSubsequenceStart = i;
                    }
                    currentSubsequenceLength++;
                } else {
                    currentSubsequenceStart = -1;
                    currentSubsequenceLength = 0;
                }

                if (currentSubsequenceLength > bestSubsequenceLength || (currentSubsequenceLength == bestSubsequenceLength &&
                                (currentSubsequenceStart < bestSequenceIndex || (currentSubsequenceStart == bestSequenceIndex &&
                                                currentSubsequenceSum > bestSequenceSum)))) {

                    bestSubsequenceLength = currentSubsequenceLength;
                    bestSequenceIndex = currentSubsequenceStart;
                    bestSequenceSum = currentSubsequenceSum;
                    bestSequence = String.join(" ", dnaSequence);
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", sequenceCounter, bestSequenceSum);
        System.out.println(bestSequence);
    }
}
