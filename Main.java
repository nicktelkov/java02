public class Main {
    public static void main(String[] args) {
        for (Creature Creature : Creature.values()) {
            System.out.println(Creature.getKind() +  " Может бежать " + Creature.getRun() + " Может прыгнуть " + Creature.getJump());
        }
    }
}
