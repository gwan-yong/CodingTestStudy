class Solution {
    public int lengthOfLastWord(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch :  s.toCharArray()){
                stack.push(ch);
        }

        int result =0 ;
        while(!stack.isEmpty()){
            char ch = stack.pop();

            if(ch != ' '){
                result++;    
            }else {
                if(result > 0)
                break;
            }
                
            
        }
        return result;

        
    }
}