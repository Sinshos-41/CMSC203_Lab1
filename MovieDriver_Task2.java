package SSawai_lab1;

import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anotherMovie;
        do{
            //Movie object
            Movie movie = new Movie();
            //Read movie title
            System.out.print("Enter the title of the movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title);
            //Read movie rating
            System.out.print("Enter the movie's rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);
            //Read number of tickets sold
            System.out.print("Enter the number of tickets sold: ");
            int ticketsSold = scanner.nextInt();
            movie.setSoldTickets(ticketsSold);
            //Print movie details using toString()
            System.out.println(movie.toString());
            scanner.nextLine();
            // Ask user if they want to continue
            System.out.print("Do you want to enter another movie? (y/n): ");
            anotherMovie = scanner.nextLine();
        }while (anotherMovie.equalsIgnoreCase("y"));
        
        scanner.close();
    }
}