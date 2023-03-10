import java.util.Locale;
import java.util.Scanner;
import entities.Champion;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Champion champion1, champion2;

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Vida inicial: ");
        int initialLife = sc.nextInt();

        System.out.print("Ataque: ");
        int attack = sc.nextInt();

        System.out.print("Armadura: ");
        int armor = sc.nextInt();

        System.out.println();

        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        sc.nextLine();
        String name2 = sc.nextLine();

        System.out.print("Vida inicial: ");
        int initialLife2 = sc.nextInt();

        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();

        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();

        System.out.println();

        System.out.print("Quantos turnos você deseja executar? ");
        int N = sc.nextInt();

        champion1 = new Champion(name, initialLife, attack, armor);
        champion2 = new Champion(name2, initialLife2, attack2, armor2);

        for (int i = 0; i < N; i++) {
            System.out.printf("Resultado do turno %d%n", i);

            champion1.takeDamage(champion2);
            System.out.println(champion1.status());
            champion2.takeDamage(champion1);
            System.out.println(champion2.status());

            if (i+1 == N) {
                System.out.println("FIM DO CAOMBATE!");
            }

            if (champion1.getLife() == 0 || champion2.getLife() == 0) {
                System.out.println("FIM DO COMBATE!");
                i = N;
            }

            System.out.println();
        }

        sc.close();
    }


}

