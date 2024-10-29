//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        tekyonliste liste = new tekyonliste();

        liste.basekle(11);
        liste.sonaekle(22);
        liste.basekle(5);
        liste.sonaekle(33);
        liste.sonaekle(44);
        liste.sonaekle(55);


        liste.arayaekle(2,25);
        liste.arayaekle(4,49);
        liste.arayaekle(5,60);
        liste.arayaekle(9,70);
        liste.sondansil();
        liste.sondansil();
        liste.bastansil();
        liste.aradansil(4);

        liste.yazdir();

    }
}