import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import java.lang.reflect.Field;

public final class ws
  extends Spinner
{
  private static final int[] a = { 16842964, 16843126 };
  private te b;
  private tf c;
  
  public ws(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.P);
  }
  
  private ws(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
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
      if (paramContext.d(1))
      {
        paramAttributeSet = paramContext.a(1);
        if (Build.VERSION.SDK_INT < 16) {
          break label101;
        }
        setPopupBackgroundDrawable(paramAttributeSet);
      }
    }
    for (;;)
    {
      this.c = paramContext.a();
      paramContext.a.recycle();
      return;
      label101:
      if (Build.VERSION.SDK_INT >= 11) {
        try
        {
          Object localObject = Spinner.class.getDeclaredField("mPopup");
          ((Field)localObject).setAccessible(true);
          localObject = ((Field)localObject).get(this);
          if ((localObject instanceof ListPopupWindow)) {
            ((ListPopupWindow)localObject).setBackgroundDrawable(paramAttributeSet);
          }
        }
        catch (NoSuchFieldException paramAttributeSet)
        {
          paramAttributeSet.printStackTrace();
        }
        catch (IllegalAccessException paramAttributeSet)
        {
          paramAttributeSet.printStackTrace();
        }
      }
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */