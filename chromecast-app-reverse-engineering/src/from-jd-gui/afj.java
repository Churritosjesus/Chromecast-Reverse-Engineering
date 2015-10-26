import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class afj
  implements agn
{
  afj(aff paramaff, afb paramafb, AtomicBoolean paramAtomicBoolean, afk paramafk, Set paramSet1, Set paramSet2) {}
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: invokestatic 40	aff:a	()Laff;
    //   3: getfield 42	aff:b	Lafb;
    //   6: ifnull +22 -> 28
    //   9: invokestatic 40	aff:a	()Laff;
    //   12: getfield 42	aff:b	Lafb;
    //   15: getfield 48	afb:h	Ljava/lang/String;
    //   18: aload_0
    //   19: getfield 23	afj:a	Lafb;
    //   22: getfield 48	afb:h	Ljava/lang/String;
    //   25: if_acmpeq +4 -> 29
    //   28: return
    //   29: aload_0
    //   30: getfield 25	afj:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   33: invokevirtual 54	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   36: ifne +41 -> 77
    //   39: aload_0
    //   40: getfield 27	afj:c	Lafk;
    //   43: getfield 58	afk:a	Ljava/lang/String;
    //   46: ifnonnull +31 -> 77
    //   49: aload_0
    //   50: getfield 27	afj:c	Lafk;
    //   53: getfield 61	afk:b	I
    //   56: istore 10
    //   58: iload 10
    //   60: ifne +17 -> 77
    //   63: aload_0
    //   64: getfield 21	afj:f	Laff;
    //   67: invokestatic 64	aff:b	(Laff;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   70: iconst_0
    //   71: invokevirtual 68	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   74: goto -46 -> 28
    //   77: new 44	afb
    //   80: astore 5
    //   82: aload_0
    //   83: getfield 27	afj:c	Lafk;
    //   86: getfield 58	afk:a	Ljava/lang/String;
    //   89: ifnull +151 -> 240
    //   92: aload_0
    //   93: getfield 27	afj:c	Lafk;
    //   96: getfield 58	afk:a	Ljava/lang/String;
    //   99: astore_1
    //   100: aload_0
    //   101: getfield 23	afj:a	Lafb;
    //   104: getfield 71	afb:g	Ljava/lang/String;
    //   107: astore 6
    //   109: aload_0
    //   110: getfield 23	afj:a	Lafb;
    //   113: getfield 48	afb:h	Ljava/lang/String;
    //   116: astore 7
    //   118: aload_0
    //   119: getfield 25	afj:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   122: invokevirtual 54	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   125: ifeq +126 -> 251
    //   128: aload_0
    //   129: getfield 29	afj:d	Ljava/util/Set;
    //   132: astore_2
    //   133: aload_0
    //   134: getfield 25	afj:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   137: invokevirtual 54	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   140: ifeq +122 -> 262
    //   143: aload_0
    //   144: getfield 31	afj:e	Ljava/util/Set;
    //   147: astore_3
    //   148: aload_0
    //   149: getfield 23	afj:a	Lafb;
    //   152: getfield 74	afb:e	Lafl;
    //   155: astore 8
    //   157: aload_0
    //   158: getfield 27	afj:c	Lafk;
    //   161: getfield 61	afk:b	I
    //   164: ifeq +109 -> 273
    //   167: new 76	java/util/Date
    //   170: astore 4
    //   172: aload 4
    //   174: aload_0
    //   175: getfield 27	afj:c	Lafk;
    //   178: getfield 61	afk:b	I
    //   181: i2l
    //   182: ldc2_w 77
    //   185: lmul
    //   186: invokespecial 81	java/util/Date:<init>	(J)V
    //   189: new 76	java/util/Date
    //   192: astore 9
    //   194: aload 9
    //   196: invokespecial 82	java/util/Date:<init>	()V
    //   199: aload 5
    //   201: aload_1
    //   202: aload 6
    //   204: aload 7
    //   206: aload_2
    //   207: aload_3
    //   208: aload 8
    //   210: aload 4
    //   212: aload 9
    //   214: invokespecial 85	afb:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lafl;Ljava/util/Date;Ljava/util/Date;)V
    //   217: invokestatic 40	aff:a	()Laff;
    //   220: aload 5
    //   222: iconst_1
    //   223: invokevirtual 88	aff:a	(Lafb;Z)V
    //   226: aload_0
    //   227: getfield 21	afj:f	Laff;
    //   230: invokestatic 64	aff:b	(Laff;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   233: iconst_0
    //   234: invokevirtual 68	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   237: goto -209 -> 28
    //   240: aload_0
    //   241: getfield 23	afj:a	Lafb;
    //   244: getfield 90	afb:d	Ljava/lang/String;
    //   247: astore_1
    //   248: goto -148 -> 100
    //   251: aload_0
    //   252: getfield 23	afj:a	Lafb;
    //   255: getfield 92	afb:b	Ljava/util/Set;
    //   258: astore_2
    //   259: goto -126 -> 133
    //   262: aload_0
    //   263: getfield 23	afj:a	Lafb;
    //   266: getfield 94	afb:c	Ljava/util/Set;
    //   269: astore_3
    //   270: goto -122 -> 148
    //   273: aload_0
    //   274: getfield 23	afj:a	Lafb;
    //   277: getfield 97	afb:a	Ljava/util/Date;
    //   280: astore 4
    //   282: goto -93 -> 189
    //   285: astore_1
    //   286: aload_0
    //   287: getfield 21	afj:f	Laff;
    //   290: invokestatic 64	aff:b	(Laff;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   293: iconst_0
    //   294: invokevirtual 68	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   297: aload_1
    //   298: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	299	0	this	afj
    //   99	149	1	str1	String
    //   285	13	1	localObject	Object
    //   132	127	2	localSet1	Set
    //   147	123	3	localSet2	Set
    //   170	111	4	localDate1	java.util.Date
    //   80	141	5	localafb	afb
    //   107	96	6	str2	String
    //   116	89	7	str3	String
    //   155	54	8	localafl	afl
    //   192	21	9	localDate2	java.util.Date
    //   56	3	10	i	int
    // Exception table:
    //   from	to	target	type
    //   29	58	285	finally
    //   77	100	285	finally
    //   100	133	285	finally
    //   133	148	285	finally
    //   148	189	285	finally
    //   189	226	285	finally
    //   240	248	285	finally
    //   251	259	285	finally
    //   262	270	285	finally
    //   273	282	285	finally
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */