package eleven.April;

public class Country{

public String countryName;

public int zipCode;
public Country( String countryKaNaam , int zip){

System.out.println(" Country Name before :"
+countryName);
System.out.println(" country zip before  :"
+zipCode);

countryName = countryKaNaam;
zipCode = zip;

System.out.println(" Country Name after :"
+countryName);
System.out.println(" country zip after  :"
+zipCode);


}

public void printDetails(){
System.out.println(" Country Name in method :"
+countryName);

System.out.println(" ZIP in method :"
+zipCode);

}
}