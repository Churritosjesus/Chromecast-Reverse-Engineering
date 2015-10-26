import android.location.Geocoder;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.gms.common.api.GoogleApiClient;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public final class blj
{
  public static final Charset a = Charset.forName("UTF-8");
  private static final blp b = new blp("LocalizationUtil");
  private static final String[] c = { "ARAB", "CYRL", "GURU", "HANS", "HANT", "LATN", "TFNG", "VAII" };
  
  public static blm a(List paramList)
  {
    Locale localLocale = Locale.getDefault();
    Iterator localIterator = paramList.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      paramList = (blm)localIterator.next();
    } while (!paramList.a.equals(localLocale.getCountry()));
    for (;;)
    {
      return paramList;
      paramList = null;
    }
  }
  
  public static blm a(List paramList, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramList = null;
    }
    for (;;)
    {
      return paramList;
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          paramList = (blm)localIterator.next();
          if (paramString.equals(paramList.a)) {
            break;
          }
        }
      }
      paramList = null;
    }
  }
  
  public static String a()
  {
    return a(Locale.getDefault());
  }
  
  public static String a(Locale paramLocale)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c(paramLocale));
    if (!TextUtils.isEmpty(paramLocale.getCountry())) {
      localStringBuilder.append(String.format(Locale.US, ", %s;q=0.8", new Object[] { paramLocale.getLanguage() }));
    }
    localStringBuilder.append(", en;q=0.5");
    return localStringBuilder.toString();
  }
  
  public static void a(m paramm, bln parambln)
  {
    int i = 0;
    if ((ble.a(paramm)) && (ble.b(paramm) != 1))
    {
      b.a("Google Apps Access to location disabled.", new Object[0]);
      if (i != 0) {
        break label46;
      }
      parambln.a(null);
    }
    for (;;)
    {
      return;
      i = 1;
      break;
      label46:
      if (!Geocoder.isPresent())
      {
        parambln.a(null);
      }
      else
      {
        GoogleApiClient localGoogleApiClient = new bwf(SetupApplication.a()).a(new blk(parambln)).a(cni.a).b();
        localGoogleApiClient.a(new bll(localGoogleApiClient, parambln, paramm));
        localGoogleApiClient.b();
      }
    }
  }
  
  public static String b()
  {
    return b(Locale.getDefault());
  }
  
  public static String b(Locale paramLocale)
  {
    if (TextUtils.isEmpty(paramLocale.getLanguage())) {}
    for (paramLocale = "en";; paramLocale = paramLocale.getLanguage()) {
      return paramLocale;
    }
  }
  
  public static String c()
  {
    return c(Locale.getDefault());
  }
  
  public static String c(Locale paramLocale)
  {
    if (!TextUtils.isEmpty(paramLocale.getCountry())) {}
    for (paramLocale = String.format(Locale.US, "%s-%s", new Object[] { paramLocale.getLanguage(), paramLocale.getCountry() });; paramLocale = paramLocale.getLanguage()) {
      return paramLocale;
    }
  }
  
  private static String d(Locale paramLocale)
  {
    int k = 0;
    String str = paramLocale.getCountry();
    if (Build.VERSION.SDK_INT != 19)
    {
      localObject = str;
      return (String)localObject;
    }
    Object localObject = c;
    int m = localObject.length;
    for (int i = 0;; i++)
    {
      int j = k;
      if (i < m)
      {
        if (localObject[i].equals(paramLocale.getCountry())) {
          j = 1;
        }
      }
      else
      {
        localObject = str;
        if (j == 0) {
          break;
        }
        paramLocale = TextUtils.split(paramLocale.toString(), "_");
        localObject = str;
        if (paramLocale.length != 3) {
          break;
        }
        localObject = paramLocale[2];
        break;
      }
    }
  }
  
  public static boolean d()
  {
    return Locale.GERMAN.getLanguage().equals(Locale.getDefault().getLanguage());
  }
  
  public static List e()
  {
    TreeMap localTreeMap = new TreeMap();
    for (Object localObject : Locale.getAvailableLocales())
    {
      String str = ((Locale)localObject).getDisplayCountry();
      if (!TextUtils.isEmpty(str))
      {
        localObject = d((Locale)localObject);
        if ((!TextUtils.isEmpty((CharSequence)localObject)) && (((String)localObject).length() == 2) && (!localTreeMap.containsKey(str))) {
          localTreeMap.put(str, new blm((String)localObject, str));
        }
      }
    }
    return new ArrayList(localTreeMap.values());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */