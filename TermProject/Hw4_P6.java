import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Hw4_P6 {
	public static ArrayList readGraphInput() throws FileNotFoundException {
		/**
		 * This method is used to read the graph_input.txt file and store data.
		 * @param
		 */

			File fileName = new File("graph_input.txt");
			Scanner fileInput = new Scanner(fileName);
			fileInput.nextLine(); //Skip the first line
			ArrayList distances = new ArrayList();
			int index = 0;
			while (fileInput.hasNext()) {
				String[] row = fileInput.nextLine().split("\\s+");
				ArrayList row_int = new ArrayList();
				for (int i = 1; i < row.length; i++) {
					row_int.add(Integer.parseInt(row[i]));
				}
				distances.add(row_int);
			}

			fileInput.close();
			return distances;

	}

	public static HashMap readDirectDistance() throws FileNotFoundException {
		/**
		 * This method is used to read the direct_distance.txt file and store data.
		 * @param
		 */

			File fileName = new File("direct_distance.txt");
			Scanner fileInput = new Scanner(fileName);
			HashMap direct_distance = new HashMap();
			while (fileInput.hasNext()) {
				String[] row = fileInput.nextLine().split("\\s+");
				direct_distance.put(row[0], row[1]);
			}
			fileInput.close();
			return direct_distance;

	}

	public static HashMap positions() throws FileNotFoundException {
		/**
		 * This method is used to read the direct_distance.txt file and store data.
		 * @param
		 */

		File fileName = new File("direct_distance.txt");
		Scanner fileInput = new Scanner(fileName);
		HashMap positions = new HashMap();
		int counter = 0;
		while (fileInput.hasNext()) {
			String[] row = fileInput.nextLine().split("\\s+");
			positions.put(row[0], counter);
			counter++;
		}

		fileInput.close();
		return positions;
	}


	public static void main(String[] args) throws FileNotFoundException {

		System.out.println(positions());
	}
}

