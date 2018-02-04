package com.liu.shan.effective.enums;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/1/31.
 *
 * @author liuxin.
 */
public class Enum33 {

    Herb[] herbs = {new Herb("ANNUAL1", Herb.Type.ANNUAL), new Herb("ANNUAL2", Herb.Type.ANNUAL), new Herb("PERENNIAL1", Herb.Type.PERENNIAL)};

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

    @Override public String toString() {
        return "Herb{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
