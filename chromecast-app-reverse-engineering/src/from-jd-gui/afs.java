import java.net.HttpURLConnection;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class afs
{
  private static afu e = new afu(200, 299);
  final int a;
  public final int b;
  final String c;
  public final afq d;
  private final int f;
  private final String g;
  
  private afs(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection, afq paramafq)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString1;
    this.g = paramString2;
    paramInt1 = 0;
    if (paramafq != null)
    {
      this.d = paramafq;
      paramInt1 = 1;
      paramString1 = b();
      if (paramInt1 != 0) {
        break label332;
      }
      if (!paramBoolean) {
        break label122;
      }
      paramInt1 = aft.c;
      label59:
      this.f = paramInt1;
      paramInt1 = this.f;
      switch (ait.a[(paramInt1 - 1)])
      {
      }
    }
    for (;;)
    {
      return;
      this.d = new afz(this, paramString2);
      break;
      label122:
      if ((paramString1.a != null) && (paramString1.a.containsKey(Integer.valueOf(paramInt2))))
      {
        paramString2 = (Set)paramString1.a.get(Integer.valueOf(paramInt2));
        if ((paramString2 == null) || (paramString2.contains(Integer.valueOf(paramInt3))))
        {
          paramInt1 = aft.b;
          break label59;
        }
      }
      if ((paramString1.c != null) && (paramString1.c.containsKey(Integer.valueOf(paramInt2))))
      {
        paramString2 = (Set)paramString1.c.get(Integer.valueOf(paramInt2));
        if ((paramString2 == null) || (paramString2.contains(Integer.valueOf(paramInt3))))
        {
          paramInt1 = aft.a;
          break label59;
        }
      }
      if ((paramString1.b != null) && (paramString1.b.containsKey(Integer.valueOf(paramInt2))))
      {
        paramString2 = (Set)paramString1.b.get(Integer.valueOf(paramInt2));
        if ((paramString2 == null) || (paramString2.contains(Integer.valueOf(paramInt3))))
        {
          paramInt1 = aft.c;
          break label59;
        }
      }
      label332:
      paramInt1 = aft.b;
      break label59;
      paramString1 = paramString1.d;
      continue;
      paramString1 = paramString1.f;
      continue;
      paramString1 = paramString1.e;
    }
  }
  
  public afs(int paramInt, String paramString1, String paramString2)
  {
    this(-1, paramInt, -1, paramString1, paramString2, null, null, false, null, null, null, null, null);
  }
  
  afs(HttpURLConnection paramHttpURLConnection, Exception paramException) {}
  
  static afs a(JSONObject paramJSONObject, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    for (;;)
    {
      try
      {
        if (!paramJSONObject.has("code")) {
          continue;
        }
        m = paramJSONObject.getInt("code");
        localObject1 = aji.a(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
        if ((localObject1 == null) || (!(localObject1 instanceof JSONObject))) {
          continue;
        }
        localJSONObject = (JSONObject)localObject1;
        localObject1 = null;
        str = null;
        localObject5 = null;
        localObject4 = null;
        bool2 = false;
        j = 0;
        k = 0;
        i = 0;
        if (!localJSONObject.has("error")) {
          continue;
        }
        localObject4 = (JSONObject)aji.a(localJSONObject, "error", null);
        localObject1 = ((JSONObject)localObject4).optString("type", null);
        str = ((JSONObject)localObject4).optString("message", null);
        j = ((JSONObject)localObject4).optInt("code", -1);
        k = ((JSONObject)localObject4).optInt("error_subcode", -1);
        localObject2 = ((JSONObject)localObject4).optString("error_user_msg", null);
        localObject3 = ((JSONObject)localObject4).optString("error_user_title", null);
        bool1 = ((JSONObject)localObject4).optBoolean("is_transient", false);
        i = 1;
        if (i == 0) {
          continue;
        }
        localObject4 = new afs;
        ((afs)localObject4).<init>(m, j, k, (String)localObject1, str, (String)localObject3, (String)localObject2, bool1, localJSONObject, paramJSONObject, paramObject, paramHttpURLConnection, null);
        paramJSONObject = (JSONObject)localObject4;
      }
      catch (JSONException paramJSONObject)
      {
        int m;
        JSONObject localJSONObject;
        String str;
        Object localObject5;
        Object localObject4;
        boolean bool2;
        int j;
        int k;
        Object localObject2;
        Object localObject3;
        boolean bool1;
        paramJSONObject = null;
        continue;
        int i = 0;
        continue;
        Object localObject1 = null;
        continue;
      }
      return paramJSONObject;
      if ((!localJSONObject.has("error_code")) && (!localJSONObject.has("error_msg")))
      {
        localObject3 = localObject4;
        localObject2 = localObject5;
        bool1 = bool2;
        if (!localJSONObject.has("error_reason")) {}
      }
      else
      {
        localObject1 = localJSONObject.optString("error_reason", null);
        str = localJSONObject.optString("error_msg", null);
        j = localJSONObject.optInt("error_code", -1);
        k = localJSONObject.optInt("error_subcode", -1);
        i = 1;
        localObject3 = localObject4;
        localObject2 = localObject5;
        bool1 = bool2;
        continue;
        localObject1 = e;
        if ((((afu)localObject1).a > m) || (m > ((afu)localObject1).b)) {
          continue;
        }
        i = 1;
        if (i != 0) {
          continue;
        }
        if (!paramJSONObject.has("body")) {
          continue;
        }
        localObject1 = (JSONObject)aji.a(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
        paramJSONObject = new afs(m, -1, -1, null, null, null, null, false, (JSONObject)localObject1, paramJSONObject, paramObject, paramHttpURLConnection, null);
      }
    }
  }
  
  /* Error */
  private static aiq b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 169	afv:h	()Ljava/lang/String;
    //   6: invokestatic 172	aji:c	(Ljava/lang/String;)Lajn;
    //   9: astore_0
    //   10: aload_0
    //   11: ifnonnull +12 -> 23
    //   14: invokestatic 174	aiq:a	()Laiq;
    //   17: astore_0
    //   18: ldc 2
    //   20: monitorexit
    //   21: aload_0
    //   22: areturn
    //   23: aload_0
    //   24: getfield 179	ajn:b	Laiq;
    //   27: astore_0
    //   28: goto -10 -> 18
    //   31: astore_0
    //   32: ldc 2
    //   34: monitorexit
    //   35: aload_0
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   9	19	0	localObject1	Object
    //   31	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   3	10	31	finally
    //   14	18	31	finally
    //   23	28	31	finally
  }
  
  public final String a()
  {
    if (this.g != null) {}
    for (String str = this.g;; str = this.d.getLocalizedMessage()) {
      return str;
    }
  }
  
  public final String toString()
  {
    return "{HttpStatus: " + this.a + ", errorCode: " + this.b + ", errorType: " + this.c + ", errorMessage: " + a() + "}";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */