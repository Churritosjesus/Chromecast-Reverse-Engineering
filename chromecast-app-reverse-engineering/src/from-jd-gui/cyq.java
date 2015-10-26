import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class cyq
  extends cyf
{
  private static final String b = cip.O.toString();
  private static final String c = cit.L.toString();
  private static final String d = cit.b.toString();
  private static final String e = cit.K.toString();
  private static String f = "gtm_" + b + "_unrepeatable";
  private static final Set g = new HashSet();
  private final cys h;
  private final Context i;
  
  public cyq(Context paramContext)
  {
    this(paramContext, new cyr(paramContext));
  }
  
  private cyq(Context paramContext, cys paramcys)
  {
    super(b, new String[] { c });
    this.h = paramcys;
    this.i = paramContext;
  }
  
  private boolean a(String paramString)
  {
    boolean bool1 = true;
    for (;;)
    {
      try
      {
        boolean bool2 = g.contains(paramString);
        if (bool2) {
          return bool1;
        }
        if (this.i.getSharedPreferences(f, 0).contains(paramString)) {
          g.add(paramString);
        } else {
          bool1 = false;
        }
      }
      finally {}
    }
  }
  
  public final void b(Map paramMap)
  {
    String str;
    if (paramMap.get(e) != null)
    {
      str = cyh.a((cje)paramMap.get(e));
      if ((str == null) || (!a(str))) {
        break label46;
      }
    }
    for (;;)
    {
      return;
      str = null;
      break;
      label46:
      Uri.Builder localBuilder = Uri.parse(cyh.a((cje)paramMap.get(c))).buildUpon();
      paramMap = (cje)paramMap.get(d);
      if (paramMap != null)
      {
        paramMap = cyh.e(paramMap);
        if (!(paramMap instanceof List))
        {
          cuh.a("ArbitraryPixel: additional params not a list: not sending partial hit: " + localBuilder.build().toString());
          continue;
        }
        paramMap = ((List)paramMap).iterator();
        for (;;)
        {
          if (!paramMap.hasNext()) {
            break label255;
          }
          Object localObject = paramMap.next();
          if (!(localObject instanceof Map))
          {
            cuh.a("ArbitraryPixel: additional params contains non-map: not sending partial hit: " + localBuilder.build().toString());
            break;
          }
          localObject = ((Map)localObject).entrySet().iterator();
          while (((Iterator)localObject).hasNext())
          {
            Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
            localBuilder.appendQueryParameter(localEntry.getKey().toString(), localEntry.getValue().toString());
          }
        }
      }
      label255:
      paramMap = localBuilder.build().toString();
      this.h.a().a(paramMap);
      cuh.e("ArbitraryPixel: url = " + paramMap);
      if (str == null) {
        continue;
      }
      try
      {
        g.add(str);
        a.a(this.i, f, str, "true");
      }
      finally {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */