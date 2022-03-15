package stolica;

import java.util.regex.Matcher;  
import java.util.regex.Pattern;  

public class Check {

    public static boolean checkName(String userNameString){  
        Pattern p = Pattern.compile("^[а-яА-Яa-zA-Z -]{1,60}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    public static boolean checkCountry(String userNameString){  
        Pattern p = Pattern.compile("^[а-яА-Яa-zA-Z -]{1,15}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    public static boolean checkUnit(String userNameString){  
        Pattern p = Pattern.compile("^[а-яА-Яa-zA-Z -]{1,10}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    public static boolean checkPhoto(String userNameString){  
        Pattern p = Pattern.compile("^[а-яА-Яa-zA-Z0-9\\w]{1,20}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    
    public static boolean checkRegister(String userNameString){  
        Pattern p = Pattern.compile("^[0-9]{1,20}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    
    public static boolean checkPhone(String userNameString){  
        Pattern p = Pattern.compile("^[0-9]{11}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
        public static boolean checkAccount(String userNameString){  
        Pattern p = Pattern.compile("^[0-9]{20}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    public static boolean checkGoodsID(String userNameString){  
        Pattern p = Pattern.compile("^[0-9]{10}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    
    public static boolean checkPeriod(String userNameString){  
        Pattern p = Pattern.compile("^[0-9]{1,4}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
       
    public static boolean checkCost(String userNameString){  
        Pattern p = Pattern.compile("^[0-9]{1,11}(.)[0-9]{0,2}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    
    public static boolean checkAddress(String userNameString){  
        Pattern p = Pattern.compile("^(гр.|г.)[а-яА-Яa-zA-Z -]{1,20} ул.[а-яА-Яa-zA-Z -]{1,20} д.[а-яА-Яa-zA-Z0-9]{1,6}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }

    public static boolean checkComment(String userNameString){  
        Pattern p = Pattern.compile("^[а-яА-Яa-zA-Z]{1,300}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    
    public static boolean checkDoc(String userNameString){  
        Pattern p = Pattern.compile("^[0-9]{2} [0-9]{2} [0-9]{6}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    
    public static boolean checkSq(String userNameString){  
        Pattern p = Pattern.compile("^[0-9]{1,11}(.[0-9]{1})?$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    public static boolean checkNamePhone(String userNameString){  
        Pattern p = Pattern.compile("^[а-яА-Яa-zA-Z0-9 -]{1,20}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
    public static boolean checkDate(String userNameString){  
        Pattern p = Pattern.compile("^(((0[1-9]|[12]\\d|3[01])\\.(0[13578]|1[02])\\.((19|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\.(0[13456789]|1[012])\\.((19|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\.02\\.((19|[2-9]\\d)\\d{2}))|(29\\.02\\.((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches(); 
 }
}
