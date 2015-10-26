import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import com.google.android.gms.people.accountswitcherview.AccountSwitcherView;

public final class cqi
  implements View.OnApplyWindowInsetsListener
{
  public cqi(AccountSwitcherView paramAccountSwitcherView) {}
  
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    AccountSwitcherView.a(this.a, paramWindowInsets.getSystemWindowInsetTop());
    return paramWindowInsets;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */