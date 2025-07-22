class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> hmap = new HashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);


        int total =0;
        int prevValue = 0;

        for(char c: s.toCharArray()){
            int currentValue = hmap.get(c); // get the equiv value of key from map

            if(currentValue > prevValue){
                total += currentValue - (2* prevValue); // bcz we already added prev value regardless,
                // that's why if it was smaller than current, we subtract it 2 times
            } else {
                total += currentValue;
            }

            prevValue = currentValue;

        }

        return total;
    }
}
