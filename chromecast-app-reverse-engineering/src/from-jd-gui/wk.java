import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class wk
  extends AutoCompleteTextView
{
  private static final int[] a = { 16842964, 16843126 };
  private te b;
  private tf c;
  
  public wk(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public wk(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.w);
  }
  
  public wk(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(tc.a(paramContext), paramAttributeSet, paramInt);
    if (tf.a)
    {
      paramAttributeSet = th.a(getContext(), paramAttributeSet, a, paramInt, 0);
      this.c = paramAttributeSet.a();
      if (paramAttributeSet.d(0))
      {
        paramContext = paramAttributeSet.a().a(paramAttributeSet.e(0, -1));
        if (paramContext != null) {
          a(paramContext);
        }
      }
      if (paramAttributeSet.d(1)) {
        setDropDownBackgroundDrawable(paramAttributeSet.a(1));
      }
      paramAttributeSet.a.recycle();
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
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    a();
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    a(null);
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.c != null) {}
    for (ColorStateList localColorStateList = this.c.a(paramInt);; localColorStateList = null)
    {
      a(localColorStateList);
      return;
    }
  }
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    setDropDownBackgroundDrawable(this.c.a(paramInt, false));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */