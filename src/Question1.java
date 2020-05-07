

// Move all occurrence of letter ‘x’ from the string s to the end using Recursion

// Solution - recursion 1st step should be the end condition.
//          1) end condition - if count == length of string, use regular expression to remove all "x" and for loop to concatenate
//             noOfX to the end of the string. return string.
//          2) if char at count == "x" noOfX++
//          3) count++ and return - method call (string, noOfX, Count)


class Question1 {

    String moveStringToEnd (String test, int noOfX, int count) {
        if (count == test.length()){
            test = test.replaceAll("x", "");
            for (int i = 0; i < noOfX; i++){
                test = test.concat("x");
            }
            return test;
        }

        if (test.charAt(count) == 'x'){
            noOfX++;
        }

        count++;
        return moveStringToEnd(test, noOfX, count);
    }
}
