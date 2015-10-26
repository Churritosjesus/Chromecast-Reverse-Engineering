public final class dcq
  extends ddq
  implements dec
{
  private static volatile ded d = null;
  private static final dcq e = new dcq(ddv.c, ddp.a());
  private static volatile dee f;
  private static final long serialVersionUID = 0L;
  public String a;
  private int b;
  private String c;
  
  /* Error */
  private dcq(ddn paramddn, ddp paramddp)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 48	ddq:<init>	()V
    //   4: aload_0
    //   5: ldc 50
    //   7: putfield 52	dcq:a	Ljava/lang/String;
    //   10: aload_0
    //   11: ldc 50
    //   13: putfield 54	dcq:c	Ljava/lang/String;
    //   16: invokestatic 59	dek:b	()Ldel;
    //   19: astore_2
    //   20: iconst_0
    //   21: istore 5
    //   23: iload 5
    //   25: ifne +175 -> 200
    //   28: aload_1
    //   29: invokevirtual 64	ddn:a	()I
    //   32: istore 6
    //   34: iload 6
    //   36: lookupswitch	default:+36->72, 0:+52->88, 10:+58->94, 18:+109->145
    //   72: aload_2
    //   73: iload 6
    //   75: aload_1
    //   76: invokevirtual 69	del:a	(ILddn;)Z
    //   79: ifne -56 -> 23
    //   82: iconst_1
    //   83: istore 5
    //   85: goto -62 -> 23
    //   88: iconst_1
    //   89: istore 5
    //   91: goto -68 -> 23
    //   94: aload_1
    //   95: invokevirtual 72	ddn:c	()Ljava/lang/String;
    //   98: astore_3
    //   99: aload_0
    //   100: aload_0
    //   101: getfield 74	dcq:b	I
    //   104: iconst_1
    //   105: ior
    //   106: putfield 74	dcq:b	I
    //   109: aload_0
    //   110: aload_3
    //   111: putfield 52	dcq:a	Ljava/lang/String;
    //   114: goto -91 -> 23
    //   117: astore_1
    //   118: new 76	java/lang/RuntimeException
    //   121: astore_3
    //   122: aload_1
    //   123: aload_0
    //   124: putfield 79	ddx:a	Ldea;
    //   127: aload_3
    //   128: aload_1
    //   129: invokespecial 82	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   132: aload_3
    //   133: athrow
    //   134: astore_1
    //   135: aload_0
    //   136: aload_2
    //   137: invokevirtual 85	del:a	()Ldek;
    //   140: putfield 89	dcq:h	Ldek;
    //   143: aload_1
    //   144: athrow
    //   145: aload_1
    //   146: invokevirtual 72	ddn:c	()Ljava/lang/String;
    //   149: astore_3
    //   150: aload_0
    //   151: aload_0
    //   152: getfield 74	dcq:b	I
    //   155: iconst_2
    //   156: ior
    //   157: putfield 74	dcq:b	I
    //   160: aload_0
    //   161: aload_3
    //   162: putfield 54	dcq:c	Ljava/lang/String;
    //   165: goto -142 -> 23
    //   168: astore_1
    //   169: new 76	java/lang/RuntimeException
    //   172: astore 4
    //   174: new 44	ddx
    //   177: astore_3
    //   178: aload_3
    //   179: aload_1
    //   180: invokevirtual 92	java/io/IOException:getMessage	()Ljava/lang/String;
    //   183: invokespecial 95	ddx:<init>	(Ljava/lang/String;)V
    //   186: aload_3
    //   187: aload_0
    //   188: putfield 79	ddx:a	Ldea;
    //   191: aload 4
    //   193: aload_3
    //   194: invokespecial 82	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   197: aload 4
    //   199: athrow
    //   200: aload_0
    //   201: aload_2
    //   202: invokevirtual 85	del:a	()Ldek;
    //   205: putfield 89	dcq:h	Ldek;
    //   208: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	this	dcq
    //   0	209	1	paramddn	ddn
    //   0	209	2	paramddp	ddp
    //   98	96	3	localObject	Object
    //   172	26	4	localRuntimeException	RuntimeException
    //   21	69	5	i	int
    //   32	42	6	j	int
    // Exception table:
    //   from	to	target	type
    //   28	34	117	ddx
    //   72	82	117	ddx
    //   94	114	117	ddx
    //   145	165	117	ddx
    //   28	34	134	finally
    //   72	82	134	finally
    //   94	114	134	finally
    //   118	134	134	finally
    //   145	165	134	finally
    //   169	200	134	finally
    //   28	34	168	java/io/IOException
    //   72	82	168	java/io/IOException
    //   94	114	168	java/io/IOException
    //   145	165	168	java/io/IOException
  }
  
  public static dcq b()
  {
    return e;
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {}
    for (;;)
    {
      return i;
      i = 0;
      if ((this.b & 0x1) == 1) {
        i = ddo.b(1, this.a) + 0;
      }
      int j = i;
      if ((this.b & 0x2) == 2) {
        j = i + ddo.b(2, this.c);
      }
      i = j + this.h.c();
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
      paramObject2 = new dcq((ddn)paramObject1, (ddp)paramObject2);
    }
    for (;;)
    {
      return paramObject2;
      paramObject2 = new dcq(ddv.c, ddp.a());
      continue;
      paramObject2 = e;
      continue;
      paramObject2 = null;
      continue;
      paramObject2 = new dcr();
      continue;
      paramObject2 = this;
      if (paramObject1 == e) {
        continue;
      }
      paramObject1 = (dcq)paramObject1;
      if ((((dcq)paramObject1).b & 0x1) == 1)
      {
        paramInt = 1;
        label148:
        if (paramInt != 0)
        {
          this.b |= 0x1;
          this.a = ((dcq)paramObject1).a;
        }
        if ((((dcq)paramObject1).b & 0x2) != 2) {
          break label223;
        }
      }
      label223:
      for (paramInt = i;; paramInt = 0)
      {
        if (paramInt != 0)
        {
          this.b |= 0x2;
          this.c = ((dcq)paramObject1).c;
        }
        a(((dcq)paramObject1).h);
        paramObject2 = this;
        break;
        paramInt = 0;
        break label148;
      }
      paramObject2 = e;
      continue;
      if (f == null) {}
      try
      {
        if (f == null)
        {
          paramObject1 = new dds;
          ((dds)paramObject1).<init>(e);
          f = (dee)paramObject1;
        }
        paramObject2 = f;
      }
      finally {}
    }
  }
  
  public final void a(ddo paramddo)
  {
    if ((this.b & 0x1) == 1) {
      paramddo.a(1, this.a);
    }
    if ((this.b & 0x2) == 2) {
      paramddo.a(2, this.c);
    }
    this.h.a(paramddo);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */