package lockme;
import java.util.*;

public class HandleOptions {
	public static void handleWelcomeScreenInput() { 
		 boolean running = true; 
		 Scanner sc = new Scanner(System.in); 
		 do { 
		 try { 
		 Menu.displayMenu(); 
		 int input = sc.nextInt(); 
		 switch (input) { 
		 case 1: 
		 Operations.displayAllFiles("main"); 
		 break; 
		 case 2: 
		 HandleOptions.handleFileMenuOptions(); 
		 break; 
		 case 3: 
		 System.out.println("Program exited successfully."); 
		 running = false; 
		 sc.close(); 
		 System.exit(0); 
		 break; 
		 default: 
		 System.out.println("Please select a valid option from above.");
		 } }
		 catch (Exception e) { 
			 System.out.println(e.getClass().getName()); 
			 handleWelcomeScreenInput(); 
			 } 
			 } while (running == true); 
			 } 
			 
			 public static void handleFileMenuOptions() { 
			 boolean running = true; 
			 Scanner sc = new Scanner(System.in); 
			 do { 
			 try { 
			 Menu.displayFileMenuOptions(); 
			 
			 Operations.createMainFolderIfNotPresent("main"); 
			 
			 int input = sc.nextInt(); 
			 switch (input) { 
			 case 1: 
			 // File Add 
			 System.out.println("Please Enter file name to be added to the \"main\" folder"); 
			 String fileToAdd = sc.next(); 
			 Operations.createFile(fileToAdd, sc); 
			 break; 
			 
			 case 2: 
			 // File/Folder delete 
			 System.out.println("Please Enter file name to be deleted from \"main\" folder"); 
			 String fileToDelete = sc.next(); 
			 
			 
			 Operations.createMainFolderIfNotPresent("main"); 
			 List<String> filesToDelete = Operations.displayFileLocations(fileToDelete, "main");
			 String deletionPrompt = "\nSelect index of which file to delete?"+ "\n(Enter 0 if you want to delete all elements)"; 
					  System.out.println(deletionPrompt); 
					  
					  int index = sc.nextInt(); 
					  
					  if (index != 0) { 
					  
					  Operations.deleteFileRecursively(filesToDelete.get(index - 1)); 
					  } else { 
					  
					  // If index == 0, delete all files  displayed for the name 
					  for (String path : filesToDelete) { 
					  
					  Operations.deleteFileRecursively(path); 
					  } 
					  } 
					  
					  break;
			 case 3: 
				 // File/Folder Search 
				 System.out.println("Please Enter file name to be searched from \"main\" folder"); 
				 String fileName = sc.next(); 
				 
				 
				 Operations.createMainFolderIfNotPresent("main"); 
				 Operations.displayFileLocations(fileName, "main"); 
				 
				 break; 
				 case 4: 
				 // Go to Previous menu 
				 return; 
				 
				 default: 
				 System.out.println("Please select a valid option from above."); 
				 } 
				 } catch (Exception e) { 
				 System.out.println(e.getClass().getName()); 
				 handleFileMenuOptions(); 
				 } 
				 } while (running == true); 
				 } 
				
			 
}
