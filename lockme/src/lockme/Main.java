package lockme;

public class Main {
	public static void main(String[] args) { 
		 
		 // Create "main" folder if not present in current folder structure 
		 Operations.createMainFolderIfNotPresent("main"); 
		 
		 Menu.welcomeScreen("LockedMe", "Vikas Kumar Jha"); 
		 
		 HandleOptions.handleWelcomeScreenInput(); 
		 }

}
