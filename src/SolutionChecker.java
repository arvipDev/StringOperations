

public class SolutionChecker {

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        System.out.println(q1.moveStringToEnd("Geekxsforxxxgeeksx", 0, 0));
        System.out.println(q1.moveStringToEnd("xxxxgeexksx", 0, 0));
        System.out.println(q1.moveStringToEnd("xxxxx1?", 0, 0));
        Question2 q2 = new Question2();
        String one1 = "AGGTAB";
        String two2 = "GXTXAYB";
        char[] one = one1.toCharArray();
        char[] two = two2.toCharArray();
        System.out.println(q2.findSubSequence(one, two));
        System.out.println(q2.getSubSequence(one, two));
        Question3 q3 = new Question3();
        System.out.println(q3.zerosNOnes("0011110011"));
        System.out.println(q3.zerosNOnes("0001101111011"));
    }
}
