package DesignPatterns.Builder;

public class ComputerBuilder {
    public   String cpu;
    public   String ram;
    public   String storage;
    public String gpu;

    public ComputerBuilder(String ram,String storage){
        this.storage=storage;
        this.ram=ram;
    }

    public ComputerBuilder setCpu(String cpu){
        this.cpu=cpu;
        return this;
    }

    public ComputerBuilder setGpu(String gpu){
        this.gpu=gpu;
        return this;
    }

    public Computer build(){
        return new Computer(this);
    }


}
