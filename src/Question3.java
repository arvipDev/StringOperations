
//  Given a binary string str, the task is to maximize the count of 0s in left substring and 1s in right substring by
//  splitting given Binary string at any index. Print the sum of such 0s and 1s in the end


class Question3 {

    int zerosNOnes (String binary) {
        int maxSum = 0;
        int zeros = 0;
        int ones = 0;
        int total;

        for (int i = 0; i < binary.length(); i++){
            int current = binary.charAt(i) - 48;
            if (current == 0) zeros++;
            else ones++;
        }
        total = zeros + ones;

        int leftOnes = 0;
        int leftZeros = 0;

        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) - 48 == 0){
                leftZeros++;
            } else{
                leftOnes++;
            }
            int calc = leftZeros + (total - (leftOnes + leftZeros)) - (zeros - leftZeros);
            if (maxSum < calc) maxSum = calc;
        }
        return maxSum;
    }
}
