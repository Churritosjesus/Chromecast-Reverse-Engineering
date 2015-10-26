public final class eq
  implements Cloneable
{
  public static final Object a = new Object();
  public boolean b = false;
  public int[] c;
  public Object[] d;
  public int e;
  
  public eq()
  {
    this(10);
  }
  
  private eq(int paramInt)
  {
    paramInt = ef.a(10);
    this.c = new int[paramInt];
    this.d = new Object[paramInt];
    this.e = 0;
  }
  
  /* Error */
  private eq c()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 47	java/lang/Object:clone	()Ljava/lang/Object;
    //   4: checkcast 2	eq
    //   7: astore_1
    //   8: aload_1
    //   9: aload_0
    //   10: getfield 36	eq:c	[I
    //   13: invokevirtual 49	[I:clone	()Ljava/lang/Object;
    //   16: checkcast 48	[I
    //   19: putfield 36	eq:c	[I
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 38	eq:d	[Ljava/lang/Object;
    //   27: invokevirtual 51	[Ljava/lang/Object;:clone	()Ljava/lang/Object;
    //   30: checkcast 50	[Ljava/lang/Object;
    //   33: putfield 38	eq:d	[Ljava/lang/Object;
    //   36: aload_1
    //   37: areturn
    //   38: astore_1
    //   39: aconst_null
    //   40: astore_1
    //   41: goto -5 -> 36
    //   44: astore_2
    //   45: goto -9 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	eq
    //   7	30	1	localeq	eq
    //   38	1	1	localCloneNotSupportedException1	CloneNotSupportedException
    //   40	1	1	localObject	Object
    //   44	1	2	localCloneNotSupportedException2	CloneNotSupportedException
    // Exception table:
    //   from	to	target	type
    //   0	8	38	java/lang/CloneNotSupportedException
    //   8	36	44	java/lang/CloneNotSupportedException
  }
  
  private void d()
  {
    int m = this.e;
    int[] arrayOfInt = this.c;
    Object[] arrayOfObject = this.d;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      Object localObject = arrayOfObject[i];
      k = j;
      if (localObject != a)
      {
        if (i != j)
        {
          arrayOfInt[j] = arrayOfInt[i];
          arrayOfObject[j] = localObject;
          arrayOfObject[i] = null;
        }
        k = j + 1;
      }
      i++;
    }
    this.b = false;
    this.e = j;
  }
  
  public final int a()
  {
    if (this.b) {
      d();
    }
    return this.e;
  }
  
  public final Object a(int paramInt)
  {
    paramInt = ef.a(this.c, this.e, paramInt);
    if ((paramInt < 0) || (this.d[paramInt] == a)) {}
    for (Object localObject = null;; localObject = this.d[paramInt]) {
      return localObject;
    }
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    int i = ef.a(this.c, this.e, paramInt);
    if (i >= 0) {
      this.d[i] = paramObject;
    }
    for (;;)
    {
      return;
      int j = i ^ 0xFFFFFFFF;
      if ((j < this.e) && (this.d[j] == a))
      {
        this.c[j] = paramInt;
        this.d[j] = paramObject;
      }
      else
      {
        i = j;
        if (this.b)
        {
          i = j;
          if (this.e >= this.c.length)
          {
            d();
            i = ef.a(this.c, this.e, paramInt) ^ 0xFFFFFFFF;
          }
        }
        if (this.e >= this.c.length)
        {
          j = ef.a(this.e + 1);
          int[] arrayOfInt = new int[j];
          Object[] arrayOfObject = new Object[j];
          System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
          System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
          this.c = arrayOfInt;
          this.d = arrayOfObject;
        }
        if (this.e - i != 0)
        {
          System.arraycopy(this.c, i, this.c, i + 1, this.e - i);
          System.arraycopy(this.d, i, this.d, i + 1, this.e - i);
        }
        this.c[i] = paramInt;
        this.d[i] = paramObject;
        this.e += 1;
      }
    }
  }
  
  public final void b()
  {
    int j = this.e;
    Object[] arrayOfObject = this.d;
    for (int i = 0; i < j; i++) {
      arrayOfObject[i] = null;
    }
    this.e = 0;
    this.b = false;
  }
  
  public final void b(int paramInt)
  {
    if (this.d[paramInt] != a)
    {
      this.d[paramInt] = a;
      this.b = true;
    }
  }
  
  public final int c(int paramInt)
  {
    if (this.b) {
      d();
    }
    return this.c[paramInt];
  }
  
  public final Object d(int paramInt)
  {
    if (this.b) {
      d();
    }
    return this.d[paramInt];
  }
  
  public final int e(int paramInt)
  {
    if (this.b) {
      d();
    }
    return ef.a(this.c, this.e, paramInt);
  }
  
  public final String toString()
  {
    if (a() <= 0) {}
    StringBuilder localStringBuilder;
    for (Object localObject = "{}";; localObject = localStringBuilder.toString())
    {
      return (String)localObject;
      localStringBuilder = new StringBuilder(this.e * 28);
      localStringBuilder.append('{');
      int i = 0;
      if (i < this.e)
      {
        if (i > 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append(c(i));
        localStringBuilder.append('=');
        localObject = d(i);
        if (localObject != this) {
          localStringBuilder.append(localObject);
        }
        for (;;)
        {
          i++;
          break;
          localStringBuilder.append("(this Map)");
        }
      }
      localStringBuilder.append('}');
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */