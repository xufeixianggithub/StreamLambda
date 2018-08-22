package com.xufx.Client;

import com.xufx.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<Person>();
        Person p1=new Person("a","1");
        Person p2=new Person("b","2");
        Person p3=new Person("c","3");
        Person p4=new Person("d","4");
        Person p5=new Person("e","1");

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        //若key相同则以后面的对象替换前面key的对象，或者取后面的键值对
        Map<String, Person> detailMap = list.stream().collect(Collectors.toMap(Person::getAge, Function.identity(), (key1, key2)->key2));

        System.out.println(detailMap);

    }
}
