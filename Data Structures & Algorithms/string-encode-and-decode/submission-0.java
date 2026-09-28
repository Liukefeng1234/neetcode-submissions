class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }

        return encoded.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int separator = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, separator));

            int start = separator + 1;
            int end = start + length;

            result.add(str.substring(start, end));

            i = end;
        }

        return result;
    }

}
