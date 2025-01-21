package org.example.OOPDeneme;



public abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public  void makeSound(){
        System.out.println(name + "Ses Çıkarıyor");
    }
    public void eat(){
        System.out.println(name + "Yiyor");
    }


}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + "Ravv");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name + "Miyav");
    }

}


