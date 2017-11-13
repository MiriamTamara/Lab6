import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Person {

String name; 
String email;
String phone;
public boolean isValid() {
boolean valid = true;

if (name==null){
	valid = false;
	
} else if (name.equals("")){
valid =false;
} else if (name.length()<6){
valid =false;
}
if (email==null){
	valid = false;
	
} else if (email.equals("")){
valid =false;
} else {
Pattern p=Pattern.compile("(\\w)+(\\.)?(\\w)+@(\\w)+\\.(com|(ac\\.)?(\\.co\\.(uk)|(il)|(no)|(dk)))");
Matcher m =p.matcher(email);
if (!m.matches()){
valid=false;
}
}
if (phone==null){
	valid = false;
	
} else if (phone.equals("")){
valid =false;
} else if (phone.length()<9){
	valid=false;
} else if (phone.length()>10){
	valid=false;
} else if (!((phone.charAt(0))=='0')){
valid=false;
}

 return valid;
 
}
public Person(String name, String email, String phone) {
this.name = name;
this.email = email;
this.email = phone;
}

public String getName(){
	return name;
}
public String getEmail(){
	return email;
}
public String getPhone(){
	return phone;
}

public void setName(String name){
this.name=name;
}
public void setEmail(String email){
this.email=email;
}
public void setPhone(String phone){
this.phone=phone;
}

}
