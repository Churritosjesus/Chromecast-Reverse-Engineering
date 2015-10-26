public final class dcu
  extends ddq
  implements dec
{
  private static volatile ded m = null;
  private static final dcu n = new dcu(ddv.c, ddp.a());
  private static volatile dee o;
  private static final long serialVersionUID = 0L;
  public String a;
  public String b;
  public String c;
  public ddw d;
  public String e;
  public ddw f;
  public String g;
  private int j;
  private int k;
  private int l;
  
  /* Error */
  private dcu(ddn paramddn, ddp paramddp)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 56	ddq:<init>	()V
    //   4: aload_0
    //   5: ldc 58
    //   7: putfield 60	dcu:a	Ljava/lang/String;
    //   10: aload_0
    //   11: ldc 58
    //   13: putfield 62	dcu:b	Ljava/lang/String;
    //   16: aload_0
    //   17: ldc 58
    //   19: putfield 64	dcu:c	Ljava/lang/String;
    //   22: aload_0
    //   23: invokestatic 69	def:d	()Ldef;
    //   26: putfield 71	dcu:d	Lddw;
    //   29: aload_0
    //   30: ldc 58
    //   32: putfield 73	dcu:e	Ljava/lang/String;
    //   35: aload_0
    //   36: iconst_1
    //   37: putfield 75	dcu:k	I
    //   40: aload_0
    //   41: invokestatic 69	def:d	()Ldef;
    //   44: putfield 77	dcu:f	Lddw;
    //   47: aload_0
    //   48: iconst_1
    //   49: putfield 79	dcu:l	I
    //   52: aload_0
    //   53: ldc 58
    //   55: putfield 81	dcu:g	Ljava/lang/String;
    //   58: invokestatic 86	dek:b	()Ldel;
    //   61: astore_3
    //   62: iconst_0
    //   63: istore 5
    //   65: iload 5
    //   67: ifne +543 -> 610
    //   70: aload_1
    //   71: invokevirtual 91	ddn:a	()I
    //   74: istore 6
    //   76: iload 6
    //   78: lookupswitch	default:+90->168, 0:+106->184, 10:+112->190, 18:+207->285, 26:+265->343, 34:+314->392, 42:+340->418, 48:+389->467, 58:+435->513, 66:+461->539, 72:+486->564
    //   168: aload_3
    //   169: iload 6
    //   171: aload_1
    //   172: invokevirtual 96	del:a	(ILddn;)Z
    //   175: ifne -110 -> 65
    //   178: iconst_1
    //   179: istore 5
    //   181: goto -116 -> 65
    //   184: iconst_1
    //   185: istore 5
    //   187: goto -122 -> 65
    //   190: aload_1
    //   191: invokevirtual 99	ddn:c	()Ljava/lang/String;
    //   194: astore 4
    //   196: aload_0
    //   197: aload_0
    //   198: getfield 101	dcu:j	I
    //   201: iconst_1
    //   202: ior
    //   203: putfield 101	dcu:j	I
    //   206: aload_0
    //   207: aload 4
    //   209: putfield 60	dcu:a	Ljava/lang/String;
    //   212: goto -147 -> 65
    //   215: astore_2
    //   216: new 103	java/lang/RuntimeException
    //   219: astore_1
    //   220: aload_2
    //   221: aload_0
    //   222: putfield 106	ddx:a	Ldea;
    //   225: aload_1
    //   226: aload_2
    //   227: invokespecial 109	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   230: aload_1
    //   231: athrow
    //   232: astore_1
    //   233: aload_0
    //   234: getfield 71	dcu:d	Lddw;
    //   237: invokeinterface 114 1 0
    //   242: ifeq +12 -> 254
    //   245: aload_0
    //   246: getfield 71	dcu:d	Lddw;
    //   249: invokeinterface 116 1 0
    //   254: aload_0
    //   255: getfield 77	dcu:f	Lddw;
    //   258: invokeinterface 114 1 0
    //   263: ifeq +12 -> 275
    //   266: aload_0
    //   267: getfield 77	dcu:f	Lddw;
    //   270: invokeinterface 116 1 0
    //   275: aload_0
    //   276: aload_3
    //   277: invokevirtual 119	del:a	()Ldek;
    //   280: putfield 123	dcu:h	Ldek;
    //   283: aload_1
    //   284: athrow
    //   285: aload_1
    //   286: invokevirtual 99	ddn:c	()Ljava/lang/String;
    //   289: astore 4
    //   291: aload_0
    //   292: aload_0
    //   293: getfield 101	dcu:j	I
    //   296: iconst_2
    //   297: ior
    //   298: putfield 101	dcu:j	I
    //   301: aload_0
    //   302: aload 4
    //   304: putfield 62	dcu:b	Ljava/lang/String;
    //   307: goto -242 -> 65
    //   310: astore_1
    //   311: new 103	java/lang/RuntimeException
    //   314: astore_2
    //   315: new 52	ddx
    //   318: astore 4
    //   320: aload 4
    //   322: aload_1
    //   323: invokevirtual 126	java/io/IOException:getMessage	()Ljava/lang/String;
    //   326: invokespecial 129	ddx:<init>	(Ljava/lang/String;)V
    //   329: aload 4
    //   331: aload_0
    //   332: putfield 106	ddx:a	Ldea;
    //   335: aload_2
    //   336: aload 4
    //   338: invokespecial 109	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   341: aload_2
    //   342: athrow
    //   343: aload_0
    //   344: getfield 71	dcu:d	Lddw;
    //   347: invokeinterface 114 1 0
    //   352: ifne +19 -> 371
    //   355: new 66	def
    //   358: astore 4
    //   360: aload 4
    //   362: invokespecial 130	def:<init>	()V
    //   365: aload_0
    //   366: aload 4
    //   368: putfield 71	dcu:d	Lddw;
    //   371: aload_0
    //   372: getfield 71	dcu:d	Lddw;
    //   375: aload_1
    //   376: invokestatic 135	dcq:b	()Ldcq;
    //   379: aload_2
    //   380: invokevirtual 138	ddn:a	(Lddq;Lddp;)Lddq;
    //   383: invokeinterface 142 2 0
    //   388: pop
    //   389: goto -324 -> 65
    //   392: aload_1
    //   393: invokevirtual 99	ddn:c	()Ljava/lang/String;
    //   396: astore 4
    //   398: aload_0
    //   399: aload_0
    //   400: getfield 101	dcu:j	I
    //   403: bipush 8
    //   405: ior
    //   406: putfield 101	dcu:j	I
    //   409: aload_0
    //   410: aload 4
    //   412: putfield 73	dcu:e	Ljava/lang/String;
    //   415: goto -350 -> 65
    //   418: aload_0
    //   419: getfield 77	dcu:f	Lddw;
    //   422: invokeinterface 114 1 0
    //   427: ifne +19 -> 446
    //   430: new 66	def
    //   433: astore 4
    //   435: aload 4
    //   437: invokespecial 130	def:<init>	()V
    //   440: aload_0
    //   441: aload 4
    //   443: putfield 77	dcu:f	Lddw;
    //   446: aload_0
    //   447: getfield 77	dcu:f	Lddw;
    //   450: aload_1
    //   451: invokestatic 147	dcw:c	()Ldcw;
    //   454: aload_2
    //   455: invokevirtual 138	ddn:a	(Lddq;Lddp;)Lddq;
    //   458: invokeinterface 142 2 0
    //   463: pop
    //   464: goto -399 -> 65
    //   467: aload_1
    //   468: invokevirtual 149	ddn:d	()I
    //   471: istore 6
    //   473: iload 6
    //   475: invokestatic 154	dbw:a	(I)Ldbw;
    //   478: ifnonnull +15 -> 493
    //   481: aload_3
    //   482: bipush 6
    //   484: iload 6
    //   486: invokevirtual 157	del:a	(II)Ldel;
    //   489: pop
    //   490: goto -425 -> 65
    //   493: aload_0
    //   494: aload_0
    //   495: getfield 101	dcu:j	I
    //   498: bipush 32
    //   500: ior
    //   501: putfield 101	dcu:j	I
    //   504: aload_0
    //   505: iload 6
    //   507: putfield 79	dcu:l	I
    //   510: goto -445 -> 65
    //   513: aload_1
    //   514: invokevirtual 99	ddn:c	()Ljava/lang/String;
    //   517: astore 4
    //   519: aload_0
    //   520: aload_0
    //   521: getfield 101	dcu:j	I
    //   524: bipush 64
    //   526: ior
    //   527: putfield 101	dcu:j	I
    //   530: aload_0
    //   531: aload 4
    //   533: putfield 81	dcu:g	Ljava/lang/String;
    //   536: goto -471 -> 65
    //   539: aload_1
    //   540: invokevirtual 99	ddn:c	()Ljava/lang/String;
    //   543: astore 4
    //   545: aload_0
    //   546: aload_0
    //   547: getfield 101	dcu:j	I
    //   550: iconst_4
    //   551: ior
    //   552: putfield 101	dcu:j	I
    //   555: aload_0
    //   556: aload 4
    //   558: putfield 64	dcu:c	Ljava/lang/String;
    //   561: goto -496 -> 65
    //   564: aload_1
    //   565: invokevirtual 149	ddn:d	()I
    //   568: istore 6
    //   570: iload 6
    //   572: invokestatic 162	dco:a	(I)Ldco;
    //   575: ifnonnull +15 -> 590
    //   578: aload_3
    //   579: bipush 9
    //   581: iload 6
    //   583: invokevirtual 157	del:a	(II)Ldel;
    //   586: pop
    //   587: goto -522 -> 65
    //   590: aload_0
    //   591: aload_0
    //   592: getfield 101	dcu:j	I
    //   595: bipush 16
    //   597: ior
    //   598: putfield 101	dcu:j	I
    //   601: aload_0
    //   602: iload 6
    //   604: putfield 75	dcu:k	I
    //   607: goto -542 -> 65
    //   610: aload_0
    //   611: getfield 71	dcu:d	Lddw;
    //   614: invokeinterface 114 1 0
    //   619: ifeq +12 -> 631
    //   622: aload_0
    //   623: getfield 71	dcu:d	Lddw;
    //   626: invokeinterface 116 1 0
    //   631: aload_0
    //   632: getfield 77	dcu:f	Lddw;
    //   635: invokeinterface 114 1 0
    //   640: ifeq +12 -> 652
    //   643: aload_0
    //   644: getfield 77	dcu:f	Lddw;
    //   647: invokeinterface 116 1 0
    //   652: aload_0
    //   653: aload_3
    //   654: invokevirtual 119	del:a	()Ldek;
    //   657: putfield 123	dcu:h	Ldek;
    //   660: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	661	0	this	dcu
    //   0	661	1	paramddn	ddn
    //   0	661	2	paramddp	ddp
    //   61	593	3	localdel	del
    //   194	363	4	localObject	Object
    //   63	123	5	i	int
    //   74	529	6	i1	int
    // Exception table:
    //   from	to	target	type
    //   70	76	215	ddx
    //   168	178	215	ddx
    //   190	212	215	ddx
    //   285	307	215	ddx
    //   343	371	215	ddx
    //   371	389	215	ddx
    //   392	415	215	ddx
    //   418	446	215	ddx
    //   446	464	215	ddx
    //   467	490	215	ddx
    //   493	510	215	ddx
    //   513	536	215	ddx
    //   539	561	215	ddx
    //   564	587	215	ddx
    //   590	607	215	ddx
    //   70	76	232	finally
    //   168	178	232	finally
    //   190	212	232	finally
    //   216	232	232	finally
    //   285	307	232	finally
    //   311	343	232	finally
    //   343	371	232	finally
    //   371	389	232	finally
    //   392	415	232	finally
    //   418	446	232	finally
    //   446	464	232	finally
    //   467	490	232	finally
    //   493	510	232	finally
    //   513	536	232	finally
    //   539	561	232	finally
    //   564	587	232	finally
    //   590	607	232	finally
    //   70	76	310	java/io/IOException
    //   168	178	310	java/io/IOException
    //   190	212	310	java/io/IOException
    //   285	307	310	java/io/IOException
    //   343	371	310	java/io/IOException
    //   371	389	310	java/io/IOException
    //   392	415	310	java/io/IOException
    //   418	446	310	java/io/IOException
    //   446	464	310	java/io/IOException
    //   467	490	310	java/io/IOException
    //   493	510	310	java/io/IOException
    //   513	536	310	java/io/IOException
    //   539	561	310	java/io/IOException
    //   564	587	310	java/io/IOException
    //   590	607	310	java/io/IOException
  }
  
  public static dcu a(byte[] paramArrayOfByte)
  {
    return (dcu)n.f().a(paramArrayOfByte);
  }
  
  public final int a()
  {
    int i3 = 0;
    int i = this.i;
    if (i != -1) {
      return i;
    }
    if ((this.j & 0x1) == 1) {}
    for (int i1 = ddo.b(1, this.a) + 0;; i1 = 0)
    {
      i = i1;
      if ((this.j & 0x2) == 2) {
        i = i1 + ddo.b(2, this.b);
      }
      int i2 = 0;
      i1 = i;
      for (i = i2; i < this.d.size(); i++) {
        i1 += ddo.b(3, (dea)this.d.get(i));
      }
      i2 = i3;
      i = i1;
      if ((this.j & 0x8) == 8) {
        i = i1 + ddo.b(4, this.e);
      }
      for (i2 = i3; i2 < this.f.size(); i2++) {
        i += ddo.b(5, (dea)this.f.get(i2));
      }
      i2 = i;
      if ((this.j & 0x20) == 32) {
        i2 = i + ddo.c(6, this.l);
      }
      i1 = i2;
      if ((this.j & 0x40) == 64) {
        i1 = i2 + ddo.b(7, this.g);
      }
      i = i1;
      if ((this.j & 0x4) == 4) {
        i = i1 + ddo.b(8, this.c);
      }
      i1 = i;
      if ((this.j & 0x10) == 16) {
        i1 = i + ddo.c(9, this.k);
      }
      i = this.h.c() + i1;
      this.i = i;
      break;
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
      paramObject2 = new dcu((ddn)paramObject1, (ddp)paramObject2);
    }
    for (;;)
    {
      return paramObject2;
      paramObject2 = new dcu(ddv.c, ddp.a());
      continue;
      paramObject2 = n;
      continue;
      this.d.b();
      this.f.b();
      paramObject2 = null;
      continue;
      paramObject2 = new dcv();
      continue;
      paramObject2 = this;
      if (paramObject1 == n) {
        continue;
      }
      dcu localdcu = (dcu)paramObject1;
      if ((localdcu.j & 0x1) == 1)
      {
        paramInt = 1;
        if (paramInt != 0)
        {
          this.j |= 0x1;
          this.a = localdcu.a;
        }
        if ((localdcu.j & 0x2) != 2) {
          break label391;
        }
        paramInt = 1;
        label204:
        if (paramInt != 0)
        {
          this.j |= 0x2;
          this.b = localdcu.b;
        }
        if ((localdcu.j & 0x4) != 4) {
          break label396;
        }
        paramInt = 1;
        label240:
        if (paramInt != 0)
        {
          this.j |= 0x4;
          this.c = localdcu.c;
        }
        if (!localdcu.d.isEmpty())
        {
          if (!this.d.isEmpty()) {
            break label401;
          }
          this.d = localdcu.d;
        }
        label297:
        if ((localdcu.j & 0x8) != 8) {
          break label442;
        }
        paramInt = 1;
        label312:
        if (paramInt != 0)
        {
          this.j |= 0x8;
          this.e = localdcu.e;
        }
        if ((localdcu.j & 0x10) != 16) {
          break label447;
        }
        paramInt = 1;
      }
      for (;;)
      {
        if (paramInt != 0)
        {
          paramObject2 = dco.a(localdcu.k);
          paramObject1 = paramObject2;
          if (paramObject2 == null) {
            paramObject1 = dco.a;
          }
          if (paramObject1 == null)
          {
            throw new NullPointerException();
            paramInt = 0;
            break;
            label391:
            paramInt = 0;
            break label204;
            label396:
            paramInt = 0;
            break label240;
            label401:
            if (!this.d.a()) {
              this.d = a(this.d);
            }
            this.d.addAll(localdcu.d);
            break label297;
            label442:
            paramInt = 0;
            break label312;
            label447:
            paramInt = 0;
            continue;
          }
          this.j |= 0x10;
          this.k = ((dco)paramObject1).d;
        }
      }
      if (!localdcu.f.isEmpty())
      {
        if (this.f.isEmpty()) {
          this.f = localdcu.f;
        }
      }
      else
      {
        if ((localdcu.j & 0x20) != 32) {
          break label583;
        }
        paramInt = 1;
      }
      for (;;)
      {
        if (paramInt != 0)
        {
          paramObject1 = localdcu.b();
          if (paramObject1 == null)
          {
            throw new NullPointerException();
            if (!this.f.a()) {
              this.f = a(this.f);
            }
            this.f.addAll(localdcu.f);
            break;
            label583:
            paramInt = 0;
            continue;
          }
          this.j |= 0x20;
          this.l = ((dbw)paramObject1).b;
        }
      }
      if ((localdcu.j & 0x40) == 64) {}
      for (paramInt = i;; paramInt = 0)
      {
        if (paramInt != 0)
        {
          this.j |= 0x40;
          this.g = localdcu.g;
        }
        a(localdcu.h);
        paramObject2 = this;
        break;
      }
      paramObject2 = n;
      continue;
      if (o == null) {}
      try
      {
        if (o == null)
        {
          paramObject1 = new dds;
          ((dds)paramObject1).<init>(n);
          o = (dee)paramObject1;
        }
        paramObject2 = o;
      }
      finally {}
    }
  }
  
  public final void a(ddo paramddo)
  {
    int i1 = 0;
    if ((this.j & 0x1) == 1) {
      paramddo.a(1, this.a);
    }
    if ((this.j & 0x2) == 2) {
      paramddo.a(2, this.b);
    }
    for (int i = 0; i < this.d.size(); i++) {
      paramddo.a(3, (dea)this.d.get(i));
    }
    i = i1;
    if ((this.j & 0x8) == 8) {
      paramddo.a(4, this.e);
    }
    for (i = i1; i < this.f.size(); i++) {
      paramddo.a(5, (dea)this.f.get(i));
    }
    if ((this.j & 0x20) == 32) {
      paramddo.a(6, this.l);
    }
    if ((this.j & 0x40) == 64) {
      paramddo.a(7, this.g);
    }
    if ((this.j & 0x4) == 4) {
      paramddo.a(8, this.c);
    }
    if ((this.j & 0x10) == 16) {
      paramddo.a(9, this.k);
    }
    this.h.a(paramddo);
  }
  
  public final dbw b()
  {
    dbw localdbw2 = dbw.a(this.l);
    dbw localdbw1 = localdbw2;
    if (localdbw2 == null) {
      localdbw1 = dbw.a;
    }
    return localdbw1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */