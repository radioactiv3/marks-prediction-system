//name of our project package
package mlgui;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import java classes which we need to implement the class
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.SimpleKMeans;
import weka.clusterers.EM;
import weka.core.Instances;
import weka.core.Instance;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.unsupervised.attribute.AddCluster;
import java.util.Vector;
import weka.core.Attribute;
import java.util.*;
import weka.core.DenseInstance;
import weka.core.FastVector;

//Class
public class SegregateModels {
	
	public static final int subjectCount[] = {12,23,30,37,45,52}; //for semester wise subject count
	public static final String subjectName []={"LANGUAGE (COMMUNICATION IN ENGLISH)","ENGINEERING CHEMISTRY I","ENGINEERING PHYSICS I","ENGINEERING MATHEMATICS  I","ENGINEERING MECHANICS I","BASIC ELECTRICAL ENGINEERING","ENGINEERING CHEMISTRY LAB","ENGINEERING PHYSICS LAB","ELECTRICAL LAB","ENGINEERING GRAPHICS I","WORKSHOP PRACTICE I","GENERAL PROFICIENCY","ENGINEERING MATHEMATICS  II","ENGINEERING PHYSICS II","ENGINEERING CHEMISTRY II","DISASTER MANAGEMENT","BASIC ELECTRONICS","ENGINEERING MECHANICS II","INTRODUCTION TO PROGRAMMING","BASIC ELECTRONICS LAB","COMPUTER PROGRAMMING LAB","ENGINEERING GRAPHICS II","WORKSHOP PRACTICE II","MATHEMATICS - III","ENGINEERING ECONOMICS AND COSTING","DIGITAL CIRCUITS AND LOGIC DESIGN","DISCRETE MATHEMATICAL STRUCTURES","DATA STRUCTURES AND PROGRAMMING METHODOLOGY","DIGITAL CIRCUITS AND LOGIC DESIGN LAB","DATA STRUCTURES LAB","Mathematics - IV","Design & Analysis of Algorithm","Computer Organization","Formal Language & Automata Theory","Object Oriented Programming","Algorithm Laboratory","Object Oriented Programming Laboratory","MICROPROCESSOR & APPLICATIONS","OPERATING SYSTEM","DATA COMMUNICATION	SOFTWARE ENGINEERING","GRAPH THEORY AND COMBINATORIES","MICROPROCESSOR LABORATORY","OPERATING SYSTEM LABORATORY","SOFTWARE ENGINEERING LABORATORY","DATABASE MANAGEMENT SYSTEM","COMPILER DESIGN","COMPUTER NETWORKS","ARTIFICIAL INTELLIGENCE","DATABASE MANAGEMENT SYSTEM LAB","COMPILER DESIGN LAB","COMPUTER NETWORKS LAB","CRYPTOGRAPHY AND NETWORK SECURITY","STATE","CATEGORY","SSC","HSC"}; //semester wise subject details
        public Instance user = null;
        public String OverallGradeFina[] ;
        public String[] Information  ;
        public int CurrentSemester;
        
        private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
     
    //CSV file header
    private static final String Sem1 = "LANGUAGE (COMMUNICATION IN ENGLISH),ENGINEERING CHEMISTRY I,ENGINEERING PHYSICS I,ENGINEERING MATHEMATICS  I,ENGINEERING MECHANICS I,BASIC ELECTRICAL ENGINEERING,ENGINEERING CHEMISTRY LAB,ENGINEERING PHYSICS LAB,ELECTRICAL LAB,ENGINEERING GRAPHICS I,WORKSHOP PRACTICE I,GENERAL PROFICIENCY";
    private static final String Sem2 = "LANGUAGE (COMMUNICATION IN ENGLISH),ENGINEERING CHEMISTRY I,ENGINEERING PHYSICS I,ENGINEERING MATHEMATICS  I,ENGINEERING MECHANICS I,BASIC ELECTRICAL ENGINEERING,ENGINEERING CHEMISTRY LAB,ENGINEERING PHYSICS LAB,ELECTRICAL LAB,ENGINEERING GRAPHICS I,WORKSHOP PRACTICE I,GENERAL PROFICIENCY,ENGINEERING MATHEMATICS  II,ENGINEERING PHYSICS II,ENGINEERING CHEMISTRY II,DISASTER MANAGEMENT,BASIC ELECTRONICS,ENGINEERING MECHANICS II,INTRODUCTION TO PROGRAMMING,BASIC ELECTRONICS LAB,COMPUTER PROGRAMMING LAB,ENGINEERING GRAPHICS II,WORKSHOP PRACTICE II,STATE,CATEGORY,SSC,HSC";
    private static final String Sem3 = "LANGUAGE (COMMUNICATION IN ENGLISH),ENGINEERING CHEMISTRY I,ENGINEERING PHYSICS I,ENGINEERING MATHEMATICS  I,ENGINEERING MECHANICS I,BASIC ELECTRICAL ENGINEERING,ENGINEERING CHEMISTRY LAB,ENGINEERING PHYSICS LAB,ELECTRICAL LAB,ENGINEERING GRAPHICS I,WORKSHOP PRACTICE I,GENERAL PROFICIENCY,ENGINEERING MATHEMATICS  II,ENGINEERING PHYSICS II,ENGINEERING CHEMISTRY II,DISASTER MANAGEMENT,BASIC ELECTRONICS,ENGINEERING MECHANICS II,INTRODUCTION TO PROGRAMMING,BASIC ELECTRONICS LAB,COMPUTER PROGRAMMING LAB,ENGINEERING GRAPHICS II,WORKSHOP PRACTICE II,MATHEMATICS - III,ENGINEERING ECONOMICS AND COSTING,DIGITAL CIRCUITS AND LOGIC DESIGN,DISCRETE MATHEMATICAL STRUCTURES,DATA STRUCTURES AND PROGRAMMING METHODOLOGY,DIGITAL CIRCUITS AND LOGIC DESIGN LAB,DATA STRUCTURES LAB,STATE,CATEGORY,SSC,HSC";
    private static final String Sem4 = "LANGUAGE (COMMUNICATION IN ENGLISH),ENGINEERING CHEMISTRY I,ENGINEERING PHYSICS I,ENGINEERING MATHEMATICS  I,ENGINEERING MECHANICS I,BASIC ELECTRICAL ENGINEERING,ENGINEERING CHEMISTRY LAB,ENGINEERING PHYSICS LAB,ELECTRICAL LAB,ENGINEERING GRAPHICS I,WORKSHOP PRACTICE I,GENERAL PROFICIENCY,ENGINEERING MATHEMATICS  II,ENGINEERING PHYSICS II,ENGINEERING CHEMISTRY II,DISASTER MANAGEMENT,BASIC ELECTRONICS,ENGINEERING MECHANICS II,INTRODUCTION TO PROGRAMMING,BASIC ELECTRONICS LAB,COMPUTER PROGRAMMING LAB,ENGINEERING GRAPHICS II,WORKSHOP PRACTICE II,MATHEMATICS - III,ENGINEERING ECONOMICS AND COSTING,DIGITAL CIRCUITS AND LOGIC DESIGN,DISCRETE MATHEMATICAL STRUCTURES,DATA STRUCTURES AND PROGRAMMING METHODOLOGY,DIGITAL CIRCUITS AND LOGIC DESIGN LAB,DATA STRUCTURES LAB,Mathematics - IV,Design & Analysis of Algorithm,Computer Organization,Formal Language & Automata Theory,Object Oriented Programming,Algorithm Laboratory,Object Oriented Programming Laboratory,STATE,CATEGORY,SSC,HSC";
    private static final String Sem5 = "LANGUAGE (COMMUNICATION IN ENGLISH),ENGINEERING CHEMISTRY I,ENGINEERING PHYSICS I,ENGINEERING MATHEMATICS  I,ENGINEERING MECHANICS I,BASIC ELECTRICAL ENGINEERING,ENGINEERING CHEMISTRY LAB,ENGINEERING PHYSICS LAB,ELECTRICAL LAB,ENGINEERING GRAPHICS I,WORKSHOP PRACTICE I,GENERAL PROFICIENCY,ENGINEERING MATHEMATICS  II,ENGINEERING PHYSICS II,ENGINEERING CHEMISTRY II,DISASTER MANAGEMENT,BASIC ELECTRONICS,ENGINEERING MECHANICS II,INTRODUCTION TO PROGRAMMING,BASIC ELECTRONICS LAB,COMPUTER PROGRAMMING LAB,ENGINEERING GRAPHICS II,WORKSHOP PRACTICE II,MATHEMATICS - III,ENGINEERING ECONOMICS AND COSTING,DIGITAL CIRCUITS AND LOGIC DESIGN,DISCRETE MATHEMATICAL STRUCTURES,DATA STRUCTURES AND PROGRAMMING METHODOLOGY,DIGITAL CIRCUITS AND LOGIC DESIGN LAB,DATA STRUCTURES LAB,Mathematics - IV,Design & Analysis of Algorithm,Computer Organization,Formal Language & Automata Theory,Object Oriented Programming,Algorithm Laboratory,Object Oriented Programming Laboratory,MICROPROCESSOR & APPLICATIONS,OPERATING SYSTEM,DATA COMMUNICATION,SOFTWARE ENGINEERING,GRAPH THEORY AND COMBINATORIES,MICROPROCESSOR LABORATORY,OPERATING SYSTEM LABORATORY,SOFTWARE ENGINEERING LABORATORY,STATE,CATEGORY,SSC,HSC";
    private static final String Sem6 = "LANGUAGE (COMMUNICATION IN ENGLISH),ENGINEERING CHEMISTRY I,ENGINEERING PHYSICS I,ENGINEERING MATHEMATICS  I,ENGINEERING MECHANICS I,BASIC ELECTRICAL ENGINEERING,ENGINEERING CHEMISTRY LAB,ENGINEERING PHYSICS LAB,ELECTRICAL LAB,ENGINEERING GRAPHICS I,WORKSHOP PRACTICE I,GENERAL PROFICIENCY,ENGINEERING MATHEMATICS  II,ENGINEERING PHYSICS II,ENGINEERING CHEMISTRY II,DISASTER MANAGEMENT,BASIC ELECTRONICS,ENGINEERING MECHANICS II,INTRODUCTION TO PROGRAMMING,BASIC ELECTRONICS LAB,COMPUTER PROGRAMMING LAB,ENGINEERING GRAPHICS II,WORKSHOP PRACTICE II,MATHEMATICS - III,ENGINEERING ECONOMICS AND COSTING,DIGITAL CIRCUITS AND LOGIC DESIGN,DISCRETE MATHEMATICAL STRUCTURES,DATA STRUCTURES AND PROGRAMMING METHODOLOGY,DIGITAL CIRCUITS AND LOGIC DESIGN LAB,DATA STRUCTURES LAB,Mathematics - IV,Design & Analysis of Algorithm,Computer Organization,Formal Language & Automata Theory,Object Oriented Programming,Algorithm Laboratory,Object Oriented Programming Laboratory,MICROPROCESSOR & APPLICATIONS,OPERATING SYSTEM,DATA COMMUNICATION,SOFTWARE ENGINEERING,GRAPH THEORY AND COMBINATORIES,MICROPROCESSOR LABORATORY,OPERATING SYSTEM LABORATORY,SOFTWARE ENGINEERING LABORATORY,DATABASE MANAGEMENT SYSTEM,COMPILER DESIGN,COMPUTER NETWORKS,ARTIFICIAL INTELLIGENCE,DATABASE MANAGEMENT SYSTEM LAB,COMPILER DESIGN LAB,COMPUTER NETWORKS LAB,STATE,CATEGORY,SSC,HSC";
    private static final String FILE_HEADER = "LANGUAGE (COMMUNICATION IN ENGLISH),ENGINEERING CHEMISTRY I,ENGINEERING PHYSICS I,ENGINEERING MATHEMATICS  I,ENGINEERING MECHANICS I,BASIC ELECTRICAL ENGINEERING,ENGINEERING CHEMISTRY LAB,ENGINEERING PHYSICS LAB,ELECTRICAL LAB,ENGINEERING GRAPHICS I,WORKSHOP PRACTICE I,GENERAL PROFICIENCY,ENGINEERING MATHEMATICS  II,ENGINEERING PHYSICS II,ENGINEERING CHEMISTRY II,DISASTER MANAGEMENT,BASIC ELECTRONICS,ENGINEERING MECHANICS II,INTRODUCTION TO PROGRAMMING,BASIC ELECTRONICS LAB,COMPUTER PROGRAMMING LAB,ENGINEERING GRAPHICS II,WORKSHOP PRACTICE II,MATHEMATICS - III,ENGINEERING ECONOMICS AND COSTING,DIGITAL CIRCUITS AND LOGIC DESIGN,DISCRETE MATHEMATICAL STRUCTURES,DATA STRUCTURES AND PROGRAMMING METHODOLOGY,DIGITAL CIRCUITS AND LOGIC DESIGN LAB,DATA STRUCTURES LAB,Mathematics - IV,Design & Analysis of Algorithm,Computer Organization,Formal Language & Automata Theory,Object Oriented Programming,Algorithm Laboratory,Object Oriented Programming Laboratory,MICROPROCESSOR & APPLICATIONS,OPERATING SYSTEM,DATA COMMUNICATION,SOFTWARE ENGINEERING,GRAPH THEORY AND COMBINATORIES,MICROPROCESSOR LABORATORY,OPERATING SYSTEM LABORATORY,SOFTWARE ENGINEERING LABORATORY,DATABASE MANAGEMENT SYSTEM,COMPILER DESIGN,COMPUTER NETWORKS,ARTIFICIAL INTELLIGENCE,DATABASE MANAGEMENT SYSTEM LAB,COMPILER DESIGN LAB,COMPUTER NETWORKS LAB,CRYPTOGRAPHY AND NETWORK SECURITY,STATE,CATEGORY,SSC,HSC";

 

    public static void writeCsvFile(String fileName,String grade[],String Info[],int value) {
        
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            //Write the CSV file header
            switch(value)
            {
                case 2 : fileWriter.append(Sem1.toString());
                    break;
                case 3 : fileWriter.append(Sem2.toString());
                    break;
                case 4 : fileWriter.append(Sem3.toString());
                    break;
                case 5 : fileWriter.append(Sem4.toString());
                    break;
                case 6 : fileWriter.append(Sem5.toString());
                    break;
            }
            //Add a new line separator after the header

            fileWriter.append(NEW_LINE_SEPARATOR);
            //Write a new student object list to the CSV file
            for (String x : grade) {

                fileWriter.append(x);

                fileWriter.append(COMMA_DELIMITER);
            }
                fileWriter.append(Info[2]);

                fileWriter.append(COMMA_DELIMITER);
                
                fileWriter.append(Info[3]);

                fileWriter.append(COMMA_DELIMITER);
                
                fileWriter.append(Info[4]);

                fileWriter.append(COMMA_DELIMITER);
                
                fileWriter.append(Info[5]);

            
            //System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {

            System.out.println("Error in CsvFileWriter !!!");

            e.printStackTrace();

        } finally {

             

            try {

                fileWriter.flush();

                fileWriter.close();

            } catch (IOException e) {

                System.out.println("Error while flushing/closing fileWriter !!!");

                e.printStackTrace();

            }

             

        }

    }
    
    public static void CSV2Arff()  throws Exception 
    {
        CSVLoader loader = new CSVLoader();
	Instances data = null;
	loader.setSource(new File("F:\\PROJECT-FINAL YEAR\\MLGUI\\student.csv"));
	data = loader.getDataSet();
		
		ArffSaver saver = new ArffSaver();
		saver.setInstances(data);
			
		saver.setFile(new File("F:\\PROJECT-FINAL YEAR\\MLGUI\\student.arff"));
		saver.writeBatch();
    }
    
    
        SegregateModels(String[] grade, String[] Info ,int value)throws Exception
        {
            CurrentSemester= value;
            Information =Info;
            int size = subjectCount[value-2] + 4;
            user = new DenseInstance(size);
           OverallGradeFina = new String[subjectCount[value-2]];
            int k = 0;
             //System.out.println("succesfully called before");
            while(grade[k]!=null)
            {
                 //grade[k].
               OverallGradeFina[k] = grade[k].toString();
               k++;
            }
            
            
            writeCsvFile("student.csv",OverallGradeFina,Info,value);
            CSV2Arff();
            
            String dataset = "F:\\PROJECT-FINAL YEAR\\MLGUI\\student.arff";
            DataSource source  = new DataSource(dataset);
            Instances data = source.getDataSet();
            
            user = data.instance(0);
            System.out.print(user);
            
            calculate(value);
            
        }
        private void calculate(int semester) throws Exception
        {
            //training data
		String dataset = "F:\\PROJECT-FINAL YEAR\\MLGUI\\Semester Wise Arff\\FullData.arff";
		DataSource source  = new DataSource(dataset);
		Instances data = source.getDataSet();

		
		String dataset1 = "F:\\PROJECT-FINAL YEAR\\MLGUI\\Semester Wise Arff\\First.arff";
		DataSource source1  = new DataSource(dataset1);
		Instances data1 = source1.getDataSet();
		
		
		String dataset2 = "F:\\PROJECT-FINAL YEAR\\MLGUI\\Semester Wise Arff\\Second.arff";
		DataSource source2  = new DataSource(dataset2);
		Instances data2 = source2.getDataSet();
		
		
		String dataset3 = "F:\\PROJECT-FINAL YEAR\\MLGUI\\Semester Wise Arff\\Third.arff";
		DataSource source3  = new DataSource(dataset3);
		Instances data3 = source3.getDataSet();
		
		
		String dataset4 = "F:\\PROJECT-FINAL YEAR\\MLGUI\\Semester Wise Arff\\Fourth.arff";
		DataSource source4  = new DataSource(dataset4);
		Instances data4 = source4.getDataSet();
		
		String dataset5 = "F:\\PROJECT-FINAL YEAR\\MLGUI\\Semester Wise Arff\\Fifth.arff";
		DataSource source5  = new DataSource(dataset5);
		Instances data5 = source5.getDataSet();
		
		String dataset6 = "F:\\PROJECT-FINAL YEAR\\MLGUI\\Semester Wise Arff\\Sixth.arff";
		DataSource source6  = new DataSource(dataset6);
		Instances data6 = source6.getDataSet();
		
		
		//create model
		SimpleKMeans model1 = new SimpleKMeans();  //Simple Kmeans object
		model1.setNumClusters(4);                  //set no of clusters 
		model1.setPreserveInstancesOrder(true);   
		model1.buildClusterer(data1);              //build cluster
		
		
		SimpleKMeans model2 = new SimpleKMeans();  //Simple Kmeans object
		model2.setNumClusters(4);                  //set no of clusters 
		model2.setPreserveInstancesOrder(true);   
		model2.buildClusterer(data2);              //build cluster
		
		SimpleKMeans model3 = new SimpleKMeans();  //Simple Kmeans object
		model3.setNumClusters(4);                  //set no of clusters 
		model3.setPreserveInstancesOrder(true);   
		model3.buildClusterer(data3);              //build cluster
		
		
		SimpleKMeans model4 = new SimpleKMeans();  //Simple Kmeans object
		model4.setNumClusters(4);                  //set no of clusters 
		model4.setPreserveInstancesOrder(true);   
		model4.buildClusterer(data4);              //build cluster
		
		SimpleKMeans model5 = new SimpleKMeans();  //Simple Kmeans object
		model5.setNumClusters(4);                  //set no of clusters 
		model5.setPreserveInstancesOrder(true);   
		model5.buildClusterer(data5);              //build cluster
		
		
		SimpleKMeans model6 = new SimpleKMeans();  //Simple Kmeans object
		model6.setNumClusters(4);                  //set no of clusters 
		model6.setPreserveInstancesOrder(true);   
		model6.buildClusterer(data6);              //build cluster
		
		
		//testing instance
		
		System.out.println("Instance = "+user);
		
		//find cluster number of an instance
		int num = 0;
		int[] assignments;
		switch(semester){
		case 2: num = model1.clusterInstance(user);
				assignments = model2.getAssignments();
				break;
		case 3: num = model2.clusterInstance(user);
		   		assignments = model3.getAssignments();
				break;
		case 4: num = model3.clusterInstance(user);
				assignments = model4.getAssignments();
				break;
		case 5: num = model4.clusterInstance(user);
				assignments = model5.getAssignments();
				break;
		case 6: num = model5.clusterInstance(user);
				assignments = model6.getAssignments();
				break;
		default :
			assignments = model6.getAssignments();
		}
		
		int size = subjectCount[semester-1] - subjectCount[semester-2];
				
		double [][]arr = new double[100][15];
		//to check cluster no of each instance

				int i=0;
				int k = 0; //to count no of rows
				for(int clusterNum : assignments) {
					if(clusterNum == num){
						Instance temp = data.instance(i);
						int start = subjectCount[semester-2];
						int end = subjectCount[semester-1];
						for(int z = start,j = 0;z < end;++z,++j)
						{
							//System.out.print(temp.stringValue(z)+" ");
							String str = temp.stringValue(z);
							switch(str){
							case "EX":arr[k][j] = 9.5;
										break;
							case "A":arr[k][j] = 8.5;
										break;
							case "B":arr[k][j] = 7.5;
										break;
							case "C":arr[k][j] = 6.5;
										break;
							case "D":arr[k][j] = 5.5;
										break;
							case "P":arr[k][j] = 4.5;
										break;
							case "F":arr[k][j] = 3.5;
										break;
							}
						}
						++k;
						//System.out.println();
				      //System.out.printf("Instance %d -> Cluster %d\n", i, clusterNum);
				    }
					++i;
				}
				
				double mean[] = new double[size];
				double variance[] = new double[size];
				double stdDev[] = new double[size];
				for(int col = 0;col < size;++col)
				{
					for(int row = 0;row < k;++row){
						mean[col] += arr[row][col];
					}
				}
				
				for(int z = 0;z < mean.length;++z)
					mean[z] /= k;
				
				for(int col = 0;col < size;++col)
				{
					float sum1 = 0;
					for(int row = 0;row < k;++row){
						sum1 += Math.pow((arr[row][col] - mean[col]), 2);
					}
					variance[col] = sum1/size;
					stdDev[col] = Math.sqrt(variance[col]);
				}

		
			    String gradArr[] = {"F","F","F","F","P","D","C","B","A","EX","EX"};
			    int flr[] =new int[size];
			    int subjectIndex = subjectCount[semester-2];
			    System.out.println("Subject 			"+"Predicted Grade Range(Actual predicted grade plus minus 1)");
			    for(int z = 0;z < size;++z)
			    {
			    	 flr[z] = (int)(Math.floor(mean[z]));
			    	int min = flr[z]-1;
			    	int max = flr[z]+1;
			    	System.out.println(subjectName[subjectIndex+z]+" 			"+gradArr[min]+"-"+gradArr[max]+"("+gradArr[flr[z]]+")");
			    }
FinalOutPut newFrameinCluster = new FinalOutPut(subjectName, subjectCount, Information, gradArr, CurrentSemester, flr);
newFrameinCluster.setVisible(true);

			    
	}
	//main function
	public static void main(String args[]) throws Exception{
		
		
}
}
