
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * 
 * @author fraybekele perform queries of Trash Site data from the Environmental
 *         Protection Agency (EPA). The data we will use is located at
 *         https://www.epa.gov/frs/epa-state-combined-csv-download-files.
 */
public class Main {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Trash Site Program running ");
		System.out.println("Enter your latitdue : ");
		float latitdue = reader.nextFloat();
		System.out.println("Enter your longitude : ");
		float longitdue = reader.nextFloat();

		reader.close();

		ConcurrentLinkedQueue fileQueue = new ConcurrentLinkedQueue();

		File folder = new File("Epa_Facility_Data");
		File[] allFiles = folder.listFiles();
		for (File thisFile : allFiles) {
			if (thisFile.getName().endsWith(".csv")) {
				fileQueue.add(thisFile);
			}
		}
		if (fileQueue.isEmpty()) {
			System.out.println(" No csv files in that directory. Please try a different path.");
			System.exit(1);
		}
	}

	/**
	 * Method to calculate the distance using latitude and longitude
	 * 
	 * @param lat1
	 * @param long1
	 * @param lat2
	 * @param long2
	 * @return
	 */
	public static double distance(double lat1, double long1, double lat2, double long2) {
		lat1 = Math.toRadians(lat1);
		long1 = Math.toRadians(long1);
		lat2 = Math.toRadians(lat2);
		long2 = Math.toRadians(long2);
		return 6371 * 2 * Math.asin(Math.sqrt(Math.pow(Math.sin((lat2 - lat1) / 2), 2)
				+ Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin((long2 - long1) / 2), 2)));

	}

}