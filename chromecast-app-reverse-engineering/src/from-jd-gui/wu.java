import android.content.Context;
import android.view.View;

public final class wu
  implements wy
{
  private static float c(wv paramwv)
  {
    return ((zu)paramwv.getBackground()).a;
  }
  
  public final float a(wv paramwv)
  {
    return c(paramwv) * 2.0F;
  }
  
  public final void a() {}
  
  public final void a(wv paramwv, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramwv.setBackgroundDrawable(new zu(paramInt, paramFloat1));
    paramContext = (View)paramwv;
    paramContext.setClipToOutline(true);
    paramContext.setElevation(paramFloat2);
    paramContext = (zu)paramwv.getBackground();
    boolean bool2 = paramwv.a();
    boolean bool1 = paramwv.b();
    if ((paramFloat3 != paramContext.b) || (paramContext.c != bool2) || (paramContext.d != bool1))
    {
      paramContext.b = paramFloat3;
      paramContext.c = bool2;
      paramContext.d = bool1;
      paramContext.a(null);
      paramContext.invalidateSelf();
    }
    if (!paramwv.a()) {
      paramwv.a(0, 0, 0, 0);
    }
    for (;;)
    {
      return;
      paramFloat2 = ((zu)paramwv.getBackground()).b;
      paramFloat1 = c(paramwv);
      int i = (int)Math.ceil(zv.b(paramFloat2, paramFloat1, paramwv.b()));
      paramInt = (int)Math.ceil(zv.a(paramFloat2, paramFloat1, paramwv.b()));
      paramwv.a(i, paramInt, i, paramInt);
    }
  }
  
  public final float b(wv paramwv)
  {
    return c(paramwv) * 2.0F;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */