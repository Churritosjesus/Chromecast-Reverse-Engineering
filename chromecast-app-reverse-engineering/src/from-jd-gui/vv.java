import android.content.Context;
import android.view.MenuItem;
import android.view.View;

final class vv
  extends qn
{
  public vv(vu paramvu, Context paramContext, qu paramqu)
  {
    super(paramContext, paramqu, null, false, a.s);
    int j;
    if (!((qe)paramqu.getItem()).f())
    {
      if (paramvu.f == null)
      {
        paramContext = (View)paramvu.e;
        this.b = paramContext;
      }
    }
    else
    {
      this.d = paramvu.m;
      j = paramqu.size();
    }
    for (int i = 0;; i++)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        paramvu = paramqu.getItem(i);
        if ((paramvu.isVisible()) && (paramvu.getIcon() != null)) {
          bool1 = true;
        }
      }
      else
      {
        this.e = bool1;
        return;
        paramContext = paramvu.f;
        break;
      }
    }
  }
  
  public final void onDismiss()
  {
    super.onDismiss();
    this.g.k = null;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */