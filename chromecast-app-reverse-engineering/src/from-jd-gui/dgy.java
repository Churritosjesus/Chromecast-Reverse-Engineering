import java.net.Socket;

abstract class dgy
  implements dkv
{
  public boolean a;
  private dkh b = new dkh(this.c.c.a());
  
  private dgy(dgx paramdgx) {}
  
  public final dkw a()
  {
    return this.b;
  }
  
  protected final void a(boolean paramBoolean)
  {
    if (this.c.e != 5) {
      throw new IllegalStateException("state: " + this.c.e);
    }
    dgx.a(this.c, this.b);
    this.c.e = 0;
    if ((paramBoolean) && (this.c.f == 1))
    {
      this.c.f = 0;
      dgi.b.a(this.c.a, this.c.b);
    }
    for (;;)
    {
      return;
      if (this.c.f == 2)
      {
        this.c.e = 6;
        this.c.b.c.close();
      }
    }
  }
  
  protected final void b()
  {
    dgs.a(this.c.b.c);
    this.c.e = 6;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */