class Animal{
void makeSound(){
System.out.println("Animal makes a sound");
}
}

class Dog extends Animal{
void makeSound(){
System.out.println("Dog barks");
}
}

public class MethodOverride{
public static void main(String[] args){
Animal myAnimal = new Dog();
myAnimal.makeSound();
}
}