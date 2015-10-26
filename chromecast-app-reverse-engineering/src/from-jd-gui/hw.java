import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class hw
  extends er
{
  public hw(ViewPager paramViewPager) {}
  
  private boolean a()
  {
    boolean bool = true;
    if ((ViewPager.a(this.b) != null) && (ViewPager.a(this.b).a() > 1)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public final void a(View paramView, jd paramjd)
  {
    super.a(paramView, paramjd);
    paramjd.a(ViewPager.class.getName());
    paramjd.c(a());
    if (this.b.canScrollHorizontally(1)) {
      paramjd.a(4096);
    }
    if (this.b.canScrollHorizontally(-1)) {
      paramjd.a(8192);
    }
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool = true;
    if (super.a(paramView, paramInt, paramBundle)) {}
    for (;;)
    {
      return bool;
      switch (paramInt)
      {
      default: 
        bool = false;
        break;
      case 4096: 
        if (this.b.canScrollHorizontally(1)) {
          this.b.a(ViewPager.b(this.b) + 1);
        } else {
          bool = false;
        }
        break;
      case 8192: 
        if (this.b.canScrollHorizontally(-1)) {
          this.b.a(ViewPager.b(this.b) - 1);
        } else {
          bool = false;
        }
        break;
      }
    }
  }
  
  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    paramView = jx.a();
    paramView.a(a());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.a(this.b) != null))
    {
      paramView.a(ViewPager.a(this.b).a());
      paramView.b(ViewPager.b(this.b));
      paramView.c(ViewPager.b(this.b));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */