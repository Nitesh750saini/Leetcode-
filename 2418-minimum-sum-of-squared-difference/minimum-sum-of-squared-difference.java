class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        int[] diff = new int[n];
        int max = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            total += diff[i];
        }

        if (total <= k) {
            return 0;
        }

        long[] freq = new long[max + 1];

        for (int d : diff) {
            freq[d]++;
        }

        for (int d = max; d > 0 && k > 0; d--) {
            if (freq[d] == 0) {
                continue;
            }

            long count = freq[d];
            long nextCount = freq[d - 1];

            long operations = Math.min(k, count);

            if (operations < count) {
                freq[d] -= operations;
                freq[d - 1] += operations;
                k -= operations;
            } else {
                freq[d] = 0;
                freq[d - 1] += count;
                k -= count;
            }
        }

        long ans = 0;

        for (int d = 1; d < freq.length; d++) {
            ans += freq[d] * d * d;
        }

        return ans;
    }
}