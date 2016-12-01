/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 * The application stores a list of 10 movies and displays them by category.
 The user can enter any of the following categories to display the films in the list that match the category: animated,
 drama, horror, scifi.
 After the list is displayed, the user is asked if he or she wants to continue. If no, the program ends.

 Each movie should be represented by an object of type Movie. The Movie class must provide two private fields: title
 and category. Both of these fields should be Strings. The class should also provide a constructor that accepts a title
 and category as parameters and uses the values passed to it to initialize its fields.
 When the user enters a category, the program should read through all of the movies in the ArrayList and display a line
 for any movie whose category matches the category entered by the user.
 Sufficient tests should be present.

 Standardize the category codes by displaying a menu of categories and having the user select the category by number
 rather than entering the name.

 Display the movies for the selected category in alphabetical order.
 Get the class MoviesIO from here. This class has a method named getMovie. Use this method to fill the array list with
 100 Movie objects.
 */
package movies;

class Movie implements Comparable {
    private String title;
    private String category;

    public Movie(String title, String category)
    {
        this.title = title;
        this.category = category;
    }

    String getTitle () {
        return title;
    }
    String getCategory () {
        return category;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", category=" + category + "]";
    }

    @Override
    public int compareTo(Object o) {
        Movie i = (Movie) o;
        return this.title.compareToIgnoreCase(i.title);
    }

}