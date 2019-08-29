package com.xian.linked.list.bo;

/**
 * @Description 定义节点
 * @Author: fan
 * @DateTime: 2019-08-20 23:28
 * @Version: 0.0.1-SNAPSHOT
 */

public class HeroNode {

    public int no;

    public String name;

    public String nickName;

    public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return String.format("【no】:%s, 【name】:%s, 【nickName】:%s", no, name, nickName);
    }
}
