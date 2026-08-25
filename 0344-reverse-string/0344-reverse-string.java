class Solution {
    public void reverseString(char[] s) {
        Stack<Character> sStack = new Stack<>();

        for(Character a : s){
            sStack.push(a);
        }
        int size = sStack.size();
        for(int i =0; i < size;i++){
            s[i] = sStack.pop();
        }
    }
}