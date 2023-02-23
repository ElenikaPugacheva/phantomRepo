package test.git;

public class GitTest {
	public void test() {
		System.out.println("this is just a test");
	}
}
	
//	write a new method in GitTest class in your project 
//	testTwo 
//	- void 
//	- public 
//	- print "this is class practice" follow below steps to commit changes and push to remote repo 
//	open command Prompt - change directory to project - 
//	- git status -- red files or unstage files 
//	- git add .  
//	- git status -- green files or staged files and ready for commit 
//	- git commit -m "this is class practice" 
//	- git status -- nothing to commit, working tree clean
//	- git push -u origin main 
//	- git status -- On branch main
//	Your branch is up to date with 'origin/main'.

	
//	
//	1. initialize an empty local git repo - git init
//	2. to check status of your repo - git status
//	3. to track files and add them to stage area - git add <nameofFile>                                                            - git add .  - add all files to stage area
//	4. to commit the files into local git repo   - git commit -m"this is first phantom commit"
//	5. to create a main branch                      - git branch -M main
//	6. to add remote repo                               - git remote add origin <gitRepoURL>7. to push your code into remote repo           - git push -u origin main
//}
