import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;

public class bgn
  extends mm
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.gf);
    a((Toolbar)findViewById(f.eo));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (blx.a(paramInt)) {}
    for (boolean bool = true;; bool = super.onKeyDown(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (blx.a(paramInt, this)) {}
    for (boolean bool = true;; bool = super.onKeyUp(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */