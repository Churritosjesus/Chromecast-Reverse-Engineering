final class dkt
{
  private static dks a;
  private static long b;
  
  /* Error */
  static dks a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 16	dkt:a	Ldks;
    //   6: ifnull +34 -> 40
    //   9: getstatic 16	dkt:a	Ldks;
    //   12: astore_0
    //   13: aload_0
    //   14: getfield 21	dks:f	Ldks;
    //   17: putstatic 16	dkt:a	Ldks;
    //   20: aload_0
    //   21: aconst_null
    //   22: putfield 21	dks:f	Ldks;
    //   25: getstatic 23	dkt:b	J
    //   28: ldc2_w 24
    //   31: lsub
    //   32: putstatic 23	dkt:b	J
    //   35: ldc 2
    //   37: monitorexit
    //   38: aload_0
    //   39: areturn
    //   40: ldc 2
    //   42: monitorexit
    //   43: new 18	dks
    //   46: dup
    //   47: invokespecial 26	dks:<init>	()V
    //   50: astore_0
    //   51: goto -13 -> 38
    //   54: astore_0
    //   55: ldc 2
    //   57: monitorexit
    //   58: aload_0
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	39	0	localdks	dks
    //   54	5	0	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	38	54	finally
    //   40	43	54	finally
    //   55	58	54	finally
  }
  
  static void a(dks paramdks)
  {
    if ((paramdks.f != null) || (paramdks.g != null)) {
      throw new IllegalArgumentException();
    }
    if (paramdks.d) {}
    for (;;)
    {
      return;
      try
      {
        if (b + 2048L > 65536L) {
          continue;
        }
      }
      finally {}
      b += 2048L;
      paramdks.f = a;
      paramdks.c = 0;
      paramdks.b = 0;
      a = paramdks;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */