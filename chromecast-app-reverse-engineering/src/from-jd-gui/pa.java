import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import android.widget.ListAdapter;

final class pa
  extends pr
{
  public pa(ou paramou, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public final View onCreatePanelView(int paramInt)
  {
    Object localObject1;
    switch (paramInt)
    {
    default: 
      localObject1 = super.onCreatePanelView(paramInt);
    }
    for (;;)
    {
      return (View)localObject1;
      Menu localMenu = this.a.a.o();
      if ((!onPreparePanel(paramInt, null, localMenu)) || (!onMenuOpened(paramInt, localMenu))) {
        break;
      }
      ou localou = this.a;
      qa localqa;
      Object localObject2;
      if ((localou.d == null) && ((localMenu instanceof qa)))
      {
        localqa = (qa)localMenu;
        localObject2 = localou.a.b();
        TypedValue localTypedValue = new TypedValue();
        localObject1 = ((Context)localObject2).getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(((Context)localObject2).getTheme());
        ((Resources.Theme)localObject1).resolveAttribute(a.g, localTypedValue, true);
        if (localTypedValue.resourceId != 0) {
          ((Resources.Theme)localObject1).applyStyle(localTypedValue.resourceId, true);
        }
        ((Resources.Theme)localObject1).resolveAttribute(a.K, localTypedValue, true);
        if (localTypedValue.resourceId == 0) {
          break label264;
        }
        ((Resources.Theme)localObject1).applyStyle(localTypedValue.resourceId, true);
      }
      for (;;)
      {
        localObject2 = new ContextThemeWrapper((Context)localObject2, 0);
        ((Context)localObject2).getTheme().setTo((Resources.Theme)localObject1);
        localou.d = new py((Context)localObject2, a.bL);
        localou.d.d = new oz(localou);
        localqa.a(localou.d);
        if ((localMenu != null) && (localou.d != null)) {
          break label275;
        }
        localObject1 = null;
        break;
        label264:
        ((Resources.Theme)localObject1).applyStyle(a.bZ, true);
      }
      label275:
      if (localou.d.b().getCount() > 0) {
        localObject1 = (View)localou.d.a(localou.a.a());
      } else {
        localObject1 = null;
      }
    }
  }
  
  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
    if ((bool) && (!this.a.b))
    {
      this.a.a.k();
      this.a.b = true;
    }
    return bool;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */