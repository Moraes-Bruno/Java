import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //GUI = Graphical User Interface(Interface Grafica de Usuario)

        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        JOptionPane.showMessageDialog(null,"Ola "+nome);

        int idade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        JOptionPane.showMessageDialog(null,"Voce tem "+idade+(" anos de idade"));

        double altura =  Double.parseDouble(JOptionPane.showInputDialog("Digite a sua Altura"));
        JOptionPane.showMessageDialog(null,"A sua altura é "+altura);


    }
}