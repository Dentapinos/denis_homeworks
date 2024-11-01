package org.example;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ImmutableList<String> names = ImmutableList.of("Alice", "Denis", "Maria");
        List<String> filteredNames = Lists.newArrayList(names.stream().map(name->
                Strings.repeat(name, 2)).toList()
        );
        System.out.println(filteredNames);
    }
}