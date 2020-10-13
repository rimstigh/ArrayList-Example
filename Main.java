import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> restaurants = new ArrayList<String>();
    System.out.println(restaurants.size());

    restaurants.add("Drunken Tacos");
    restaurants.add(0, "Drunken Bento");
    System.out.println(restaurants.size());
    System.out.println(restaurants.get(0));
    System.out.println(restaurants.get(1));

    restaurants.set(0, "Poke Hut");

    //restaurants.clear();
    //system.out.println(restaurants.get(0));

    for (int i = 0; i < restaurants.size(); i++) {
      System.out.println(restaurants.get(i));
    }

    for (String i : restaurants) {
      System.out.println(i);
    }

    System.out.println(restaurants);

    ArrayList<Double> rainfall = new ArrayList<Double>();
    rainfall.add(1.17);
    rainfall.add(1.19);
    rainfall.add(0.0);

    for (double i : rainfall) {
      System.out.println(i);
    }
  }
}