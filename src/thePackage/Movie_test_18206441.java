/**
 * Movie_test_18206441 class takes two file called movieLibrary.txt and playlists.txt and shows on screen several menus and submenus.
 * It also displays the elements of movieLibrary according to the project requirements
 * In this class we can do several action like adding new element to text files and save them
 * 
 * The movieLibrary.txt has all the movie informations.
 * The playlists.txt has some playlists
 * 
 * @author Name: Nabil Ahmed
 * Student ID: 18206441
 * Campus: Parramata
 * Tutor Name: Paul Davies
 * Class day: Friday
 * Class Time: 3:00pm-4:00pm & 11:00am-1:00pm
 */

package thePackage;

import java.util.Scanner;
import java.io.*;
import java.util.Formatter;
import java.text.DecimalFormat;

public class Movie_test_18206441 {
  /*
   * Its the main class get movieLibrary.txt and playlists.txt as an input and
   * gives the result accordingly
   * It also takes user input and gives the output accordingly
   */
  
  /**
   * Initialized arrays and its length
   * declaring arrays for movie and playlist class
   */
  private static int movie_D = 0;
  private static Movie_18206441[] movieArray = new Movie_18206441[100];
  private static Playlist_18206441[] playlistArray = new Playlist_18206441[100];

  
  public static void main(String[] args) throws IOException {

    Scanner keyboard = new Scanner(System.in);
    
    // It checks the existing file
    File movieFile = new File("movieLibrary.txt");
    File playlistFile = new File("playlists.txt");

    // Checks the existence of meovie file
    if (movieFile.exists()) {
      Scanner inputFile = new Scanner(movieFile);
      String movieDetails;
      String[] tokens;

      
      // reads all the data accordingly
      while (inputFile.hasNext()) {
        movieDetails = inputFile.nextLine();
        tokens = movieDetails.split(",");

        //Value of tokens are passing to movie array variables
        if (movie_D < movieArray.length) {
          movieArray[movie_D] = new Movie_18206441();
          movieArray[movie_D].setMovie_Id(Integer.parseInt(tokens[0]));
          movieArray[movie_D].setMovie_Title(tokens[1]);
          movieArray[movie_D].setDirector(tokens[2]);
          movieArray[movie_D].setWriter(tokens[3]);
          movieArray[movie_D].setMovie_Duration(Double.parseDouble(tokens[4]));
          movieArray[movie_D].setGenre(tokens[5]);
          movieArray[movie_D].setMovie_Class(tokens[6]);
          movieArray[movie_D].setMovie_Release(tokens[7]);
          
          //checks the condition
          if (tokens.length == 9) {
            movieArray[movie_D].setrating(Double.parseDouble(tokens[8]));
            // System.out.println(movieArray[movie_D].getrating());
          }
          // System.out.println(movieArray[movie_D].getMovie_Title());
          movie_D++;

        }
      }
      
      //closes the movie file
      inputFile.close();

    } else {
      System.out.println("The file is not available");
    }
    
    //It checks the existence of playlist file
    if (playlistFile.exists()) {
      Scanner inputFile = new Scanner(playlistFile);
      String playlistDetails;
      String[] tokens1;

      int playlist_D = 0;
      
      //reads all the data accordingliy
      while (inputFile.hasNext()) {
        playlistDetails = inputFile.nextLine();
        tokens1 = playlistDetails.split(",");
        int[] Movies;
        Movies = new int[Integer.parseInt(tokens1[2])];
        if(Integer.parseInt(tokens1[2]) > 0){
          for (int i = 0; i < Movies.length; i++) {
            Movies[i] = Integer.parseInt(tokens1[i+3]);
          }
        }
        //Value of tokens are passing to playlist array variables
        if (playlist_D < playlistArray.length) {
          playlistArray[playlist_D] = new Playlist_18206441();
          playlistArray[playlist_D].setplaylistId(Integer.parseInt(tokens1[0]));
          playlistArray[playlist_D].setname(tokens1[1]);
          playlistArray[playlist_D].setlength(Integer.parseInt(tokens1[2]));
          playlistArray[playlist_D].setMovies(Movies);
        }
        playlist_D++;
      }
      
      //Main menu option 
      String[] menuItems = { "Movies", "Playlists", "Save", "Exit" };
      
      //data types and variables
      final int minimumMenu = 1;
      final int maximumMenu = menuItems.length;
      int my_choice;
      
      //displays all the menu items
      do {
        Menu_18206441.displayMenuItem(menuItems);
        my_choice = Menu_18206441.getMenuChoice(minimumMenu, maximumMenu);
        System.out.println();
        System.out.println("The menu choice is " + " " + my_choice);

        //displays sub-menu for movie option
        if (my_choice == 1) {
          String[] menuItems1 = { "Display Movies", "Sort Movies", "Rate Movie", "Change Movie Genre",
              "Add Movie to Library", "Exit Sub-menu" };

          final int minMenu1 = 1;
          final int maxMenu1 = menuItems1.length;
          int my_choice1;

          Menu_18206441.displayMenuItem1(menuItems1);
          my_choice1 = Menu_18206441.getMenuChoice1(minMenu1, maxMenu1);
          System.out.println();
          System.out.println("The menu choice is" + " " + my_choice1);
          
          //displays sub-menu for display movie
          if (my_choice1 == 1) {
            System.out.println();
            System.out.println(
                "*******************************************************************************************************");
            System.out.format("%-50s%-10s%-15s%-20s%-10s\n", "Movie Title", "Duration", "Genre", "Classification",
                "Rating");
            System.out.println();

            for (int i = 0; i < movie_D; i++) {
              // Movie_18206441 movies= movieArray[i];
              // Movie_18206441.rateDisplay();
              // System.out.println();
              // System.out.println(movieArray[i].getMovie_Title());

              System.out.printf("%-50s%-10s%-15s%-20s%-10s\n", movieArray[i].getMovie_Title(),
                  movieArray[i].getMovie_Duration(), movieArray[i].getGenre(), movieArray[i].getMovie_Class(),
                  movieArray[i].getrating());

            }
          }

          //displays sub-menu for sort movies
          if (my_choice1 == 2) {
            String[] menuItems2 = { "by title", "by genre", "Exit Sub-menu" };

            final int minMenu2 = 1;
            final int maxMenu2 = menuItems2.length;
            int my_choice2;

            Menu_18206441.displayMenuItem1(menuItems2);
            my_choice2 = Menu_18206441.getMenuChoice1(minMenu2, maxMenu2);
            System.out.println("The menu choice is" + " " + my_choice2);
            
            //displays the sub-menu by title
            if (my_choice2 == 1) {

              System.out.format("%-50s%-10s%-15s%-20s%-10s\n", "Movie Title", "Duration", "Genre", "Classification",
                  "Rating");
              System.out.println();
              for (int i = 0; i < movie_D; i++) {
                // Movie_18206441 movies= movieArray[i];
                // Movie_18206441.rateDisplay();
                // System.out.println();
                // System.out.println(movieArray[i].getMovie_Title());
                sortTitle(movieArray);

                System.out.printf("%-50s%-10s%-15s%-20s%-10s\n", movieArray[i].getMovie_Title(),
                    movieArray[i].getMovie_Duration(), movieArray[i].getGenre(), movieArray[i].getMovie_Class(),
                    movieArray[i].getrating());

              }
            }

            //displays the sub-menu for genre
            if (my_choice2 == 2) {

              System.out.format("%-50s%-10s%-15s%-20s%-10s\n", "Movie Title", "Duration", "Genre", "Classification",
                  "Rating");
              System.out.println();
              for (int i = 0; i < movie_D; i++) {
                // Movie_18206441 movies= movieArray[i];
                // Movie_18206441.rateDisplay();
                // System.out.println();
                // System.out.println(movieArray[i].getMovie_Title());
                sortGenre(movieArray);

                System.out.printf("%-50s%-10s%-15s%-20s%-10s\n", movieArray[i].getMovie_Title(),
                    movieArray[i].getMovie_Duration(), movieArray[i].getGenre(), movieArray[i].getMovie_Class(),
                    movieArray[i].getrating());
              }
            }
            
            //exits the sort movie sub-menu
            if (my_choice2 == 3) {
              String[] menuItems3 = { "Display Movies", "Sort Movies", "Rate Movie", "Change Movie Genre",
                  "Add Movie to Library", "Exit Sub-menu" };

              final int minMenu3 = 1;
              final int maxMenu3 = menuItems1.length;
              int my_choice3;

              Menu_18206441.displayMenuItem1(menuItems1);
              my_choice3 = Menu_18206441.getMenuChoice1(minMenu3, maxMenu3);
              System.out.println("The menu choice is" + " " + my_choice3);

            }

          }
          
          //user can rate movie by this option
          if (my_choice1 == 3) {
            String Movie_Title = null;
            int location;
            double rate;
            location = sortTitle(movieArray, Movie_Title);
            if (location == -1) {
              System.out.println("Incorrect Movie Title");
            } else {
              System.out.println("The movie rating is " + movieArray[location].getrating() + " in the array");
              Scanner kb = new Scanner(System.in);
              System.out.println();
              System.out.println("Enter your rating for the movie");
              rate = kb.nextDouble();
              System.out.println();
              System.out.println("You have successfully rated the movie.");
              if (rate >= 0 && rate <= 5 && rate % 0.5 == 0) {
                movieArray[location].setrating(rate);
              }

            }
          }
          
          //user can change the movie genre by this option
          if (my_choice1 == 4) {
            String Genre = null;
            int location2;
            String genre = "";
            location2 = sortTitle(movieArray, Genre);
            if (location2 == -1) {
              System.out.println("Incorrect Movie title");
            } else {
              System.out.println("The movie genre is " + movieArray[location2].getGenre() + " in the array");
              Scanner kb = new Scanner(System.in);
              System.out.println();
              System.out.println("Enter your genre for the movie");
              genre = kb.nextLine();
              System.out.println();
              if (genre.equals("Action") || genre.equals("Adventure") || genre.equals("Comedy") || genre.equals("Crime")
                  || genre.equals("Fantasy") || genre.equals("Family") || genre.equals("Romance")
                  || genre.equals("Horror") || genre.equals("Drama") || genre.equals("Sci-Fi")
                  || genre.equals("Thriller")) {
                movieArray[location2].setGenre(genre);
                System.out.println("You have successfully change the genre.");
              } else {
                System.out.println("Not a valid genre");
              }
            }
            
            //returns to the main menu
            if (my_choice1 == 6) {
              String[] menuItems4 = { "Movies", "Playlists", "Save", "Exit" };
              final int minimumMenu1 = 1;
              final int maximumMenu1 = menuItems.length;
              int my_choice4;

              Menu_18206441.displayMenuItem(menuItems);
              my_choice = Menu_18206441.getMenuChoice(minimumMenu, maximumMenu);
              System.out.println("The menu choice is " + " " + my_choice);
            }

          }
          if (my_choice1 == 5) {
            newMovie();
          }

          if (my_choice == 4) {
            System.out.println("Thank You Very Much");
          }
        }
        
        //displays playlist sub-menu
        if (my_choice == 2) {
          String[] menuItems3 = { "Display Playlists", "Create Playlist", "Add Movie to Playlist", "Exit Sub-menu" };

          final int minMenu = 1;
          final int maxMenu = menuItems3.length;
          int my_choice3;

          Menu_18206441.displayMenuItem1(menuItems3);
          my_choice3 = Menu_18206441.getMenuChoice(minMenu, maxMenu);
          System.out.println();
          System.out.println("The menu choice is" + " " + my_choice3);
          if (my_choice3 == 1) {
            System.out.println("" + "Playlist Name");
            System.out.println();
            System.out.println("Select the playlist");
            for (int i = 0; i < playlistArray.length; i++) {
              if (playlistArray[i] != null) {
                System.out.println(playlistArray[i].getplaylistId() + "." + "" + playlistArray[i].getname());
              }
            }
            System.out.println("Enter your playlist id");
            int playlistId = keyboard.nextInt();
            Playlist_18206441 selectedPl = playlistArray[playlistId - 1];
            int[] movies = selectedPl.getMovies();
            for (int i = 0; i < movies.length; i++) {
              int movieId = movies[i];
              boolean found = false;
              int foundAt = -1;
              int j = 0;
              while (!found && j  < movieArray.length) {
                if (movieArray[j].getMovie_Id() == (movieId)) {
                  found = true;
                  foundAt = j;
                }
                j++;
              }
              if(foundAt != -1){
                Movie_18206441 foundmovie = movieArray[foundAt];
                System.out.println(foundmovie.getMovie_Title());
                
              }
              else{
                System.out.println("The movie is not found sorry");
              }
            }
            
          }
          if(my_choice3 == 4){
           
          }
        }
        
        //saves the new movie
        if (my_choice == 3) {
          saveMovie();
        }
        //exit the program
        if (my_choice == 4) {
          System.out.println("Thank You Very Much");
        }

      } while (my_choice != maximumMenu);
    }
  }

