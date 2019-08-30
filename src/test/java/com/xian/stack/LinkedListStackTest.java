package com.xian.stack;



import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/8/30  13:33
 * @Version: 0.0.1-SHAPSHOT
 */

public class LinkedListStackTest {


    @Test
    public void pushTest() {
        LinkedListStack<String> stack = new LinkedListStack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        stack.show();
    }

    @Test
    public void popTest() {
        LinkedListStack<String> stack = new LinkedListStack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        stack.show();
        System.out.println("-------------出栈-----------");
        stack.pop();
        stack.pop();
        stack.show();
    }
}
