public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public int shareCostInCents() {
        return costInCents;
    }

    public int changeCostInCents(int costInCents) {
        return this.costInCents = costInCents;
    }

    public String getDishName() {
        return nameOfDish;
    }

    public String changeDishName(String nameOfDish) {
        return this.nameOfDish = nameOfDish;
    }

    public boolean shareWouldRecommend() {
        return wouldRecommend;
    }

    public boolean ChangeWouldRecommend(boolean wouldRecommend) {
        return this.wouldRecommend = wouldRecommend;
    }

}
