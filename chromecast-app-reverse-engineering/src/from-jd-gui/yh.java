import android.view.View;
import android.view.ViewParent;

final class yh
  implements Runnable
{
  yh(yg paramyg) {}
  
  public final void run()
  {
    yg.a(this.a).getParent().requestDisallowInterceptTouchEvent(true);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */