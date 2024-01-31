import java.util.*;

public class leetcode49 {
    // Method 1: by sorting the strings
    // Time complexity: O(nlogk)
    // Space Complexity: O(n)
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     if (strs == null || strs.length == 0) return new ArrayList<>();

    //     List<List<String>> ans = new ArrayList<>();
    //     HashMap<String, List<String>> hm = new HashMap<>(); 

    //     for(String s: strs){
    //         char[] arr = s.toCharArray(); //convert string into array for sorting
    //         // sorting the array
    //         Arrays.sort(arr);

    //         // now store the sorted array as string
    //         String key = new String(arr);

    //         // if key is not present in map just add it into map
    //         if(!hm.containsKey(key)) hm.put(key, new ArrayList<>());

    //         // if key is present in hash map than add string "s" in existing list value
    //         hm.get(key).add(s);
    //     }

    //     // now storing the ans in final list from map 
    //     for (Map.Entry<String, List<String>> stringAnagrams : hm.entrySet()) ans.add(stringAnagrams.getValue());

    //     return ans;              

    // }

    // Method 2: categorize by frequency
    // Time complexity: O(n)
    // Spae complexity: O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>(); 

        for(String s: strs){
            // creating frequency string
            // function calling
            String freqStr = getFrequencyString(s);

            // If the frequency string is present, add the string to the list
            if (hm.containsKey(freqStr)) hm.get(freqStr).add(s);
            else {
                // else create a new list
                List<String> al = new ArrayList<>();
                al.add(s);
                hm.put(freqStr, al);
            }
        }

        // now storing the ans in final list from map 
        for (Map.Entry<String, List<String>> stringAnagrams : hm.entrySet()) ans.add(stringAnagrams.getValue());
    
        return ans; 

    }

    private String getFrequencyString(String str) {

        // Frequency buckets
        int[] freq = new int[26];
    
        // Iterate over each character
        for (char c : str.toCharArray()) {
          freq[c - 'a']++;
        }
    
        // Start creating the frequency string
        StringBuilder frequencyString = new StringBuilder("");
        char c = 'a';
        for (int i : freq) {
          frequencyString.append(c);
          frequencyString.append(i);
          c++;
        }
    
        return frequencyString.toString();
    }

}
