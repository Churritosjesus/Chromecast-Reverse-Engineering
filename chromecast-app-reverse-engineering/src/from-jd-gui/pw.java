import android.content.Context;
import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

class pw
  extends px
{
  final Context a;
  Map b;
  Map c;
  
  pw(Context paramContext, Object paramObject)
  {
    super(paramObject);
    this.a = paramContext;
  }
  
  final MenuItem a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof cd))
    {
      cd localcd = (cd)paramMenuItem;
      if (this.b == null) {
        this.b = new ed();
      }
      MenuItem localMenuItem = (MenuItem)this.b.get(paramMenuItem);
      paramMenuItem = localMenuItem;
      if (localMenuItem == null)
      {
        paramMenuItem = a.a(this.a, localcd);
        this.b.put(localcd, paramMenuItem);
      }
    }
    for (;;)
    {
      return paramMenuItem;
    }
  }
  
  final SubMenu a(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof ce))
    {
      ce localce = (ce)paramSubMenu;
      if (this.c == null) {
        this.c = new ed();
      }
      SubMenu localSubMenu = (SubMenu)this.c.get(localce);
      paramSubMenu = localSubMenu;
      if (localSubMenu == null)
      {
        paramSubMenu = this.a;
        if (Build.VERSION.SDK_INT < 14) {
          break label87;
        }
        paramSubMenu = new qv(paramSubMenu, localce);
        this.c.put(localce, paramSubMenu);
      }
    }
    for (;;)
    {
      return paramSubMenu;
      label87:
      throw new UnsupportedOperationException();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */