class Main {
  public static void main(String[] args) {
    Onibus o = new Onibus();
    Passageiro p1 = new Passageiro("A", o, 0);
    Passageiro p2 = new Passageiro("B", o, 0);
    Passageiro p3 = new Passageiro("C", o, 1);
    Passageiro p4 = new Passageiro("D", o, 2);

    p1.start();
    p2.start();
    p3.start();
    p4.start();
  }
}