class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int front = 0;
        int rear = numbers.length-1;

        while(true){
            if(target == numbers[front]+ numbers[rear]){
                result[0] = front +1;
                result[1] = rear +1;
                return result;
            }else if(target > numbers[front]+ numbers[rear]){
                front+=1;
            }else{
                rear-=1;
            }

        }
    }
}