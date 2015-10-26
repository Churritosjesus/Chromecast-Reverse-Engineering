import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class qm
  extends qh
  implements ActionProvider.VisibilityListener
{
  private fd d;
  
  public qm(ql paramql, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramql, paramContext, paramActionProvider);
  }
  
  public final View a(MenuItem paramMenuItem)
  {
    return this.c.onCreateActionView(paramMenuItem);
  }
  
  public final void a(fd paramfd)
  {
    this.d = paramfd;
    ActionProvider localActionProvider = this.c;
    if (paramfd != null) {}
    for (paramfd = this;; paramfd = null)
    {
      localActionProvider.setVisibilityListener(paramfd);
      return;
    }
  }
  
  public final boolean b()
  {
    return this.c.overridesItemVisibility();
  }
  
  public final boolean c()
  {
    return this.c.isVisible();
  }
  
  public final void d()
  {
    this.c.refreshVisibility();
  }
  
  public final void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    if (this.d != null) {
      this.d.a();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */