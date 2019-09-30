package com.xian.collection.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/9/30  15:11
 * @Version: 0.0.1-SHAPSHOT
 */
public class OperateSetTest {
    Set<String> set1 = new HashSet<String>() {
        {
            add("乾");
            add("坤");
            add("震");
            add("艮");
            add("离");
            add("坎");
            add("兑");
            add("巽");
        }
    };

    Set<String> set2 = new HashSet<String>() {
        {
            add("艮");
            add("兑");
        }
    };

    /**
     * 求交集
     */
    @Test
    public void retain() {
        Set<String> result = new HashSet<>();
        result.addAll(set1);
        result.retainAll(set2);
        System.out.println("【Set交集】" + result);
    }

    /**
     * 差集
     */
    @Test
    public void remove() {
        Set<String> result = new HashSet<>();
        result.addAll(set1);
        result.removeAll(set2);
        System.out.println("【Set差集】" + result);
    }

    /**
     * 求并集
     */
    @Test
    public void add() {
        Set<String> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        System.out.println("【Set并集】" + result);
    }

    /**
     * 清除
     */
    @Test
    public void clear() {
        Set<String> result = new HashSet<>();
        result.addAll(set1);
        System.out.println(result);
        result.clear();
        System.out.println("【清理】" + result);
    }
}