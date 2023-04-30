package Practice;
import java.util.Scanner;
public class tic_tac_toe
{
    public static boolean check(String tac[]){
        //this is method is look for winning possibilities and return result
        if(tac[0]!="-" && tac[1]!="-" && tac[2]!="-")
        {
            if(tac[0].equals(tac[1]) && tac[1].equals(tac[2]))
            {
                System.out.println(tac[0]+" "+tac[1]+" "+tac[2]);
                System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
                System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
                return true;
            }          
        } 
        if(tac[3]!="-" && tac[4]!="-" && tac[5]!="-")
        {
            if(tac[3].equals(tac[4]) && tac[4].equals(tac[5]))
            {
                System.out.println(tac[0]+" "+tac[1]+" "+tac[2]);
                System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
                System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
                return true;
            }          
        }
        if(tac[6]!="-" && tac[7]!="-" && tac[8]!="-")
        {
            if(tac[6].equals(tac[7]) && tac[7].equals(tac[8]))
            {
                System.out.println(tac[0]+" "+tac[1]+" "+tac[2]);
                System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
                System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
                return true;
            }          
        }
        if(tac[0]!="-" && tac[3]!="-" && tac[6]!="-")
        {
            if(tac[0].equals(tac[3]) && tac[3].equals(tac[6]))
            {
                System.out.println(tac[0]+" "+tac[1]+" "+tac[2]);
                System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
                System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
                return true;
            }          
        }
        if(tac[1]!="-" && tac[4]!="-" && tac[7]!="-")
        {
            if(tac[1].equals(tac[4]) && tac[4].equals(tac[7]))
            {
                System.out.println(tac[0]+" "+tac[1]+" "+tac[2]);
                System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
                System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
                return true;
            }          
        }
        if(tac[2]!="-" && tac[5]!="-" && tac[8]!="-")
        {
            if(tac[2].equals(tac[5]) && tac[5].equals(tac[8]))
            {
                System.out.println(tac[0]+" "+tac[1]+" "+tac[2]);
                System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
                System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
                return true;
            }          
        }
        if(tac[0]!="-" && tac[4]!="-" && tac[8]!="-")
        {
            if(tac[0].equals(tac[4]) && tac[4].equals(tac[8]))
            {
                System.out.println(tac[0]+" "+tac[1]+" "+tac[2]);
                System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
                System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
                return true;
            }          
        }
        if(tac[2]!="-" && tac[4]!="-" && tac[6]!="-")
        {
            if(tac[2].equals(tac[4]) && tac[4].equals(tac[6]))
            {
                System.out.println(tac[0]+" "+tac[1]+" "+tac[2]);
                System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
                System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
                return true;
            }          
        }
        
        return false;
        
    }   
    public static void main(String[] args) {
        String [] tac = {"-","-","-","-","-","-","-","-","-",};
        Scanner sc = new Scanner(System.in);

        //this statement display (like real game) for user understanding 
        System.out.println(tac[0]+" "+tac[1]+" "+tac[2]);
        System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
        System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
        
       
        //choosing the token 0 or 1
        System.out.println("choose your side i.e. 0 or 1");        
        String val = sc.next();
        int i=1;
        String comp;
        if(val.equals("0")){
            //now computer will choose on basis of user choosen token
            comp="1";
        }
        else{
            comp="0";
        }
        System.out.println("REMINDER- if you choose occupied location you miss one step");
        System.out.println();
        System.out.println("you choose "+val+" computer choose "+comp);

        //using loop that iterate only 9-times for steps
        while(i<10){

            //if all locations are occupied then end the loop and diplay msg
            if(tac[0]!="-"&&tac[1]!="-"&&tac[2]!="-"&&tac[3]!="-"&&tac[4]!="-"&&tac[5]!="-"&&tac[6]!="-"&&tac[7]!="-"&&tac[8]!="-"){
                System.out.println("game tie");
                break;
            }
        //everytime program will ask user for location of his choosen token
        System.out.println("on which location you want "+val);
        int loc = sc.nextInt();
        
        //program check enter location if occupied or not
        // and also user will missed one st        
        if(tac[loc-1]=="-"){
            tac[loc-1] = val;
            if(i>2){            
            //as soon as user enter location program check that if he will winning or not
            boolean winner = check(tac);
            if(winner){
            System.out.println(val+" is winner");
            break;
            }
        }
        }
        
        //if location is occupied then print msg choose properly
        //and also user will missed his one step and then definately computer will will...
        else{
            System.out.println("choose location properly");
            // continue;
        }

        //now real journy start 
        //first computer will check that if he(computer) is wining by putting his token on specific location..
        boolean flag = true;
        if(i>1){
        if(tac[0]!="-" && tac[1]!="-" && tac[2]=="-"){
            if(tac[0]==tac[1] && tac[0]==comp){
                tac[2]=comp;
                flag=false;
                //now program call will then check method for confirming computer is won or not
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        
        if(tac[3]!="-" && tac[4]!="-"&& tac[5]=="-"){
            if(tac[3]==tac[4] && tac[3]==comp){
                flag=false;
                tac[5]=comp;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        if(flag){
        if(tac[6]!="-" && tac[7]!="-"&& tac[8]=="-"){
            if(tac[6]==tac[7] && tac[7]==comp){
                flag=false;
                tac[8]=comp;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[1]!="-" && tac[2]!="-"&& tac[0]=="-"){
            if(tac[1]==tac[2] && tac[1]==comp){
                tac[0]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[4]!="-" && tac[5]!="-"&& tac[3]=="-"){
            if(tac[4]==tac[5] && tac[5]==comp){
                tac[3]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[7]!="-" && tac[8]!="-"&& tac[6]=="-"){
            if(tac[7]==tac[8] && tac[7]==comp){
                tac[6]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[0]!="-" && tac[2]!="-"&& tac[1]=="-"){
            if(tac[0]==tac[2] && tac[0]==comp){
                tac[1]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[3]!="-" && tac[5]!="-"&& tac[4]=="-"){
            if(tac[3]==tac[5] && tac[3]==comp){
                tac[4]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[6]!="-" && tac[8]!="-"&& tac[7]=="-"){
            if(tac[6]==tac[8] && tac[6]==comp){
                tac[7]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[0]!="-" && tac[3]!="-"&& tac[6]=="-"){
            if(tac[0]==tac[3] && tac[3]==comp){
                tac[6]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[1]!="-" && tac[4]!="-"&& tac[7]=="-"){
            if(tac[1]==tac[4] && tac[1]==comp){
                tac[7]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[2]!="-" && tac[5]!="-"&& tac[8]=="-"){
            if(tac[2]==tac[5] && tac[2]==comp){
                tac[8]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[3]!="-" && tac[6]!="-"&& tac[0]=="-"){
            if(tac[3]==tac[6] && tac[3]==comp){
                tac[0]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }if(flag){
        if(tac[4]!="-" && tac[7]!="-"&& tac[1]=="-"){
            if(tac[4]==tac[7] && tac[4]==comp){
                tac[1]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[5]!="-" && tac[8]!="-"&& tac[2]=="-"){
            if(tac[5]==tac[8] && tac[5]==comp){
                tac[2]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }
        if(flag){
        if(tac[0]!="-" && tac[6]!="-"&& tac[3]=="-"){
            if(tac[0]==tac[6] && tac[0]==comp){
                tac[3]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }if(flag){
        if(tac[1]!="-" && tac[7]!="-"&& tac[4]=="-"){
            if(tac[1]==tac[7] && tac[1]==comp){
                tac[4]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }if(flag){
        if(tac[2]!="-" && tac[8]!="-"&& tac[5]=="-"){
            if(tac[2]==tac[8] && tac[2]==comp){
                tac[5]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }if(flag){
        if(tac[0]!="-" && tac[4]!="-"&& tac[8]=="-"){
            if(tac[0]==tac[4] && tac[0]==comp){
                tac[8]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }if(flag){
        if(tac[4]!="-" && tac[8]!="-"&& tac[0]=="-"){
            if(tac[4]==tac[8] && tac[4]==comp){
                tac[0]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }if(flag){
        if(tac[0]!="-" && tac[8]!="-"&& tac[4]=="-"){
            if(tac[0]==tac[8] && tac[0]==comp){
                tac[4]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }if(flag){
        if(tac[2]!="-" && tac[4]!="-"&& tac[6]=="-"){
            if(tac[2]==tac[4] && tac[2]==comp){
                tac[6]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }if(flag){
        if(tac[2]!="-" && tac[6]!="-"&& tac[4]=="-"){
            if(tac[2]==tac[6] && tac[2]==comp){
                tac[4]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }if(flag){
        if(tac[6]!="-" && tac[4]!="-"&& tac[2]=="-"){
            if(tac[6]==tac[4] && tac[6]==comp){
                tac[2]=comp;
                flag=false;
                boolean winner = check(tac);
                if(winner){
                System.out.println(comp+" computer is winner");
                break;
                }
            }
        }
        }

        //now computer is checking that if user is gettting won by putting his(user) token on specific location
        //then on that specific location computer will put his token for not to win the user
        if(flag){
        if(tac[0]!="-" && tac[1]!="-" && tac[2]=="-"){
            if(tac[0]==tac[1] && tac[0]==val){
                tac[2]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[3]!="-" && tac[4]!="-"&& tac[5]=="-"){
            if(tac[3]==tac[4] && tac[3]==val){
                tac[5]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[6]!="-" && tac[7]!="-"&& tac[8]=="-"){
            if(tac[6]==tac[4] && tac[7]==val){
                tac[8]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[1]!="-" && tac[2]!="-"&& tac[0]=="-"){
            if(tac[1]==tac[2] && tac[1]==val){
                tac[0]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[4]!="-" && tac[5]!="-"&& tac[3]=="-"){
            if(tac[4]==tac[5] && tac[5]==val){
                tac[3]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[7]!="-" && tac[8]!="-"&& tac[6]=="-"){
            if(tac[7]==tac[8] && tac[7]==val){
                tac[6]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[0]!="-" && tac[2]!="-"&& tac[1]=="-"){
            if(tac[0]==tac[2] && tac[0]==val){
                tac[1]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[3]!="-" && tac[5]!="-"&& tac[4]=="-"){
            if(tac[3]==tac[5] && tac[3]==val){
                tac[4]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[6]!="-" && tac[8]!="-"&& tac[7]=="-"){
            if(tac[6]==tac[8] && tac[6]==val){
                tac[7]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[0]!="-" && tac[3]!="-"&& tac[6]=="-"){
            if(tac[0]==tac[3] && tac[3]==val){
                tac[6]=comp;
                flag=false;
            }
            }
        }if(flag){
        if(tac[1]!="-" && tac[4]!="-"&& tac[7]=="-"){
            if(tac[1]==tac[4] && tac[1]==val){
                tac[7]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[2]!="-" && tac[5]!="-"&& tac[8]=="-"){
            if(tac[2]==tac[5] && tac[2]==val){
                tac[8]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[3]!="-" && tac[6]!="-"&& tac[0]=="-"){
            if(tac[3]==tac[6] && tac[3]==val){
                tac[0]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[4]!="-" && tac[7]!="-"&& tac[1]=="-"){
            if(tac[4]==tac[7] && tac[4]==val){
                tac[1]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[5]!="-" && tac[8]!="-"&& tac[2]=="-"){
            if(tac[5]==tac[8] && tac[5]==val){
                tac[2]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[0]!="-" && tac[6]!="-"&& tac[3]=="-"){
            if(tac[0]==tac[6] && tac[0]==val){
                tac[3]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[1]!="-" && tac[7]!="-"&& tac[4]=="-"){
            if(tac[1]==tac[7] && tac[1]==val){
                tac[4]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[2]!="-" && tac[8]!="-"&& tac[5]=="-"){
            if(tac[2]==tac[8] && tac[2]==val){
                tac[5]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[0]!="-" && tac[4]!="-"&& tac[8]=="-"){
            if(tac[0]==tac[4] && tac[0]==val){
                tac[8]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[4]!="-" && tac[8]!="-"&& tac[0]=="-"){
            if(tac[4]==tac[8] && tac[4]==val){
                tac[0]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[0]!="-" && tac[8]!="-"&& tac[4]=="-"){
            if(tac[0]==tac[8] && tac[0]==val){
                tac[4]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[2]!="-" && tac[4]!="-"&& tac[6]=="-"){
            if(tac[2]==tac[4] && tac[2]==val){
                tac[6]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[2]!="-" && tac[6]!="-"&& tac[4]=="-"){
            if(tac[2]==tac[6] && tac[2]==val){
                tac[4]=comp;
                flag=false;
            }
        }
        }if(flag){
        if(tac[6]!="-" && tac[4]!="-"&& tac[2]=="-"){
            if(tac[6]==tac[4] && tac[6]==val){
                tac[2]=comp;
                flag=false;
            }
        }
        }
    }   
        //this positions occuping in the first 2 steps
        //if no one is getting win then computer comes this part and just put his token in the suggested location
        
        //temp logic start
        // if(flag){
        //     if(tac[0]==val && i==1){
        //         tac[8]=comp;
        //         flag=false;
        //         }
        //     }
        // if(flag){
        //     if(tac[8]==val && i==1){
        //         tac[0]=comp;
        //         flag=false;
        //         }
        //     }
        // if(flag){
        //     if(tac[2]==val && i==1){
        //         tac[6]=comp;
        //         flag=false;
        //         }
        //     }
        // if(flag){
        //     if(tac[6]==val && i==1){
        //         tac[21]=comp;
        //         flag=false;
        //         }
        //     }
        //temp logic not usefull
        
        
        //second temp logic
//        if(flag) {
//        	if(tac[0]==val) {
//        		tac[8]=comp;
//        		flag=false;
//        	}
//        }
//        if(flag) {
//        	if(tac[8]==val) {
//        		tac[0]=comp;
//        		flag=false;
//        	}
//        }
//        if(flag) {
//        	if(tac[2]==val) {
//        		tac[6]=comp;
//        		flag=false;
//        	}
//        }
//        if(flag) {
//        	if(tac[6]==val) {
//        		tac[2]=comp;
//        		flag=false;
//        	}
//        }
        
        
        
        if(flag){
        if(tac[4]=="-"){
            tac[4]=comp;
            flag=false;
            }
        }if(flag){
        if(tac[0]=="-"){
            tac[0]=comp;
            flag=false;
            }
        }if(flag){
        if(tac[2]=="-"){
            tac[2]=comp;
            flag=false;
            }
        }if(flag){
        if(tac[6]=="-"){
            tac[6]=comp;
            flag=false;
            }
        }if(flag){
        if(tac[8]=="-"){
            tac[8]=comp;
            flag=false;
            }
        }if(flag){
        if(tac[3]=="-"){
            tac[3]=comp;
            flag=false;
            }
        }if(flag){
        if(tac[5]=="-"){
            tac[5]=comp;
            flag=false;
            }
        }if(flag){
        if(tac[7]=="-"){
            tac[7]=comp;
            flag=false;
            }
        }if(flag){
        if(tac[1]=="-"){
            tac[1]=comp;
            flag=false;
            }
        }

        //this statement is used for clear the screen
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println(tac[0]+" "+tac[1]+" "+tac[2]); 
        System.out.println(tac[3]+" "+tac[4]+" "+tac[5]);
        System.out.println(tac[6]+" "+tac[7]+" "+tac[8]);
        i=i+1;
        }    
        sc.close();        
    }    
}
