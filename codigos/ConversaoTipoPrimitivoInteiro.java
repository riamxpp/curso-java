package codigos;

public class ConversaoTipoPrimitivoInteiro {
  public static void conversaoTipoPrimitivoInteiro(){
    double a = 1; // Aqui tem uma conversão implica 1 (int) vira 1.0
    System.out.println(a);
    
    float b = (float) 1.0; // conversão explicita (CAST)
    System.out.println(b);

    int c = 128; 
    byte d = (byte) c; // O que tem na váriavel c ñ cabe no tipo byte, então ele vai continuar e irá para o próximo valores, os negativos.
    System.out.println(d);

    double e = 1.99999999;
    int f = (int) e;
    System.out.println(f);
  }
}