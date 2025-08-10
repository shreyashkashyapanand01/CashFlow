import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class ScreenshotShorter {

    public static void main(String[] args) {
        // Change this to your folder path
        //String folderPath = "C:\Users\KIIT\OneDrive\Desktop\PROJECTS\Fullstack-Expense-Tracker\frontend\SCREENSHOTS";
        String folderPath = "C:/Users/KIIT/OneDrive/Desktop/PROJECTS/Fullstack-Expense-Tracker/frontend/SCREENSHOTS";


        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path!");
            return;
        }

        // Get list of screenshot files
        File[] screenshots = folder.listFiles((dir, name) ->
                name.toLowerCase().endsWith(".png") ||
                name.toLowerCase().endsWith(".jpg") ||
                name.toLowerCase().endsWith(".jpeg")
        );

        if (screenshots == null || screenshots.length == 0) {
            System.out.println("No screenshots found.");
            return;
        }

        // Sort by SSID (numeric part in filename)
        Arrays.sort(screenshots, Comparator.comparingInt(f -> extractSSID(f.getName())));

        // Print sorted file names
        System.out.println("Sorted Screenshot Names:");
        for (File file : screenshots) {
            System.out.println(file.getName());
        }
    }

    // Helper to extract SSID (numbers in filename)
    private static int extractSSID(String fileName) {
        String numberOnly = fileName.replaceAll("[^0-9]", "");
        try {
            return Integer.parseInt(numberOnly);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE; // Put files without numbers at the end
        }
    }
}
