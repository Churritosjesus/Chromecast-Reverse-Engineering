public final class dix
{
  int a;
  int b;
  int c;
  final int[] d = new int[10];
  
  final int a()
  {
    if ((this.a & 0x2) != 0) {}
    for (int i = this.d[1];; i = -1) {
      return i;
    }
  }
  
  final dix a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 >= this.d.length) {
      return this;
    }
    int i = 1 << paramInt1;
    this.a |= i;
    if ((paramInt2 & 0x1) != 0)
    {
      this.b |= i;
      label44:
      if ((paramInt2 & 0x2) == 0) {
        break label87;
      }
    }
    label87:
    for (this.c = (i | this.c);; this.c = ((i ^ 0xFFFFFFFF) & this.c))
    {
      this.d[paramInt1] = paramInt3;
      break;
      this.b &= (i ^ 0xFFFFFFFF);
      break label44;
    }
  }
  
  final boolean a(int paramInt)
  {
    boolean bool = true;
    if ((1 << paramInt & this.a) != 0) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  final int b(int paramInt)
  {
    int j = 0;
    if ((1 << paramInt & this.c) != 0)
    {
      i = 1;
      if (i == 0) {
        break label51;
      }
    }
    label51:
    for (int i = 2;; i = 0)
    {
      if ((1 << paramInt & this.b) != 0) {
        j = 1;
      }
      paramInt = i;
      if (j != 0) {
        paramInt = i | 0x1;
      }
      return paramInt;
      i = 0;
      break;
    }
  }
  
  public final int c(int paramInt)
  {
    if ((this.a & 0x80) != 0) {}
    for (paramInt = this.d[7];; paramInt = 65536) {
      return paramInt;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */