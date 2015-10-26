import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

public final class aaj
{
  public Method a;
  public Method b;
  Method c;
  private Method d;
  
  public aaj()
  {
    try
    {
      this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
      this.a.setAccessible(true);
      try
      {
        this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.b.setAccessible(true);
        try
        {
          this.d = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
          this.d.setAccessible(true);
          try
          {
            this.c = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[] { Integer.TYPE, ResultReceiver.class });
            this.c.setAccessible(true);
            return;
          }
          catch (NoSuchMethodException localNoSuchMethodException1)
          {
            for (;;) {}
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          for (;;) {}
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException3)
      {
        for (;;) {}
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException4)
    {
      for (;;) {}
    }
  }
  
  public final void a(AutoCompleteTextView paramAutoCompleteTextView, boolean paramBoolean)
  {
    if (this.d != null) {}
    try
    {
      this.d.invoke(paramAutoCompleteTextView, new Object[] { Boolean.valueOf(true) });
      return;
    }
    catch (Exception paramAutoCompleteTextView)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */