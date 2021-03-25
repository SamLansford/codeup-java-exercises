//package prep;
//
//import prep.foods.Dinner;
//import prep.foods.Food;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) {
//
//        ArrayList<Food> foods = new ArrayList<>();
//        foods.add(new Dinner("Casserole", "Concoction of whatever I find", "1200", true));
//
//        for (Food food : foods) {
//
//
//            System.out.println(getPrintableString(food.getDescription()));
//        }
//
//    }
//    public static String getPrintableString(List<String> strings) {
//        String printableString = new StringBuilder();
//        printableString.append("--------------------");
//        for (String string : strings) {
//            printableString.append(string + "\n");
//        }
//        printableString.append("--------------------");
//    }
//}
