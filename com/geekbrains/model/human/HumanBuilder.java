package com.geekbrains.model.human;

public class HumanBuilder {
    private int genId;
    private Human human;
    private int age;
    private String name;

    public HumanBuilder(){
        createHuman();
    }

    public HumanBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public HumanBuilder setName(String name){
        this.name = name;
        return this;
    }

    private void createHuman(){
        human = new Human();
    }

    private void nextId(){
        human.setId(genId++);
    }

    private void createName(){
        human.setName(name);
    }

    private void createAge(){
        human.setAge(age);
    }

    public Human build(){
        createHuman();
        createName();
        createAge();
        nextId();
        return human;
    }
}
