public class Passagem{

  int limite = 2;
  
  public synchronized void comprar(Passageiro p) throws InterruptedException{
    if(limite > 0){
      System.out.println(p.getNome()+ " A compra está sendo efetivada");
      Thread.sleep(1000);
      limite--;
    }
    else{
      System.out.println("As passagens se encerraram!" + p.getNome() + " Você não completou a compra da passagem!");
    }
  }
}