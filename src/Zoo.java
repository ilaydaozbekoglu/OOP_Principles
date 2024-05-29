// Kapsülleme ve Sınıf Tanımı
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter ve Setter Yöntemleri
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Genel bir davranış (metod)
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Hayvanların yemesi için genel bir metod
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Kalıtım
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Getter ve Setter Yöntemleri
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Polimorfizm: metodun üzerine yazılması (override)
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}

// Polimorfizm
class Cat extends Animal {
    private String furColor;

    // Constructor
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    // Getter ve Setter Yöntemleri
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    // Polimorfizm: metodun üzerine yazılması (override)
    @Override
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}

// Diğer bir hayvan türü
class Bird extends Animal {
    private boolean canFly;

    // Constructor
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    // Getter ve Setter Yöntemleri
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    // Polimorfizm: metodun üzerine yazılması (override)
    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps");
    }
}

// Ana sınıf (main) ve metod
public class Zoo {
    public static void main(String[] args) {
        // Nesne oluşturma ve kapsülleme kullanımı
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Black");
        Bird bird = new Bird("Tweety", 1, true);


        // Polimorfizm örneği
        Animal[] animals = {dog, cat, bird};

        // Hayvanların ses çıkarması
        for (Animal animal : animals) {
            animal.makeSound(); // Her hayvan türüne özgü ses çıkarır
            animal.eat();       // Her hayvan yemek yer
        }

        /*
            Örnek 2:
            Animal[] animals = {dog, cat, bird};
            for (int i = 0; i < animals.length; i++) {
                animals[i].makeSound(); // Her hayvan türüne özgü ses çıkarır
                animals[i].eat();       // Her hayvan yemek yer
}
            Örnek 3:
            import java.util.ArrayList;
            import java.util.List;

            // Polimorfizm örneği
            List<Animal> animals = new ArrayList<>();
            animals.add(dog);
            animals.add(cat);
            animals.add(bird);

            // Hayvanların ses çıkarması
            for (Animal animal : animals) {
                animal.makeSound(); // Her hayvan türüne özgü ses çıkarır
                animal.eat();       // Her hayvan yemek yer
}


 */
    }
}
