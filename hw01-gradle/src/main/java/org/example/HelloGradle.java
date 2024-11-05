package org.example;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

public class HelloGradle {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("Apple", "Banana", "Mango", "Cherry");
        Joiner joiner = Joiner.on("->");
        System.out.println(joiner.join(list));
    }
}