import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class sc
  implements ViewTreeObserver.OnScrollChangedListener
{
  sc(Field paramField, PopupWindow paramPopupWindow, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener) {}
  
  public final void onScrollChanged()
  {
    for (;;)
    {
      try
      {
        WeakReference localWeakReference = (WeakReference)this.a.get(this.b);
        if ((localWeakReference == null) || (localWeakReference.get() == null)) {
          return;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        continue;
      }
      this.c.onScrollChanged();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */