package Method;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a time value in the format hh:mm:ss or 'stop' to exit: ");
            String timeStr = scanner.nextLine();

            if ("stop".equalsIgnoreCase(timeStr)) {
                break;
            }

            String[] parts = timeStr.split(":");
            if (parts.length != 3) {
                System.out.println("Invalid input.");
                continue;
            }

            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);

            long totalSeconds = hmsToSecs(hours, minutes, seconds);
            System.out.println("The equivalent time in seconds is: " + totalSeconds);
        }
    }

    public static long hmsToSecs(int hours, int minutes, int seconds) {
        return hours * 3600L + minutes * 60L + seconds; 


	}

}
