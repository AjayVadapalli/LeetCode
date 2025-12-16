1class Solution {
2    public int candy(int[] ratings) {
3        int n = ratings.length;
4        int candies = n;
5        int i = 1;
6
7        while (i < n) {
8
9            if (ratings[i] == ratings[i - 1]) {
10                i++;
11                continue;
12            }
13
14            int peak = 0;
15
16            while (i < n && ratings[i] > ratings[i - 1]) {
17                peak++;
18                candies += peak;
19                i++;
20            }
21
22            int valley = 0;
23
24            while (i < n && ratings[i] < ratings[i - 1]) {
25                valley++;
26                candies += valley;
27                i++;
28            }
29
30            candies -= Math.min(peak, valley);
31        }
32
33        return candies;
34    }
35}
36