package com.xian.linked.list;


import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * @Description
 * @Author: fan
 * @DateTime: 2019-08-28 22:27
 * @Version: 0.0.1-SNAPSHOT
 */
public class DoubleLinkedListTest {

    @Test
    public void add() {
        HeroDoubleNode heroNode1 = new HeroDoubleNode(1, "宋江", "及时雨");
        HeroDoubleNode heroNode2 = new HeroDoubleNode(2, "卢俊义", "玉麒麟");
        HeroDoubleNode heroNode3 = new HeroDoubleNode(3, "吴用", "智多星");
        HeroDoubleNode heroNode4 = new HeroDoubleNode(4, "林冲", "豹子头");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        // 直接插入
        doubleLinkedList.add(heroNode1);
        doubleLinkedList.add(heroNode2);
        doubleLinkedList.add(heroNode3);
        doubleLinkedList.add(heroNode4);
        doubleLinkedList.show();
    }

    @Test
    public void update() {
        HeroDoubleNode heroNode1 = new HeroDoubleNode(1, "宋江", "及时雨");
        HeroDoubleNode heroNode2 = new HeroDoubleNode(2, "卢俊义", "玉麒麟");
        HeroDoubleNode heroNode3 = new HeroDoubleNode(3, "吴用", "智多星");
        HeroDoubleNode heroNode4 = new HeroDoubleNode(4, "林冲", "豹子头");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        // 直接插入
        doubleLinkedList.add(heroNode1);
        doubleLinkedList.add(heroNode2);
        doubleLinkedList.add(heroNode3);
        doubleLinkedList.add(heroNode4);
        doubleLinkedList.show();
        System.out.println("【修改后的数据】");
        HeroDoubleNode newHeroNode3 = new HeroDoubleNode(3, "小吴用", "小智多星");
        doubleLinkedList.update(newHeroNode3);
        doubleLinkedList.show();
        
        
    }

    @Test
    public void delete() {
        HeroDoubleNode heroNode1 = new HeroDoubleNode(1, "宋江", "及时雨");
        HeroDoubleNode heroNode2 = new HeroDoubleNode(2, "卢俊义", "玉麒麟");
        HeroDoubleNode heroNode3 = new HeroDoubleNode(3, "吴用", "智多星");
        HeroDoubleNode heroNode4 = new HeroDoubleNode(4, "林冲", "豹子头");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        // 直接插入
        doubleLinkedList.add(heroNode1);
        doubleLinkedList.add(heroNode2);
        doubleLinkedList.add(heroNode3);
        doubleLinkedList.add(heroNode4);
        doubleLinkedList.show();
        System.out.println("【删除后的数据展示】");
        doubleLinkedList.delete(2);
        doubleLinkedList.show();
    }
}
