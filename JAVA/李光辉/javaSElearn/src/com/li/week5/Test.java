package com.li.week5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("001", "li", 20, "武汉");
        Student student2 = new Student("002", "wan", 21, "宜昌");
        Student student3 = new Student("003", "zhang", 22, "襄阳");
        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println("普通for循环: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("增强for循环: ");
        for (Student s:list) {
            System.out.println(s);
        }

        System.out.println("使用迭代器");
        Iterator<Student> studentIterator = list.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
    }
}
