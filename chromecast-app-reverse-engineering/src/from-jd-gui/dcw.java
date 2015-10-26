public final class dcw
  extends ddq
  implements dec
{
  private static volatile ded f = null;
  private static final dcw g = new dcw(ddv.c, ddp.a());
  private static volatile dee j;
  private static final long serialVersionUID = 0L;
  public String a;
  public String b;
  private int c;
  private String d;
  private int e;
  
  /* Error */
  private dcw(ddn paramddn, ddp paramddp)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 50	ddq:<init>	()V
    //   4: aload_0
    //   5: ldc 52
    //   7: putfield 54	dcw:a	Ljava/lang/String;
    //   10: aload_0
    //   11: ldc 52
    //   13: putfield 56	dcw:b	Ljava/lang/String;
    //   16: aload_0
    //   17: ldc 52
    //   19: putfield 58	dcw:d	Ljava/lang/String;
    //   22: aload_0
    //   23: iconst_2
    //   24: putfield 60	dcw:e	I
    //   27: invokestatic 65	dek:b	()Ldel;
    //   30: astore_2
    //   31: iconst_0
    //   32: istore 5
    //   34: iload 5
    //   36: ifne +255 -> 291
    //   39: aload_1
    //   40: invokevirtual 70	ddn:a	()I
    //   43: istore 6
    //   45: iload 6
    //   47: lookupswitch	default:+49->96, 0:+65->112, 10:+71->118, 18:+122->169, 26:+176->223, 32:+199->246
    //   96: aload_2
    //   97: iload 6
    //   99: aload_1
    //   100: invokevirtual 75	del:a	(ILddn;)Z
    //   103: ifne -69 -> 34
    //   106: iconst_1
    //   107: istore 5
    //   109: goto -75 -> 34
    //   112: iconst_1
    //   113: istore 5
    //   115: goto -81 -> 34
    //   118: aload_1
    //   119: invokevirtual 78	ddn:c	()Ljava/lang/String;
    //   122: astore_3
    //   123: aload_0
    //   124: aload_0
    //   125: getfield 80	dcw:c	I
    //   128: iconst_1
    //   129: ior
    //   130: putfield 80	dcw:c	I
    //   133: aload_0
    //   134: aload_3
    //   135: putfield 54	dcw:a	Ljava/lang/String;
    //   138: goto -104 -> 34
    //   141: astore_1
    //   142: new 82	java/lang/RuntimeException
    //   145: astore_3
    //   146: aload_1
    //   147: aload_0
    //   148: putfield 85	ddx:a	Ldea;
    //   151: aload_3
    //   152: aload_1
    //   153: invokespecial 88	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   156: aload_3
    //   157: athrow
    //   158: astore_1
    //   159: aload_0
    //   160: aload_2
    //   161: invokevirtual 91	del:a	()Ldek;
    //   164: putfield 95	dcw:h	Ldek;
    //   167: aload_1
    //   168: athrow
    //   169: aload_1
    //   170: invokevirtual 78	ddn:c	()Ljava/lang/String;
    //   173: astore_3
    //   174: aload_0
    //   175: aload_0
    //   176: getfield 80	dcw:c	I
    //   179: iconst_2
    //   180: ior
    //   181: putfield 80	dcw:c	I
    //   184: aload_0
    //   185: aload_3
    //   186: putfield 56	dcw:b	Ljava/lang/String;
    //   189: goto -155 -> 34
    //   192: astore 4
    //   194: new 82	java/lang/RuntimeException
    //   197: astore_1
    //   198: new 46	ddx
    //   201: astore_3
    //   202: aload_3
    //   203: aload 4
    //   205: invokevirtual 98	java/io/IOException:getMessage	()Ljava/lang/String;
    //   208: invokespecial 101	ddx:<init>	(Ljava/lang/String;)V
    //   211: aload_3
    //   212: aload_0
    //   213: putfield 85	ddx:a	Ldea;
    //   216: aload_1
    //   217: aload_3
    //   218: invokespecial 88	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   221: aload_1
    //   222: athrow
    //   223: aload_1
    //   224: invokevirtual 78	ddn:c	()Ljava/lang/String;
    //   227: astore_3
    //   228: aload_0
    //   229: aload_0
    //   230: getfield 80	dcw:c	I
    //   233: iconst_4
    //   234: ior
    //   235: putfield 80	dcw:c	I
    //   238: aload_0
    //   239: aload_3
    //   240: putfield 58	dcw:d	Ljava/lang/String;
    //   243: goto -209 -> 34
    //   246: aload_1
    //   247: invokevirtual 103	ddn:d	()I
    //   250: istore 6
    //   252: iload 6
    //   254: invokestatic 108	dco:a	(I)Ldco;
    //   257: ifnonnull +14 -> 271
    //   260: aload_2
    //   261: iconst_4
    //   262: iload 6
    //   264: invokevirtual 111	del:a	(II)Ldel;
    //   267: pop
    //   268: goto -234 -> 34
    //   271: aload_0
    //   272: aload_0
    //   273: getfield 80	dcw:c	I
    //   276: bipush 8
    //   278: ior
    //   279: putfield 80	dcw:c	I
    //   282: aload_0
    //   283: iload 6
    //   285: putfield 60	dcw:e	I
    //   288: goto -254 -> 34
    //   291: aload_0
    //   292: aload_2
    //   293: invokevirtual 91	del:a	()Ldek;
    //   296: putfield 95	dcw:h	Ldek;
    //   299: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	300	0	this	dcw
    //   0	300	1	paramddn	ddn
    //   0	300	2	paramddp	ddp
    //   122	118	3	localObject	Object
    //   192	12	4	localIOException	java.io.IOException
    //   32	82	5	i	int
    //   43	241	6	k	int
    // Exception table:
    //   from	to	target	type
    //   39	45	141	ddx
    //   96	106	141	ddx
    //   118	138	141	ddx
    //   169	189	141	ddx
    //   223	243	141	ddx
    //   246	268	141	ddx
    //   271	288	141	ddx
    //   39	45	158	finally
    //   96	106	158	finally
    //   118	138	158	finally
    //   142	158	158	finally
    //   169	189	158	finally
    //   194	223	158	finally
    //   223	243	158	finally
    //   246	268	158	finally
    //   271	288	158	finally
    //   39	45	192	java/io/IOException
    //   96	106	192	java/io/IOException
    //   118	138	192	java/io/IOException
    //   169	189	192	java/io/IOException
    //   223	243	192	java/io/IOException
    //   246	268	192	java/io/IOException
    //   271	288	192	java/io/IOException
  }
  
  public static dcw c()
  {
    return g;
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {}
    for (;;)
    {
      return i;
      i = 0;
      if ((this.c & 0x1) == 1) {
        i = ddo.b(1, this.a) + 0;
      }
      int k = i;
      if ((this.c & 0x2) == 2) {
        k = i + ddo.b(2, this.b);
      }
      i = k;
      if ((this.c & 0x4) == 4) {
        i = k + ddo.b(3, this.d);
      }
      k = i;
      if ((this.c & 0x8) == 8) {
        k = i + ddo.c(4, this.e);
      }
      i = k + this.h.c();
      this.i = i;
    }
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    int i = 1;
    switch (dcn.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      paramObject2 = new dcw((ddn)paramObject1, (ddp)paramObject2);
    }
    for (;;)
    {
      return paramObject2;
      paramObject2 = new dcw(ddv.c, ddp.a());
      continue;
      paramObject2 = g;
      continue;
      paramObject2 = null;
      continue;
      paramObject2 = new dcx();
      continue;
      paramObject2 = this;
      if (paramObject1 == g) {
        continue;
      }
      paramObject1 = (dcw)paramObject1;
      if ((((dcw)paramObject1).c & 0x1) == 1)
      {
        paramInt = 1;
        if (paramInt != 0)
        {
          this.c |= 0x1;
          this.a = ((dcw)paramObject1).a;
        }
        if ((((dcw)paramObject1).c & 0x2) != 2) {
          break label279;
        }
        paramInt = 1;
        label182:
        if (paramInt != 0)
        {
          this.c |= 0x2;
          this.b = ((dcw)paramObject1).b;
        }
        if ((((dcw)paramObject1).c & 0x4) != 4) {
          break label284;
        }
        paramInt = 1;
        label216:
        if (paramInt != 0)
        {
          this.c |= 0x4;
          this.d = ((dcw)paramObject1).d;
        }
        if ((((dcw)paramObject1).c & 0x8) != 8) {
          break label289;
        }
        paramInt = i;
      }
      for (;;)
      {
        if (paramInt != 0)
        {
          paramObject2 = ((dcw)paramObject1).b();
          if (paramObject2 == null)
          {
            throw new NullPointerException();
            paramInt = 0;
            break;
            label279:
            paramInt = 0;
            break label182;
            label284:
            paramInt = 0;
            break label216;
            label289:
            paramInt = 0;
            continue;
          }
          this.c |= 0x8;
          this.e = ((dco)paramObject2).d;
        }
      }
      a(((dcw)paramObject1).h);
      paramObject2 = this;
      continue;
      paramObject2 = g;
      continue;
      if (j == null) {}
      try
      {
        if (j == null)
        {
          paramObject1 = new dds;
          ((dds)paramObject1).<init>(g);
          j = (dee)paramObject1;
        }
        paramObject2 = j;
      }
      finally {}
    }
  }
  
  public final void a(ddo paramddo)
  {
    if ((this.c & 0x1) == 1) {
      paramddo.a(1, this.a);
    }
    if ((this.c & 0x2) == 2) {
      paramddo.a(2, this.b);
    }
    if ((this.c & 0x4) == 4) {
      paramddo.a(3, this.d);
    }
    if ((this.c & 0x8) == 8) {
      paramddo.a(4, this.e);
    }
    this.h.a(paramddo);
  }
  
  public final dco b()
  {
    dco localdco2 = dco.a(this.e);
    dco localdco1 = localdco2;
    if (localdco2 == null) {
      localdco1 = dco.b;
    }
    return localdco1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */