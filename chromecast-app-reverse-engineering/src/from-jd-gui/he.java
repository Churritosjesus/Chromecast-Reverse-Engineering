import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

public final class he
  implements View.OnApplyWindowInsetsListener
{
  public he(gm paramgm) {}
  
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramWindowInsets = new iy(paramWindowInsets);
    return ((iy)this.a.a(paramView, paramWindowInsets)).a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */