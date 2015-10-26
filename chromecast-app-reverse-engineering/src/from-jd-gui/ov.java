import android.view.Menu;
import android.view.Window.Callback;

final class ov
  implements Runnable
{
  ov(ou paramou) {}
  
  public final void run()
  {
    ou localou = this.a;
    Menu localMenu = localou.h();
    if ((localMenu instanceof qa)) {}
    for (localqa = (qa)localMenu;; localqa = null)
    {
      if (localqa != null) {
        localqa.d();
      }
      try
      {
        localMenu.clear();
        if ((!localou.c.onCreatePanelMenu(0, localMenu)) || (!localou.c.onPreparePanel(0, null, localMenu))) {
          localMenu.clear();
        }
        return;
      }
      finally
      {
        if (localqa == null) {
          break;
        }
        localqa.e();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */