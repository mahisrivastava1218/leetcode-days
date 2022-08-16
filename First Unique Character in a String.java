class Solution{
    public int firstUniqChar(String s){
        int total[]=new int[26];
        for(char c : s.toCharArray()){
            total[c-'a'] += 1;
        }for(int i=0; i<s.length();++i)
            if(total[s.charAt(i)- 'a']==1)
                  return i;      
        return -1;
        
    }
}
