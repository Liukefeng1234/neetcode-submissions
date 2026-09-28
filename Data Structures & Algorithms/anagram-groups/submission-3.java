class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            int[] counts = new int[26];

            for (char c : s.toCharArray()) {
                counts[c - 'a']++;
            }

            String key = Arrays.toString(counts);

            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }

            groups.get(key).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}
