import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.chromecast.app.widget.SlidingTabLayout;

public final class boe
  implements View.OnClickListener
{
  public boe(SlidingTabLayout paramSlidingTabLayout) {}
  
  public final void onClick(View paramView)
  {
    for (int i = 0;; i++)
    {
      if (i < SlidingTabLayout.a(this.a).getChildCount())
      {
        if (paramView != SlidingTabLayout.a(this.a).getChildAt(i)) {
          continue;
        }
        SlidingTabLayout.c(this.a).a(i);
        if (SlidingTabLayout.d(this.a) != null) {
          SlidingTabLayout.d(this.a).a(i);
        }
      }
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\boe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */