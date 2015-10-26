import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class pl
  implements vs
{
  private ActionMode.Callback a;
  private Context b;
  private ArrayList c;
  private ep d;
  
  public pl(Context paramContext, ActionMode.Callback paramCallback)
  {
    this.b = paramContext;
    this.a = paramCallback;
    this.c = new ArrayList();
    this.d = new ep();
  }
  
  private Menu a(Menu paramMenu)
  {
    Menu localMenu2 = (Menu)this.d.get(paramMenu);
    Menu localMenu1 = localMenu2;
    if (localMenu2 == null)
    {
      localMenu1 = a.a(this.b, (cc)paramMenu);
      this.d.put(paramMenu, localMenu1);
    }
    return localMenu1;
  }
  
  public final void a(vr paramvr)
  {
    this.a.onDestroyActionMode(b(paramvr));
  }
  
  public final boolean a(vr paramvr, Menu paramMenu)
  {
    return this.a.onCreateActionMode(b(paramvr), a(paramMenu));
  }
  
  public final boolean a(vr paramvr, MenuItem paramMenuItem)
  {
    return this.a.onActionItemClicked(b(paramvr), a.a(this.b, (cd)paramMenuItem));
  }
  
  public final ActionMode b(vr paramvr)
  {
    int j = this.c.size();
    int i = 0;
    if (i < j)
    {
      pk localpk = (pk)this.c.get(i);
      if ((localpk != null) && (localpk.a == paramvr)) {
        paramvr = localpk;
      }
    }
    for (;;)
    {
      return paramvr;
      i++;
      break;
      paramvr = new pk(this.b, paramvr);
      this.c.add(paramvr);
    }
  }
  
  public final boolean b(vr paramvr, Menu paramMenu)
  {
    return this.a.onPrepareActionMode(b(paramvr), a(paramMenu));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */