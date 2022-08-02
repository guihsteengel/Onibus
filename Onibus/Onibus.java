public class Onibus{

  private static boolean poltronas[] = new boolean[2];
  
  public synchronized void comprar(Passageiro p, int poltrona) throws InterruptedException{
    if(poltronas[poltrona] == true){
      System.out.println(p.getNome()+ " Esta poltrona já foi comprada!");
      Thread.sleep(1000);
      poltronas[poltrona] = false;
    }
    else{
      System.out.println(p.getNome() + " Poltrona livre!");
    }
  }
}