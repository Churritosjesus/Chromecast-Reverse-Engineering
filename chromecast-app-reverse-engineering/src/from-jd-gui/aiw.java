import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class aiw
{
  private static final HashMap a = new HashMap();
  private final ags b;
  private final String c;
  private StringBuilder d;
  private int e = 3;
  
  public aiw(ags paramags, String paramString)
  {
    ajp.a(paramString, "tag");
    this.b = paramags;
    paramags = String.valueOf("FacebookSDK.");
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {}
    for (paramags = paramags.concat(paramString);; paramags = new String(paramags))
    {
      this.c = paramags;
      this.d = new StringBuilder();
      return;
    }
  }
  
  public static void a(ags paramags, int paramInt, String paramString1, String paramString2)
  {
    String str;
    if (afv.a(paramags))
    {
      paramString2 = c(paramString2);
      if (paramString1.startsWith("FacebookSDK.")) {
        break label85;
      }
      str = String.valueOf("FacebookSDK.");
      paramString1 = String.valueOf(paramString1);
      if (paramString1.length() == 0) {
        break label72;
      }
      paramString1 = str.concat(paramString1);
    }
    label72:
    label85:
    for (;;)
    {
      Log.println(paramInt, paramString1, paramString2);
      if (paramags == ags.f) {
        new Exception().printStackTrace();
      }
      return;
      paramString1 = new String(str);
    }
  }
  
  public static void a(ags paramags, String paramString1, String paramString2)
  {
    a(paramags, 3, paramString1, paramString2);
  }
  
  public static void a(ags paramags, String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (afv.a(paramags)) {
      a(paramags, 3, paramString1, String.format(paramString2, paramVarArgs));
    }
  }
  
  public static void a(String paramString)
  {
    try
    {
      if (!afv.a(ags.b)) {
        a(paramString, "ACCESS_TOKEN_REMOVED");
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private static void a(String paramString1, String paramString2)
  {
    try
    {
      a.put(paramString1, paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  private static String c(String paramString)
  {
    try
    {
      Iterator localIterator = a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramString = paramString.replace((CharSequence)localEntry.getKey(), (CharSequence)localEntry.getValue());
      }
      return paramString;
    }
    finally {}
  }
  
  public final void a()
  {
    String str = this.d.toString();
    a(this.b, this.e, this.c, str);
    this.d = new StringBuilder();
  }
  
  public final void a(String paramString, Object paramObject)
  {
    if (afv.a(this.b)) {
      this.d.append(String.format("  %s:\t%s\n", new Object[] { paramString, paramObject }));
    }
  }
  
  public final void b(String paramString)
  {
    if (afv.a(this.b)) {
      this.d.append(paramString);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aiw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */