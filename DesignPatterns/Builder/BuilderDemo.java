package DesignPatterns.Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer cmpBuilder=new ComputerBuilder("12GB","1TB").setCpu("i5 1234gc").setGpu("Nvidea Gforce 4GB").build();

        cmpBuilder.printComp();

    }
}
