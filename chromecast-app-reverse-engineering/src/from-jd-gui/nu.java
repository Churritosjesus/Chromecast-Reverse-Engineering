import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

final class nu
  implements vs
{
  private vs a;
  
  public nu(no paramno, vs paramvs)
  {
    this.a = paramvs;
  }
  
  public final void a(vr paramvr)
  {
    this.a.a(paramvr);
    if (this.b.q != null)
    {
      this.b.b.getDecorView().removeCallbacks(this.b.r);
      this.b.q.dismiss();
    }
    for (;;)
    {
      if (this.b.p != null) {
        this.b.p.removeAllViews();
      }
      this.b.o = null;
      return;
      if (this.b.p != null)
      {
        this.b.p.setVisibility(8);
        if (this.b.p.getParent() != null) {
          gt.q((View)this.b.p.getParent());
        }
      }
    }
  }
  
  public final boolean a(vr paramvr, Menu paramMenu)
  {
    return this.a.a(paramvr, paramMenu);
  }
  
  public final boolean a(vr paramvr, MenuItem paramMenuItem)
  {
    return this.a.a(paramvr, paramMenuItem);
  }
  
  public final boolean b(vr paramvr, Menu paramMenu)
  {
    return this.a.b(paramvr, paramMenu);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */