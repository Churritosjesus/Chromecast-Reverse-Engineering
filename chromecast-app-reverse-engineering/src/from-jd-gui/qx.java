import android.view.View;

public final class qx
  implements iu
{
  private boolean a = false;
  private int b;
  
  protected qx(qw paramqw) {}
  
  public final qx a(ih paramih, int paramInt)
  {
    this.c.f = paramih;
    this.b = paramInt;
    return this;
  }
  
  public final void a(View paramView)
  {
    this.c.setVisibility(0);
    this.a = false;
  }
  
  public final void b(View paramView)
  {
    if (this.a) {}
    for (;;)
    {
      return;
      this.c.f = null;
      this.c.setVisibility(this.b);
      paramView = this.c.d;
    }
  }
  
  public final void c(View paramView)
  {
    this.a = true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */