package CSC227;

import java.io.*;

public class Project227 {
	
	public static void main(String args[]) {	
		//make object to use the methods without making them static.
		Project227 Object = new Project227();
		//the path of our .csv file
		String path = "D:\\KSU Stuff\\Level 6\\CSC227\\Project\\data for students 01.csv";

		//save the .CSV file content into a 2d array using our method, giving it the path.
		String[][] f = Object.makeArray(path);
				
		//Printing the informations:
		
		System.out.print("1. Total number of process: ");
		//the answer is the same as the array length
		System.out.print(f.length);
		
		System.out.print("\n\n2. Maximum burst time: ");
		//use getMinMax method, giving it the array, 1 to get the max, and the number of the column we need to get the results from.
		System.out.print(Object.getMinMax(f, 1, 1));
		
		System.out.print("\n\n3. Minimum burst time: ");
		//use getMinMax method, giving it the array, 0 to get the min, and the number of the column we need to get the results from.
		System.out.print(Object.getMinMax(f, 0, 1));
		
		System.out.print("\n\n4. How many process have more than average burst time: ");
		//use NumOfMoreOrLess method, giving it the array, 1 to get the number of more than average,
		//and the number of the column we need to get the results from
		System.out.print(Object.NumOfMoreOrLess(f, 1, 1));
	
		System.out.print("\n\n5. How many processes have less than average burst time: ");
		//use NumOfMoreOrLess method, giving it the array, 0 to get number of less than average,
		//and the number of the column we need to get the results from
		System.out.print(Object.NumOfMoreOrLess(f, 0, 1));
	}
	
	
	//moreOrLess Variable: 1 to get number of more than average, 0 to get less than average of the given column,
	//column Variable: apply on the column with the given number (Ex. 1 for CPU Burst, 2 for Arrival Time).
	public int NumOfMoreOrLess(String[][] f, int moreOrLess, int column) {
		//variables to count.
		int more = 0;
		int less = 0;
		
		//get the average to use it to comparing.
		double avg = getAvg(f, column);
		
		//for each row in the column.
		for(int i = 0; i<f.length;i++) {
			
			//if it is more than the average then add 1 to "more" variable.
			if(Integer.parseInt(f[i][column]) > avg) 
				more++;
			//else if it is less (equal is not included) then add 1 to the "less" variable.
			else if(Integer.parseInt(f[i][column]) < avg)
				less++;
			
		}
		
		//return number of less than average when "column == 0"
		if(moreOrLess == 0) 
			return less;
		//return number of more than average when "column == 1"
		else if(moreOrLess == 1)
			return more;
		//if the input is wrong return -1
		else
			return -1;
		
	}
	
	
	//calculate the average of the given column, (ex. 1 for CPU Burst, 2 for Arrival Time)
	public double getAvg(String[][] f , int column) {
		int avg = 0;
		
		for(int i = 0; i<50;i++) {
			//count the total of all columns
			avg += Integer.parseInt(f[i][column]);
		}
		
		//return the average.
		return (double)avg/f.length;
	}
	
	
	//0 to get min, and 1 to get max of a given column (ex. 1 for CPU Burst, 2 for Arrival Time)
	public int getMinMax(String[][] f, int minOrMax , int column) {
		int min = -1;
		int max = -1;
		
		//for each row in the column
		for(int i = 0; i<f.length;i++) {
			
			//if max is -1 (null) OR max is less than the current row then "max = current Row"
			if((max == -1) || (Integer.parseInt(f[i][column]) > max)) {
				max = Integer.parseInt(f[i][column]);
			}
			//if min is -1 (null) OR min is more than the current row then "min = current Row"
			if((min == -1) || (Integer.parseInt(f[i][column]) < min)) {
				min = Integer.parseInt(f[i][column]);
			}
		}
		
		//return Min when "column == 0".
		if(minOrMax == 0) 
			return min;
		//return Max when "column == 1".
		else if(minOrMax == 1)
			return max;
		//if the input is wrong return -1.
		else 
			return -1;
		
	}
	
	
	//function to read the .CSV file and save it into 2D Array.
	public String[][] makeArray(String path){
		//the path of our file.
		String file = path;
		BufferedReader reader = null;
		String line = "";
		String[][] f = new String[50][3];
		
		//uncomment the three S.O.P to print the whole content of the array.
		//System.out.print("PID | CPU Burst | Arrival Time\n");
		try {
			reader = new BufferedReader(new FileReader(file));
			int counter = 0;
			while((line = reader.readLine()) != null) {
				
				String[] row = line.split(",");
				int i = 0;
				for(String index : row) {
					//System.out.printf("%-10s", index);
					f[counter][i++] = index;
				}
				counter++;
				//System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return f;
	}
	
}
