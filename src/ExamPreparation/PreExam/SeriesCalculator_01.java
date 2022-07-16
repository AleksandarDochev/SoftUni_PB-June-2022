package ExamPreparation.PreExam;

import java.util.Scanner;

public class SeriesCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String showName = scanner.nextLine();
        int seasonsCount = Integer.parseInt(scanner.nextLine());
        int episodesCount = Integer.parseInt(scanner.nextLine());
        double timeEpisode = Double.parseDouble(scanner.nextLine());

        double commercials = timeEpisode * 0.20;
        double timeEpisodeCommercial = timeEpisode+commercials;
        double specialEpisodeTime = seasonsCount * 10;

        double totalTime = (timeEpisodeCommercial*episodesCount)*seasonsCount+specialEpisodeTime;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",showName,Math.floor(totalTime));

    }
}
