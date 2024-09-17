package DesignPatterns.Builder;

public class Computer {
    private  String cpu;
    private  String ram;
    private  String storage;
    private String gpu;

    public Computer(ComputerBuilder cmpBuild){
        this.cpu=cmpBuild.cpu;
        this.gpu=cmpBuild.gpu;
        this.ram=cmpBuild.ram;
        this.storage=cmpBuild.storage;
    }

    public void printComp(){
        System.out.println("Cpu "+this.cpu);
        System.out.println("Gpu "+this.gpu);
        System.out.println("Ram "+this.ram);
        System.out.println("Storage "+this.storage);
    }
}
