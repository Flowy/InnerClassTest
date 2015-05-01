package com.flowyk;

/**
 * Created by Lukas on 1. 5. 2015.
 */
public class OuterClass {

    private String outerParameter;

    public OuterClass(String outerParameter) {
        this.outerParameter = outerParameter;
    }

    @Override
    public String toString() {
        return "{OuterClass: " + outerParameter + "}";
    }
    public class LocalClass {
        private String innerParameter;

        public LocalClass(String parameter) {
            this.innerParameter = parameter;
        }

        @Override
        public String toString() {
            return "{OuterClass: " + OuterClass.this.outerParameter + "\t"
                    + "LocalClass: " + this.innerParameter + "}";
        }
    }

    public static class StaticLocalClass {
        private String innerParameter;

        public StaticLocalClass(String parameter) {
            this.innerParameter = parameter;
        }

        @Override
        public String toString() {
            return "{OuterClass: " + "NO ACCESS" + "\t"
                    + "LocalStaticClass: " + this.innerParameter + "}";
        }
    }
}
