package com.liu.shan.effective.enums;

import java.util.EnumSet;
import java.util.Set;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/1/31.
 *
 * @author liuxin.
 */

//改用EnumSet 合并集合，原理EnumSet实现set接口可以去重
public class Enum32 {

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Text.Style.BOLD, Text.Style.ITALIC, Text.Style.UNDERLINE));
    }
}


class Text{
    public enum Style{BOLD,ITALIC,UNDERLINE,STRIKETHROUGH}
    public void applyStyles(Set<Style> styles){
        //实现方案
        System.out.println(styles); //[BOLD, ITALIC, UNDERLINE]
    }
}



//用位域合并集合，最终是一个数字，虽然能正确表示多个集合，但是翻译困难 ，但有个优点占用空间少 ，一个数字可以表示一个集合
class Text1 {

    public static final int BOLD = 1 << 0; //1  0001

    public static final int ITALIC = 1 << 1; // 2  0010

    public static final int STRIKETHROUGH = 1 << 2; // 4 0100

    public static final int UNDERLINE = 1 << 3; //8 1000

    void applyStyles(int styles) {
        System.out.println(styles);
    }

    public static void main(String[] args) {
        Text1 text1 = new Text1();
        text1.applyStyles(STRIKETHROUGH | UNDERLINE | UNDERLINE); //集合 12 1100
    }
}