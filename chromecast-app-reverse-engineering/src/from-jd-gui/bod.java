import android.view.View;
import com.google.android.apps.chromecast.app.widget.SlidingTabLayout;

public final class bod
  implements hx
{
  private int a;
  
  public bod(SlidingTabLayout paramSlidingTabLayout) {}
  
  public final void a(int paramInt)
  {
    if (this.a == 0)
    {
      SlidingTabLayout.a(this.b).a(paramInt, 0.0F);
      SlidingTabLayout.a(this.b, paramInt, 0);
    }
    if (SlidingTabLayout.b(this.b) != null) {
      SlidingTabLayout.b(this.b).a(paramInt);
    }
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i = SlidingTabLayout.a(this.b).getChildCount();
    if ((i == 0) || (paramInt1 < 0) || (paramInt1 >= i)) {
      return;
    }
    SlidingTabLayout.a(this.b).a(paramInt1, paramFloat);
    View localView = SlidingTabLayout.a(this.b).getChildAt(paramInt1);
    if (localView != null) {}
    for (i = (int)(localView.getWidth() * paramFloat);; i = 0)
    {
      SlidingTabLayout.a(this.b, paramInt1, i);
      if (SlidingTabLayout.b(this.b) == null) {
        break;
      }
      SlidingTabLayout.b(this.b).a(paramInt1, paramFloat, paramInt2);
      break;
    }
  }
  
  public final void b(int paramInt)
  {
    this.a = paramInt;
    if (SlidingTabLayout.b(this.b) != null) {
      SlidingTabLayout.b(this.b).b(paramInt);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */