class Animal {
  Animal() {
    System.out.println("Animal constructor called");
  }
  
  void eat() {
    System.out.println("Animal is eating");
  }
}

class Dog extends Animal {
  Dog() {
    super();
    System.out.println("Dog constructor called");
  }
  
  void bark() {
    System.out.println("Dog is barking");
  }
  
  void eat() {
    super.eat();
    System.out.println("Dog is eating");
  }
}

class Labrador extends Dog {
  Labrador() {
    super();
    System.out.println("Labrador constructor called");
  }
  
  void fetch() {
    System.out.println("Labrador is fetching");
  }
}

public class first {
  public static void main(String[] args) {
    Labrador l = new Labrador();
    l.eat();
    l.bark();
    l.fetch();
  }
}
