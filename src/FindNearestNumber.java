import java.util.*;
import java.util.stream.Collectors;

public class FindNearestNumber {
    public static void main(String[] args) {
        String test = "jdkslgklds";
        System.out.print(test.isEmpty());

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = readArrayList(input);

        int factor = input.nextInt();

        ArrayList<Integer> finalResults = calculateDiffs(numbers, factor);

        for (int value : finalResults) {
            System.out.print(value + " ");
        }
    }

    private static ArrayList<Integer> calculateDiffs(ArrayList<Integer> numbers, int factor) {
        ArrayList<Integer> diffs = new ArrayList<>();
        for (int value : numbers) {
            int diff = value - factor;
            diff = Math.abs(diff);
            diffs.add(diff);
        }
        return findTheNearest(diffs, numbers, factor);
    }

    private static ArrayList<Integer> findTheNearest(ArrayList<Integer> diffs, ArrayList<Integer> numbers, int factor) {
        ArrayList<Integer> results = new ArrayList<>();
        int smallest = 0;
        for (int i = 0; i < diffs.size(); i++) {
            if (i == 0) {
                smallest = diffs.get(i);
            } else {
                if (diffs.get(i) <= smallest){
                    smallest = diffs.get(i);
                }
            }
        }
        for (int j = 0; j < diffs.size(); j++){
            if(diffs.get(j) == smallest) {
                results.add(numbers.get(j));
            }
        }
        return sortArray(results);
    }

    private static ArrayList<Integer> sortArray(ArrayList<Integer> results) {
        for (int i = 0; i < results.size(); i ++) {
            for (int j = i + 1; j < results.size(); j++) {
                if (results.get(j) <= results.get(i)) {
                    int temp = results.get(i);
                    results.set(i, results.get(j));
                    results.set(j, temp);
                }
            }
        }
        return results;
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
