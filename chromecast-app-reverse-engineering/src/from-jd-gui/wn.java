import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public final class wn
  extends CheckedTextView
{
  private static final int[] a = { 16843016 };
  private tf b;
  
  public wn(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  private wn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 16843720);
    if (tf.a)
    {
      paramContext = th.a(getContext(), paramAttributeSet, a, 16843720, 0);
      setCheckMarkDrawable(paramContext.a(0));
      paramContext.a.recycle();
      this.b = paramContext.a();
    }
  }
  
  public final void setCheckMarkDrawable(int paramInt)
  {
    if (this.b != null) {
      setCheckMarkDrawable(this.b.a(paramInt, false));
    }
    for (;;)
    {
      return;
      super.setCheckMarkDrawable(paramInt);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */