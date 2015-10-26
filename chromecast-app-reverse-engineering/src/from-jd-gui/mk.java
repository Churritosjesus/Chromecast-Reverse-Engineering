import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class mk
  extends ViewGroup.MarginLayoutParams
{
  public int a = 0;
  
  public mk(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.a = 8388627;
  }
  
  public mk(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, oq.t);
    this.a = paramContext.getInt(oq.u, 0);
    paramContext.recycle();
  }
  
  public mk(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public mk(mk parammk)
  {
    super(parammk);
    this.a = parammk.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */