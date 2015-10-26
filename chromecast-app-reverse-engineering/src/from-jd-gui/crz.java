import java.util.regex.Pattern;

public final class crz
{
  public static final crz a = new crz();
  private Pattern[] b = new Pattern[0];
  private String[] c = new String[0];
  
  /* Error */
  public final String a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 34	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifeq +9 -> 19
    //   13: aconst_null
    //   14: astore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_2
    //   18: areturn
    //   19: iconst_0
    //   20: istore_3
    //   21: aload_1
    //   22: astore_2
    //   23: iload_3
    //   24: aload_0
    //   25: getfield 23	crz:b	[Ljava/util/regex/Pattern;
    //   28: arraylength
    //   29: if_icmpge -14 -> 15
    //   32: aload_0
    //   33: getfield 23	crz:b	[Ljava/util/regex/Pattern;
    //   36: iload_3
    //   37: aaload
    //   38: aload_1
    //   39: invokevirtual 38	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   42: aload_0
    //   43: getfield 27	crz:c	[Ljava/lang/String;
    //   46: iload_3
    //   47: aaload
    //   48: invokevirtual 43	java/util/regex/Matcher:replaceAll	(Ljava/lang/String;)Ljava/lang/String;
    //   51: astore_1
    //   52: iinc 3 1
    //   55: goto -34 -> 21
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	crz
    //   0	63	1	paramString	String
    //   14	9	2	str	String
    //   20	33	3	i	int
    //   6	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	8	58	finally
    //   23	52	58	finally
  }
  
  public final void a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    int i = 0;
    try
    {
      if (paramArrayOfString1.length == paramArrayOfString2.length) {}
      for (boolean bool = true;; bool = false)
      {
        a.b(bool);
        this.b = new Pattern[paramArrayOfString1.length];
        this.c = paramArrayOfString2;
        while (i < paramArrayOfString1.length)
        {
          this.b[i] = Pattern.compile(paramArrayOfString1[i]);
          i++;
        }
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\crz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */