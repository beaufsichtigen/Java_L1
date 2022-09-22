package l5_nested_classes.anonimous;


public class Anonymous_class {
    public static void main(String[] args) {
        Greetings OldLady = new Greetings() {
            @Override
            public void GreetNeighbor() {
                System.out.println("Gooood Morning");
            }
        };
        Moveble OldLadyMove = new Moveble() {
            @Override
            public void move() {
                System.out.println("Waltz");
            }
        };

        OldLady.GreetNeighbor();
        OldLadyMove.move();

    }
}
