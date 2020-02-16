import java.util.Scanner;

public class Email {   
    private String fname;
    private String lname;
    private String dept;
    private String password;
    private int capacity;
    private String altEmail;
    private String address;

    Scanner in = new Scanner(System.in);
    
    public Email(){
        setName();
        setDept();
        setCap();
        setRandPass();
        setAddress();
        getEmailDetails();
        setAltEmail();
        setPass();
        displayAll();
    }

    public Email(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    
    }

    public void welcomeMessage(String a, String b){
        System.out.println("\n\n\tWelcome "+ a +" "+ b+".\n");
    }

    public void setName(){
        System.out.println("What is the first name?");
        this.fname=in.nextLine();
        System.out.println("What is the last name?");
        this.lname=in.nextLine();
        welcomeMessage(this.fname, this.lname);
    }

    public void setRandPass(){
       this.password="aaa";
       System.out.println("Current password is: aaa");
       //generate random string
    }

    public void setAltEmail(){
        System.out.println("\nWhat is an alternative email for the account?");
        this.altEmail = in.nextLine();
        System.out.println("Thank you!");
    }
   
    public void setPass(){
        
        System.out.println("\nWhat is your current password?");
        String a = in.nextLine();
        if(this.password.equals(a)){
            System.out.println("New Password: ");
            this.password=in.nextLine();
        }else{
            System.out.println("That wasn't your password");
        }
        System.out.println("Thank You");
    }

    public void setDept(){
        System.out.println("Which department? (1- Sales, 2-Dev, 3- Acct, 4- None)");
        int depo=in.nextInt();
        in.nextLine();
        if(depo==1){
            this.dept ="sales";
        }else if(depo==3){
            this.dept ="accounting";
        }else if(depo==2){
            this.dept ="development";
        }else{
            this.dept="department";
        }
    }

   public void setCap(){
       System.out.println("What is the email's capacity?");
       this.capacity=in.nextInt();
       in.nextLine();
   }

   public void getEmailDetails(){
       System.out.println("\n\t" + fname + " " + lname + "'s account. \n\tEmail Address: "+fname+"."+lname+"@"+dept+"."+"apple.com \n\tCapacity: "+ capacity);
   }

   public void displayAll(){
       System.out.println("\n\t"+fname+" "+lname+"\n\tDept: "+ dept+"\tPassword: "+password+"\n\tCap: "+capacity+"\t\tAlt. Email: "+altEmail+"\n\tAddress: "+ address+"\n");
       
   }

   /**
    * @param address the address to set
    */
   public void setAddress() {
       this.address =""+fname+"."+lname+"@"+dept+"."+"apple.com";
   }

   public void getAddress(){
       System.out.println(address);
   }
}
