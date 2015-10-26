class ddy
  extends ddl
{
  private static final long serialVersionUID = 1L;
  public final byte[] b;
  private int c = 0;
  
  ddy(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    byte[] arrayOfByte = this.b;
    int i = d() + paramInt2;
    for (paramInt2 = i; paramInt2 < i + paramInt3; paramInt2++) {
      paramInt1 = paramInt1 * 31 + arrayOfByte[paramInt2];
    }
    return paramInt1;
  }
  
  public ddm a()
  {
    return new ddz(this);
  }
  
  final boolean a(ddy paramddy, int paramInt1, int paramInt2)
  {
    if (paramInt2 > paramddy.b())
    {
      paramInt1 = b();
      throw new IllegalArgumentException(40 + "Length too large: " + paramInt2 + paramInt1);
    }
    if (paramInt1 + paramInt2 > paramddy.b())
    {
      i = paramddy.b();
      throw new IllegalArgumentException(59 + "Ran off end of other: " + paramInt1 + ", " + paramInt2 + ", " + i);
    }
    byte[] arrayOfByte2 = this.b;
    byte[] arrayOfByte1 = paramddy.b;
    int k = d();
    int j = d();
    int i = paramddy.d() + paramInt1;
    paramInt1 = j;
    if (paramInt1 < k + paramInt2) {
      if (arrayOfByte2[paramInt1] == arrayOfByte1[i]) {}
    }
    for (boolean bool = false;; bool = true)
    {
      return bool;
      paramInt1++;
      i++;
      break;
    }
  }
  
  public int b()
  {
    return this.b.length;
  }
  
  protected void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.b, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  protected int d()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof ddl))
      {
        bool = false;
      }
      else if (b() != ((ddl)paramObject).b())
      {
        bool = false;
      }
      else if (b() == 0)
      {
        bool = true;
      }
      else if ((paramObject instanceof ddy))
      {
        ddy localddy = (ddy)paramObject;
        if ((this.c != 0) && (localddy.c != 0) && (this.c != localddy.c)) {
          bool = false;
        } else {
          bool = a((ddy)paramObject, 0, b());
        }
      }
      else
      {
        if (!(paramObject instanceof deg)) {
          break;
        }
        bool = paramObject.equals(this);
      }
    }
    paramObject = String.valueOf(paramObject.getClass());
    throw new IllegalArgumentException(String.valueOf(paramObject).length() + 49 + "Has a new type of ByteString been created? Found " + (String)paramObject);
  }
  
  public int hashCode()
  {
    int j = this.c;
    int i = j;
    if (j == 0)
    {
      i = b();
      j = a(i, 0, i);
      i = j;
      if (j == 0) {
        i = 1;
      }
      this.c = i;
    }
    return i;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */