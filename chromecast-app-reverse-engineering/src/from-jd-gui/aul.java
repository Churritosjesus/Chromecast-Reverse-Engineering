public final class aul
  extends att
{
  private final blp n = new blp("LoadPreviewRequest");
  private final aea o;
  private final String p;
  
  /* Error */
  public aul(String paramString1, String paramString2, String paramString3, dca paramdca, String paramString4, int paramInt1, int paramInt2, int paramInt3, aea paramaea, adz paramadz)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 14
    //   3: invokestatic 20	asr:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   6: astore 11
    //   8: new 22	dcc
    //   11: dup
    //   12: invokespecial 25	dcc:<init>	()V
    //   15: astore_1
    //   16: aload_1
    //   17: aload_3
    //   18: putfield 27	dcc:a	Ljava/lang/String;
    //   21: aload_1
    //   22: aload 4
    //   24: putfield 31	dcc:b	Ldca;
    //   27: aload_1
    //   28: aload 5
    //   30: putfield 34	dcc:c	Ljava/lang/String;
    //   33: aload_1
    //   34: iload 6
    //   36: invokestatic 40	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   39: putfield 44	dcc:d	Ljava/lang/Integer;
    //   42: aload_1
    //   43: iload 7
    //   45: invokestatic 40	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   48: putfield 47	dcc:e	Ljava/lang/Integer;
    //   51: aload_1
    //   52: iload 8
    //   54: invokestatic 40	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   57: putfield 50	dcc:f	Ljava/lang/Integer;
    //   60: aload_0
    //   61: ldc 52
    //   63: aload 11
    //   65: aload_1
    //   66: invokestatic 55	dcc:a	(Ldew;)[B
    //   69: aload 10
    //   71: invokespecial 58	att:<init>	(Ljava/lang/String;Ljava/lang/String;[BLadz;)V
    //   74: aload_0
    //   75: new 60	blp
    //   78: dup
    //   79: ldc 52
    //   81: invokespecial 63	blp:<init>	(Ljava/lang/String;)V
    //   84: putfield 65	aul:n	Lblp;
    //   87: aload_0
    //   88: invokestatic 70	com/google/android/apps/chromecast/app/SetupApplication:a	()Lcom/google/android/apps/chromecast/app/SetupApplication;
    //   91: invokestatic 73	asr:a	(Landroid/content/Context;)Laec;
    //   94: putfield 79	ads:i	Laec;
    //   97: aload_0
    //   98: aload 9
    //   100: putfield 81	aul:o	Laea;
    //   103: aload_0
    //   104: aload_2
    //   105: putfield 83	aul:p	Ljava/lang/String;
    //   108: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	aul
    //   0	109	1	paramString1	String
    //   0	109	2	paramString2	String
    //   0	109	3	paramString3	String
    //   0	109	4	paramdca	dca
    //   0	109	5	paramString4	String
    //   0	109	6	paramInt1	int
    //   0	109	7	paramInt2	int
    //   0	109	8	paramInt3	int
    //   0	109	9	paramaea	aea
    //   0	109	10	paramadz	adz
    //   6	58	11	str	String
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */