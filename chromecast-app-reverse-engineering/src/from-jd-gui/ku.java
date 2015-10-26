import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class ku
  extends ViewGroup.MarginLayoutParams
{
  public int a = 0;
  public float b;
  public boolean c;
  public boolean d;
  
  public ku(int paramInt1, int paramInt2)
  {
    super(-1, -1);
  }
  
  public ku(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.a());
    this.a = paramContext.getInt(0, 0);
    paramContext.recycle();
  }
  
  public ku(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public ku(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public ku(ku paramku)
  {
    super(paramku);
    this.a = paramku.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */