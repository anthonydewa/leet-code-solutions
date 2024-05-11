import java.util.HashMap;

class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        HashMap<Character, Integer> test = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            test.put(s.charAt(i), 1);
            for (int j = (i + 1); j < s.length(); j++) {
                Character cs = s.charAt(j);

                if (test.get(cs) == null) {
                    test.put(cs, 1);
                } else {
                    break;
                }
            }

            if (count < test.size()) {
                count = test.size();
            }
            test.clear();
        }

        return count;
    }
}