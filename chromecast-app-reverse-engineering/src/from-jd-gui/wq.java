import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.RadioButton;

public final class wq
  extends RadioButton
{
  private static final int[] a = { 16843015 };
  private tf b;
  private Drawable c;
  
  public wq(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.M);
  }
  
  private wq(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (tf.a)
    {
      paramContext = th.a(getContext(), paramAttributeSet, a, paramInt, 0);
      setButtonDrawable(paramContext.a(0));
      paramContext.a.recycle();
      this.b = paramContext.a();
    }
  }
  
  public final int getCompoundPaddingLeft()
  {
    int j = super.getCompoundPaddingLeft();
    int i = j;
    if (Build.VERSION.SDK_INT < 17)
    {
      i = j;
      if (this.c != null) {
        i = j + this.c.getIntrinsicWidth();
      }
    }
    return i;
  }
  
  public final void setButtonDrawable(int paramInt)
  {
    if (this.b != null) {
      setButtonDrawable(this.b.a(paramInt, false));
    }
    for (;;)
    {
      return;
      super.setButtonDrawable(paramInt);
    }
  }
  
  public final void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    this.c = paramDrawable;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */