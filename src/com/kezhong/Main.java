package com.kezhong;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new ArrayList<>(10);
        long start = System.currentTimeMillis();
        initList(list1);
        long end = System.currentTimeMillis();
        System.out.println("LinkedList初始化花费时间：" + (end - start));
        start = System.currentTimeMillis();
        initList(list2);
        end = System.currentTimeMillis();
        System.out.println("ArrayList初始化花费时间：" + (end - start));

        start = System.currentTimeMillis();
        iterator(list1);
        end = System.currentTimeMillis();
        System.out.println("LinkedList遍历花费时间：" + (end - start));

        start = System.currentTimeMillis();
        iterator(list2);
        end = System.currentTimeMillis();
        System.out.println("ArrayList遍历花费时间：" + (end - start));

        start = System.currentTimeMillis();
        insert(list1);
        end = System.currentTimeMillis();
        System.out.println("LinkedList插入数据花费时间：" + (end - start));

        start = System.currentTimeMillis();
        insert(list2);
        end = System.currentTimeMillis();
        System.out.println("ArrayList插入数据花费时间：" + (end - start));

        start = System.currentTimeMillis();
        remove(list1);
        end = System.currentTimeMillis();
        System.out.println("LinkedList删除数据花费时间：" + (end - start));

        start = System.currentTimeMillis();
        remove(list2);
        end = System.currentTimeMillis();
        System.out.println("ArrayList删除数据花费时间：" + (end - start));

    }

    private static void initList(List<String> list) {
        String uuid;
        for(int i = 0; i < 10000000; i++) {
            uuid = UUID.randomUUID().toString();
            list.add(uuid);
        }
    }

    private static void iterator(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private static void insert(List<String> list) {
        String uuid = UUID.randomUUID().toString();
        list.add(0, uuid);
    }

    private static void remove(List<String> list) {
        list.remove(0);
    }
}
