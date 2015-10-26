import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class xv
  extends ViewGroup.MarginLayoutParams
{
  public float g;
  public int h = -1;
  
  public xv(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.g = 0.0F;
  }
  
  public xv(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, oq.ak);
    this.g = paramContext.getFloat(oq.am, 0.0F);
    this.h = paramContext.getInt(oq.al, -1);
    paramContext.recycle();
  }
  
  public xv(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */