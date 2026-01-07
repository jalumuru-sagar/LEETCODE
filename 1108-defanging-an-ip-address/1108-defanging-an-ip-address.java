class Solution {
    public String defangIPaddr(String address) {
        char[] arr=address.toCharArray();
        String result="";
        for(char c:arr){
            if(c=='.')
            {
                result+="[.]";
            }
            else{
                result+=c;
            }
        }
        return result;
        
    }
    
}