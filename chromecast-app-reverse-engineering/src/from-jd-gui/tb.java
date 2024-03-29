import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;

public final class tb
{
  static final int[] a = { -16842910 };
  static final int[] b = { 16842908 };
  static final int[] c = { 16843518 };
  static final int[] d = { 16842919 };
  static final int[] e = { 16842912 };
  static final int[] f = { 16842913 };
  static final int[] g = { -16842919, -16842908 };
  static final int[] h = new int[0];
  private static final ThreadLocal i = new ThreadLocal();
  private static final int[] j = new int[1];
  
  public static int a(Context paramContext, int paramInt)
  {
    j[0] = paramInt;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, j);
    try
    {
      paramInt = localTypedArray.getColor(0, 0);
      return paramInt;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  static int a(Context paramContext, int paramInt, float paramFloat)
  {
    int k = a(paramContext, paramInt);
    paramInt = Math.round(Color.alpha(k) * paramFloat);
    if ((paramInt < 0) || (paramInt > 255)) {
      throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
    return k & 0xFFFFFF | paramInt << 24;
  }
  
  public static ColorStateList a(int paramInt1, int paramInt2)
  {
    return new ColorStateList(new int[][] { a, h }, new int[] { paramInt2, paramInt1 });
  }
  
  public static ColorStateList b(Context paramContext, int paramInt)
  {
    j[0] = paramInt;
    paramContext = paramContext.obtainStyledAttributes(null, j);
    try
    {
      ColorStateList localColorStateList = paramContext.getColorStateList(0);
      return localColorStateList;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static int c(Context paramContext, int paramInt)
  {
    Object localObject = b(paramContext, paramInt);
    if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {}
    for (paramInt = ((ColorStateList)localObject).getColorForState(a, ((ColorStateList)localObject).getDefaultColor());; paramInt = a(paramContext, paramInt, ((TypedValue)localObject).getFloat()))
    {
      return paramInt;
      TypedValue localTypedValue = (TypedValue)i.get();
      localObject = localTypedValue;
      if (localTypedValue == null)
      {
        localObject = new TypedValue();
        i.set(localObject);
      }
      paramContext.getTheme().resolveAttribute(16842803, (TypedValue)localObject, true);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */