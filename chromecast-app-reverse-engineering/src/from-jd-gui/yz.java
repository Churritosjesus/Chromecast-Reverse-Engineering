import android.view.ViewGroup;

public abstract class yz
{
  public final za a = new za();
  private boolean b = false;
  
  public abstract int a();
  
  public int a(int paramInt)
  {
    return 0;
  }
  
  public abstract zr a(ViewGroup paramViewGroup, int paramInt);
  
  public abstract void a(zr paramzr, int paramInt);
  
  public final void b(int paramInt)
  {
    this.a.a(paramInt, 1);
  }
  
  public final void b(zr paramzr, int paramInt)
  {
    paramzr.b = paramInt;
    paramzr.a(1, 519);
    a.a("RV OnBindView");
    a(paramzr, paramInt);
    a.b();
  }
  
  public final void c(int paramInt)
  {
    this.a.b(paramInt, 1);
  }
  
  public final void d(int paramInt)
  {
    this.a.c(paramInt, 1);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */