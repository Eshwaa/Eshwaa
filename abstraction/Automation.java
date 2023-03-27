package org.abstraction;

public class Automation extends MultipleLanguage implements Language,TestTool{
    public static void main(String[] args) {
        Automation auto = new Automation();
        auto.java();
        auto.selenium();
        auto.ruby();
        auto.python();
    }

    @Override
    public void ruby() {
        System.out.println("Ruby");
    }

    @Override
    public void java() {
        System.out.println("Java");
    }

    @Override
    public void selenium() {
        System.out.println("Selenium");
    }
}
