final class dks
{
  final byte[] a;
  int b;
  int c;
  boolean d;
  boolean e;
  dks f;
  dks g;
  
  dks()
  {
    this.a = new byte['ࠀ'];
    this.e = true;
    this.d = false;
  }
  
  dks(dks paramdks)
  {
    this(paramdks.a, paramdks.b, paramdks.c);
    paramdks.d = true;
  }
  
  private dks(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = false;
    this.d = true;
  }
  
  public final dks a()
  {
    if (this.f != this) {}
    for (dks localdks = this.f;; localdks = null)
    {
      this.g.f = this.f;
      this.f.g = this.g;
      this.f = null;
      this.g = null;
      return localdks;
    }
  }
  
  public final dks a(dks paramdks)
  {
    paramdks.g = this;
    paramdks.f = this.f;
    this.f.g = paramdks;
    this.f = paramdks;
    return paramdks;
  }
  
  public final void a(dks paramdks, int paramInt)
  {
    if (!paramdks.e) {
      throw new IllegalArgumentException();
    }
    if (paramdks.c + paramInt > 2048)
    {
      if (paramdks.d) {
        throw new IllegalArgumentException();
      }
      if (paramdks.c + paramInt - paramdks.b > 2048) {
        throw new IllegalArgumentException();
      }
      System.arraycopy(paramdks.a, paramdks.b, paramdks.a, 0, paramdks.c - paramdks.b);
      paramdks.c -= paramdks.b;
      paramdks.b = 0;
    }
    System.arraycopy(this.a, this.b, paramdks.a, paramdks.c, paramInt);
    paramdks.c += paramInt;
    this.b += paramInt;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */