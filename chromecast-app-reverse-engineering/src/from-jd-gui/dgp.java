import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;

final class dgp
  extends dgn
{
  private final Method a;
  private final Method b;
  private final Method c;
  private final Class d;
  private final Class e;
  
  public dgp(Method paramMethod1, Method paramMethod2, Method paramMethod3, Class paramClass1, Class paramClass2)
  {
    this.a = paramMethod1;
    this.b = paramMethod2;
    this.c = paramMethod3;
    this.d = paramClass1;
    this.e = paramClass2;
  }
  
  public final void a(SSLSocket paramSSLSocket)
  {
    try
    {
      this.c.invoke(null, new Object[] { paramSSLSocket });
      return;
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new AssertionError();
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      for (;;) {}
    }
  }
  
  public final void a(SSLSocket paramSSLSocket, String paramString, List paramList)
  {
    paramString = new ArrayList(paramList.size());
    int j = paramList.size();
    Object localObject;
    for (int i = 0; i < j; i++)
    {
      localObject = (dfx)paramList.get(i);
      if (localObject != dfx.a) {
        paramString.add(((dfx)localObject).toString());
      }
    }
    try
    {
      ClassLoader localClassLoader = dgn.class.getClassLoader();
      localObject = this.d;
      Class localClass = this.e;
      paramList = new dgq;
      paramList.<init>(paramString);
      paramString = Proxy.newProxyInstance(localClassLoader, new Class[] { localObject, localClass }, paramList);
      this.a.invoke(null, new Object[] { paramSSLSocket, paramString });
      return;
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new AssertionError(paramSSLSocket);
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final String b(SSLSocket paramSSLSocket)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	dgp:b	Ljava/lang/reflect/Method;
    //   4: aconst_null
    //   5: iconst_1
    //   6: anewarray 34	java/lang/Object
    //   9: dup
    //   10: iconst_0
    //   11: aload_1
    //   12: aastore
    //   13: invokevirtual 40	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   16: invokestatic 97	java/lang/reflect/Proxy:getInvocationHandler	(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
    //   19: checkcast 80	dgq
    //   22: astore_1
    //   23: aload_1
    //   24: invokestatic 100	dgq:a	(Ldgq;)Z
    //   27: ifne +25 -> 52
    //   30: aload_1
    //   31: invokestatic 103	dgq:b	(Ldgq;)Ljava/lang/String;
    //   34: ifnonnull +18 -> 52
    //   37: getstatic 108	dgi:a	Ljava/util/logging/Logger;
    //   40: getstatic 114	java/util/logging/Level:INFO	Ljava/util/logging/Level;
    //   43: ldc 116
    //   45: invokevirtual 122	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   48: aconst_null
    //   49: astore_1
    //   50: aload_1
    //   51: areturn
    //   52: aload_1
    //   53: invokestatic 100	dgq:a	(Ldgq;)Z
    //   56: ifeq +8 -> 64
    //   59: aconst_null
    //   60: astore_1
    //   61: goto -11 -> 50
    //   64: aload_1
    //   65: invokestatic 103	dgq:b	(Ldgq;)Ljava/lang/String;
    //   68: astore_1
    //   69: goto -19 -> 50
    //   72: astore_1
    //   73: new 42	java/lang/AssertionError
    //   76: dup
    //   77: invokespecial 43	java/lang/AssertionError:<init>	()V
    //   80: athrow
    //   81: astore_1
    //   82: goto -9 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	dgp
    //   0	85	1	paramSSLSocket	SSLSocket
    // Exception table:
    //   from	to	target	type
    //   0	48	72	java/lang/IllegalAccessException
    //   52	59	72	java/lang/IllegalAccessException
    //   64	69	72	java/lang/IllegalAccessException
    //   0	48	81	java/lang/reflect/InvocationTargetException
    //   52	59	81	java/lang/reflect/InvocationTargetException
    //   64	69	81	java/lang/reflect/InvocationTargetException
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */