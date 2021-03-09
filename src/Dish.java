class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary() {
        System.out.printf("Your total is %d cents. For the dish %s, would you like to recommend this to others? %b", costInCents, nameOfDish, wouldRecommend);
    }
}
