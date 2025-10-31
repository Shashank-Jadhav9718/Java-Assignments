package ASS2.SETB;

import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalruns;
    double bat_avg;

    public CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totalruns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalruns = totalruns;
        this.bat_avg = 0.0;
    }

    public void display() {
        System.out.println("Player: " + name);
        System.out.println("\tRuns: " + totalruns);
        System.out.println("\tInnings: " + no_of_innings);
        System.out.println("\tNot Out: " + no_of_times_notout);
        System.out.println("\tAvg: " + String.format("%.2f", bat_avg));
        System.out.println("-------------------------");
    }
    

}

public class Q2 {

    public static double avg(int totalruns, int innings, int notout) {
        int dismissals = innings - notout;
        if (dismissals <= 0) {
            return 0.0;
        }
        return (double) totalruns / dismissals;
    }

    public static void sortPlayers(CricketPlayer[] players) {
        int n = players.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (players[j].bat_avg < players[j + 1].bat_avg) {
                    CricketPlayer temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many players do you want to enter? (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Number of Innings: ");
            int innings = scanner.nextInt();

            System.out.print("Number of times not out: ");
            int notout = scanner.nextInt();

            System.out.print("Total Runs: ");
            int runs = scanner.nextInt();
            scanner.nextLine();

            players[i] = new CricketPlayer(name, innings, notout, runs);
        }

        for (int i = 0; i < n; i++) {
            players[i].bat_avg = avg(players[i].totalruns, players[i].no_of_innings, players[i].no_of_times_notout);
        }

        sortPlayers(players);

        System.out.println("\n--- Player Details (Sorted by Batting Average) ---");
        for (int i = 0; i < n; i++) {
            players[i].display();
        }
        
        scanner.close();
    }
}