class A {
  int a = 10;
  public void showA() { System.out.println(a);}
}

class B extends A {
  int b = 20;
  public void showB() { System.out.println(b);}
}

class C extends B {
  int c = 30;
  public void showC() { System.out.println(c);}
}

class D extends B {
  int d = 40;
  public void showD() { System.out.println(d);}
}

abstract class E {
  int e = 50;
  abstract void showE();
}

interface F {
  void showE();
}

class G extends E implements F {
  @Override
  public void showE() {
    System.out.println(e);
  }
}

public class InheritanceExample {
  public static void main(String[] args) {
    C c = new C();
    c.showA();
    c.showB();
    c.showC();
    D d = new D();
    d.showA();
    d.showB();
    d.showD();
    G g = new G();
    g.showE();
  }
}