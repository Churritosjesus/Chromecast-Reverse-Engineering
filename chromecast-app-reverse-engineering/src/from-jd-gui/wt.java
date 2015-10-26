import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class wt
  extends TextView
{
  public wt(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public wt(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public wt(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, oq.O, paramInt, 0);
    int i = localTypedArray.getResourceId(oq.P, -1);
    localTypedArray.recycle();
    if (i != -1)
    {
      localTypedArray = paramContext.obtainStyledAttributes(i, oq.bH);
      if (localTypedArray.hasValue(oq.bM)) {
        setAllCaps(localTypedArray.getBoolean(oq.bM, false));
      }
      localTypedArray.recycle();
    }
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, oq.O, paramInt, 0);
    if (paramContext.hasValue(oq.Q)) {
      setAllCaps(paramContext.getBoolean(oq.Q, false));
    }
    paramContext.recycle();
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (pg localpg = new pg(getContext());; localpg = null)
    {
      setTransformationMethod(localpg);
      return;
    }
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramInt, oq.bH);
    if (paramContext.hasValue(oq.bM)) {
      setAllCaps(paramContext.getBoolean(oq.bM, false));
    }
    paramContext.recycle();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */