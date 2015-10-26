import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class aqj
  extends apk
  implements btd, bwn
{
  static String c;
  private static final blp d = new blp("BackdropCastConnection");
  private static String h;
  public final aow b;
  private final Context e;
  private final atf f;
  private final btl g;
  
  public aqj(aow paramaow, Context paramContext, atf paramatf)
  {
    super(paramaow.b, paramContext);
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      h = localJSONObject.put("requestId", "0").put("type", "GET_STATUS").toString();
    }
    catch (JSONException localJSONException1)
    {
      try
      {
        for (;;)
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          c = localJSONObject.put("requestId", "0").put("type", "SETTINGS_UPDATED").toString();
          this.b = paramaow;
          this.e = paramContext;
          this.f = paramatf;
          aqi.a();
          this.g = new btl();
          return;
          localJSONException1 = localJSONException1;
          d.a("Could not create JSON status request message: %s", new Object[] { localJSONException1.getMessage() });
        }
      }
      catch (JSONException localJSONException2)
      {
        for (;;)
        {
          d.a("Could not create JSON refresh message: %s", new Object[] { localJSONException2.getMessage() });
        }
      }
    }
  }
  
  private void i()
  {
    Object localObject = a();
    String str;
    if (localObject == null)
    {
      str = "";
      if (localObject != null) {
        break label48;
      }
      localObject = "";
      label19:
      if ((!TextUtils.isEmpty(str)) || (!this.b.c.h)) {
        break label56;
      }
    }
    for (;;)
    {
      return;
      str = ((ApplicationMetadata)localObject).b;
      break;
      label48:
      localObject = ((ApplicationMetadata)localObject).c;
      break label19;
      label56:
      if (!TextUtils.equals(str, this.b.o))
      {
        this.b.g();
        aqi.a();
        this.b.b(str, (String)localObject);
      }
    }
  }
  
  private void j()
  {
    a("urn:x-cast:com.google.cast.sse", this);
    if (h != null)
    {
      aqi.a();
      this.b.g();
      a("urn:x-cast:com.google.cast.sse", h, null);
    }
  }
  
  public final void a(double paramDouble)
  {
    a(new aqr(this, paramDouble));
  }
  
  public final void a(ApplicationMetadata paramApplicationMetadata)
  {
    if (paramApplicationMetadata == null)
    {
      paramApplicationMetadata = null;
      this.b.g();
      String str = this.b.o;
      if (!TextUtils.equals(paramApplicationMetadata, this.b.o))
      {
        if (paramApplicationMetadata == null) {
          break label67;
        }
        i();
        this.b.g();
        super.a(paramApplicationMetadata, this);
      }
    }
    for (;;)
    {
      return;
      paramApplicationMetadata = paramApplicationMetadata.b;
      break;
      label67:
      if (!this.b.c.h) {
        i();
      }
    }
  }
  
  /* Error */
  public final void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 73	aqj:b	Laow;
    //   4: invokevirtual 142	aow:g	()Ljava/lang/String;
    //   7: pop
    //   8: aload_0
    //   9: getfield 77	aqj:f	Latf;
    //   12: ifnonnull +4 -> 16
    //   15: return
    //   16: new 187	org/json/JSONTokener
    //   19: astore_3
    //   20: aload_3
    //   21: aload_2
    //   22: invokespecial 188	org/json/JSONTokener:<init>	(Ljava/lang/String;)V
    //   25: aload_3
    //   26: invokevirtual 192	org/json/JSONTokener:nextValue	()Ljava/lang/Object;
    //   29: checkcast 47	org/json/JSONObject
    //   32: astore 4
    //   34: aload 4
    //   36: ldc -62
    //   38: invokevirtual 198	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   41: astore_2
    //   42: new 200	org/json/JSONArray
    //   45: astore_3
    //   46: aload_3
    //   47: aload 4
    //   49: ldc -54
    //   51: invokevirtual 198	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   54: invokespecial 203	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   57: aload_0
    //   58: getfield 73	aqj:b	Laow;
    //   61: invokevirtual 142	aow:g	()Ljava/lang/String;
    //   64: pop
    //   65: aload_3
    //   66: invokevirtual 207	org/json/JSONArray:length	()I
    //   69: ifle +93 -> 162
    //   72: new 209	java/util/ArrayList
    //   75: astore 4
    //   77: aload 4
    //   79: aload_3
    //   80: invokevirtual 207	org/json/JSONArray:length	()I
    //   83: invokespecial 212	java/util/ArrayList:<init>	(I)V
    //   86: iconst_0
    //   87: istore 5
    //   89: iload 5
    //   91: aload_3
    //   92: invokevirtual 207	org/json/JSONArray:length	()I
    //   95: if_icmpge +47 -> 142
    //   98: aload 4
    //   100: aload_3
    //   101: iload 5
    //   103: invokevirtual 215	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   106: invokeinterface 221 2 0
    //   111: pop
    //   112: iinc 5 1
    //   115: goto -26 -> 89
    //   118: astore_2
    //   119: getstatic 33	aqj:d	Lblp;
    //   122: ldc -33
    //   124: iconst_1
    //   125: anewarray 92	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: aload_1
    //   131: aastore
    //   132: invokevirtual 98	blp:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: invokestatic 83	aqi:a	()Laqi;
    //   138: pop
    //   139: goto -124 -> 15
    //   142: aload_0
    //   143: getfield 73	aqj:b	Laow;
    //   146: aload 4
    //   148: invokestatic 229	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   151: invokevirtual 232	aow:a	(Ljava/util/List;)V
    //   154: aload_0
    //   155: getfield 73	aqj:b	Laow;
    //   158: invokevirtual 142	aow:g	()Ljava/lang/String;
    //   161: pop
    //   162: invokestatic 83	aqi:a	()Laqi;
    //   165: pop
    //   166: aload_0
    //   167: getfield 77	aqj:f	Latf;
    //   170: aload_2
    //   171: aload_0
    //   172: getfield 73	aqj:b	Laow;
    //   175: invokevirtual 237	atf:a	(Ljava/lang/String;Laow;)Laui;
    //   178: astore_1
    //   179: invokestatic 83	aqi:a	()Laqi;
    //   182: pop
    //   183: aload_0
    //   184: getfield 77	aqj:f	Latf;
    //   187: aload_1
    //   188: invokevirtual 240	atf:a	(Lads;)V
    //   191: aload_0
    //   192: getfield 73	aqj:b	Laow;
    //   195: invokevirtual 142	aow:g	()Ljava/lang/String;
    //   198: pop
    //   199: goto -184 -> 15
    //   202: astore_3
    //   203: getstatic 33	aqj:d	Lblp;
    //   206: ldc -14
    //   208: iconst_2
    //   209: anewarray 92	java/lang/Object
    //   212: dup
    //   213: iconst_0
    //   214: aload_1
    //   215: aastore
    //   216: dup
    //   217: iconst_1
    //   218: aload_0
    //   219: getfield 73	aqj:b	Laow;
    //   222: invokevirtual 142	aow:g	()Ljava/lang/String;
    //   225: aastore
    //   226: invokevirtual 98	blp:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: goto -67 -> 162
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	this	aqj
    //   0	232	1	paramString1	String
    //   0	232	2	paramString2	String
    //   19	82	3	localObject1	Object
    //   202	1	3	localJSONException	JSONException
    //   32	115	4	localObject2	Object
    //   87	26	5	i	int
    // Exception table:
    //   from	to	target	type
    //   16	42	118	org/json/JSONException
    //   42	86	202	org/json/JSONException
    //   89	112	202	org/json/JSONException
    //   142	162	202	org/json/JSONException
  }
  
  public final void a(boolean paramBoolean)
  {
    a(new aqp(this, paramBoolean));
  }
  
  public final void e()
  {
    a(new aqs(this));
  }
  
  public final void f()
  {
    ApplicationMetadata localApplicationMetadata = a();
    String str = this.b.o;
    if ("00000000-0000-0000-0000-000000000000".equals(str))
    {
      this.b.b(str, "");
      new Handler().postDelayed(new aqk(this), asr.a);
    }
    do
    {
      for (;;)
      {
        return;
        if (!"E8C28D3C".equals(str)) {
          break;
        }
        j();
      }
    } while (localApplicationMetadata == null);
    str = this.g.c();
    if ((localApplicationMetadata.e != null) && (localApplicationMetadata.e.contains(str))) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        a(new aqm(this));
      }
      a(new aql(this));
      break;
    }
  }
  
  public final void g()
  {
    b();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */