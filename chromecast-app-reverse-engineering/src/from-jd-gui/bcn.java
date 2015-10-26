import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class bcn
  implements alt, bcm
{
  public static final Comparator a = new bco();
  public ScheduledFuture b;
  public final Set c;
  public final Set d;
  public final Set e;
  private ScheduledExecutorService f = Executors.newSingleThreadScheduledExecutor();
  private final int g = blf.g(SetupApplication.a());
  private final blp h = new blp("OffersManager");
  private final atf i;
  private String j;
  private final Map k;
  private final Set l;
  private final aea m = new bcp(this);
  
  public bcn(atf paramatf, String paramString, Bundle paramBundle)
  {
    this.i = paramatf;
    this.j = paramString;
    this.k = new HashMap();
    this.l = new HashSet();
    this.e = new HashSet();
    this.c = new HashSet();
    paramatf = PreferenceManager.getDefaultSharedPreferences(SetupApplication.a()).getString("hiddenOffers", "");
    this.d = new HashSet();
    if (!TextUtils.isEmpty(paramatf)) {
      this.d.addAll(Arrays.asList(paramatf.split(",")));
    }
    if ((paramBundle != null) && (paramBundle.containsKey("getAppsOffers")))
    {
      paramatf = paramBundle.getParcelableArrayList("getAppsOffers");
      this.c.addAll(paramatf);
    }
    for (;;)
    {
      return;
      b();
    }
  }
  
  private void b()
  {
    try
    {
      dbl localdbl = new dbl;
      localdbl.<init>();
      this.l.size();
      localdbl.b = new String[this.l.size()];
      this.l.toArray(localdbl.b);
      this.l.clear();
      bcr localbcr = new bcr;
      localbcr.<init>(this);
      atf localatf = this.i;
      bcs localbcs = new bcs;
      localbcs.<init>(this, localdbl, localbcr);
      localatf.a(localbcs, localbcr);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a()
  {
    ArrayList localArrayList = new ArrayList(this.c.size());
    localArrayList.addAll(this.c);
    Collections.sort(localArrayList, a);
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((bct)localIterator.next()).a(localArrayList);
    }
  }
  
  /* Error */
  public final void a(aow paramaow)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield 229	aow:q	Ljava/lang/String;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 88	bcn:k	Ljava/util/Map;
    //   11: aload_2
    //   12: invokeinterface 234 2 0
    //   17: istore_3
    //   18: iload_3
    //   19: ifeq +6 -> 25
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: aload_0
    //   26: getfield 88	bcn:k	Ljava/util/Map;
    //   29: aload_2
    //   30: aload_1
    //   31: invokeinterface 238 3 0
    //   36: pop
    //   37: aload_0
    //   38: getfield 93	bcn:l	Ljava/util/Set;
    //   41: aload_2
    //   42: invokeinterface 241 2 0
    //   47: pop
    //   48: aload_0
    //   49: getfield 243	bcn:b	Ljava/util/concurrent/ScheduledFuture;
    //   52: ifnull +14 -> 66
    //   55: aload_0
    //   56: getfield 243	bcn:b	Ljava/util/concurrent/ScheduledFuture;
    //   59: iconst_0
    //   60: invokeinterface 249 2 0
    //   65: pop
    //   66: aload_0
    //   67: getfield 93	bcn:l	Ljava/util/Set;
    //   70: invokeinterface 164 1 0
    //   75: pop
    //   76: aload_0
    //   77: getfield 51	bcn:f	Ljava/util/concurrent/ScheduledExecutorService;
    //   80: astore_1
    //   81: new 251	bcq
    //   84: astore_2
    //   85: aload_2
    //   86: aload_0
    //   87: invokespecial 252	bcq:<init>	(Lbcn;)V
    //   90: aload_0
    //   91: aload_1
    //   92: aload_2
    //   93: aload_0
    //   94: getfield 63	bcn:g	I
    //   97: i2l
    //   98: getstatic 258	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   101: invokeinterface 264 5 0
    //   106: putfield 243	bcn:b	Ljava/util/concurrent/ScheduledFuture;
    //   109: goto -87 -> 22
    //   112: astore_1
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_1
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	bcn
    //   0	117	1	paramaow	aow
    //   6	87	2	localObject	Object
    //   17	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	18	112	finally
    //   25	66	112	finally
    //   66	109	112	finally
  }
  
  public final void a(bcd parambcd)
  {
    Object localObject = SetupApplication.a();
    localObject = new bcu(parambcd.a.c, parambcd.a.a, new bcf(parambcd), new bcg(parambcd, (Context)localObject));
    parambcd = ((ads)localObject).b;
    this.i.a((ads)localObject);
  }
  
  public final void a(bcd parambcd, int paramInt)
  {
    this.d.add(parambcd.a());
    if (this.c.remove(parambcd))
    {
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext()) {
        ((bct)localIterator.next()).a(parambcd, paramInt);
      }
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      if (!TextUtils.equals(paramString, this.j))
      {
        this.j = paramString;
        this.k.clear();
        this.l.clear();
        this.c.clear();
        a();
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */