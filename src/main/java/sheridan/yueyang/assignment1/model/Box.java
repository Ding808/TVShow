package sheridan.yueyang.assignment1.model;

public class Box {
    private int id;
    private String prize;

    public Box(int id, String prize) {
        this.id = id;
        this.prize = prize;
    }

    public int getId() {
        return id;
    }

    public String getPrize() {
        return prize;
    }

}
