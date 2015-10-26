import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public final class bo
{
  private static bp a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 22) {
      a = new bt();
    }
    for (;;)
    {
      return;
      if (i >= 21) {
        a = new bs();
      } else if (i >= 19) {
        a = new br();
      } else if (i >= 11) {
        a = new bq();
      } else {
        a = new bp();
      }
    }
  }
  
  public static void a(Drawable paramDrawable)
  {
    a.a(paramDrawable);
  }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    a.a(paramDrawable, paramFloat1, paramFloat2);
  }
  
  public static void a(Drawable paramDrawable, int paramInt)
  {
    a.a(paramDrawable, paramInt);
  }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    a.a(paramDrawable, paramColorStateList);
  }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    a.a(paramDrawable, paramMode);
  }
  
  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    a.a(paramDrawable, paramBoolean);
  }
  
  public static boolean b(Drawable paramDrawable)
  {
    return a.b(paramDrawable);
  }
  
  public static Drawable c(Drawable paramDrawable)
  {
    return a.c(paramDrawable);
  }
  
  public static Drawable d(Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if ((paramDrawable instanceof bu)) {
      localDrawable = ((bu)paramDrawable).a();
    }
    return localDrawable;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */