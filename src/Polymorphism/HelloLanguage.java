package Polymorphism;

public class HelloLanguage {
    public static void main(String[] args) {
        Language la=new Language();
        la.learn();
        la=new Java();
        la.learn();
        la=new Cobol();
        la.learn();
    }
}
