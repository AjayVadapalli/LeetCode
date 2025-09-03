class Solution {
    public long subArrayRanges(int[] nums) {
        return sumOfMax(nums) - sumOfMin(nums);
    }

    public long sumOfMax(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<int[]> st1 = new Stack<>();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (!st1.isEmpty() && st1.peek()[0] < arr[i]) {
                count += st1.pop()[1];
            }
            left[i] = count;
            st1.push(new int[]{arr[i], count});
        }

        Stack<int[]> st2 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int count = 1;
            while (!st2.isEmpty() && st2.peek()[0] <= arr[i]) {
                count += st2.pop()[1];
            }
            right[i] = count;
            st2.push(new int[]{arr[i], count});
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (long) arr[i] * left[i] * right[i];
        }
        return ans;
    }

    public long sumOfMin(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<int[]> st1 = new Stack<>();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (!st1.isEmpty() && st1.peek()[0] > arr[i]) {
                count += st1.pop()[1];
            }
            left[i] = count;
            st1.push(new int[]{arr[i], count});
        }

        Stack<int[]> st2 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int count = 1;
            while (!st2.isEmpty() && st2.peek()[0] >= arr[i]) {
                count += st2.pop()[1];
            }
            right[i] = count;
            st2.push(new int[]{arr[i], count});
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (long) arr[i] * left[i] * right[i];
        }
        return ans;
    }
}
