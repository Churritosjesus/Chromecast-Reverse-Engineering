import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

public final class wo
  extends EditText
{
  private static final int[] a = { 16842964 };
  private te b;
  private tf c;
  
  public wo(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.H);
  }
  
  private wo(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(tc.a(paramContext), paramAttributeSet, paramInt);
    if (tf.a)
    {
      paramContext = th.a(getContext(), paramAttributeSet, a, paramInt, 0);
      if (paramContext.d(0))
      {
        paramAttributeSet = paramContext.a().a(paramContext.e(0, -1));
        if (paramAttributeSet != null) {
          a(paramAttributeSet);
        }
      }
      this.c = paramContext.a();
      paramContext.a.recycle();
    }
  }
  
  private void a()
  {
    if ((getBackground() != null) && (this.b != null)) {
      tf.a(this, this.b);
    }
  }
  
  private void a(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.b == null) {
        this.b = new te();
      }
      this.b.a = paramColorStateList;
      this.b.b = true;
    }
    for (;;)
    {
      a();
      return;
      this.b = null;
    }
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    a();
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    a(null);
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.c != null) {}
    for (ColorStateList localColorStateList = this.c.a(paramInt);; localColorStateList = null)
    {
      a(localColorStateList);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */