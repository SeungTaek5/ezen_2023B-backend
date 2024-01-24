package 팀과제.팀과제4;

public class Step1 {
    public static void main(String[] args) {

        Machine machine = new Machine();

        Americano americano = new Americano();
        VanillaLatte vanillaLatte = new VanillaLatte();

        machine.run(americano);
        machine.run(vanillaLatte);
    }
}


