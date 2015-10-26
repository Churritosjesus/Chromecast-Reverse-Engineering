import android.content.Context;
import android.view.MenuItem;
import android.view.View;

public final class yt
  implements qb, qq
{
  public Context a;
  public qa b;
  public qn c;
  public wg d;
  private View e;
  
  public yt(Context paramContext, View paramView, int paramInt)
  {
    this(paramContext, paramView, 5, a.L, 0);
  }
  
  private yt(Context paramContext, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramContext;
    this.b = new qa(paramContext);
    this.b.a(this);
    this.e = paramView;
    this.c = new qn(paramContext, this.b, paramView, false, paramInt2, 0);
    this.c.f = paramInt1;
    this.c.d = this;
  }
  
  public final void a(qa paramqa) {}
  
  public final void a(qa paramqa, boolean paramBoolean) {}
  
  public final boolean a(qa paramqa, MenuItem paramMenuItem)
  {
    if (this.d != null) {}
    for (boolean bool = this.d.a(paramMenuItem);; bool = false) {
      return bool;
    }
  }
  
  public final boolean a_(qa paramqa)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramqa == null) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (paramqa.hasVisibleItems())
      {
        new qn(this.a, paramqa, this.e).b();
        bool1 = bool2;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */