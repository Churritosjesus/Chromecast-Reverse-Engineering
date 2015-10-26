import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class qh
  extends fb
{
  final ActionProvider c;
  
  public qh(qg paramqg, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramContext);
    this.c = paramActionProvider;
  }
  
  public final View a()
  {
    return this.c.onCreateActionView();
  }
  
  public final void a(SubMenu paramSubMenu)
  {
    this.c.onPrepareSubMenu(this.d.a(paramSubMenu));
  }
  
  public final boolean e()
  {
    return this.c.onPerformDefaultAction();
  }
  
  public final boolean f()
  {
    return this.c.hasSubMenu();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */