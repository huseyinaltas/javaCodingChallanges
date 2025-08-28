package algorithms;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                merged.add(current);
                current = intervals[i];
            }
        }

        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] inputIntervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };

        int[][] result = merge(inputIntervals);
        int[][] result1 = merge1(inputIntervals);

        System.out.print("Merged intervals: ");
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        System.out.print("\nMerged intervals: ");
        for (int[] interval : result1) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        // Output: Merged intervals: [1, 6] [8, 10] [15, 18]
    }

    // Dummy method placeholder like atbash1 in your original code
    public static int[][] merge1(int[][] intervals) {
        return null;
    }
}
