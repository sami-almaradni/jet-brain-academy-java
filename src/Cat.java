class Cat {

    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return counter;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("1", 3);
        Cat cat2 = new Cat("2", 3);
        Cat cat3 = new Cat("3", 3);
        Cat cat4 = new Cat("4", 3);
        Cat cat5 = new Cat("5", 3);
        Cat cat6 = new Cat("6", 3);
        Cat cat7 = new Cat("7", 3);

        System.out.println(Cat.getNumberOfCats());
    }
}
