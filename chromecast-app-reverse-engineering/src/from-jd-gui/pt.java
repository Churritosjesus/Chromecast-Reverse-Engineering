import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.widget.PopupWindow;

public final class pt
  extends yg
{
  public pt(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }
  
  public final yc a()
  {
    if (ActionMenuItemView.a(this.a) != null) {}
    for (yc localyc = ActionMenuItemView.a(this.a).a();; localyc = null) {
      return localyc;
    }
  }
  
  protected final boolean b()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (ActionMenuItemView.b(this.a) != null)
    {
      bool1 = bool2;
      if (ActionMenuItemView.b(this.a).a(ActionMenuItemView.c(this.a)))
      {
        yc localyc = a();
        bool1 = bool2;
        if (localyc != null)
        {
          bool1 = bool2;
          if (localyc.b.isShowing()) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */