import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import org.xmlpull.v1.XmlPullParser;

public final class pm
  extends MenuInflater
{
  private static final Class[] a;
  private static final Class[] b;
  private final Object[] c;
  private final Object[] d;
  private Context e;
  private Object f;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    a = arrayOfClass;
    b = arrayOfClass;
  }
  
  public pm(Context paramContext)
  {
    super(paramContext);
    this.e = paramContext;
    this.c = new Object[] { paramContext };
    this.d = this.c;
  }
  
  private Object a(Object paramObject)
  {
    for (;;)
    {
      if ((paramObject instanceof Activity)) {}
      while (!(paramObject instanceof ContextWrapper)) {
        return paramObject;
      }
      paramObject = ((ContextWrapper)paramObject).getBaseContext();
    }
  }
  
  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    po localpo = new po(this, paramMenu);
    int i = paramXmlPullParser.getEventType();
    int j = 0;
    paramMenu = null;
    Object localObject;
    int k;
    if (i == 2)
    {
      localObject = paramXmlPullParser.getName();
      if (((String)localObject).equals("menu"))
      {
        k = paramXmlPullParser.next();
        label56:
        i = 0;
        label59:
        if (i != 0) {
          return;
        }
      }
    }
    switch (k)
    {
    default: 
    case 2: 
    case 3: 
      for (;;)
      {
        k = paramXmlPullParser.next();
        break label59;
        throw new RuntimeException("Expecting menu, got " + (String)localObject);
        k = paramXmlPullParser.next();
        i = k;
        if (k != 1) {
          break;
        }
        break label56;
        if (j == 0)
        {
          localObject = paramXmlPullParser.getName();
          if (((String)localObject).equals("group"))
          {
            localObject = localpo.z.e.obtainStyledAttributes(paramAttributeSet, oq.aq);
            localpo.b = ((TypedArray)localObject).getResourceId(oq.at, 0);
            localpo.c = ((TypedArray)localObject).getInt(oq.au, 0);
            localpo.d = ((TypedArray)localObject).getInt(oq.av, 0);
            localpo.e = ((TypedArray)localObject).getInt(oq.ar, 0);
            localpo.f = ((TypedArray)localObject).getBoolean(oq.aw, true);
            localpo.g = ((TypedArray)localObject).getBoolean(oq.as, true);
            ((TypedArray)localObject).recycle();
          }
          else
          {
            if (((String)localObject).equals("item"))
            {
              localObject = localpo.z.e.obtainStyledAttributes(paramAttributeSet, oq.ax);
              localpo.i = ((TypedArray)localObject).getResourceId(oq.aG, 0);
              localpo.j = (((TypedArray)localObject).getInt(oq.aH, localpo.c) & 0xFFFF0000 | ((TypedArray)localObject).getInt(oq.aK, localpo.d) & 0xFFFF);
              localpo.k = ((TypedArray)localObject).getText(oq.aL);
              localpo.l = ((TypedArray)localObject).getText(oq.aM);
              localpo.m = ((TypedArray)localObject).getResourceId(oq.aF, 0);
              localpo.n = po.a(((TypedArray)localObject).getString(oq.aB));
              localpo.o = po.a(((TypedArray)localObject).getString(oq.aI));
              if (((TypedArray)localObject).hasValue(oq.aC)) {
                if (((TypedArray)localObject).getBoolean(oq.aC, false))
                {
                  k = 1;
                  label458:
                  localpo.p = k;
                  label465:
                  localpo.q = ((TypedArray)localObject).getBoolean(oq.aD, false);
                  localpo.r = ((TypedArray)localObject).getBoolean(oq.aN, localpo.f);
                  localpo.s = ((TypedArray)localObject).getBoolean(oq.aE, localpo.g);
                  localpo.t = ((TypedArray)localObject).getInt(oq.aO, -1);
                  localpo.x = ((TypedArray)localObject).getString(oq.aJ);
                  localpo.u = ((TypedArray)localObject).getResourceId(oq.ay, 0);
                  localpo.v = ((TypedArray)localObject).getString(oq.aA);
                  localpo.w = ((TypedArray)localObject).getString(oq.az);
                  if (localpo.w == null) {
                    break label676;
                  }
                  k = 1;
                  label593:
                  if ((k == 0) || (localpo.u != 0) || (localpo.v != null)) {
                    break label682;
                  }
                }
              }
              for (localpo.y = ((fb)localpo.a(localpo.w, b, localpo.z.d));; localpo.y = null)
              {
                ((TypedArray)localObject).recycle();
                localpo.h = false;
                break;
                k = 0;
                break label458;
                localpo.p = localpo.e;
                break label465;
                label676:
                k = 0;
                break label593;
                label682:
                if (k != 0) {
                  Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
              }
            }
            if (((String)localObject).equals("menu"))
            {
              a(paramXmlPullParser, paramAttributeSet, localpo.b());
            }
            else
            {
              j = 1;
              paramMenu = (Menu)localObject;
              continue;
              localObject = paramXmlPullParser.getName();
              if ((j != 0) && (((String)localObject).equals(paramMenu)))
              {
                j = 0;
                paramMenu = null;
              }
              else if (((String)localObject).equals("group"))
              {
                localpo.a();
              }
              else if (((String)localObject).equals("item"))
              {
                if (!localpo.h) {
                  if ((localpo.y != null) && (localpo.y.f()))
                  {
                    localpo.b();
                  }
                  else
                  {
                    localpo.h = true;
                    localpo.a(localpo.a.add(localpo.b, localpo.i, localpo.j, localpo.k));
                  }
                }
              }
              else if (((String)localObject).equals("menu"))
              {
                i = 1;
              }
            }
          }
        }
      }
    }
    throw new RuntimeException("Unexpected end of document");
  }
  
  /* Error */
  public final void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 340
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 342	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 5
    //   19: aconst_null
    //   20: astore 4
    //   22: aload_0
    //   23: getfield 31	pm:e	Landroid/content/Context;
    //   26: invokevirtual 346	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   29: iload_1
    //   30: invokevirtual 352	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   33: astore 6
    //   35: aload 6
    //   37: astore 4
    //   39: aload 6
    //   41: astore_3
    //   42: aload 6
    //   44: astore 5
    //   46: aload_0
    //   47: aload 6
    //   49: aload 6
    //   51: invokestatic 358	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   54: aload_2
    //   55: invokespecial 306	pm:a	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   58: aload 6
    //   60: ifnull -47 -> 13
    //   63: aload 6
    //   65: invokeinterface 363 1 0
    //   70: goto -57 -> 13
    //   73: astore 5
    //   75: aload 4
    //   77: astore_3
    //   78: new 365	android/view/InflateException
    //   81: astore_2
    //   82: aload 4
    //   84: astore_3
    //   85: aload_2
    //   86: ldc_w 367
    //   89: aload 5
    //   91: invokespecial 370	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   94: aload 4
    //   96: astore_3
    //   97: aload_2
    //   98: athrow
    //   99: astore_2
    //   100: aload_3
    //   101: ifnull +9 -> 110
    //   104: aload_3
    //   105: invokeinterface 363 1 0
    //   110: aload_2
    //   111: athrow
    //   112: astore 4
    //   114: aload 5
    //   116: astore_3
    //   117: new 365	android/view/InflateException
    //   120: astore_2
    //   121: aload 5
    //   123: astore_3
    //   124: aload_2
    //   125: ldc_w 367
    //   128: aload 4
    //   130: invokespecial 370	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   133: aload 5
    //   135: astore_3
    //   136: aload_2
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	pm
    //   0	138	1	paramInt	int
    //   0	138	2	paramMenu	Menu
    //   15	121	3	localObject1	Object
    //   20	75	4	localObject2	Object
    //   112	17	4	localIOException	java.io.IOException
    //   17	28	5	localObject3	Object
    //   73	61	5	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   33	31	6	localXmlResourceParser	android.content.res.XmlResourceParser
    // Exception table:
    //   from	to	target	type
    //   22	35	73	org/xmlpull/v1/XmlPullParserException
    //   46	58	73	org/xmlpull/v1/XmlPullParserException
    //   22	35	99	finally
    //   46	58	99	finally
    //   78	82	99	finally
    //   85	94	99	finally
    //   97	99	99	finally
    //   117	121	99	finally
    //   124	133	99	finally
    //   136	138	99	finally
    //   22	35	112	java/io/IOException
    //   46	58	112	java/io/IOException
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */