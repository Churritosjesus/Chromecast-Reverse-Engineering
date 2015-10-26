import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ActionBarContainer;

public final class rd
  extends rc
{
  public rd(ActionBarContainer paramActionBarContainer)
  {
    super(paramActionBarContainer);
  }
  
  public final void getOutline(Outline paramOutline)
  {
    if (this.a.e) {
      if (this.a.d != null) {
        this.a.d.getOutline(paramOutline);
      }
    }
    for (;;)
    {
      return;
      if (this.a.b != null) {
        this.a.b.getOutline(paramOutline);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */