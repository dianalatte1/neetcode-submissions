class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> letters = new HashMap<>();


        for(char letter : s.toCharArray()){
            if (letters.containsKey(letter)){
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }

        }

        for(char letter : t.toCharArray()){
            if (!letters.containsKey(letter)){
                return false;
            } else {
                int frequence = letters.get(letter)-1;
                
                if(frequence < 0){
                    return false;
                }
                letters.put(letter, frequence);

            }

        }

        return true;


    }
}
