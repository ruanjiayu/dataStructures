package com.xian.stack;

import java.util.Scanner;

/**
 * @Description: 用数组模拟栈
 * @Author: fan
 * @DateTime: 2019-08-30 00:13
 * @Version: 0.0.1-SNAPSHOT
 */
public class ArrayStack {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(4);
        String key = "";
        // 控制是否退出菜单
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        while (loop) {
            System.out.println("【输入show:显示栈】");
            System.out.println("【输入exit:退出程序】");
            System.out.println("【输入push:从栈中存数据(入栈)】");
            System.out.println("【输入pop:从栈中取出数据(出栈)】");
            System.out.println("【请输入你的选择】");
            key = scanner.next();
            switch (key) {
                case "show":
                    stack.show();
                    break;
                case "push":
                    System.out.println("【请输入一个数】");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    try {
                        int res = stack.pop();
                        System.out.println(String.format("【出栈的数据为%s】", res));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("【程序退出了～～】");
    }

    /**
     * 栈的大小
     */
    private int maxSize;
    /**
     * 数组来模拟栈，数据就放置在数组中
     */
    private int[] stack;
    /**
     * 初始化栈顶的坐标
     */
    private int top = -1;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 入栈
     *
     * @param value
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("【栈已经满了～～】");
            return;
        }
        top++;
        stack[top] = value;
    }

    /**
     * 出栈
     *
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("【栈空，已经没有数据了～～】");
        }
        int value = stack[top];
        top--;
        return value;
    }

    /**
     * 显示栈的内容
     */
    public void show() {
        if (isEmpty()) {
            System.out.println("【栈为空～～】");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(String.format("【栈元素stack[%s]:%s】", i, stack[i]));
        }

    }
}
