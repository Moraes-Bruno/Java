public class ComputadorTeste {
    public static void main(String[] args) {
        Computador pc1 = new Computador();
        pc1.setMarca("Hp");
        pc1.setModelo("Compaq presario cq-21");
        pc1.setCor("preto");
        pc1.setPreco(1500);
        pc1.setNumeroSerie(69420);

        pc1.imprimir();
        pc1.calcularValor();
        pc1.imprimir();

        Computador pc2 = new Computador();
        pc2.setMarca("IBM");
        pc2.setModelo("Thinkpad");
        pc2.setCor("preto");
        pc2.setPreco(5000);
        pc2.setNumeroSerie(696969);

        pc2.imprimir();
        pc2.calcularValor();
        pc2.imprimir();
        int valorretorno = pc2.alterarValor(6000);
            if(valorretorno==1){
                System.out.println("Valor alterado");
            }else{
                System.out.println("valor nao alterado");
            }

            pc2.imprimir();

    }
}