package rockPaperScissors;

public class Human implements IPlayer {
    private IIOStream iostream;

    public Human(IIOStream iostream) {
        this.iostream = iostream;
    }

    @Override
    public IMove move() {
        return new MoveFromString(
                this.iostream.value("Your move (Rock = r, Paper = p or Scissors = s): ")
        );
    }

    @Override
    public String name() {
        return "You";
    }
}
