public class CompleteStaircase {
    public int arrangeCoins(int n) {
        int rows = 0;

        while (n >= rows + 1) {
            rows++;
            n -= rows;
        }

        return rows;
    }

    public static void main(String[] args) {
        int n = 5;
        CompleteStaircase solution = new CompleteStaircase();
        int completeRows = solution.arrangeCoins(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}
