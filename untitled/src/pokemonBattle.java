import java.util.*;

public class pokemonBattle{
    public static Scanner console = new Scanner(System.in);
    public static String chosenPokemon;
    public static Random rand = new Random();

    public static void main(String[] args) {
        battleStart();
        damage();
    }
    public static void battleStart(){
        System.out.println("Another trainer is issuing a challenge!");
        System.out.println("Zebstrika appeared.");
        System.out.println("Which Pokemon do you choose?");
        chosenPokemon = console.nextLine();
        System.out.println("You chose " + chosenPokemon);
        System.out.println("It's a Pokemon battle between " + chosenPokemon + " and Zebstrika");
    }
    public static void damage(){
        System.out.println("What's the level?");
        System.out.println("What's the attack?");
        System.out.println("What's the defense?");
        System.out.println("What's the base?");
        System.out.println("What's the STAB?");
        System.out.println("What's the HP?");
        System.out.println("What's the ");
        System.out.println();
        double mod = STAB * (0.05 (1.0 - 0.85) rand.nextDouble());
        int damage ((((2 * level + 10) / 250) + (attack + defense) * (base) + 2) * mod);
    }
}