import java.util.Locale;

public class DishTools {

    public static void printSummary(Dish dish) {
        System.out.printf("Your total is %d cents. For the dish %s, would you like to recommend this to others? %b\n", dish.costInCents, shoutDishName(dish), dish.wouldRecommend);
    }

    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static String shoutDishName(Dish dish) {
//        String d1 = dish.nameOfDish.toUpperCase();
//        dish.nameOfDish = dish.nameOfDish.toUpperCase();
        return dish.nameOfDish.toUpperCase();
//        System.out.println(d1);
    }

    public static void printShoutDishName(String dishName) {
        System.out.println(dishName);
    }

    public static void analyzeDishCost(Dish dish) {
        if (dish.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("The price is too low");
        } else if (dish.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("The price is too high");
        }
    }

    public static void flipRecommendation(Dish dish) {
        System.out.println(!dish.wouldRecommend);
    }
}
