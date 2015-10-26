package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import tf;
import th;

public class TintImageView
  extends ImageView
{
  private static final int[] a = { 16842964, 16843033 };
  private final tf b;
  
  public TintImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TintImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TintImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = th.a(getContext(), paramAttributeSet, a, paramInt, 0);
    if (paramContext.a.length() > 0)
    {
      if (paramContext.d(0)) {
        setBackgroundDrawable(paramContext.a(0));
      }
      if (paramContext.d(1)) {
        setImageDrawable(paramContext.a(1));
      }
    }
    paramContext.a.recycle();
    this.b = paramContext.a();
  }
  
  public void setImageResource(int paramInt)
  {
    setImageDrawable(this.b.a(paramInt, false));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\widget\TintImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */