public class aec
{
  int a;
  int b;
  final int c;
  final float d;
  
  public aec()
  {
    this(2500, 1, 1.0F);
  }
  
  public aec(int paramInt1, int paramInt2, float paramFloat)
  {
    this.a = paramInt1;
    this.c = paramInt2;
    this.d = paramFloat;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(aef paramaef)
  {
    this.b += 1;
    this.a = ((int)(this.a + this.a * this.d));
    if (!c()) {
      throw paramaef;
    }
  }
  
  public int b()
  {
    return this.b;
  }
  
  protected boolean c()
  {
    if (this.b <= this.c) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */