

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> rows = new HashMap<>();

        // Store reserved seats row-wise
        for (int[] seat : reservedSeats) {
            rows.putIfAbsent(seat[0], new HashSet<>());
            rows.get(seat[0]).add(seat[1]);
        }

        // Rows with no reserved seats can fit 2 families
        int ans = (n - rows.size()) * 2;

        // Check rows having reserved seats
        for (Set<Integer> seats : rows.values()) {

            boolean left = true;
            boolean middle = true;
            boolean right = true;

            // Left: 2,3,4,5
            for (int i = 2; i <= 5; i++) {
                if (seats.contains(i))
                    left = false;
            }

            // Middle: 4,5,6,7
            for (int i = 4; i <= 7; i++) {
                if (seats.contains(i))
                    middle = false;
            }

            // Right: 6,7,8,9
            for (int i = 6; i <= 9; i++) {
                if (seats.contains(i))
                    right = false;
            }

            if (left && right)
                ans += 2;
            else if (left || middle || right)
                ans += 1;
        }

        return ans;
    }
}