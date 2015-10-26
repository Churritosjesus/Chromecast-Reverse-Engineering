import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

public class bv
  extends Drawable
  implements Drawable.Callback, bu
{
  private static PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
  Drawable a;
  private ColorStateList c;
  private PorterDuff.Mode d = b;
  private int e;
  private PorterDuff.Mode f;
  private boolean g;
  
  public bv(Drawable paramDrawable)
  {
    a(paramDrawable);
  }
  
  private boolean a(int[] paramArrayOfInt)
  {
    boolean bool = true;
    if ((this.c != null) && (this.d != null))
    {
      int i = this.c.getColorForState(paramArrayOfInt, this.c.getDefaultColor());
      paramArrayOfInt = this.d;
      if ((!this.g) || (i != this.e) || (paramArrayOfInt != this.f))
      {
        setColorFilter(i, paramArrayOfInt);
        this.e = i;
        this.f = paramArrayOfInt;
        this.g = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public final Drawable a()
  {
    return this.a;
  }
  
  public final void a(Drawable paramDrawable)
  {
    if (this.a != null) {
      this.a.setCallback(null);
    }
    this.a = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.a.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    return this.a.getChangingConfigurations();
  }
  
  public Drawable getCurrent()
  {
    return this.a.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return this.a.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.a.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return this.a.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return this.a.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return this.a.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return this.a.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return this.a.getState();
  }
  
  public Region getTransparentRegion()
  {
    return this.a.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isStateful()
  {
    if (((this.c != null) && (this.c.isStateful())) || (this.a.isStateful())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Drawable mutate()
  {
    Drawable localDrawable2 = this.a;
    Drawable localDrawable1 = localDrawable2.mutate();
    if (localDrawable1 != localDrawable2) {
      a(localDrawable1);
    }
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.a.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    return this.a.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    this.a.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.a.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.a.setFilterBitmap(paramBoolean);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = this.a.setState(paramArrayOfInt);
    if ((a(paramArrayOfInt)) || (bool)) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void setTint(int paramInt)
  {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.c = paramColorStateList;
    a(getState());
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.d = paramMode;
    a(getState());
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((super.setVisible(paramBoolean1, paramBoolean2)) || (this.a.setVisible(paramBoolean1, paramBoolean2))) {}
    for (paramBoolean1 = true;; paramBoolean1 = false) {
      return paramBoolean1;
    }
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */