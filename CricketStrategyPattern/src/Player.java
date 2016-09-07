/**
 * Created by user-2 on 7/9/16.
 */
public class Player {

    private PlayingStrategy playingStrategy;
    private String name;
    private double netRunRate;
    private int totalRuns;

    public Player(PlayingStrategy playingStrategy, String name, double netRunRate, int totalRuns){
        this.playingStrategy = playingStrategy;
        this.name = name;
        this.netRunRate = netRunRate;
        this.totalRuns = totalRuns;
    }

    public  void setPlayingStrategy(PlayingStrategy playingStrategy){
        this.playingStrategy = playingStrategy;
    }

    public String getName(){
        return this.name;
    }

    public double getNetRunRate(){
        return this.netRunRate;
    }

    public int getTotalRuns(){
        return this.totalRuns;
    }

    public void setTotalRuns(int newTotalRuns){
        this.totalRuns = newTotalRuns;
        changeNetRunRate();
    }

    private void changeNetRunRate() {
        this.netRunRate = this.totalRuns / 100;
    }

    public String play(){
        return playingStrategy.play();
    }

}
