import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public final class hv
  extends ViewGroup.LayoutParams
{
  public boolean a;
  public int b;
  public float c = 0.0F;
  public boolean d;
  public int e;
  public int f;
  
  public hv()
  {
    super(-1, -1);
  }
  
  public hv(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ViewPager.c());
    this.b = paramContext.getInteger(0, 48);
    paramContext.recycle();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\hv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */