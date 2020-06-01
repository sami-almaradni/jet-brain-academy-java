class A {

    public void method() {
        System.out.println("A");
    }
}

class B extends A {

    public void method() {
        System.out.println("B");
    }
}

class C extends B {

    @Override
    public void method() {
        System.out.println("C");
    }
}

class D extends C {

    public void method() {
        super.method();
    }

    public static void main(String[] args) {
        A a = new D();
        a.method();
    }
}