  //method for sort the movie title
  public static void sortTitle(Movie_18206441[] movi_D) {
    //data types and variables
    int startAt;
    int j;
    int minIndex;
    Movie_18206441 temp;
    for (startAt = 0; startAt < movie_D - 1; startAt++) {

      minIndex = startAt;
      temp = movieArray[startAt];

      for (j = startAt + 1; j < movie_D; j++) {
        // if (movieArray1[j] - temp < 0){
        if (movieArray[j].getMovie_Title().compareTo(temp.getMovie_Title()) < 0) {
          temp = movieArray[j];
          minIndex = j;
        }
      }

      movieArray[minIndex] = movieArray[startAt];
      movieArray[startAt] = temp;

    }
  }

  //method for sort the title by genre
  public static void sortGenre(Movie_18206441[] movieArray) {
    int startAt;
    int j;
    int minIndex;
    Movie_18206441 temporary;
    for (startAt = 0; startAt < movie_D - 1; startAt++) {

      minIndex = startAt;
      temporary = movieArray[startAt];

      for (j = startAt + 1; j < movie_D; j++) {
        // if (movieArray1[j] - temp < 0){
        if (movieArray[j].getGenre().compareTo(temporary.getGenre()) < 0) {
          temporary = movieArray[j];
          minIndex = j;
        }
      }

      movieArray[minIndex] = movieArray[startAt];
      movieArray[startAt] = temporary;

    }
  }

