package com.liu.shan.effective.enums;

import java.util.*;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/1/31.
 *
 * @author liuxin.
 */
public class Enum33 {



    public static void main(String[] args) {
        Herb[] herbs = {new Herb("ANNUAL1", Herb.Type.ANNUAL), new Herb("ANNUAL2", Herb.Type.ANNUAL), new Herb("PERENNIAL1", Herb.Type.PERENNIAL)};
        Set<Herb>[] herbsByType = new Set[Herb.Type.values().length];
        for (int i = 0; i < herbsByType.length; i++) {
            herbsByType[i] = new HashSet<>();
        }
        for (Herb herb : herbs) {
            herbsByType[herb.getType().ordinal()].add(herb);
        }

        for (int i = 0 ; i < herbsByType.length; i ++) {
            System.out.printf("%s: %s%n", Herb.Type.values()[i], herbsByType[i]);
        }

        //注意EeumMap构造器采用键类型的Class对象：这是一个有限制的类型令牌，它提供了运行时的泛型信息
        Map<Herb.Type, Set<Herb>> herbsByTypeMap = new EnumMap<>(Herb.Type.class);
        Map<Herb.Type, Set<Herb>> maps = new HashMap<>();
        for (Herb.Type t : Herb.Type.values()) {
            herbsByTypeMap.put(t, new HashSet<>());
            maps.put(t, new HashSet<>());
        }

        for (Herb herb : herbs) {
            herbsByTypeMap.get(herb.getType()).add(herb);
            maps.get(herb.getType()).add(herb);
        }

        System.out.println("===================map===============");
        System.out.println(herbsByTypeMap);
        System.out.println("Map ： "  + maps);
    }



}

class Herb {
    public enum Type {
        ANNUAL, PERENNIAL, BIENNIAL
    }

    private final String name;

    private final Type type;

    public Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override public String toString() {
        return "Herb{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
