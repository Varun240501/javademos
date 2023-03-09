package phase1;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class lockeddemo {
    public static void main(String[] args)  {
        File newfolder = new File("C:\\Users\\var\\Desktop\\Projdemo");
        newfolder.mkdirs(); 
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("********WELCOME********\n");
            System.out.println("****This is LockedMe application**** \n");
            System.out.println("****Developed by - Varun R**** \n");
            System.out.println("**The following functions are :- **\n");
            System.out.println("1. Display files in ascending order\n");
            System.out.println("2. User Enabled Operations  \n");
            System.out.println("3. Exit the Program");
            System.out.println("**Select your choice**\n");

            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:

                    File array[] = newfolder.listFiles();
                    Arrays.sort(array);

                    for(int i=0;i<array.length;i++)
                        System.out.println(array[i]);
                        break;


                case 2:
                	boolean temp=true;
                    while(temp==true) {
                        System.out.println("Option 1 :- Add a file in the existing Directory");
                        System.out.println("Option 2 :- Delete a file from the existing Directory. ");
                        System.out.println("Option 3 :- Search a file from the Directory");
                        System.out.println("Option 4 :- Back to the previous menu");
                        System.out.println("Option 5 :- Exit Program");


                        int choice2 = scanner.nextInt();

                        switch (choice2) {
                            case 1:
                                File file = new File("C:\\Users\\var\\Desktop\\Projdemo");
                                System.out.println("Enter a file name");
                                String name = scanner.next();
                                if(new File(newfolder,name).exists()){
                                    System.out.println("file already exist");
                                }else {
                                    File newfolder1 = new File(newfolder, name);
                                    try {
										newfolder1.createNewFile();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
                                    if (new File(newfolder, name).exists()) {
                                        System.out.println("file added successfully");
                                    }
                                }

                                break;


                            case 2:
                                System.out.println("Enter a file name");
                                String name1 = scanner.next();
                                File newfolder2 = new File(newfolder, name1);
                                System.out.println(newfolder2);
                                if (newfolder2.exists()) {
                                    File folder3 = new File(newfolder, name1);
                                    folder3.delete();
                                    System.out.println("File successfully deleted");
                                } else {
                                    System.out.println("file does not exist");
                                }
                                newfolder2.delete();
                                break;


                            case 3:
                            	System.out.println("Enter a keyword to search");
                                String search = scanner.next();

                                File array1[] = newfolder.listFiles();
                                boolean t=false;
                                for(int a=0;a<array1.length;a++){
                                    if(array1[a].getName().startsWith(search)){
                                        System.out.println(array1[a]);
                                        t=true;
                                        break;
                                    }
                                }
                                if(t==false) {
                                	System.out.println("File not found");
                                } 

                            case 4:
                                temp = false;
                                break;

                            case 5:

                                System.out.println("****Program Terminated Successfully****");
                                System.exit(0);
                            default:
                                System.out.println("Input correct value and retry");

                        }

                    }
                    break;

                case 3:
                    System.out.println("****Program Terminated Successfully****");
                    System.exit(0);

                default:
                    System.out.println("Input correct value and retry");
                    break;

            }
        }
    }

}

