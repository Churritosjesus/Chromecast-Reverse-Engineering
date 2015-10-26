import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

public final class ot
{
  private static Class[] a = { Context.class, AttributeSet.class };
  private static final Map b = new ed();
  private final Object[] c = new Object[2];
  
  public static Context a(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, oq.cw, 0, 0);
    if (paramBoolean1) {}
    for (int i = paramAttributeSet.getResourceId(oq.cx, 0);; i = 0)
    {
      if ((paramBoolean2) && (i == 0)) {
        i = paramAttributeSet.getResourceId(oq.cy, 0);
      }
      for (;;)
      {
        paramAttributeSet.recycle();
        paramAttributeSet = paramContext;
        if (i != 0) {
          if ((paramContext instanceof pi))
          {
            paramAttributeSet = paramContext;
            if (((pi)paramContext).a == i) {}
          }
          else
          {
            paramAttributeSet = new pi(paramContext, i);
          }
        }
        return paramAttributeSet;
      }
    }
  }
  
  private View a(Context paramContext, String paramString1, String paramString2)
  {
    Constructor localConstructor = (Constructor)b.get(paramString1);
    Object localObject = localConstructor;
    if (localConstructor == null) {}
    for (;;)
    {
      try
      {
        localObject = paramContext.getClassLoader();
        if (paramString2 == null) {
          continue;
        }
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext = paramString2 + paramString1;
        localObject = ((ClassLoader)localObject).loadClass(paramContext).asSubclass(View.class).getConstructor(a);
        b.put(paramString1, localObject);
        ((Constructor)localObject).setAccessible(true);
        paramContext = (View)((Constructor)localObject).newInstance(this.c);
      }
      catch (Exception paramContext)
      {
        paramContext = null;
        continue;
      }
      return paramContext;
      paramContext = paramString1;
    }
  }
  
  /* Error */
  public View a(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: aload_2
    //   1: astore 4
    //   3: aload_2
    //   4: ldc 122
    //   6: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   9: ifeq +14 -> 23
    //   12: aload_3
    //   13: aconst_null
    //   14: ldc -126
    //   16: invokeinterface 134 3 0
    //   21: astore 4
    //   23: aload_0
    //   24: getfield 31	ot:c	[Ljava/lang/Object;
    //   27: iconst_0
    //   28: aload_1
    //   29: aastore
    //   30: aload_0
    //   31: getfield 31	ot:c	[Ljava/lang/Object;
    //   34: iconst_1
    //   35: aload_3
    //   36: aastore
    //   37: iconst_m1
    //   38: aload 4
    //   40: bipush 46
    //   42: invokevirtual 138	java/lang/String:indexOf	(I)I
    //   45: if_icmpne +29 -> 74
    //   48: aload_0
    //   49: aload_1
    //   50: aload 4
    //   52: ldc -116
    //   54: invokespecial 142	ot:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   57: astore_1
    //   58: aload_0
    //   59: getfield 31	ot:c	[Ljava/lang/Object;
    //   62: iconst_0
    //   63: aconst_null
    //   64: aastore
    //   65: aload_0
    //   66: getfield 31	ot:c	[Ljava/lang/Object;
    //   69: iconst_1
    //   70: aconst_null
    //   71: aastore
    //   72: aload_1
    //   73: areturn
    //   74: aload_0
    //   75: aload_1
    //   76: aload 4
    //   78: aconst_null
    //   79: invokespecial 142	ot:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    //   82: astore_1
    //   83: aload_0
    //   84: getfield 31	ot:c	[Ljava/lang/Object;
    //   87: iconst_0
    //   88: aconst_null
    //   89: aastore
    //   90: aload_0
    //   91: getfield 31	ot:c	[Ljava/lang/Object;
    //   94: iconst_1
    //   95: aconst_null
    //   96: aastore
    //   97: goto -25 -> 72
    //   100: astore_1
    //   101: aload_0
    //   102: getfield 31	ot:c	[Ljava/lang/Object;
    //   105: iconst_0
    //   106: aconst_null
    //   107: aastore
    //   108: aload_0
    //   109: getfield 31	ot:c	[Ljava/lang/Object;
    //   112: iconst_1
    //   113: aconst_null
    //   114: aastore
    //   115: aconst_null
    //   116: astore_1
    //   117: goto -45 -> 72
    //   120: astore_1
    //   121: aload_0
    //   122: getfield 31	ot:c	[Ljava/lang/Object;
    //   125: iconst_0
    //   126: aconst_null
    //   127: aastore
    //   128: aload_0
    //   129: getfield 31	ot:c	[Ljava/lang/Object;
    //   132: iconst_1
    //   133: aconst_null
    //   134: aastore
    //   135: aload_1
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	ot
    //   0	137	1	paramContext	Context
    //   0	137	2	paramString	String
    //   0	137	3	paramAttributeSet	AttributeSet
    //   1	76	4	str	String
    // Exception table:
    //   from	to	target	type
    //   23	58	100	java/lang/Exception
    //   74	83	100	java/lang/Exception
    //   23	58	120	finally
    //   74	83	120	finally
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */