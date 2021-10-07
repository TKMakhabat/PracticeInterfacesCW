package equipment;

public class Player  implements Equipment{

    private String format;

    public Player(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void play() {
        System.out.println("Starts playing");
    }
}
