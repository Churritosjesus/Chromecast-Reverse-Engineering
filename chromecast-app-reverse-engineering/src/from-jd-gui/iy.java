import android.view.WindowInsets;

public final class iy
  extends ix
{
  public final WindowInsets a;
  
  public iy(WindowInsets paramWindowInsets)
  {
    this.a = paramWindowInsets;
  }
  
  public final int a()
  {
    return this.a.getSystemWindowInsetLeft();
  }
  
  public final ix a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new iy(this.a.replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public final int b()
  {
    return this.a.getSystemWindowInsetTop();
  }
  
  public final int c()
  {
    return this.a.getSystemWindowInsetRight();
  }
  
  public final int d()
  {
    return this.a.getSystemWindowInsetBottom();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\iy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */