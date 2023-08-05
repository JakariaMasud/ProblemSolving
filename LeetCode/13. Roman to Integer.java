class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> values = new HashMap<>();
        int previousValue=0;
        int sum=0;
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        for(int i=s.length()-1;i>=0;i--){
            char singleChar = s.charAt(i);
            int currentValue = values.get(singleChar);
            if(currentValue>=previousValue ){
               sum = sum+currentValue;
                previousValue = currentValue;
            }else{
                sum = sum-currentValue;
                previousValue = currentValue;
            }

        }

    return sum;
        
    }

}