  public static int sortTitle(Movie_18206441[] movieArray, String Movie_Title) {
    int i = 0;
    int foundAt = -1;
    boolean found = false;
    Movie_18206441 rate;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter the movie Title");
    String title = kb.nextLine();
    while (!found && i < movieArray.length) {
      if (movieArray[i].getMovie_Title().compareTo(title) == 0) {
        found = true;
        foundAt = i;
      }
      i++;
    }
    return foundAt;
  }

  //method for change the genre of the movie
  public static int changeGenre(Movie_18206441[] movieArray, String Genre) {
    int i = 0;
    int foundAt = -1;
    boolean found = false;
    Movie_18206441 genre;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter the movie title");
    kb.nextLine();
    String movieTitle = kb.nextLine();
    while (!found && i < movieArray.length) {
      if (movieArray[i].getMovie_Title().compareTo(movieTitle) == 0) {
        found = true;
        foundAt = i;
      }
      i++;
    }
    return foundAt;
  }

  //method for adding new movie to the library
  public static void newMovie() {
    int mvieID;
    String mTitle;
    String director;
    String writer;
    double duration;
    String gnr;
    String cls;
    String rDate;
    double rating;
    Scanner kb = new Scanner(System.in);
    System.out.println("ID:");
    mvieID = movie_D + 1;
    System.out.println(mvieID);

    System.out.println("Movie Title:");
    mTitle = kb.next();
    System.out.println(mTitle);

    System.out.println("Director:");
    director = kb.next();
    System.out.println(director);

    System.out.println("Writer:");
    writer = kb.next();
    System.out.println(writer);

    System.out.println("duration:");
    duration = kb.nextDouble();
    System.out.println(duration);

    System.out.println("Genre:");
    gnr = kb.next();
    System.out.println(gnr);

    System.out.println("Classification:");
    cls = kb.next();
    System.out.println(cls);

    System.out.println("Release Date:");
    rDate = kb.next();
    System.out.println(rDate);

    System.out.println("Rating:");
    rating = kb.nextDouble();
    System.out.println(rating);

    movieArray[movie_D] = new Movie_18206441(mvieID, mTitle, director, writer, duration, gnr, cls, rDate, rating);
    movie_D++;
  }

  //method for saving the new movie
  public static void saveMovie() throws FileNotFoundException {
    File movieFile = new File("movieLibrary.txt");
    PrintWriter printf = new PrintWriter("movieLibrary.txt");
    for (int i = 0; i < movie_D; i++) {
      printf.println(movieArray[i].getMovie_Id() + "," + movieArray[i].getMovie_Title() + ","
          + movieArray[i].getDirector() + "," + movieArray[i].getWriter() + "," + movieArray[i].getMovie_Duration()
          + "," + movieArray[i].getGenre() + "," + movieArray[i].getMovie_Class() + ","
          + movieArray[i].getMovie_Release() + "," + movieArray[i].getrating());
    }
    printf.close();
  }

}
