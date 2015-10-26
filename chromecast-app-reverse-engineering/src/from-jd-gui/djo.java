final class djo
  implements dku
{
  private final djz a = new djz();
  private boolean b;
  private boolean c;
  
  djo(djn paramdjn) {}
  
  /* Error */
  private void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 17	djo:d	Ldjn;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 17	djo:d	Ldjn;
    //   11: invokestatic 33	djn:g	(Ldjn;)Ldjq;
    //   14: invokevirtual 38	djq:j_	()V
    //   17: aload_0
    //   18: getfield 17	djo:d	Ldjn;
    //   21: getfield 41	djn:b	J
    //   24: lconst_0
    //   25: lcmp
    //   26: ifgt +55 -> 81
    //   29: aload_0
    //   30: getfield 43	djo:c	Z
    //   33: ifne +48 -> 81
    //   36: aload_0
    //   37: getfield 45	djo:b	Z
    //   40: ifne +41 -> 81
    //   43: aload_0
    //   44: getfield 17	djo:d	Ldjn;
    //   47: invokestatic 48	djn:d	(Ldjn;)Ldia;
    //   50: ifnonnull +31 -> 81
    //   53: aload_0
    //   54: getfield 17	djo:d	Ldjn;
    //   57: invokestatic 51	djn:e	(Ldjn;)V
    //   60: goto -43 -> 17
    //   63: astore_3
    //   64: aload_0
    //   65: getfield 17	djo:d	Ldjn;
    //   68: invokestatic 33	djn:g	(Ldjn;)Ldjq;
    //   71: invokevirtual 53	djq:b	()V
    //   74: aload_3
    //   75: athrow
    //   76: astore_3
    //   77: aload_2
    //   78: monitorexit
    //   79: aload_3
    //   80: athrow
    //   81: aload_0
    //   82: getfield 17	djo:d	Ldjn;
    //   85: invokestatic 33	djn:g	(Ldjn;)Ldjq;
    //   88: invokevirtual 53	djq:b	()V
    //   91: aload_0
    //   92: getfield 17	djo:d	Ldjn;
    //   95: invokestatic 56	djn:h	(Ldjn;)V
    //   98: aload_0
    //   99: getfield 17	djo:d	Ldjn;
    //   102: getfield 41	djn:b	J
    //   105: aload_0
    //   106: getfield 25	djo:a	Ldjz;
    //   109: getfield 57	djz:b	J
    //   112: invokestatic 63	java/lang/Math:min	(JJ)J
    //   115: lstore 5
    //   117: aload_0
    //   118: getfield 17	djo:d	Ldjn;
    //   121: astore_3
    //   122: aload_3
    //   123: aload_3
    //   124: getfield 41	djn:b	J
    //   127: lload 5
    //   129: lsub
    //   130: putfield 41	djn:b	J
    //   133: aload_2
    //   134: monitorexit
    //   135: aload_0
    //   136: getfield 17	djo:d	Ldjn;
    //   139: invokestatic 33	djn:g	(Ldjn;)Ldjq;
    //   142: invokevirtual 38	djq:j_	()V
    //   145: aload_0
    //   146: getfield 17	djo:d	Ldjn;
    //   149: invokestatic 66	djn:a	(Ldjn;)Ldjb;
    //   152: astore_2
    //   153: aload_0
    //   154: getfield 17	djo:d	Ldjn;
    //   157: invokestatic 69	djn:b	(Ldjn;)I
    //   160: istore 4
    //   162: iload_1
    //   163: ifeq +42 -> 205
    //   166: lload 5
    //   168: aload_0
    //   169: getfield 25	djo:a	Ldjz;
    //   172: getfield 57	djz:b	J
    //   175: lcmp
    //   176: ifne +29 -> 205
    //   179: iconst_1
    //   180: istore_1
    //   181: aload_2
    //   182: iload 4
    //   184: iload_1
    //   185: aload_0
    //   186: getfield 25	djo:a	Ldjz;
    //   189: lload 5
    //   191: invokevirtual 74	djb:a	(IZLdjz;J)V
    //   194: aload_0
    //   195: getfield 17	djo:d	Ldjn;
    //   198: invokestatic 33	djn:g	(Ldjn;)Ldjq;
    //   201: invokevirtual 53	djq:b	()V
    //   204: return
    //   205: iconst_0
    //   206: istore_1
    //   207: goto -26 -> 181
    //   210: astore_2
    //   211: aload_0
    //   212: getfield 17	djo:d	Ldjn;
    //   215: invokestatic 33	djn:g	(Ldjn;)Ldjq;
    //   218: invokevirtual 53	djq:b	()V
    //   221: aload_2
    //   222: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	223	0	this	djo
    //   0	223	1	paramBoolean	boolean
    //   4	178	2	localObject1	Object
    //   210	12	2	localObject2	Object
    //   63	12	3	localObject3	Object
    //   76	4	3	localObject4	Object
    //   121	3	3	localdjn	djn
    //   160	23	4	i	int
    //   115	75	5	l	long
    // Exception table:
    //   from	to	target	type
    //   17	60	63	finally
    //   7	17	76	finally
    //   64	76	76	finally
    //   77	79	76	finally
    //   81	135	76	finally
    //   145	162	210	finally
    //   166	179	210	finally
    //   181	194	210	finally
  }
  
  public final dkw a()
  {
    return djn.g(this.d);
  }
  
  public final void a_(djz paramdjz, long paramLong)
  {
    this.a.a_(paramdjz, paramLong);
    while (this.a.b >= 16384L) {
      a(false);
    }
  }
  
  public final void close()
  {
    for (;;)
    {
      synchronized (this.d)
      {
        if (this.b) {
          return;
        }
        if (this.d.g.c) {
          break label89;
        }
        if (this.a.b > 0L)
        {
          if (this.a.b <= 0L) {
            break label89;
          }
          a(true);
        }
      }
      djn.a(this.d).a(djn.b(this.d), true, null, 0L);
      label89:
      synchronized (this.d)
      {
        this.b = true;
        djn.a(this.d).c();
        djn.f(this.d);
      }
    }
  }
  
  public final void flush()
  {
    synchronized (this.d)
    {
      djn.h(this.d);
      if (this.a.b > 0L)
      {
        a(false);
        djn.a(this.d).c();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */