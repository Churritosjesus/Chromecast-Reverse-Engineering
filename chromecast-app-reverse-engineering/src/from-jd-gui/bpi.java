import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class bpi
  extends bqz
  implements cpd
{
  private static DecimalFormat a;
  private final brb b;
  private final String c;
  private final Uri e;
  
  public bpi(brb parambrb, String paramString)
  {
    this(parambrb, paramString, true, false);
  }
  
  private bpi(brb parambrb, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(parambrb);
    a.f(paramString);
    this.b = parambrb;
    this.c = paramString;
    this.e = a(this.c);
  }
  
  public static Uri a(String paramString)
  {
    a.f(paramString);
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("google-analytics.com");
    localBuilder.path(paramString);
    return localBuilder.build();
  }
  
  private static String a(double paramDouble)
  {
    if (a == null) {
      a = new DecimalFormat("0.######");
    }
    return a.format(paramDouble);
  }
  
  private static void a(Map paramMap, String paramString, double paramDouble)
  {
    if (paramDouble != 0.0D) {
      paramMap.put(paramString, a(paramDouble));
    }
  }
  
  private static void a(Map paramMap, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0)) {
      paramMap.put(paramString, paramInt1 + "x" + paramInt2);
    }
  }
  
  private static void a(Map paramMap, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private static void a(Map paramMap, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramMap.put(paramString, "1");
    }
  }
  
  private static Map b(cou paramcou)
  {
    HashMap localHashMap = new HashMap();
    Object localObject1 = (bpx)paramcou.a(bpx.class);
    Object localObject4;
    Object localObject3;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject4 = Collections.unmodifiableMap(((bpx)localObject1).a).entrySet().iterator();
      label193:
      while (((Iterator)localObject4).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject4).next();
        localObject1 = ((Map.Entry)localObject3).getValue();
        if (localObject1 == null) {
          localObject1 = null;
        }
        for (;;)
        {
          if (localObject1 == null) {
            break label193;
          }
          localHashMap.put(((Map.Entry)localObject3).getKey(), localObject1);
          break;
          if ((localObject1 instanceof String))
          {
            localObject2 = (String)localObject1;
            localObject1 = localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2)) {
              localObject1 = null;
            }
          }
          else if ((localObject1 instanceof Double))
          {
            localObject1 = (Double)localObject1;
            if (((Double)localObject1).doubleValue() != 0.0D) {
              localObject1 = a(((Double)localObject1).doubleValue());
            } else {
              localObject1 = null;
            }
          }
          else if ((localObject1 instanceof Boolean))
          {
            if (localObject1 != Boolean.FALSE) {
              localObject1 = "1";
            } else {
              localObject1 = null;
            }
          }
          else
          {
            localObject1 = String.valueOf(localObject1);
          }
        }
      }
    }
    localObject1 = (bpy)paramcou.a(bpy.class);
    if (localObject1 != null)
    {
      a(localHashMap, "t", ((bpy)localObject1).a);
      a(localHashMap, "cid", ((bpy)localObject1).b);
      a(localHashMap, "uid", ((bpy)localObject1).c);
      a(localHashMap, "sc", ((bpy)localObject1).f);
      a(localHashMap, "sf", ((bpy)localObject1).h);
      a(localHashMap, "ni", ((bpy)localObject1).g);
      a(localHashMap, "adid", ((bpy)localObject1).d);
      a(localHashMap, "ate", ((bpy)localObject1).e);
    }
    localObject1 = (cpk)paramcou.a(cpk.class);
    if (localObject1 != null)
    {
      a(localHashMap, "cd", ((cpk)localObject1).a);
      a(localHashMap, "a", ((cpk)localObject1).b);
      a(localHashMap, "dr", ((cpk)localObject1).c);
    }
    localObject1 = (cpi)paramcou.a(cpi.class);
    if (localObject1 != null)
    {
      a(localHashMap, "ec", ((cpi)localObject1).a);
      a(localHashMap, "ea", ((cpi)localObject1).b);
      a(localHashMap, "el", ((cpi)localObject1).c);
      a(localHashMap, "ev", ((cpi)localObject1).d);
    }
    localObject1 = (cpf)paramcou.a(cpf.class);
    if (localObject1 != null)
    {
      a(localHashMap, "cn", ((cpf)localObject1).a);
      a(localHashMap, "cs", ((cpf)localObject1).b);
      a(localHashMap, "cm", ((cpf)localObject1).c);
      a(localHashMap, "ck", ((cpf)localObject1).d);
      a(localHashMap, "cc", ((cpf)localObject1).e);
      a(localHashMap, "ci", ((cpf)localObject1).f);
      a(localHashMap, "anid", ((cpf)localObject1).g);
      a(localHashMap, "gclid", ((cpf)localObject1).h);
      a(localHashMap, "dclid", ((cpf)localObject1).i);
      a(localHashMap, "aclid", ((cpf)localObject1).j);
    }
    localObject1 = (cpj)paramcou.a(cpj.class);
    if (localObject1 != null)
    {
      a(localHashMap, "exd", ((cpj)localObject1).a);
      a(localHashMap, "exf", ((cpj)localObject1).b);
    }
    localObject1 = (cpl)paramcou.a(cpl.class);
    if (localObject1 != null)
    {
      a(localHashMap, "sn", ((cpl)localObject1).a);
      a(localHashMap, "sa", ((cpl)localObject1).b);
      a(localHashMap, "st", ((cpl)localObject1).c);
    }
    localObject1 = (cpm)paramcou.a(cpm.class);
    if (localObject1 != null)
    {
      a(localHashMap, "utv", ((cpm)localObject1).a);
      a(localHashMap, "utt", ((cpm)localObject1).b);
      a(localHashMap, "utc", ((cpm)localObject1).c);
      a(localHashMap, "utl", ((cpm)localObject1).d);
    }
    localObject1 = (bpv)paramcou.a(bpv.class);
    if (localObject1 != null)
    {
      localObject1 = Collections.unmodifiableMap(((bpv)localObject1).a).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = a.a("cd", ((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, ((Map.Entry)localObject2).getValue());
        }
      }
    }
    localObject1 = (bpw)paramcou.a(bpw.class);
    if (localObject1 != null)
    {
      localObject3 = Collections.unmodifiableMap(((bpw)localObject1).a).entrySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        localObject2 = a.a("cm", ((Integer)((Map.Entry)localObject1).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject2)) {
          localHashMap.put(localObject2, a(((Double)((Map.Entry)localObject1).getValue()).doubleValue()));
        }
      }
    }
    localObject1 = (cph)paramcou.a(cph.class);
    if (localObject1 != null)
    {
      localObject2 = ((cph)localObject1).d;
      if (localObject2 != null)
      {
        localObject2 = ((bqa)localObject2).a().entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          if (((String)((Map.Entry)localObject3).getKey()).startsWith("&")) {
            localHashMap.put(((String)((Map.Entry)localObject3).getKey()).substring(1), ((Map.Entry)localObject3).getValue());
          } else {
            localHashMap.put(((Map.Entry)localObject3).getKey(), ((Map.Entry)localObject3).getValue());
          }
        }
      }
      localObject2 = Collections.unmodifiableList(((cph)localObject1).b).iterator();
      for (int i = 1; ((Iterator)localObject2).hasNext(); i++) {
        localHashMap.putAll(((bqb)((Iterator)localObject2).next()).a(a.a("promo", i)));
      }
      localObject2 = Collections.unmodifiableList(((cph)localObject1).a).iterator();
      for (i = 1; ((Iterator)localObject2).hasNext(); i++) {
        localHashMap.putAll(((bpz)((Iterator)localObject2).next()).a(a.a("pr", i)));
      }
      localObject3 = ((cph)localObject1).c.entrySet().iterator();
      for (i = 1; ((Iterator)localObject3).hasNext(); i++)
      {
        localObject2 = (Map.Entry)((Iterator)localObject3).next();
        localObject4 = (List)((Map.Entry)localObject2).getValue();
        localObject1 = a.a("il", i);
        localObject4 = ((List)localObject4).iterator();
        for (int j = 1; ((Iterator)localObject4).hasNext(); j++) {
          localHashMap.putAll(((bpz)((Iterator)localObject4).next()).a((String)localObject1 + a.a("pi", j)));
        }
        if (!TextUtils.isEmpty((CharSequence)((Map.Entry)localObject2).getKey())) {
          localHashMap.put((String)localObject1 + "nm", ((Map.Entry)localObject2).getKey());
        }
      }
    }
    localObject1 = (cpg)paramcou.a(cpg.class);
    if (localObject1 != null)
    {
      a(localHashMap, "ul", ((cpg)localObject1).a);
      a(localHashMap, "sd", ((cpg)localObject1).b);
      a(localHashMap, "sr", ((cpg)localObject1).c, ((cpg)localObject1).d);
      a(localHashMap, "vp", ((cpg)localObject1).e, ((cpg)localObject1).f);
    }
    paramcou = (cpe)paramcou.a(cpe.class);
    if (paramcou != null)
    {
      a(localHashMap, "an", paramcou.a);
      a(localHashMap, "aid", paramcou.c);
      a(localHashMap, "aiid", paramcou.d);
      a(localHashMap, "av", paramcou.b);
    }
    return localHashMap;
  }
  
  public final Uri a()
  {
    return this.e;
  }
  
  public final void a(cou paramcou)
  {
    a.c(paramcou);
    a.b(paramcou.c, "Can't deliver not submitted measurement");
    a.h("deliver should be called on worker thread");
    Object localObject1 = paramcou.a();
    Object localObject2 = (bpy)((cou)localObject1).b(bpy.class);
    if (TextUtils.isEmpty(((bpy)localObject2).a)) {
      this.d.a().a(b((cou)localObject1), "Ignoring measurement without type");
    }
    for (;;)
    {
      return;
      if (TextUtils.isEmpty(((bpy)localObject2).b))
      {
        this.d.a().a(b((cou)localObject1), "Ignoring measurement without client id");
      }
      else if (!this.b.d().e)
      {
        double d = ((bpy)localObject2).h;
        if (bqs.a(d, ((bpy)localObject2).b))
        {
          b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
        }
        else
        {
          localObject1 = b((cou)localObject1);
          ((Map)localObject1).put("v", "1");
          ((Map)localObject1).put("_v", "ma4.5.0");
          ((Map)localObject1).put("tid", this.c);
          if (!this.b.d().d) {
            break;
          }
          paramcou = new StringBuilder();
          localObject1 = ((Map)localObject1).entrySet().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (Map.Entry)((Iterator)localObject1).next();
            if (paramcou.length() != 0) {
              paramcou.append(", ");
            }
            paramcou.append((String)((Map.Entry)localObject2).getKey());
            paramcou.append("=");
            paramcou.append((String)((Map.Entry)localObject2).getValue());
          }
          c("Dry run is enabled. GoogleAnalytics would have sent", paramcou.toString());
        }
      }
    }
    HashMap localHashMap = new HashMap();
    bqs.a(localHashMap, "uid", ((bpy)localObject2).c);
    Object localObject3 = (cpe)paramcou.a(cpe.class);
    if (localObject3 != null)
    {
      bqs.a(localHashMap, "an", ((cpe)localObject3).a);
      bqs.a(localHashMap, "aid", ((cpe)localObject3).c);
      bqs.a(localHashMap, "av", ((cpe)localObject3).b);
      bqs.a(localHashMap, "aiid", ((cpe)localObject3).d);
    }
    localObject3 = ((bpy)localObject2).b;
    String str = this.c;
    if (!TextUtils.isEmpty(((bpy)localObject2).d)) {}
    for (boolean bool = true;; bool = false)
    {
      localObject2 = new bre(0L, (String)localObject3, str, bool, 0L, localHashMap);
      ((Map)localObject1).put("_s", String.valueOf(this.d.c().a((bre)localObject2)));
      paramcou = new bsi(this.d.a(), (Map)localObject1, paramcou.d, true);
      this.d.c().a(paramcou);
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */