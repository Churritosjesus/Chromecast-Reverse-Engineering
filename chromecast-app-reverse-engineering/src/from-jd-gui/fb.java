import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class fb
{
  public final Context a;
  public fc b;
  private fd c;
  
  public fb(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public abstract View a();
  
  public View a(MenuItem paramMenuItem)
  {
    return a();
  }
  
  public void a(SubMenu paramSubMenu) {}
  
  public void a(fd paramfd)
  {
    if ((this.c != null) && (paramfd != null)) {
      Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
    }
    this.c = paramfd;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b != null) {
      this.b.a(paramBoolean);
    }
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean c()
  {
    return true;
  }
  
  public void d()
  {
    if ((this.c != null) && (b()))
    {
      fd localfd = this.c;
      c();
      localfd.a();
    }
  }
  
  public boolean e()
  {
    return false;
  }
  
  public boolean f()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */