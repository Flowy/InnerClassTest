package com.flowyk;

/**
 * Created by Lukas on 1. 5. 2015.
 */
public class Starter {
    public static void main(String... args) {
        OuterClass outerClass = new OuterClass("outer class");
        OuterClass.StaticLocalClass staticLocalClass = new OuterClass.StaticLocalClass("static local class");
        OuterClass.LocalClass localClass = outerClass.new LocalClass("inner local class");
        System.out.println(outerClass);
        System.out.println(staticLocalClass);
        System.out.println(localClass);
    }
}
