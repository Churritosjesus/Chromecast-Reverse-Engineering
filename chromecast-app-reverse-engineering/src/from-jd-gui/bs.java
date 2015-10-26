import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

class bs
  extends br
{
  public final void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    paramDrawable.setHotspot(paramFloat1, paramFloat2);
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable instanceof by)) {
      b.a(paramDrawable, paramInt);
    }
    for (;;)
    {
      return;
      paramDrawable.setTint(paramInt);
    }
  }
  
  public final void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    if ((paramDrawable instanceof by)) {
      b.a(paramDrawable, paramColorStateList);
    }
    for (;;)
    {
      return;
      paramDrawable.setTintList(paramColorStateList);
    }
  }
  
  public final void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    if ((paramDrawable instanceof by)) {
      b.a(paramDrawable, paramMode);
    }
    for (;;)
    {
      return;
      paramDrawable.setTintMode(paramMode);
    }
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if ((paramDrawable instanceof GradientDrawable)) {
      localObject = new by(paramDrawable);
    }
    return (Drawable)localObject;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */