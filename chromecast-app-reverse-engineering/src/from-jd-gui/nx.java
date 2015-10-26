import android.view.Window;
import android.view.Window.Callback;

final class nx
  implements qq
{
  nx(no paramno) {}
  
  public final void a(qa paramqa, boolean paramBoolean)
  {
    qa localqa = paramqa.k();
    int i;
    if (localqa != paramqa)
    {
      i = 1;
      no localno = this.a;
      if (i != 0) {
        paramqa = localqa;
      }
      paramqa = localno.a(paramqa);
      if (paramqa != null)
      {
        if (i == 0) {
          break label71;
        }
        this.a.a(paramqa.a, paramqa, localqa);
        this.a.a(paramqa, true);
      }
    }
    for (;;)
    {
      return;
      i = 0;
      break;
      label71:
      this.a.a(paramqa, paramBoolean);
    }
  }
  
  public final boolean a_(qa paramqa)
  {
    if ((paramqa == null) && (this.a.g))
    {
      Window.Callback localCallback = this.a.b.getCallback();
      if ((localCallback != null) && (!this.a.m)) {
        localCallback.onMenuOpened(8, paramqa);
      }
    }
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */