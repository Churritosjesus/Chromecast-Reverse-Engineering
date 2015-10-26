import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class eh
{
  private final LinkedHashMap a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  
  public eh(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    this.c = paramInt;
    this.a = new LinkedHashMap(0, 0.75F, true);
  }
  
  private int c(Object paramObject1, Object paramObject2)
  {
    int i = b(paramObject1, paramObject2);
    if (i < 0) {
      throw new IllegalStateException("Negative size: " + paramObject1 + "=" + paramObject2);
    }
    return i;
  }
  
  /* Error */
  public final Object a(Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +13 -> 14
    //   4: new 63	java/lang/NullPointerException
    //   7: dup
    //   8: ldc 65
    //   10: invokespecial 66	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   13: athrow
    //   14: aload_0
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield 35	eh:a	Ljava/util/LinkedHashMap;
    //   20: aload_1
    //   21: invokevirtual 69	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   24: astore_1
    //   25: aload_1
    //   26: ifnull +17 -> 43
    //   29: aload_0
    //   30: aload_0
    //   31: getfield 71	eh:f	I
    //   34: iconst_1
    //   35: iadd
    //   36: putfield 71	eh:f	I
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: areturn
    //   43: aload_0
    //   44: aload_0
    //   45: getfield 73	eh:g	I
    //   48: iconst_1
    //   49: iadd
    //   50: putfield 73	eh:g	I
    //   53: aload_0
    //   54: monitorexit
    //   55: aconst_null
    //   56: astore_1
    //   57: goto -16 -> 41
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	eh
    //   0	65	1	paramObject	Object
    // Exception table:
    //   from	to	target	type
    //   16	25	60	finally
    //   29	41	60	finally
    //   43	55	60	finally
    //   61	63	60	finally
  }
  
  public final Object a(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null)) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      this.d += 1;
      this.b += c(paramObject1, paramObject2);
      paramObject2 = this.a.put(paramObject1, paramObject2);
      if (paramObject2 != null) {
        this.b -= c(paramObject1, paramObject2);
      }
      a(this.c);
      return paramObject2;
    }
    finally {}
  }
  
  public final void a()
  {
    a(-1);
  }
  
  public final void a(int paramInt)
  {
    for (;;)
    {
      try
      {
        if ((this.b < 0) || ((this.a.isEmpty()) && (this.b != 0)))
        {
          IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localIllegalStateException.<init>(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
          throw localIllegalStateException;
        }
      }
      finally {}
      if ((this.b <= paramInt) || (this.a.isEmpty())) {
        return;
      }
      Object localObject3 = (Map.Entry)this.a.entrySet().iterator().next();
      Object localObject2 = ((Map.Entry)localObject3).getKey();
      localObject3 = ((Map.Entry)localObject3).getValue();
      this.a.remove(localObject2);
      this.b -= c(localObject2, localObject3);
      this.e += 1;
    }
  }
  
  public final int b()
  {
    try
    {
      int i = this.c;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int b(Object paramObject1, Object paramObject2)
  {
    return 1;
  }
  
  public final String toString()
  {
    int i = 0;
    try
    {
      int j = this.f + this.g;
      if (j != 0) {
        i = this.f * 100 / j;
      }
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(i) });
      return str;
    }
    finally {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */