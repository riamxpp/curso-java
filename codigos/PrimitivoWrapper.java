package codigos;

public class PrimitivoWrapper {
  public static void primitivoWrapper(){
    // Wrappers
    // Byte, Short, Integer, Long
    Byte b = 100;
    Short s = 1000;
    Integer i = 10000; // Integer i = Interger.parseInt("10000"); // transforma em inteiro.
    Long l = 100000L;
    String texto = "texto";
    texto.toUpperCase();

    System.out.println(b.byteValue());
    System.out.println(s.toString());
    System.out.println(i.equals(10000));
    System.out.println(l / 3);

    Boolean bo = Boolean.parseBoolean("true");
    System.out.println(bo);
    System.out.println(bo.toString().toUpperCase());

    Character c = '#';
    System.out.println(c);

    //Wrapper, objetos dos tipos primitivos (int, double)
    int a = 123; // primitivo!
    System.out.println(a);
  }
}
