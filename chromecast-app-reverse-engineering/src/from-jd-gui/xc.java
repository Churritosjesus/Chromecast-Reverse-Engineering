public final class xc
{
  private long a = 0L;
  private xc b;
  
  private void b()
  {
    if (this.b == null) {
      this.b = new xc();
    }
  }
  
  private void e(int paramInt)
  {
    if (paramInt >= 64) {
      if (this.b != null) {
        this.b.e(paramInt - 64);
      }
    }
    for (;;)
    {
      return;
      this.a &= (1L << paramInt ^ 0xFFFFFFFFFFFFFFFF);
    }
  }
  
  public final void a()
  {
    for (xc localxc = this;; localxc = localxc.b)
    {
      localxc.a = 0L;
      if (localxc.b == null) {
        break;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt >= 64)
    {
      b();
      this.b.a(paramInt - 64);
    }
    for (;;)
    {
      return;
      this.a |= 1L << paramInt;
    }
  }
  
  final void a(int paramInt, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    xc localxc = this;
    if (paramInt >= 64)
    {
      localxc.b();
      localxc.b.a(paramInt - 64, bool);
    }
    label44:
    label123:
    label129:
    for (;;)
    {
      return;
      if ((localxc.a & 0x8000000000000000) != 0L)
      {
        paramBoolean = true;
        long l2 = (1L << paramInt) - 1L;
        long l1 = localxc.a;
        localxc.a = (((l2 ^ 0xFFFFFFFFFFFFFFFF) & localxc.a) << 1 | l1 & l2);
        if (!bool) {
          break label123;
        }
        localxc.a(paramInt);
      }
      for (;;)
      {
        if ((!paramBoolean) && (localxc.b == null)) {
          break label129;
        }
        localxc.b();
        localxc = localxc.b;
        paramInt = 0;
        bool = paramBoolean;
        break;
        paramBoolean = false;
        break label44;
        localxc.e(paramInt);
      }
    }
  }
  
  public final boolean b(int paramInt)
  {
    xc localxc = this;
    while (paramInt >= 64)
    {
      localxc.b();
      localxc = localxc.b;
      paramInt -= 64;
    }
    if ((localxc.a & 1L << paramInt) != 0L) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean c(int paramInt)
  {
    xc localxc = this;
    while (paramInt >= 64)
    {
      localxc.b();
      localxc = localxc.b;
      paramInt -= 64;
    }
    long l1 = 1L << paramInt;
    if ((localxc.a & l1) != 0L) {}
    for (boolean bool = true;; bool = false)
    {
      localxc.a &= (l1 ^ 0xFFFFFFFFFFFFFFFF);
      l1 -= 1L;
      long l2 = localxc.a;
      localxc.a = (Long.rotateRight((l1 ^ 0xFFFFFFFFFFFFFFFF) & localxc.a, 1) | l2 & l1);
      if (localxc.b != null)
      {
        if (localxc.b.b(0)) {
          localxc.a(63);
        }
        localxc.b.c(0);
      }
      return bool;
    }
  }
  
  final int d(int paramInt)
  {
    if (this.b == null) {
      if (paramInt >= 64) {
        paramInt = Long.bitCount(this.a);
      }
    }
    for (;;)
    {
      return paramInt;
      paramInt = Long.bitCount(this.a & (1L << paramInt) - 1L);
      continue;
      if (paramInt < 64) {
        paramInt = Long.bitCount(this.a & (1L << paramInt) - 1L);
      } else {
        paramInt = this.b.d(paramInt - 64) + Long.bitCount(this.a);
      }
    }
  }
  
  public final String toString()
  {
    if (this.b == null) {}
    for (String str = Long.toBinaryString(this.a);; str = this.b.toString() + "xx" + Long.toBinaryString(this.a)) {
      return str;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */