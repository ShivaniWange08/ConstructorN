package eleven.April;

public class State{

public String StateName;
public int pinCode;

public State(String StateName, int pinCode){

this.StateName = StateName;
this.pinCode = pinCode;

}

public void printDetails(){
System.out.println(" State Name in method :" +StateName);
System.out.println(" Pin Code in method :" +pinCode);


}
}
