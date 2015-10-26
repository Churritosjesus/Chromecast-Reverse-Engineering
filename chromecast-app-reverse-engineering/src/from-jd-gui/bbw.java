public final class bbw
  extends att
{
  private final blp n = new blp("OAuthCallbackRequest");
  private final aea o;
  private final String p;
  
  /* Error */
  public bbw(String paramString1, String paramString2, dcm paramdcm, String paramString3, aea paramaea, adz paramadz)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 14
    //   3: invokestatic 20	asr:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6: astore_1
    //   7: new 22	dcl
    //   10: dup
    //   11: invokespecial 25	dcl:<init>	()V
    //   14: astore 7
    //   16: aload 7
    //   18: aload 4
    //   20: putfield 28	dcl:e	Ljava/lang/String;
    //   23: aload 7
    //   25: iconst_1
    //   26: invokestatic 34	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   29: putfield 38	dcl:c	Ljava/lang/Boolean;
    //   32: aload 7
    //   34: aload_3
    //   35: putfield 42	dcl:d	Ldcm;
    //   38: aload_0
    //   39: ldc 44
    //   41: aload_1
    //   42: aload 7
    //   44: invokestatic 47	dcl:a	(Ldew;)[B
    //   47: aload 6
    //   49: invokespecial 50	att:<init>	(Ljava/lang/String;Ljava/lang/String;[BLadz;)V
    //   52: aload_0
    //   53: new 52	blp
    //   56: dup
    //   57: ldc 44
    //   59: invokespecial 55	blp:<init>	(Ljava/lang/String;)V
    //   62: putfield 57	bbw:n	Lblp;
    //   65: aload_0
    //   66: aload_2
    //   67: putfield 59	bbw:p	Ljava/lang/String;
    //   70: aload_0
    //   71: aload 5
    //   73: putfield 61	bbw:o	Laea;
    //   76: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	bbw
    //   0	77	1	paramString1	String
    //   0	77	2	paramString2	String
    //   0	77	3	paramdcm	dcm
    //   0	77	4	paramString3	String
    //   0	77	5	paramaea	aea
    //   0	77	6	paramadz	adz
    //   14	29	7	localdcl	dcl
  }
  
  /* Error */
  public bbw(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, aea paramaea, adz paramadz)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 14
    //   3: invokestatic 20	asr:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6: astore_1
    //   7: new 22	dcl
    //   10: dup
    //   11: invokespecial 25	dcl:<init>	()V
    //   14: astore 8
    //   16: aload 8
    //   18: aload_3
    //   19: putfield 65	dcl:a	Ljava/lang/String;
    //   22: aload 8
    //   24: aload 4
    //   26: putfield 68	dcl:b	Ljava/lang/String;
    //   29: aload 8
    //   31: aload 5
    //   33: putfield 28	dcl:e	Ljava/lang/String;
    //   36: aload 8
    //   38: iconst_1
    //   39: invokestatic 34	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   42: putfield 38	dcl:c	Ljava/lang/Boolean;
    //   45: aload_0
    //   46: ldc 44
    //   48: aload_1
    //   49: aload 8
    //   51: invokestatic 47	dcl:a	(Ldew;)[B
    //   54: aload 7
    //   56: invokespecial 50	att:<init>	(Ljava/lang/String;Ljava/lang/String;[BLadz;)V
    //   59: aload_0
    //   60: new 52	blp
    //   63: dup
    //   64: ldc 44
    //   66: invokespecial 55	blp:<init>	(Ljava/lang/String;)V
    //   69: putfield 57	bbw:n	Lblp;
    //   72: aload_0
    //   73: invokestatic 73	com/google/android/apps/chromecast/app/SetupApplication:a	()Lcom/google/android/apps/chromecast/app/SetupApplication;
    //   76: invokestatic 76	asr:a	(Landroid/content/Context;)Laec;
    //   79: putfield 82	ads:i	Laec;
    //   82: aload_0
    //   83: aload_2
    //   84: putfield 59	bbw:p	Ljava/lang/String;
    //   87: aload_0
    //   88: aload 6
    //   90: putfield 61	bbw:o	Laea;
    //   93: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	bbw
    //   0	94	1	paramString1	String
    //   0	94	2	paramString2	String
    //   0	94	3	paramString3	String
    //   0	94	4	paramString4	String
    //   0	94	5	paramString5	String
    //   0	94	6	paramaea	aea
    //   0	94	7	paramadz	adz
    //   14	36	8	localdcl	dcl
  }
  
  public final String g()
  {
    return "oauth2:https://www.google.com/accounts/OAuthLogin";
  }
  
  public final String h()
  {
    return this.p;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */