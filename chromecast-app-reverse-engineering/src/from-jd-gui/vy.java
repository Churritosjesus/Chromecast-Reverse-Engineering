import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.TintImageView;

final class vy
  extends TintImageView
  implements wc
{
  public vy(vu paramvu, Context paramContext)
  {
    super(paramContext, null, a.r);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
    setOnTouchListener(new vz(this, this, paramvu));
  }
  
  public final boolean d()
  {
    return false;
  }
  
  public final boolean e()
  {
    return false;
  }
  
  public final boolean performClick()
  {
    if (super.performClick()) {}
    for (;;)
    {
      return true;
      playSoundEffect(0);
      this.a.b();
    }
  }
  
  protected final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable2 = getDrawable();
    Drawable localDrawable1 = getBackground();
    if ((localDrawable2 != null) && (localDrawable1 != null))
    {
      int i = getWidth();
      paramInt3 = getHeight();
      paramInt1 = Math.max(i, paramInt3) / 2;
      int k = getPaddingLeft();
      int j = getPaddingRight();
      paramInt2 = getPaddingTop();
      paramInt4 = getPaddingBottom();
      i = (i + (k - j)) / 2;
      paramInt2 = (paramInt3 + (paramInt2 - paramInt4)) / 2;
      bo.a(localDrawable1, i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
    }
    return bool;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */