package bnb;

public class HotelList{

    private String name;
    private int rating;
    private int weekNormal;
    private int weekEndnormal;
    private int weekRewards;
    private int weekendRewards;
    
    public HotelList(String name, int rating, int weekNormal, int weekEndnormal, int weekRewards, int weekendRewards) {
        this.name = name;
        this.rating = rating;
        this.weekNormal = weekNormal;
        this.weekEndnormal = weekEndnormal;
        this.weekRewards = weekRewards;
        this.weekendRewards = weekendRewards;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getWeekNormal() {
        return weekNormal;
    }
    public void setWeekNormal(int weekNormal) {
        this.weekNormal = weekNormal;
    }
    public int getWeekEndnormal() {
        return weekEndnormal;
    }
    public void setWeekEndnormal(int weekEndnormal) {
        this.weekEndnormal = weekEndnormal;
    }
    public int getWeekRewards() {
        return weekRewards;
    }
    public void setWeekRewards(int weekRewards) {
        this.weekRewards = weekRewards;
    }
    public int getWeekendRewards() {
        return weekendRewards;
    }
    public void setWeekendRewards(int weekendRewards) {
        this.weekendRewards = weekendRewards;
    }
 



    
}   