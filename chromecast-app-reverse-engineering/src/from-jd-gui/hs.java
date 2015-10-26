import android.support.v4.view.ViewPager;

public final class hs
  implements Runnable
{
  public hs(ViewPager paramViewPager) {}
  
  public final void run()
  {
    ViewPager.a(this.a, 0);
    this.a.b();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\hs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */