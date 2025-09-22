class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //create a Map <Key, Value> of <String, List<String>>
        Map<String, List<String>> map = new HashMap<>();

        // for each string in strs
        for(String str: strs){

            //turn them to char array
            char[] arr = str.toCharArray();

            //sort the char array
            Arrays.sort(arr);

            //make the sorted char array into string again
            String key = String.valueOf(arr);

            //if map doesn't contain key, put (key, empty Array list) in hmap
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            //get value of hmap, by putting key. = list of strings.
            // List<T> has list.add("") method

            //based on the key, add its original word the values (List<String>)
            map.get(key).add(str);
        }

        //empty answer List of lists
        List<List<String>> answer = new ArrayList<>();

        //fill the answer list
        //for all the keys in the keyset  / categorizing anagrams based on key
        for(String key: map.keySet()){

            //add to answer list, value of hmap based on key = List<String>
            answer.add(map.get(key));
        }

        return answer;



    }
}
