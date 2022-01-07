package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {


        boolean running = true;

        while (running) {
            System.out.println(returnMenuDisplay());

            int userResponse = promptUserForChoice();
            running = executeUserChoice(userResponse);
        }
    }


    private static boolean executeUserChoice(int choice) {
        boolean continueRunning = true;

        switch (choice) {
            case 0:
                continueRunning = false;
                break;
            case 1:
                for (Movie movie : MoviesArray.findAll()) {
                    String newLine = System.lineSeparator();
                    System.out.println(newLine);
                    System.out.printf("%s -- %s", movie.getName(), movie.getCategory());
                    System.out.println(newLine);
                }
                break;
            case 2:
                viewMoviesByCategory("animated");
                break;
            case 3:
                viewMoviesByCategory("drama");
                break;
            case 4:
                viewMoviesByCategory("horror");
                break;
            case 5:
                viewMoviesByCategory("scifi");
                break;
        }
        return continueRunning;
    }



    private static void viewMoviesByCategory(String category) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                // Display movie
                System.out.printf("%s -- %s \n", movie.getName(), movie.getCategory());
            }
        }
    }
    
    
//    public static Movie[] addMovie(Movie[] movies, Movie movie) {
//        Movie[] newMovie = Arrays.copyOf(movies, movies.length + 1);
//
//        newMovie[newMovie.length - 1] = movie;
//
//        return newMovie;
//    }



    private static String returnMenuDisplay() {

        return "What would you like to do? \n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add new movie\n";

    }

    private static int promptUserForChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");

        return input.getInt(0, 6);
    }
}
