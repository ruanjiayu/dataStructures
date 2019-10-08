package com.xian.collection.Arrays;

import org.junit.Test;

import java.util.Arrays;


/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/10/8  9:50
 * @Version: 0.0.1-SHAPSHOT
 */
public class ArraysTest {

    // 第一种方式
    int[] arr = new int[5];
    // 第二种方式
    int[] arrs = new int[]{1995, 1996, 1997};
    // 第三种方式
    int a[] = {1, 2, 3};
    int b[][] = {{1, 2, 3}, {4, 5, 6}};

    /**
     * 只可以打印一维数组
     */
    @Test
    public void string() {
        System.out.println("【arr】:" + Arrays.toString(arr));
        System.out.println("【arrs】:" + Arrays.toString(arrs));
        System.out.println("【a】:" + Arrays.toString(a));
        System.out.println("【b】:" + Arrays.toString(b));
    }

    /**
     * 可以打印二维数组
     */
    @Test
    public void deepToString() {
        System.out.println("【b】:" + Arrays.deepToString(b));
    }


}