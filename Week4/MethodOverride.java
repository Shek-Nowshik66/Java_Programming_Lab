class Student {
  int a = 10;
  public void display() {
    System.out.println(a);
  }
}

class MethodOverride extends Student {
  @Override
  public void display() {
    System.out.println(a);
  }
  public static void main(String[] args) {
    MethodOverride obj = new MethodOverride();
    obj.display();
  }
}