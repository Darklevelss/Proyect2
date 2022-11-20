package logic;



public class Town {
    private String name;
    private int totalVotes;

    public Town(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalOfVotes) {
        this.totalVotes = totalOfVotes;
    }
}
