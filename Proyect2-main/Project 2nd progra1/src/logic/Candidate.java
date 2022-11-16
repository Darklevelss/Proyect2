package logic;

public class Candidate {
    private String name;
    private int totalVotes;
    private Gender gender;

    public Candidate(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.totalVotes=0;
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

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name;
    }
}
