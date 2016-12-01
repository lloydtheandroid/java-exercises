package movies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMovieListApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        ArrayList<Movie> movies = new ArrayList<>();

        System.out.println("Welcome to the Movie List Application!");
        System.out.println();
        System.out.println("There are 100 movies in this list.");

        for (int i = 1; i <= 100; i++) {

            Movie m = MovieIO.getMovie(i);
            movies.add(m);
        }
        Collections.sort(movies);
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("What category are you interested in ? ");
            System.out.println("Drama | Horror| Musical | Sci-fi");

            String category = sc.next();
            System.out.println(category);

            for (Movie movie : movies) {

                if (category.equalsIgnoreCase(movie.getCategory())) {
                    System.out.println(movie.getTitle());
                }
            }

            System.out.println("Continue? (y/n): ");
            choice = sc.next();
        }
        System.out.println("Thanks!");

    }
}