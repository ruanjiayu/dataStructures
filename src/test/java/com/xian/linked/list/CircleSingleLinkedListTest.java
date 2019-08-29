package com.xian.linked.list;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: fan
 * @DateTime: 2019-08-29 20:16
 * @Version: 0.0.1-SNAPSHOT
 */

public class CircleSingleLinkedListTest {

    @Test
    public void add() {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.add(5);
        circleSingleLinkedList.show();
    }

    @Test
    public void show() {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.show();
    }
}
