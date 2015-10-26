public final class aup
  extends att
{
  private final aea n;
  private final String o;
  
  /* Error */
  public aup(String paramString1, String paramString2, String paramString3, aea paramaea, adz paramadz)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 12
    //   3: invokestatic 18	asr:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6: astore_1
    //   7: new 20	dcl
    //   10: dup
    //   11: invokespecial 23	dcl:<init>	()V
    //   14: astore 6
    //   16: aload 6
    //   18: aload_3
    //   19: putfield 26	dcl:e	Ljava/lang/String;
    //   22: aload 6
    //   24: iconst_1
    //   25: invokestatic 32	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   28: putfield 36	dcl:c	Ljava/lang/Boolean;
    //   31: aload_0
    //   32: ldc 38
    //   34: aload_1
    //   35: aload 6
    //   37: invokestatic 41	dcl:a	(Ldew;)[B
    //   40: aload 5
    //   42: invokespecial 44	att:<init>	(Ljava/lang/String;Ljava/lang/String;[BLadz;)V
    //   45: aload_0
    //   46: aload_2
    //   47: putfield 46	aup:o	Ljava/lang/String;
    //   50: aload_0
    //   51: aload 4
    //   53: putfield 48	aup:n	Laea;
    //   56: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	aup
    //   0	57	1	paramString1	String
    //   0	57	2	paramString2	String
    //   0	57	3	paramString3	String
    //   0	57	4	paramaea	aea
    //   0	57	5	paramadz	adz
    //   14	22	6	localdcl	dcl
  }
  
  public final String g()
  {
    return "oauth2:https://www.google.com/accounts/OAuthLogin";
  }
  
  public final String h()
  {
    return this.o;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */