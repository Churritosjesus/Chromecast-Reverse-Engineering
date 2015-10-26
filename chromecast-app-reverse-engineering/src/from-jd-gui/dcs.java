public final class dcs
  extends ddq
  implements dec
{
  private static volatile ded g = null;
  private static final dcs j = new dcs(ddv.c, ddp.a());
  private static volatile dee k;
  private static final long serialVersionUID = 0L;
  private int a;
  private String b;
  private String c;
  private String d;
  private long e;
  private String f;
  
  /* Error */
  private dcs(ddn paramddn, ddp paramddp)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 51	ddq:<init>	()V
    //   4: aload_0
    //   5: ldc 53
    //   7: putfield 55	dcs:b	Ljava/lang/String;
    //   10: aload_0
    //   11: ldc 53
    //   13: putfield 57	dcs:c	Ljava/lang/String;
    //   16: aload_0
    //   17: ldc 53
    //   19: putfield 59	dcs:d	Ljava/lang/String;
    //   22: aload_0
    //   23: lconst_0
    //   24: putfield 61	dcs:e	J
    //   27: aload_0
    //   28: ldc 53
    //   30: putfield 63	dcs:f	Ljava/lang/String;
    //   33: invokestatic 68	dek:b	()Ldel;
    //   36: astore_2
    //   37: iconst_0
    //   38: istore 5
    //   40: iload 5
    //   42: ifne +267 -> 309
    //   45: aload_1
    //   46: invokevirtual 73	ddn:a	()I
    //   49: istore 6
    //   51: iload 6
    //   53: lookupswitch	default:+59->112, 0:+75->128, 10:+81->134, 18:+132->185, 26:+187->240, 32:+210->263, 42:+232->285
    //   112: aload_2
    //   113: iload 6
    //   115: aload_1
    //   116: invokevirtual 78	del:a	(ILddn;)Z
    //   119: ifne -79 -> 40
    //   122: iconst_1
    //   123: istore 5
    //   125: goto -85 -> 40
    //   128: iconst_1
    //   129: istore 5
    //   131: goto -91 -> 40
    //   134: aload_1
    //   135: invokevirtual 81	ddn:c	()Ljava/lang/String;
    //   138: astore_3
    //   139: aload_0
    //   140: aload_0
    //   141: getfield 83	dcs:a	I
    //   144: iconst_1
    //   145: ior
    //   146: putfield 83	dcs:a	I
    //   149: aload_0
    //   150: aload_3
    //   151: putfield 55	dcs:b	Ljava/lang/String;
    //   154: goto -114 -> 40
    //   157: astore_1
    //   158: new 85	java/lang/RuntimeException
    //   161: astore_3
    //   162: aload_1
    //   163: aload_0
    //   164: putfield 88	ddx:a	Ldea;
    //   167: aload_3
    //   168: aload_1
    //   169: invokespecial 91	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   172: aload_3
    //   173: athrow
    //   174: astore_1
    //   175: aload_0
    //   176: aload_2
    //   177: invokevirtual 94	del:a	()Ldek;
    //   180: putfield 98	dcs:h	Ldek;
    //   183: aload_1
    //   184: athrow
    //   185: aload_1
    //   186: invokevirtual 81	ddn:c	()Ljava/lang/String;
    //   189: astore_3
    //   190: aload_0
    //   191: aload_0
    //   192: getfield 83	dcs:a	I
    //   195: iconst_2
    //   196: ior
    //   197: putfield 83	dcs:a	I
    //   200: aload_0
    //   201: aload_3
    //   202: putfield 57	dcs:c	Ljava/lang/String;
    //   205: goto -165 -> 40
    //   208: astore_1
    //   209: new 85	java/lang/RuntimeException
    //   212: astore 4
    //   214: new 47	ddx
    //   217: astore_3
    //   218: aload_3
    //   219: aload_1
    //   220: invokevirtual 101	java/io/IOException:getMessage	()Ljava/lang/String;
    //   223: invokespecial 104	ddx:<init>	(Ljava/lang/String;)V
    //   226: aload_3
    //   227: aload_0
    //   228: putfield 88	ddx:a	Ldea;
    //   231: aload 4
    //   233: aload_3
    //   234: invokespecial 91	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   237: aload 4
    //   239: athrow
    //   240: aload_1
    //   241: invokevirtual 81	ddn:c	()Ljava/lang/String;
    //   244: astore_3
    //   245: aload_0
    //   246: aload_0
    //   247: getfield 83	dcs:a	I
    //   250: iconst_4
    //   251: ior
    //   252: putfield 83	dcs:a	I
    //   255: aload_0
    //   256: aload_3
    //   257: putfield 59	dcs:d	Ljava/lang/String;
    //   260: goto -220 -> 40
    //   263: aload_0
    //   264: aload_0
    //   265: getfield 83	dcs:a	I
    //   268: bipush 8
    //   270: ior
    //   271: putfield 83	dcs:a	I
    //   274: aload_0
    //   275: aload_1
    //   276: invokevirtual 107	ddn:b	()J
    //   279: putfield 61	dcs:e	J
    //   282: goto -242 -> 40
    //   285: aload_1
    //   286: invokevirtual 81	ddn:c	()Ljava/lang/String;
    //   289: astore_3
    //   290: aload_0
    //   291: aload_0
    //   292: getfield 83	dcs:a	I
    //   295: bipush 16
    //   297: ior
    //   298: putfield 83	dcs:a	I
    //   301: aload_0
    //   302: aload_3
    //   303: putfield 63	dcs:f	Ljava/lang/String;
    //   306: goto -266 -> 40
    //   309: aload_0
    //   310: aload_2
    //   311: invokevirtual 94	del:a	()Ldek;
    //   314: putfield 98	dcs:h	Ldek;
    //   317: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	318	0	this	dcs
    //   0	318	1	paramddn	ddn
    //   0	318	2	paramddp	ddp
    //   138	165	3	localObject	Object
    //   212	26	4	localRuntimeException	RuntimeException
    //   38	92	5	i	int
    //   49	65	6	m	int
    // Exception table:
    //   from	to	target	type
    //   45	51	157	ddx
    //   112	122	157	ddx
    //   134	154	157	ddx
    //   185	205	157	ddx
    //   240	260	157	ddx
    //   263	282	157	ddx
    //   285	306	157	ddx
    //   45	51	174	finally
    //   112	122	174	finally
    //   134	154	174	finally
    //   158	174	174	finally
    //   185	205	174	finally
    //   209	240	174	finally
    //   240	260	174	finally
    //   263	282	174	finally
    //   285	306	174	finally
    //   45	51	208	java/io/IOException
    //   112	122	208	java/io/IOException
    //   134	154	208	java/io/IOException
    //   185	205	208	java/io/IOException
    //   240	260	208	java/io/IOException
    //   263	282	208	java/io/IOException
    //   285	306	208	java/io/IOException
  }
  
  public static dct b()
  {
    return (dct)j.i();
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {}
    for (;;)
    {
      return i;
      i = 0;
      if ((this.a & 0x1) == 1) {
        i = ddo.b(1, this.b) + 0;
      }
      int m = i;
      if ((this.a & 0x2) == 2) {
        m = i + ddo.b(2, this.c);
      }
      i = m;
      if ((this.a & 0x4) == 4) {
        i = m + ddo.b(3, this.d);
      }
      m = i;
      if ((this.a & 0x8) == 8) {
        m = i + ddo.b(4, this.e);
      }
      i = m;
      if ((this.a & 0x10) == 16) {
        i = m + ddo.b(5, this.f);
      }
      i += this.h.c();
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
      paramObject2 = new dcs((ddn)paramObject1, (ddp)paramObject2);
    }
    for (;;)
    {
      return paramObject2;
      paramObject2 = new dcs(ddv.c, ddp.a());
      continue;
      paramObject2 = j;
      continue;
      paramObject2 = null;
      continue;
      paramObject2 = new dct();
      continue;
      paramObject2 = this;
      if (paramObject1 == j) {
        continue;
      }
      paramObject1 = (dcs)paramObject1;
      if ((((dcs)paramObject1).a & 0x1) == 1)
      {
        paramInt = 1;
        label148:
        if (paramInt != 0)
        {
          this.a |= 0x1;
          this.b = ((dcs)paramObject1).b;
        }
        if ((((dcs)paramObject1).a & 0x2) != 2) {
          break label335;
        }
        paramInt = 1;
        label182:
        if (paramInt != 0)
        {
          this.a |= 0x2;
          this.c = ((dcs)paramObject1).c;
        }
        if ((((dcs)paramObject1).a & 0x4) != 4) {
          break label340;
        }
        paramInt = 1;
        label216:
        if (paramInt != 0)
        {
          this.a |= 0x4;
          this.d = ((dcs)paramObject1).d;
        }
        if ((((dcs)paramObject1).a & 0x8) != 8) {
          break label345;
        }
        paramInt = 1;
        label252:
        if (paramInt != 0)
        {
          long l = ((dcs)paramObject1).e;
          this.a |= 0x8;
          this.e = l;
        }
        if ((((dcs)paramObject1).a & 0x10) != 16) {
          break label350;
        }
      }
      label335:
      label340:
      label345:
      label350:
      for (paramInt = i;; paramInt = 0)
      {
        if (paramInt != 0)
        {
          this.a |= 0x10;
          this.f = ((dcs)paramObject1).f;
        }
        a(((dcs)paramObject1).h);
        paramObject2 = this;
        break;
        paramInt = 0;
        break label148;
        paramInt = 0;
        break label182;
        paramInt = 0;
        break label216;
        paramInt = 0;
        break label252;
      }
      paramObject2 = j;
      continue;
      if (k == null) {}
      try
      {
        if (k == null)
        {
          paramObject1 = new dds;
          ((dds)paramObject1).<init>(j);
          k = (dee)paramObject1;
        }
        paramObject2 = k;
      }
      finally {}
    }
  }
  
  public final void a(ddo paramddo)
  {
    if ((this.a & 0x1) == 1) {
      paramddo.a(1, this.b);
    }
    if ((this.a & 0x2) == 2) {
      paramddo.a(2, this.c);
    }
    if ((this.a & 0x4) == 4) {
      paramddo.a(3, this.d);
    }
    if ((this.a & 0x8) == 8)
    {
      long l = this.e;
      paramddo.d(4, 0);
      paramddo.a(l);
    }
    if ((this.a & 0x10) == 16) {
      paramddo.a(5, this.f);
    }
    this.h.a(paramddo);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */