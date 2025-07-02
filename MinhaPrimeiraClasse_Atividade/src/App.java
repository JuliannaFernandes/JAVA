public class App {
    public static void main(String[] args) throws Exception {
       
        Copo copo1 = new Copo();

        copo1.cor= "Azul";
        copo1.ml = 250.0f;
        System.out.format("Copo 1: Cor = %s, capacidade de = %.2f ml%n", copo1.cor, copo1.ml);
        
    }
}