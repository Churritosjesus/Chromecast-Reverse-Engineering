import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

final class po
{
  Menu a;
  int b;
  int c;
  int d;
  int e;
  boolean f;
  boolean g;
  boolean h;
  int i;
  int j;
  CharSequence k;
  CharSequence l;
  int m;
  char n;
  char o;
  int p;
  boolean q;
  boolean r;
  boolean s;
  int t;
  int u;
  String v;
  String w;
  String x;
  fb y;
  
  public po(pm parampm, Menu paramMenu)
  {
    this.a = paramMenu;
    a();
  }
  
  static char a(String paramString)
  {
    char c1 = '\000';
    if (paramString == null) {}
    for (;;)
    {
      return c1;
      c1 = paramString.charAt(0);
    }
  }
  
  Object a(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      paramArrayOfClass = pm.a(this.z).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
      paramString = paramArrayOfClass;
    }
    catch (Exception paramArrayOfClass)
    {
      for (;;)
      {
        Log.w("SupportMenuInflater", "Cannot instantiate class: " + paramString, paramArrayOfClass);
        paramString = null;
      }
    }
    return paramString;
  }
  
  public final void a()
  {
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = true;
    this.g = true;
  }
  
  void a(MenuItem paramMenuItem)
  {
    int i1 = 1;
    Object localObject = paramMenuItem.setChecked(this.q).setVisible(this.r).setEnabled(this.s);
    if (this.p > 0) {}
    for (boolean bool = true;; bool = false)
    {
      ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(this.l).setIcon(this.m).setAlphabeticShortcut(this.n).setNumericShortcut(this.o);
      if (this.t >= 0) {
        fx.a(paramMenuItem, this.t);
      }
      if (this.x == null) {
        break label162;
      }
      if (!pm.a(this.z).isRestricted()) {
        break;
      }
      throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
    }
    paramMenuItem.setOnMenuItemClickListener(new pn(pm.b(this.z), this.x));
    label162:
    if (this.p >= 2)
    {
      if ((paramMenuItem instanceof qe)) {
        ((qe)paramMenuItem).a(true);
      }
    }
    else
    {
      if (this.v == null) {
        break label356;
      }
      fx.a(paramMenuItem, (View)a(this.v, pm.a(), pm.c(this.z)));
    }
    for (;;)
    {
      if (this.u > 0)
      {
        if (i1 != 0) {
          break label344;
        }
        fx.b(paramMenuItem, this.u);
      }
      for (;;)
      {
        if (this.y != null) {
          fx.a(paramMenuItem, this.y);
        }
        return;
        if (!(paramMenuItem instanceof qg)) {
          break;
        }
        localObject = (qg)paramMenuItem;
        try
        {
          if (((qg)localObject).e == null) {
            ((qg)localObject).e = ((cd)((qg)localObject).d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
          }
          ((qg)localObject).e.invoke(((qg)localObject).d, new Object[] { Boolean.valueOf(true) });
        }
        catch (Exception localException)
        {
          Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", localException);
        }
        break;
        label344:
        Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
      }
      label356:
      i1 = 0;
    }
  }
  
  public final SubMenu b()
  {
    this.h = true;
    SubMenu localSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
    a(localSubMenu.getItem());
    return localSubMenu;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\po.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */