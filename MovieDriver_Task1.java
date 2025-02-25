package SSawai_lab1;

import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
}
