import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

final class pn
  implements MenuItem.OnMenuItemClickListener
{
  private static final Class[] a = { MenuItem.class };
  private Object b;
  private Method c;
  
  public pn(Object paramObject, String paramString)
  {
    this.b = paramObject;
    Class localClass = paramObject.getClass();
    try
    {
      this.c = localClass.getMethod(paramString, a);
      return;
    }
    catch (Exception paramObject)
    {
      paramString = new InflateException("Couldn't resolve menu item onClick handler " + paramString + " in class " + localClass.getName());
      paramString.initCause((Throwable)paramObject);
      throw paramString;
    }
  }
  
  /* Error */
  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 39	pn:c	Ljava/lang/reflect/Method;
    //   6: invokevirtual 73	java/lang/reflect/Method:getReturnType	()Ljava/lang/Class;
    //   9: getstatic 79	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   12: if_acmpne +31 -> 43
    //   15: aload_0
    //   16: getfield 39	pn:c	Ljava/lang/reflect/Method;
    //   19: aload_0
    //   20: getfield 29	pn:b	Ljava/lang/Object;
    //   23: iconst_1
    //   24: anewarray 4	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_1
    //   30: aastore
    //   31: invokevirtual 83	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   34: checkcast 75	java/lang/Boolean
    //   37: invokevirtual 87	java/lang/Boolean:booleanValue	()Z
    //   40: istore_2
    //   41: iload_2
    //   42: ireturn
    //   43: aload_0
    //   44: getfield 39	pn:c	Ljava/lang/reflect/Method;
    //   47: aload_0
    //   48: getfield 29	pn:b	Ljava/lang/Object;
    //   51: iconst_1
    //   52: anewarray 4	java/lang/Object
    //   55: dup
    //   56: iconst_0
    //   57: aload_1
    //   58: aastore
    //   59: invokevirtual 83	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: goto -22 -> 41
    //   66: astore_1
    //   67: new 89	java/lang/RuntimeException
    //   70: dup
    //   71: aload_1
    //   72: invokespecial 92	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	pn
    //   0	76	1	paramMenuItem	MenuItem
    //   1	41	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	41	66	java/lang/Exception
    //   43	63	66	java/lang/Exception
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */