package Arrays.Patterns.SlidingWindow;

public class LongestRepeatingCharReplace {

    public static void main(String[] args) {

        String str = "AABABBA";
        int k = 1;

        System.out.println(characterReplacement(str,k));

    }

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int j = 0;
        int max_freq = 0;
        int maxWindowSize = 0;

        for(int i=0; i<s.length(); i++){

            freq[s.charAt(i) - 'A']++;

            max_freq = Math.max(max_freq, freq[s.charAt(i)-'A']);

            int windowLength = i-j+1;

            if(windowLength - max_freq > k){
                freq[s.charAt(j)-'A']--;
                j++;
            }

            windowLength = i-j+1;
            maxWindowSize = Math.max(windowLength, maxWindowSize);

        }

        return maxWindowSize;

    }

}
