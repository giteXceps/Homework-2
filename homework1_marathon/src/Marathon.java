public class Marathon {
    private String[] names = new String[16]; // private variables
    private int[] scores = new int[16];

    public Marathon(String[] names, int[] score) { // constructer block
        this.names = names;
        this.scores = score;
    }

    // getters and setters
    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] score) {
        this.scores = score;
    }
}
