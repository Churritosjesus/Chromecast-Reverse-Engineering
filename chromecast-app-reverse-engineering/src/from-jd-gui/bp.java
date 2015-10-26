import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

class bp
{
  public void a(Drawable paramDrawable) {}
  
  public void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) {}
  
  public void a(Drawable paramDrawable, int paramInt)
  {
    b.a(paramDrawable, paramInt);
  }
  
  public void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    b.a(paramDrawable, paramColorStateList);
  }
  
  public void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    b.a(paramDrawable, paramMode);
  }
  
  public void a(Drawable paramDrawable, boolean paramBoolean) {}
  
  public boolean b(Drawable paramDrawable)
  {
    return false;
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (!(paramDrawable instanceof bv)) {
      localObject = new bv(paramDrawable);
    }
    return (Drawable)localObject;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */