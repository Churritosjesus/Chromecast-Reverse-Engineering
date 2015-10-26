import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

public final class aik
  implements afm
{
  private static Map b = new HashMap();
  public Map a = new HashMap();
  
  private static ail a(Integer paramInteger)
  {
    try
    {
      paramInteger = (ail)b.get(paramInteger);
      return paramInteger;
    }
    finally
    {
      paramInteger = finally;
      throw paramInteger;
    }
  }
  
  /* Error */
  public static void a(int paramInt, ail paramail)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_1
    //   4: ldc 34
    //   6: invokestatic 39	ajp:a	(Ljava/lang/Object;Ljava/lang/String;)V
    //   9: getstatic 18	aik:b	Ljava/util/Map;
    //   12: iload_0
    //   13: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   16: invokeinterface 49 2 0
    //   21: istore_2
    //   22: iload_2
    //   23: ifeq +7 -> 30
    //   26: ldc 2
    //   28: monitorexit
    //   29: return
    //   30: getstatic 18	aik:b	Ljava/util/Map;
    //   33: iload_0
    //   34: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   37: aload_1
    //   38: invokeinterface 53 3 0
    //   43: pop
    //   44: goto -18 -> 26
    //   47: astore_1
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	paramInt	int
    //   0	53	1	paramail	ail
    //   21	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	22	47	finally
    //   30	44	47	finally
  }
  
  public final boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    ail localail = (ail)this.a.get(Integer.valueOf(paramInt1));
    boolean bool;
    if (localail != null) {
      bool = localail.a(paramInt2, paramIntent);
    }
    for (;;)
    {
      return bool;
      localail = a(Integer.valueOf(paramInt1));
      if (localail != null) {
        bool = localail.a(paramInt2, paramIntent);
      } else {
        bool = false;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */