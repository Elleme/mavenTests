package junit;

/**
 * @ Author     ：Young
 * @ Date       ：Created in 16:24 2018/12/4
 * @ Description：junit 学习
 * @ Modified By：Young
 */
public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}
