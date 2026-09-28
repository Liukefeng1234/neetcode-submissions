class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numList = new HashSet<>();
        int longest = 0;

        for (int num : nums) {
            numList.add(num);
        }

        for (int num : numList) {
            if (!numList.contains(num - 1)) {
                int curr = num;
                int length = 1;

                while (numList.contains( curr + 1)) {
                    curr++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
