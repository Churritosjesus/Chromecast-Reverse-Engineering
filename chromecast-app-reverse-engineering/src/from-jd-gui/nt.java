import android.view.Window;
import android.view.Window.Callback;

final class nt
  implements qq
{
  nt(no paramno) {}
  
  public final void a(qa paramqa, boolean paramBoolean)
  {
    this.a.b(paramqa);
  }
  
  public final boolean a_(qa paramqa)
  {
    Window.Callback localCallback = this.a.b.getCallback();
    if (localCallback != null) {
      localCallback.onMenuOpened(8, paramqa);
    }
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */