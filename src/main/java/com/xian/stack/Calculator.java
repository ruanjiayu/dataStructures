package com.xian.stack;

/**
 * @Description: 使用栈来完成表达式的计算思路
 * @Author: Xian
 * @CreateDate: 2019/9/3  15:58
 * @Version: 0.0.1-SHAPSHOT
 */
public class Calculator {

    private final static char MULTIPLICATION_OPERATION = '*';

    private final static char DIVISION_OPERATION = '/';

    private final static char SUBTRACTION_OPERATION = '-';

    private final static char ADDITION_OPERATION = '+';

    /**
     * 判断操作符的优先级
     *
     * @param oper
     * @return
     */
    public int priority(char oper) {
        if (oper == MULTIPLICATION_OPERATION || oper == DIVISION_OPERATION) {
            return 1;
        } else if (oper == SUBTRACTION_OPERATION || oper == ADDITION_OPERATION) {
            return 0;
        }
        // 出现了其他的运算符
        else {
            return -1;
        }
    }

    /**
     * 判断是否是最基础的符号： +, -, *, /
     *
     * @param oper
     * @return
     */
    public boolean isOperation(char oper) {
        boolean flag = oper == MULTIPLICATION_OPERATION || oper == DIVISION_OPERATION || oper == SUBTRACTION_OPERATION || oper == ADDITION_OPERATION;
        return flag;
    }

}
