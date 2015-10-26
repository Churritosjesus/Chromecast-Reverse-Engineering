import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class zt
  extends er
{
  zt(zs paramzs) {}
  
  public final void a(View paramView, jd paramjd)
  {
    super.a(paramView, paramjd);
    if ((!this.b.a()) && (this.b.b.e != null)) {
      this.b.b.e.a(paramView, paramjd);
    }
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool2 = false;
    boolean bool1;
    if (super.a(paramView, paramInt, paramBundle)) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (!this.b.a())
      {
        bool1 = bool2;
        if (this.b.b.e != null)
        {
          paramBundle = this.b.b.e;
          paramView = paramBundle.e.a;
          paramView = paramBundle.e.n;
          bool1 = bool2;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */