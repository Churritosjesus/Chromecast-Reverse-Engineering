public final class aum
  extends att
{
  private final blp n = new blp("SaveDeviceBackdropSettingsRequest");
  private final aea o;
  private final String p;
  
  /* Error */
  public aum(String paramString1, String paramString2, dck paramdck, aea paramaea, adz paramadz)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 14
    //   3: invokestatic 20	asr:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6: astore 6
    //   8: new 22	dbu
    //   11: dup
    //   12: invokespecial 25	dbu:<init>	()V
    //   15: astore_1
    //   16: aload_1
    //   17: aload_2
    //   18: putfield 27	dbu:a	Ljava/lang/String;
    //   21: aload_1
    //   22: aload_3
    //   23: putfield 31	dbu:b	Ldck;
    //   26: aload_1
    //   27: invokevirtual 35	dbu:d	()I
    //   30: newarray <illegal type>
    //   32: astore_3
    //   33: aload_1
    //   34: aload_3
    //   35: iconst_0
    //   36: aload_3
    //   37: arraylength
    //   38: invokestatic 40	dep:a	([BII)Ldep;
    //   41: invokevirtual 43	dbu:a	(Ldep;)V
    //   44: aload_0
    //   45: ldc 45
    //   47: aload 6
    //   49: aload_3
    //   50: aload 5
    //   52: invokespecial 48	att:<init>	(Ljava/lang/String;Ljava/lang/String;[BLadz;)V
    //   55: aload_0
    //   56: new 50	blp
    //   59: dup
    //   60: ldc 45
    //   62: invokespecial 53	blp:<init>	(Ljava/lang/String;)V
    //   65: putfield 55	aum:n	Lblp;
    //   68: aload_0
    //   69: invokestatic 60	com/google/android/apps/chromecast/app/SetupApplication:a	()Lcom/google/android/apps/chromecast/app/SetupApplication;
    //   72: invokestatic 63	asr:a	(Landroid/content/Context;)Laec;
    //   75: putfield 69	ads:i	Laec;
    //   78: aload_0
    //   79: aload_2
    //   80: putfield 71	aum:p	Ljava/lang/String;
    //   83: aload_0
    //   84: aload 4
    //   86: putfield 73	aum:o	Laea;
    //   89: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	aum
    //   0	90	1	paramString1	String
    //   0	90	2	paramString2	String
    //   0	90	3	paramdck	dck
    //   0	90	4	paramaea	aea
    //   0	90	5	paramadz	adz
    //   6	42	6	str	String
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */