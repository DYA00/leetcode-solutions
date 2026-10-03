// Solution for the problem of Substring with Concatenation of All Words in the leetcode.
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;

        HashMap<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        for (int offset = 0; offset < wordLength; offset++) {
            int left = offset;
            int right = offset;

            HashMap<String, Integer> window = new HashMap<>();
            int count = 0;

            while (right + wordLength <= s.length()) {
                String current = s.substring(right, right + wordLength);
                right += wordLength;

                if(!required.containsKey(current)) {
                    window.clear();
                    count = 0;
                    left = right;
                    continue;
                }

                window.put(current, window.getOrDefault(current, 0) + 1);
                count ++;

                while (window.get(current) > required.get(current)) {
                    String leftWord = s.substring(left, left + wordLength);
                    window.put(leftWord, window.get(leftWord) - 1);
                    left += wordLength;
                    count--;
                }

                if (count == wordCount) {
                    result.add(left);

                    String leftWord = s.substring(left, left + wordLength);
                    window.put(leftWord, window.get(leftWord) - 1);
                    left += wordLength;
                    count--;
                }
            }
        }

        return result;
    }
}
