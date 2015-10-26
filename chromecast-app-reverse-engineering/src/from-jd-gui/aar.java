import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public final class aar
  implements qp
{
  public qe a;
  private qa b;
  
  public aar(Toolbar paramToolbar) {}
  
  public final void a(Context paramContext, qa paramqa)
  {
    if ((this.b != null) && (this.a != null)) {
      this.b.b(this.a);
    }
    this.b = paramqa;
  }
  
  public final void a(qa paramqa, boolean paramBoolean) {}
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(qu paramqu)
  {
    return false;
  }
  
  public final void b(boolean paramBoolean)
  {
    int k = 0;
    int i;
    int m;
    if (this.a != null)
    {
      i = k;
      if (this.b != null) {
        m = this.b.size();
      }
    }
    for (int j = 0;; j++)
    {
      i = k;
      if (j < m)
      {
        if (this.b.getItem(j) == this.a) {
          i = 1;
        }
      }
      else
      {
        if (i == 0) {
          c(this.a);
        }
        return;
      }
    }
  }
  
  public final boolean b(qe paramqe)
  {
    Toolbar.b(this.c);
    if (Toolbar.c(this.c).getParent() != this.c) {
      this.c.addView(Toolbar.c(this.c));
    }
    this.c.e = paramqe.getActionView();
    this.a = paramqe;
    if (this.c.e.getParent() != this.c)
    {
      aas localaas = Toolbar.g();
      localaas.a = (0x800003 | Toolbar.d(this.c) & 0x70);
      localaas.b = 2;
      this.c.e.setLayoutParams(localaas);
      this.c.addView(this.c.e);
    }
    Toolbar.a(this.c, true);
    this.c.requestLayout();
    paramqe.e(true);
    if ((this.c.e instanceof vt)) {
      ((vt)this.c.e).a();
    }
    return true;
  }
  
  public final boolean c(qe paramqe)
  {
    if ((this.c.e instanceof vt)) {
      ((vt)this.c.e).b();
    }
    this.c.removeView(this.c.e);
    this.c.removeView(Toolbar.c(this.c));
    this.c.e = null;
    Toolbar.a(this.c, false);
    this.a = null;
    this.c.requestLayout();
    paramqe.e(false);
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */