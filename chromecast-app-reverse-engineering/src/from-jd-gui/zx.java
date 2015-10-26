import android.content.Context;
import android.support.v7.widget.SearchView;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Method;

public final class zx
  implements Runnable
{
  public zx(SearchView paramSearchView) {}
  
  public final void run()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getContext().getSystemService("input_method");
    aaj localaaj;
    SearchView localSearchView;
    if (localInputMethodManager != null)
    {
      localaaj = SearchView.m;
      localSearchView = this.a;
      if (localaaj.c == null) {
        break label62;
      }
    }
    for (;;)
    {
      try
      {
        localaaj.c.invoke(localInputMethodManager, new Object[] { Integer.valueOf(0), null });
        return;
      }
      catch (Exception localException) {}
      label62:
      localInputMethodManager.showSoftInput(localSearchView, 0);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */