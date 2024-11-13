package it.itismeucci.ordinamento;

// A Java program to demonstrate Comparator interface
import java.util.*;

// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie> {
    private Double rating;
    private String name;
    private int year;



    // Constructor
    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public Double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie other) {
        return this.year - other.year;
    }
}

// Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return m1.getRating().compareTo(m2.getRating());
 
    }
}

// Class to compare Movies by name
class NameCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }

}

// Driver class
class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(
                new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(
                new Movie("Return of the Jedi", 8.4, 1983));

        // Sort by rating : (1) Create an object of
        // ratingCompare
        // (2) Call Collections.sort
        // (3) Print Sorted list
        System.out.println("Sorted by rating");
        
        Collections.sort(list, new RatingCompare());
        for (Movie movie : list)
            System.out.println(movie.getRating() + " "
                    + movie.getName() + " "
                    + movie.getYear());

        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie : list)
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " "
                    + movie.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie movie : list)
            System.out.println(movie.getYear() + " "
                    + movie.getRating() + " "
                    + movie.getName() + " ");



        Collections.sort(list, (m1, m2) -> m1.getRating().compareTo(m2.getRating()));
        System.out.println("Sorted by rating with lambda");
        for (Movie movie : list)
            System.out.println(movie.getYear() + " "
                    + movie.getRating() + " "
                    + movie.getName() + " ");

        
    }
}
