package logic;


import java.util.Random;

public class Town {
    private String name;
    private int votesTown;


    public Town(String name) {
        this.name = name;
        votesTown=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotesTown() {
        return votesTown;
    }

    public void setVotesTown(int votesTown) {
        this.votesTown = votesTown;
    }
}
