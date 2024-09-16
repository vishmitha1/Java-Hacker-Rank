package DesignPatterns;

public class Singleton {
    private  static Singleton instence;
    private String data;
    private Singleton(String Data){
        this.data=Data;
    }
    public  static Singleton getInstance(String data){
        if(instence==null){
            instence=new Singleton(data);
        }
            return instence;
    }
}
