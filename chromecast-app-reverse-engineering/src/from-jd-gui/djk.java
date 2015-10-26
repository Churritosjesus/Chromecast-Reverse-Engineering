import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

final class djk
  extends dgj
  implements dic
{
  private dib b;
  
  djk(djb paramdjb)
  {
    super("OkHttp %s", new Object[] { djb.a(paramdjb) });
  }
  
  /* Error */
  protected final void a()
  {
    // Byte code:
    //   0: getstatic 36	dia:e	Ldia;
    //   3: astore_3
    //   4: getstatic 36	dia:e	Ldia;
    //   7: astore 4
    //   9: aload_3
    //   10: astore_2
    //   11: aload_3
    //   12: astore_1
    //   13: aload_0
    //   14: aload_0
    //   15: getfield 14	djk:a	Ldjb;
    //   18: getfield 40	djb:g	Ldjr;
    //   21: aload_0
    //   22: getfield 14	djk:a	Ldjb;
    //   25: getfield 44	djb:h	Ljava/net/Socket;
    //   28: invokestatic 49	dkk:b	(Ljava/net/Socket;)Ldkv;
    //   31: invokestatic 52	dkk:a	(Ldkv;)Ldkd;
    //   34: aload_0
    //   35: getfield 14	djk:a	Ldjb;
    //   38: getfield 55	djb:b	Z
    //   41: invokeinterface 60 3 0
    //   46: putfield 62	djk:b	Ldib;
    //   49: aload_3
    //   50: astore_2
    //   51: aload_3
    //   52: astore_1
    //   53: aload_0
    //   54: getfield 14	djk:a	Ldjb;
    //   57: getfield 55	djb:b	Z
    //   60: ifne +16 -> 76
    //   63: aload_3
    //   64: astore_2
    //   65: aload_3
    //   66: astore_1
    //   67: aload_0
    //   68: getfield 62	djk:b	Ldib;
    //   71: invokeinterface 66 1 0
    //   76: aload_3
    //   77: astore_2
    //   78: aload_3
    //   79: astore_1
    //   80: aload_0
    //   81: getfield 62	djk:b	Ldib;
    //   84: aload_0
    //   85: invokeinterface 69 2 0
    //   90: ifne -14 -> 76
    //   93: aload_3
    //   94: astore_2
    //   95: aload_3
    //   96: astore_1
    //   97: getstatic 71	dia:a	Ldia;
    //   100: astore_3
    //   101: aload_3
    //   102: astore_2
    //   103: aload_3
    //   104: astore_1
    //   105: getstatic 73	dia:h	Ldia;
    //   108: astore 5
    //   110: aload_0
    //   111: getfield 14	djk:a	Ldjb;
    //   114: aload_3
    //   115: aload 5
    //   117: invokestatic 76	djb:a	(Ldjb;Ldia;Ldia;)V
    //   120: aload_0
    //   121: getfield 62	djk:b	Ldib;
    //   124: invokestatic 81	dgs:a	(Ljava/io/Closeable;)V
    //   127: return
    //   128: astore_1
    //   129: aload_2
    //   130: astore_1
    //   131: getstatic 83	dia:b	Ldia;
    //   134: astore_2
    //   135: getstatic 83	dia:b	Ldia;
    //   138: astore_1
    //   139: aload_0
    //   140: getfield 14	djk:a	Ldjb;
    //   143: aload_2
    //   144: aload_1
    //   145: invokestatic 76	djb:a	(Ldjb;Ldia;Ldia;)V
    //   148: aload_0
    //   149: getfield 62	djk:b	Ldib;
    //   152: invokestatic 81	dgs:a	(Ljava/io/Closeable;)V
    //   155: goto -28 -> 127
    //   158: astore_3
    //   159: aload_1
    //   160: astore_2
    //   161: aload_3
    //   162: astore_1
    //   163: aload_0
    //   164: getfield 14	djk:a	Ldjb;
    //   167: aload_2
    //   168: aload 4
    //   170: invokestatic 76	djb:a	(Ldjb;Ldia;Ldia;)V
    //   173: aload_0
    //   174: getfield 62	djk:b	Ldib;
    //   177: invokestatic 81	dgs:a	(Ljava/io/Closeable;)V
    //   180: aload_1
    //   181: athrow
    //   182: astore_2
    //   183: goto -10 -> 173
    //   186: astore_1
    //   187: goto -24 -> 163
    //   190: astore_1
    //   191: goto -43 -> 148
    //   194: astore_1
    //   195: goto -75 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	djk
    //   12	93	1	localdia1	dia
    //   128	1	1	localIOException1	java.io.IOException
    //   130	51	1	localObject1	Object
    //   186	1	1	localObject2	Object
    //   190	1	1	localIOException2	java.io.IOException
    //   194	1	1	localIOException3	java.io.IOException
    //   10	158	2	localObject3	Object
    //   182	1	2	localIOException4	java.io.IOException
    //   3	112	3	localdia2	dia
    //   158	4	3	localObject4	Object
    //   7	162	4	localdia3	dia
    //   108	8	5	localdia4	dia
    // Exception table:
    //   from	to	target	type
    //   13	49	128	java/io/IOException
    //   53	63	128	java/io/IOException
    //   67	76	128	java/io/IOException
    //   80	93	128	java/io/IOException
    //   97	101	128	java/io/IOException
    //   105	110	128	java/io/IOException
    //   13	49	158	finally
    //   53	63	158	finally
    //   67	76	158	finally
    //   80	93	158	finally
    //   97	101	158	finally
    //   105	110	158	finally
    //   131	135	158	finally
    //   163	173	182	java/io/IOException
    //   135	139	186	finally
    //   139	148	190	java/io/IOException
    //   110	120	194	java/io/IOException
  }
  
  public final void a(int paramInt, long paramLong)
  {
    if (paramInt == 0) {}
    for (;;)
    {
      synchronized (this.a)
      {
        djb localdjb = this.a;
        localdjb.d += paramLong;
        this.a.notifyAll();
        return;
      }
      ??? = this.a.a(paramInt);
      if (??? == null) {
        continue;
      }
      try
      {
        ((djn)???).a(paramLong);
      }
      finally {}
    }
  }
  
  public final void a(int paramInt, dia paramdia)
  {
    if (djb.a(this.a, paramInt)) {
      djb.a(this.a, paramInt, paramdia);
    }
    for (;;)
    {
      return;
      djn localdjn = this.a.b(paramInt);
      if (localdjn != null) {
        localdjn.c(paramdia);
      }
    }
  }
  
  public final void a(int paramInt, dke arg2)
  {
    int i = ???.b.length;
    synchronized (this.a)
    {
      djn[] arrayOfdjn = (djn[])djb.e(this.a).values().toArray(new djn[djb.e(this.a).size()]);
      djb.b(this.a, true);
      int j = arrayOfdjn.length;
      i = 0;
      if (i < j)
      {
        ??? = arrayOfdjn[i];
        if ((???.c > paramInt) && (???.b()))
        {
          ???.c(dia.g);
          this.a.b(???.c);
        }
        i++;
      }
    }
  }
  
  public final void a(int paramInt, List paramList)
  {
    djb.a(this.a, paramInt, paramList);
  }
  
  public final void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramBoolean)
    {
      dh localdh = djb.c(this.a, paramInt1);
      if (localdh != null) {
        localdh.h();
      }
    }
    for (;;)
    {
      return;
      djb.b(this.a, true, paramInt1, paramInt2, null);
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt1, dkd paramdkd, int paramInt2)
  {
    if (djb.a(this.a, paramInt1)) {
      djb.a(this.a, paramInt1, paramdkd, paramInt2, paramBoolean);
    }
    for (;;)
    {
      return;
      djn localdjn = this.a.a(paramInt1);
      if (localdjn == null)
      {
        this.a.a(paramInt1, dia.c);
        paramdkd.f(paramInt2);
      }
      else
      {
        localdjn.f.a(paramdkd, paramInt2);
        if (paramBoolean) {
          localdjn.e();
        }
      }
    }
  }
  
  public final void a(boolean paramBoolean, dix paramdix)
  {
    for (;;)
    {
      int i;
      synchronized (this.a)
      {
        int j = this.a.f.c(65536);
        if (paramBoolean)
        {
          localObject = this.a.f;
          ((dix)localObject).c = 0;
          ((dix)localObject).b = 0;
          ((dix)localObject).a = 0;
          Arrays.fill(((dix)localObject).d, 0);
        }
        Object localObject = this.a.f;
        i = 0;
        if (i < 10)
        {
          if (paramdix.a(i)) {
            ((dix)localObject).a(i, paramdix.b(i), paramdix.d[i]);
          }
          i++;
          continue;
        }
        if (this.a.a == dfx.d)
        {
          ExecutorService localExecutorService = djb.d();
          localObject = new djm;
          ((djm)localObject).<init>(this, "OkHttp %s ACK Settings", new Object[] { djb.a(this.a) }, paramdix);
          localExecutorService.execute((Runnable)localObject);
        }
        i = this.a.f.c(65536);
        if ((i == -1) || (i == j)) {
          break label367;
        }
        l = i - j;
        if (!djb.g(this.a))
        {
          paramdix = this.a;
          paramdix.d += l;
          if (l > 0L) {
            paramdix.notifyAll();
          }
          djb.a(this.a, true);
        }
        if (djb.e(this.a).isEmpty()) {
          break label362;
        }
        paramdix = (djn[])djb.e(this.a).values().toArray(new djn[djb.e(this.a).size()]);
        if ((paramdix == null) || (l == 0L)) {
          break label361;
        }
        j = paramdix.length;
        i = 0;
        if (i >= j) {
          break label361;
        }
      }
      synchronized (paramdix[i])
      {
        ???.a(l);
        i++;
        continue;
        paramdix = finally;
        throw paramdix;
      }
      label361:
      return;
      label362:
      paramdix = null;
      continue;
      label367:
      paramdix = null;
      long l = 0L;
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt, List paramList, dif paramdif)
  {
    int j = 0;
    int k = 0;
    int i = 0;
    boolean bool = true;
    if (djb.a(this.a, paramInt)) {
      djb.a(this.a, paramInt, paramList, paramBoolean2);
    }
    Object localObject;
    for (;;)
    {
      return;
      synchronized (this.a)
      {
        if (!djb.b(this.a)) {}
      }
      localObject = this.a.a(paramInt);
      if (localObject != null) {
        break;
      }
      if ((paramdif == dif.b) || (paramdif == dif.c)) {
        i = 1;
      }
      if (i != 0)
      {
        this.a.a(paramInt, dia.c);
      }
      else
      {
        if (paramInt <= djb.c(this.a)) {}
        if (paramInt % 2 == djb.d(this.a) % 2) {}
        paramdif = new djn;
        paramdif.<init>(paramInt, this.a, paramBoolean1, paramBoolean2, paramList);
        djb.b(this.a, paramInt);
        djb.e(this.a).put(Integer.valueOf(paramInt), paramdif);
        paramList = djb.d();
        localObject = new djl;
        ((djl)localObject).<init>(this, "OkHttp %s stream %d", new Object[] { djb.a(this.a), Integer.valueOf(paramInt) }, paramdif);
        paramList.execute((Runnable)localObject);
      }
    }
    if (paramdif == dif.a) {}
    for (i = 1;; i = 0)
    {
      if (i == 0) {
        break label311;
      }
      ((djn)localObject).b(dia.b);
      this.a.b(paramInt);
      break;
    }
    label311:
    ??? = null;
    for (;;)
    {
      try
      {
        if (((djn)localObject).e == null)
        {
          paramInt = j;
          if (paramdif == dif.c) {
            paramInt = 1;
          }
          if (paramInt != 0)
          {
            paramList = dia.b;
            paramBoolean1 = bool;
            if (paramList == null) {
              break label488;
            }
            ((djn)localObject).b(paramList);
            if (!paramBoolean2) {
              break;
            }
            ((djn)localObject).e();
            break;
          }
          ((djn)localObject).e = paramList;
          paramBoolean1 = ((djn)localObject).a();
          localObject.notifyAll();
          paramList = ???;
          continue;
        }
        paramInt = k;
      }
      finally {}
      if (paramdif == dif.b) {
        paramInt = 1;
      }
      if (paramInt != 0)
      {
        paramList = dia.d;
        paramBoolean1 = bool;
      }
      else
      {
        paramdif = new java/util/ArrayList;
        paramdif.<init>();
        paramdif.addAll(((djn)localObject).e);
        paramdif.addAll(paramList);
        ((djn)localObject).e = paramdif;
        paramBoolean1 = bool;
        paramList = ???;
        continue;
        label488:
        if (!paramBoolean1) {
          ((djn)localObject).d.b(((djn)localObject).c);
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */