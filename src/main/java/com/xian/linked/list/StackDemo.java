package com.xian.linked.list;

import java.util.Stack;

/**
 * @Description
 * @Author: fan
 * @DateTime: 2019-08-28 20:38
 * @Version: 0.0.1-SNAPSHOT
 */
public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // 入栈
        stack.add("111");
        stack.add("222");
        stack.add("333");
        // 出栈
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
