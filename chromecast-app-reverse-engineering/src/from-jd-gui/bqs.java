import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public final class bqs
{
  public static double a(String paramString, double paramDouble)
  {
    paramDouble = 100.0D;
    if (paramString == null) {}
    for (;;)
    {
      return paramDouble;
      try
      {
        double d = Double.parseDouble(paramString);
        paramDouble = d;
      }
      catch (NumberFormatException paramString) {}
    }
  }
  
  public static long a(String paramString)
  {
    long l2 = 0L;
    long l1;
    if (paramString == null) {
      l1 = l2;
    }
    for (;;)
    {
      return l1;
      try
      {
        l1 = Long.parseLong(paramString);
      }
      catch (NumberFormatException paramString)
      {
        l1 = l2;
      }
    }
  }
  
  public static cpf a(bql parambql, String paramString)
  {
    Iterator localIterator = null;
    a.c(parambql);
    if (TextUtils.isEmpty(paramString)) {
      parambql = localIterator;
    }
    for (;;)
    {
      return parambql;
      try
      {
        URI localURI = new java/net/URI;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("?");
        localURI.<init>(paramString);
        localObject = URLEncodedUtils.parse(localURI, "UTF-8");
        paramString = new HashMap(((List)localObject).size());
        localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          parambql = (NameValuePair)localIterator.next();
          paramString.put(parambql.getName(), parambql.getValue());
        }
      }
      catch (URISyntaxException paramString)
      {
        parambql.d("No valid campaign data found", paramString);
        parambql = localIterator;
      }
      parambql = new cpf();
      parambql.e = ((String)paramString.get("utm_content"));
      parambql.c = ((String)paramString.get("utm_medium"));
      parambql.a = ((String)paramString.get("utm_campaign"));
      parambql.b = ((String)paramString.get("utm_source"));
      parambql.d = ((String)paramString.get("utm_term"));
      parambql.f = ((String)paramString.get("utm_id"));
      parambql.g = ((String)paramString.get("anid"));
      parambql.h = ((String)paramString.get("gclid"));
      parambql.i = ((String)paramString.get("dclid"));
      parambql.j = ((String)paramString.get("aclid"));
    }
  }
  
  public static String a(Locale paramLocale)
  {
    Object localObject = null;
    if (paramLocale == null) {}
    for (;;)
    {
      return (String)localObject;
      String str = paramLocale.getLanguage();
      if (!TextUtils.isEmpty(str))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(str.toLowerCase());
        if (!TextUtils.isEmpty(paramLocale.getCountry())) {
          ((StringBuilder)localObject).append("-").append(paramLocale.getCountry().toLowerCase());
        }
        localObject = ((StringBuilder)localObject).toString();
      }
    }
  }
  
  public static void a(Map paramMap, String paramString1, String paramString2)
  {
    if ((paramString2 != null) && (!paramMap.containsKey(paramString1))) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  public static void a(Map paramMap1, String paramString, Map paramMap2)
  {
    a(paramMap1, paramString, (String)paramMap2.get(paramString));
  }
  
  public static void a(Map paramMap, String paramString, boolean paramBoolean)
  {
    if (!paramMap.containsKey(paramString)) {
      if (!paramBoolean) {
        break label27;
      }
    }
    label27:
    for (String str = "1";; str = "0")
    {
      paramMap.put(paramString, str);
      return;
    }
  }
  
  public static boolean a(double paramDouble, String paramString)
  {
    boolean bool = true;
    if ((paramDouble <= 0.0D) || (paramDouble >= 100.0D)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      if (!TextUtils.isEmpty(paramString))
      {
        int j = paramString.length() - 1;
        int i = 0;
        for (;;)
        {
          k = i;
          if (j < 0) {
            break;
          }
          k = paramString.charAt(j);
          k = (i << 6 & 0xFFFFFFF) + k + (k << 14);
          int m = 0xFE00000 & k;
          i = k;
          if (m != 0) {
            i = k ^ m >> 21;
          }
          j--;
        }
      }
      int k = 1;
      if (k % 10000 < 100.0D * paramDouble) {
        bool = false;
      }
    }
  }
  
  public static boolean a(Context paramContext, Class paramClass)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramClass);
      paramContext = localPackageManager.getServiceInfo(localComponentName, 4);
      if (paramContext == null) {
        break label44;
      }
      bool = paramContext.enabled;
      if (!bool) {
        break label44;
      }
      bool = true;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        label44:
        boolean bool = false;
      }
    }
    return bool;
  }
  
  public static boolean a(Context paramContext, Class paramClass, boolean paramBoolean)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramClass);
      paramContext = localPackageManager.getReceiverInfo(localComponentName, 2);
      if ((paramContext == null) || (!paramContext.enabled)) {
        break label54;
      }
      if (paramBoolean)
      {
        paramBoolean = paramContext.exported;
        if (!paramBoolean) {
          break label54;
        }
      }
      paramBoolean = true;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        label54:
        paramBoolean = false;
      }
    }
    return paramBoolean;
  }
  
  public static boolean a(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    paramBoolean = bool;
    if (paramString != null)
    {
      paramBoolean = bool;
      if (!paramString.equalsIgnoreCase("true"))
      {
        paramBoolean = bool;
        if (!paramString.equalsIgnoreCase("yes"))
        {
          if (!paramString.equalsIgnoreCase("1")) {
            break label43;
          }
          paramBoolean = bool;
        }
      }
    }
    for (;;)
    {
      return paramBoolean;
      label43:
      if ((!paramString.equalsIgnoreCase("false")) && (!paramString.equalsIgnoreCase("no")))
      {
        paramBoolean = bool;
        if (!paramString.equalsIgnoreCase("0")) {}
      }
      else
      {
        paramBoolean = false;
      }
    }
  }
  
  public static MessageDigest b(String paramString)
  {
    int i = 0;
    if (i < 2) {}
    for (;;)
    {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
      break;
      Object localObject = null;
    }
  }
  
  public static void b(Map paramMap, String paramString1, String paramString2)
  {
    if ((paramString2 != null) && (TextUtils.isEmpty((CharSequence)paramMap.get(paramString1)))) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  public static boolean c(String paramString)
  {
    boolean bool = true;
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return bool;
      if (paramString.startsWith("http:")) {
        bool = false;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */