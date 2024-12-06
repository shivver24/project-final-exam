import java.util.HashMap;


public class IDandPasswords
{
   HashMap<String, String> logininfo = new HashMap<String,String>(); 
   
   IDandPasswords()
   {
      logininfo.put("admin" , "password");
      logininfo.put("eric123" , "imongmama");
   }
   
   protected HashMap getLoginInfo()
   {
      return logininfo;
   }
}