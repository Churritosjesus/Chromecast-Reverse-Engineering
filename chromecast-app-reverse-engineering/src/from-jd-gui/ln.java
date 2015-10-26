import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;

public final class ln
{
  private static lp a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    for (a = new lo();; a = new lp()) {
      return;
    }
  }
  
  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */