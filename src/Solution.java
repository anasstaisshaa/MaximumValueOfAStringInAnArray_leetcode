class Solution {
    public int maximumValue(String[] strs) {
        int result =0;
        int num = 0;
        for(int i = 0; i< strs.length; i++){
            if(strs[i].matches("[0-9]+")){
                num = Integer.parseInt(strs[i]);
                if(num > result)
                    result = num;
            }
            else {
                if(strs[i].length() > result)
                    result = strs[i].length();
            }
        }
        return result;
    }
}
