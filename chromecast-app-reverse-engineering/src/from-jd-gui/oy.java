import android.view.MenuItem;
import android.view.Window.Callback;

final class oy
  implements qb
{
  oy(ou paramou) {}
  
  public final void a(qa paramqa)
  {
    if (this.a.c != null)
    {
      if (!this.a.a.g()) {
        break label41;
      }
      this.a.c.onPanelClosed(8, paramqa);
    }
    for (;;)
    {
      return;
      label41:
      if (this.a.c.onPreparePanel(0, null, paramqa)) {
        this.a.c.onMenuOpened(8, paramqa);
      }
    }
  }
  
  public final boolean a(qa paramqa, MenuItem paramMenuItem)
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\oy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */