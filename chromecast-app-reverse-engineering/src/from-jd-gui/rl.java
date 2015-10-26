import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rl
  extends DataSetObservable
{
  private static final String g = rl.class.getSimpleName();
  private static final Object h = new Object();
  private static final Map i = new HashMap();
  final Object a = new Object();
  final List b = new ArrayList();
  final List c = new ArrayList();
  final String d;
  boolean e = false;
  boolean f = true;
  private final Context j;
  private rn k = new ro(this);
  private int l = 50;
  private boolean m = true;
  private boolean n = false;
  
  private rl(Context paramContext, String paramString)
  {
    this.j = paramContext.getApplicationContext();
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.endsWith(".xml"))) {}
    for (this.d = (paramString + ".xml");; this.d = paramString) {
      return;
    }
  }
  
  public static rl a(Context paramContext, String paramString)
  {
    synchronized (h)
    {
      rl localrl2 = (rl)i.get(paramString);
      rl localrl1 = localrl2;
      if (localrl2 == null)
      {
        localrl1 = new rl;
        localrl1.<init>(paramContext, paramString);
        i.put(paramString, localrl1);
      }
      return localrl1;
    }
  }
  
  /* Error */
  private void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 85	rl:j	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 111	rl:d	Ljava/lang/String;
    //   8: invokevirtual 137	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 143	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore 6
    //   17: aload 6
    //   19: aload_2
    //   20: aconst_null
    //   21: invokeinterface 149 3 0
    //   26: iconst_0
    //   27: istore 7
    //   29: iload 7
    //   31: iconst_1
    //   32: if_icmpeq +21 -> 53
    //   35: iload 7
    //   37: iconst_2
    //   38: if_icmpeq +15 -> 53
    //   41: aload 6
    //   43: invokeinterface 153 1 0
    //   48: istore 7
    //   50: goto -21 -> 29
    //   53: ldc -101
    //   55: aload 6
    //   57: invokeinterface 158 1 0
    //   62: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   65: ifne +61 -> 126
    //   68: new 131	org/xmlpull/v1/XmlPullParserException
    //   71: astore_3
    //   72: aload_3
    //   73: ldc -92
    //   75: invokespecial 167	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   78: aload_3
    //   79: athrow
    //   80: astore_3
    //   81: getstatic 36	rl:g	Ljava/lang/String;
    //   84: astore 5
    //   86: new 101	java/lang/StringBuilder
    //   89: astore 4
    //   91: aload 4
    //   93: ldc -87
    //   95: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   98: aload 5
    //   100: aload 4
    //   102: aload_0
    //   103: getfield 111	rl:d	Ljava/lang/String;
    //   106: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: aload_3
    //   113: invokestatic 175	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   116: pop
    //   117: aload_2
    //   118: ifnull +7 -> 125
    //   121: aload_2
    //   122: invokevirtual 180	java/io/FileInputStream:close	()V
    //   125: return
    //   126: aload_0
    //   127: getfield 60	rl:c	Ljava/util/List;
    //   130: astore 5
    //   132: aload 5
    //   134: invokeinterface 185 1 0
    //   139: aload 6
    //   141: invokeinterface 153 1 0
    //   146: istore 7
    //   148: iload 7
    //   150: iconst_1
    //   151: if_icmpeq +172 -> 323
    //   154: iload 7
    //   156: iconst_3
    //   157: if_icmpeq -18 -> 139
    //   160: iload 7
    //   162: iconst_4
    //   163: if_icmpeq -24 -> 139
    //   166: ldc -69
    //   168: aload 6
    //   170: invokeinterface 158 1 0
    //   175: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   178: ifne +67 -> 245
    //   181: new 131	org/xmlpull/v1/XmlPullParserException
    //   184: astore_3
    //   185: aload_3
    //   186: ldc -67
    //   188: invokespecial 167	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   191: aload_3
    //   192: athrow
    //   193: astore 5
    //   195: getstatic 36	rl:g	Ljava/lang/String;
    //   198: astore_3
    //   199: new 101	java/lang/StringBuilder
    //   202: astore 4
    //   204: aload 4
    //   206: ldc -87
    //   208: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   211: aload_3
    //   212: aload 4
    //   214: aload_0
    //   215: getfield 111	rl:d	Ljava/lang/String;
    //   218: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: aload 5
    //   226: invokestatic 175	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   229: pop
    //   230: aload_2
    //   231: ifnull -106 -> 125
    //   234: aload_2
    //   235: invokevirtual 180	java/io/FileInputStream:close	()V
    //   238: goto -113 -> 125
    //   241: astore_2
    //   242: goto -117 -> 125
    //   245: aload 6
    //   247: aconst_null
    //   248: ldc -65
    //   250: invokeinterface 195 3 0
    //   255: astore_3
    //   256: aload 6
    //   258: aconst_null
    //   259: ldc -59
    //   261: invokeinterface 195 3 0
    //   266: invokestatic 203	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   269: lstore 8
    //   271: aload 6
    //   273: aconst_null
    //   274: ldc -51
    //   276: invokeinterface 195 3 0
    //   281: invokestatic 211	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   284: fstore_1
    //   285: new 213	rp
    //   288: astore 4
    //   290: aload 4
    //   292: aload_3
    //   293: lload 8
    //   295: fload_1
    //   296: invokespecial 216	rp:<init>	(Ljava/lang/String;JF)V
    //   299: aload 5
    //   301: aload 4
    //   303: invokeinterface 219 2 0
    //   308: pop
    //   309: goto -170 -> 139
    //   312: astore_3
    //   313: aload_2
    //   314: ifnull +7 -> 321
    //   317: aload_2
    //   318: invokevirtual 180	java/io/FileInputStream:close	()V
    //   321: aload_3
    //   322: athrow
    //   323: aload_2
    //   324: ifnull -199 -> 125
    //   327: aload_2
    //   328: invokevirtual 180	java/io/FileInputStream:close	()V
    //   331: goto -206 -> 125
    //   334: astore_2
    //   335: goto -210 -> 125
    //   338: astore_2
    //   339: goto -214 -> 125
    //   342: astore_2
    //   343: goto -22 -> 321
    //   346: astore_2
    //   347: goto -222 -> 125
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	350	0	this	rl
    //   284	12	1	f1	float
    //   11	224	2	localFileInputStream	java.io.FileInputStream
    //   241	87	2	localIOException1	java.io.IOException
    //   334	1	2	localIOException2	java.io.IOException
    //   338	1	2	localIOException3	java.io.IOException
    //   342	1	2	localIOException4	java.io.IOException
    //   346	1	2	localFileNotFoundException	java.io.FileNotFoundException
    //   71	8	3	localXmlPullParserException1	org.xmlpull.v1.XmlPullParserException
    //   80	33	3	localXmlPullParserException2	org.xmlpull.v1.XmlPullParserException
    //   184	109	3	localObject1	Object
    //   312	10	3	localObject2	Object
    //   89	213	4	localObject3	Object
    //   84	49	5	localObject4	Object
    //   193	107	5	localIOException5	java.io.IOException
    //   15	257	6	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   27	137	7	i1	int
    //   269	25	8	l1	long
    // Exception table:
    //   from	to	target	type
    //   12	26	80	org/xmlpull/v1/XmlPullParserException
    //   41	50	80	org/xmlpull/v1/XmlPullParserException
    //   53	80	80	org/xmlpull/v1/XmlPullParserException
    //   126	139	80	org/xmlpull/v1/XmlPullParserException
    //   139	148	80	org/xmlpull/v1/XmlPullParserException
    //   166	193	80	org/xmlpull/v1/XmlPullParserException
    //   245	309	80	org/xmlpull/v1/XmlPullParserException
    //   12	26	193	java/io/IOException
    //   41	50	193	java/io/IOException
    //   53	80	193	java/io/IOException
    //   126	139	193	java/io/IOException
    //   139	148	193	java/io/IOException
    //   166	193	193	java/io/IOException
    //   245	309	193	java/io/IOException
    //   234	238	241	java/io/IOException
    //   12	26	312	finally
    //   41	50	312	finally
    //   53	80	312	finally
    //   81	117	312	finally
    //   126	139	312	finally
    //   139	148	312	finally
    //   166	193	312	finally
    //   195	230	312	finally
    //   245	309	312	finally
    //   327	331	334	java/io/IOException
    //   121	125	338	java/io/IOException
    //   317	321	342	java/io/IOException
    //   0	12	346	java/io/FileNotFoundException
  }
  
  public final int a()
  {
    synchronized (this.a)
    {
      d();
      int i1 = this.b.size();
      return i1;
    }
  }
  
  public final int a(ResolveInfo paramResolveInfo)
  {
    synchronized (this.a)
    {
      d();
      List localList = this.b;
      int i2 = localList.size();
      for (int i1 = 0; i1 < i2; i1++) {
        if (((rm)localList.get(i1)).a == paramResolveInfo) {
          return i1;
        }
      }
      i1 = -1;
    }
  }
  
  public final ResolveInfo a(int paramInt)
  {
    synchronized (this.a)
    {
      d();
      ResolveInfo localResolveInfo = ((rm)this.b.get(paramInt)).a;
      return localResolveInfo;
    }
  }
  
  public final Intent b(int paramInt)
  {
    synchronized (this.a)
    {
      return null;
    }
  }
  
  public final ResolveInfo b()
  {
    synchronized (this.a)
    {
      d();
      if (!this.b.isEmpty())
      {
        localResolveInfo = ((rm)this.b.get(0)).a;
        return localResolveInfo;
      }
      ResolveInfo localResolveInfo = null;
    }
  }
  
  public final int c()
  {
    synchronized (this.a)
    {
      d();
      int i1 = this.c.size();
      return i1;
    }
  }
  
  void d()
  {
    int i1 = 1;
    if ((this.m) && (this.f) && (!TextUtils.isEmpty(this.d)))
    {
      this.m = false;
      this.e = true;
      g();
    }
    for (;;)
    {
      e();
      if ((i1 | 0x0) != 0) {
        notifyChanged();
      }
      return;
      i1 = 0;
    }
  }
  
  void e()
  {
    int i2 = this.c.size() - this.l;
    if (i2 <= 0) {}
    for (;;)
    {
      return;
      this.f = true;
      for (int i1 = 0; i1 < i2; i1++) {
        this.c.remove(0);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */