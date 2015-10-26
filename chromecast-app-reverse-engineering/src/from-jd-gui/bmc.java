import android.app.Activity;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

final class bmc
  implements View.OnFocusChangeListener
{
  bmc(View paramView, View.OnFocusChangeListener paramOnFocusChangeListener, Activity paramActivity, TextView paramTextView) {}
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean) {
      apg.a(129).b();
    }
    View localView = this.a;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      if (this.b != null) {
        this.b.onFocusChange(paramView, paramBoolean);
      }
      ((InputMethodManager)this.c.getSystemService("input_method")).hideSoftInputFromWindow(this.d.getWindowToken(), 0);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */