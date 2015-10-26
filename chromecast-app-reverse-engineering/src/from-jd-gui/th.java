import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class th
{
  public final TypedArray a;
  private final Context b;
  private tf c;
  
  private th(Context paramContext, TypedArray paramTypedArray)
  {
    this.b = paramContext;
    this.a = paramTypedArray;
  }
  
  public static th a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    return new th(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt));
  }
  
  public static th a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    return new th(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, 0));
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    return this.a.getInt(paramInt1, paramInt2);
  }
  
  public final Drawable a(int paramInt)
  {
    int i;
    if (this.a.hasValue(paramInt))
    {
      i = this.a.getResourceId(paramInt, 0);
      if (i == 0) {}
    }
    for (Drawable localDrawable = a().a(i, false);; localDrawable = this.a.getDrawable(paramInt)) {
      return localDrawable;
    }
  }
  
  public final tf a()
  {
    if (this.c == null) {
      this.c = tf.a(this.b);
    }
    return this.c;
  }
  
  public final boolean a(int paramInt, boolean paramBoolean)
  {
    return this.a.getBoolean(paramInt, paramBoolean);
  }
  
  public final int b(int paramInt1, int paramInt2)
  {
    return this.a.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public final Drawable b(int paramInt)
  {
    if (this.a.hasValue(paramInt))
    {
      paramInt = this.a.getResourceId(paramInt, 0);
      if (paramInt == 0) {}
    }
    for (Drawable localDrawable = a().a(paramInt, true);; localDrawable = null) {
      return localDrawable;
    }
  }
  
  public final int c(int paramInt1, int paramInt2)
  {
    return this.a.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public final CharSequence c(int paramInt)
  {
    return this.a.getText(paramInt);
  }
  
  public final int d(int paramInt1, int paramInt2)
  {
    return this.a.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public final boolean d(int paramInt)
  {
    return this.a.hasValue(paramInt);
  }
  
  public final int e(int paramInt1, int paramInt2)
  {
    return this.a.getResourceId(paramInt1, paramInt2);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\th.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */