

// Find the Longest Common Subsequence of 2 strings

// Solution - 1) create a 2D array - int[char1[].length +1][char2[].length +1]
//            2) 1st row and 1st column should be 0 -
//            3) if char1[i+1] == char2[j+1], add 1 to the value of the cell diagonally above/behind
//            4) else - compare the element directly above and behind and assign bigger value to the current cell
//            4) the last cell of the 2D array will be the largest subsequence count.

// To get the longest subsequence string -
//            1) in a while loop running with argument true - start from the last cell.
//            2) if the value in cell directly above and behind is lesser than current cell's value, concatenate corresponding
//               alphabet to the string and move diagonally by a cell.
//            3) else - move up by a cell.
//            4) Condition to break out of the loop - if current cell value == 0, concatenate corresponding
//               alphabet to the string and break.




class Question2 {

    int findSubSequence (char[] one, char[] two) {
        int oneSize = one.length;
        int twoSize = two.length;
        int[][] subSequence = new int[oneSize + 1][twoSize + 1];

        for (int i = 0; i <= oneSize; i++){
            for (int j = 0; j <= twoSize; j++){
                if (i == 0 || j == 0){
                    subSequence[i][j] = 0;
                }
                else if (one[i-1] == two[j-1] ) {
                    subSequence[i][j] = subSequence[i-1][j-1] + 1;
                }
                else {
                    if (subSequence[i-1][j] > subSequence[i][j-1]) {
                        subSequence[i][j] = subSequence[i - 1][j];
                    }
                    else subSequence[i][j] = subSequence[i][j-1];
                }
            }
        }
        return subSequence[oneSize][twoSize];
    }

    String getSubSequence (char[] one, char[] two) {
        String subSeq = "";
        int oneSize = one.length;
        int twoSize = two.length;
        int[][] subSequence = new int[oneSize + 1][twoSize + 1];

        for (int i = 0; i <= oneSize; i++){
            for (int j = 0; j <= twoSize; j++){
                if (i == 0 || j == 0){
                    subSequence[i][j] = 0;
                }
                else if (one[i-1] == two[j-1] ) {
                    subSequence[i][j] = subSequence[i-1][j-1] + 1;
                }
                else {
                    if (subSequence[i-1][j] > subSequence[i][j-1]) {
                        subSequence[i][j] = subSequence[i - 1][j];
                    }
                    else subSequence[i][j] = subSequence[i][j-1];
                }
            }
        }

        int in = oneSize;
        int jn = twoSize;
        while (true){
            if (subSequence[in][jn] == 0) {
                subSeq = one[in-1] + subSeq;
                return subSeq;
            }
            else if (subSequence[in][jn] > subSequence[in-1][jn] && subSequence[in][jn] > subSequence[in][jn-1]){
                subSeq = one[in-1] + subSeq;
                in--;
                jn--;
            }
            else{
                jn--;
            }
        }
    }

}
