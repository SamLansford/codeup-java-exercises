//package prep.foods;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public abstract class Dinner extends Food{
//
//    private boolean isSeasoned;
//
//    public Dinner(String name, String description, int calories, boolean isSeasoned) throws IllegalAccessException {
//        super(name, description, calories);
//        this.isSeasoned = isSeasoned;
//    }
//
//    public boolean isSeasoned() {
//        return isSeasoned;
//    }
//
//    public void setSeasoned(boolean seasoned) {
//        isSeasoned = seasoned;
//    }
//
//
//    public ArrayList<String> getFullDescription() {
//        String name = super.getName();
//        String description = super.getDescription();
//        String calories = super.getCalories() + "";
//        String isSeasoned = isSeasoned()
//                ? "Seasoned"
//                : "Not Seasoned";
//
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add(name);
//        list.add(description);
//        list.add(calories);
//        list.add(isSeasoned);
//
//        return ;
//    }
//}
