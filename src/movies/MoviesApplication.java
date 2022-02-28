package movies;

import util.*;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input in = new Input();
        Movie[] movies = MoviesArray.findAll();
        boolean isRunning = true;

        while(isRunning){
            System.out.println(" ");
            System.out.println("What would you like to do?");
            System.out.println(" ");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - animated");
            System.out.println("3 - drama");
            System.out.println("4 - horror");
            System.out.println("5 - scifi");
            System.out.println(" ");
            int userInput = in.getInt(0,5);

            switch(userInput){
                case 0:
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;
                case 1:
                    for(Movie movie: movies){
                        System.out.print(movie.getName() + " - ");
                        System.out.print(movie.getCategory());
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for(Movie movie: movies){
                        if(movie.getCategory() == "animated"){
                            System.out.print(movie.getName() + " - ");
                            System.out.print(movie.getCategory());
                            System.out.println(" ");
                        }
                    }
                    break;
                case 3:
                    for(Movie movie: movies){
                        if(movie.getCategory() == "drama"){
                            System.out.print(movie.getName() + " - ");
                            System.out.print(movie.getCategory());
                            System.out.println(" ");
                        }
                    }
                    break;
                case 4:
                    for(Movie movie: movies){
                        if(movie.getCategory() == "horror"){
                            System.out.print(movie.getName() + " - ");
                            System.out.print(movie.getCategory());
                            System.out.println(" ");
                        }
                    }
                    break;
                case 5:
                    for(Movie movie: movies){
                        if(movie.getCategory() == "scifi"){
                            System.out.print(movie.getName() + " - ");
                            System.out.print(movie.getCategory());
                            System.out.println(" ");
                        }
                    }
                    break;
                default:
                    isRunning = false;
                    break;
            }
        }
    }
}
