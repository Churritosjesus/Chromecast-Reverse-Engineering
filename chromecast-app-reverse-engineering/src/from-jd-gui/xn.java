final class xn
{
  public zr a;
  public zr b;
  public int c;
  public int d;
  public int e;
  public int f;
  
  private xn(zr paramzr1, zr paramzr2)
  {
    this.a = paramzr1;
    this.b = paramzr2;
  }
  
  xn(zr paramzr1, zr paramzr2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramzr1, paramzr2);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
  }
  
  public final String toString()
  {
    return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */