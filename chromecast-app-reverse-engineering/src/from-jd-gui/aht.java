import android.os.Bundle;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class aht
{
  private List a = new ArrayList();
  private List b = new ArrayList();
  private int c;
  private ahx d;
  private String e;
  
  public aht(ahx paramahx, String paramString1, String paramString2)
  {
    this.d = paramahx;
    this.e = paramString2;
  }
  
  private static byte[] a(String paramString)
  {
    Object localObject = null;
    try
    {
      paramString = paramString.getBytes("UTF-8");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        aji.a("Encoding exception: ", paramString);
        paramString = (String)localObject;
      }
    }
  }
  
  public final int a()
  {
    try
    {
      int i = this.a.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int a(aga paramaga, boolean paramBoolean1, boolean paramBoolean2)
  {
    JSONArray localJSONArray;
    Object localObject1;
    Object localObject2;
    try
    {
      i = this.c;
      this.b.addAll(this.a);
      this.a.clear();
      localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      localObject1 = this.b.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ahm)((Iterator)localObject1).next();
        if ((paramBoolean1) || (!((ahm)localObject2).b)) {
          localJSONArray.put(((ahm)localObject2).a);
        }
      }
      if (localJSONArray.length() != 0) {
        break label121;
      }
    }
    finally {}
    int i = 0;
    for (;;)
    {
      return i;
      try
      {
        label121:
        localObject2 = ahu.a(ahw.b, this.d, this.e, paramBoolean2, ahe.e());
        localObject1 = localObject2;
        if (this.c > 0)
        {
          ((JSONObject)localObject2).put("num_skipped_events", i);
          localObject1 = localObject2;
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          JSONObject localJSONObject = new JSONObject();
        }
      }
      paramaga.c = ((JSONObject)localObject1);
      localObject2 = paramaga.d;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Bundle();
      }
      localObject2 = localJSONArray.toString();
      if (localObject2 != null)
      {
        ((Bundle)localObject1).putByteArray("custom_events_file", a((String)localObject2));
        paramaga.f = localObject2;
      }
      paramaga.d = ((Bundle)localObject1);
      i = localJSONArray.length();
    }
  }
  
  /* Error */
  public final void a(ahm paramahm)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 23	aht:a	Ljava/util/List;
    //   6: invokeinterface 53 1 0
    //   11: aload_0
    //   12: getfield 25	aht:b	Ljava/util/List;
    //   15: invokeinterface 53 1 0
    //   20: iadd
    //   21: sipush 1000
    //   24: if_icmplt +16 -> 40
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 58	aht:c	I
    //   32: iconst_1
    //   33: iadd
    //   34: putfield 58	aht:c	I
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: getfield 23	aht:a	Ljava/util/List;
    //   44: aload_1
    //   45: invokeinterface 151 2 0
    //   50: pop
    //   51: goto -14 -> 37
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	aht
    //   0	59	1	paramahm	ahm
    // Exception table:
    //   from	to	target	type
    //   2	37	54	finally
    //   40	51	54	finally
  }
  
  public final void a(List paramList)
  {
    try
    {
      this.a.addAll(paramList);
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      this.a.addAll(this.b);
      this.b.clear();
      this.c = 0;
      return;
    }
    finally {}
  }
  
  public final List b()
  {
    try
    {
      List localList = this.a;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.a = localArrayList;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */