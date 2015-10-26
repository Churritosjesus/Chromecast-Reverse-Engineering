import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class ww
  implements wy
{
  final RectF a = new RectF();
  
  private static zv c(wv paramwv)
  {
    return (zv)paramwv.getBackground();
  }
  
  public final float a(wv paramwv)
  {
    paramwv = c(paramwv);
    float f1 = Math.max(paramwv.d, paramwv.c + paramwv.a + paramwv.d / 2.0F);
    float f2 = paramwv.d;
    return (paramwv.a + f2) * 2.0F + f1 * 2.0F;
  }
  
  public void a()
  {
    zv.b = new wx(this);
  }
  
  public final void a(wv paramwv, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramContext = new zv(paramContext.getResources(), paramInt, paramFloat1, paramFloat2, paramFloat3);
    paramContext.e = paramwv.b();
    paramContext.invalidateSelf();
    paramwv.setBackgroundDrawable(paramContext);
    paramContext = new Rect();
    c(paramwv).getPadding(paramContext);
    ((View)paramwv).setMinimumHeight((int)Math.ceil(b(paramwv)));
    ((View)paramwv).setMinimumWidth((int)Math.ceil(a(paramwv)));
    paramwv.a(paramContext.left, paramContext.top, paramContext.right, paramContext.bottom);
  }
  
  public final float b(wv paramwv)
  {
    paramwv = c(paramwv);
    float f1 = Math.max(paramwv.d, paramwv.c + paramwv.a + paramwv.d * 1.5F / 2.0F);
    float f2 = paramwv.d;
    return (paramwv.a + f2 * 1.5F) * 2.0F + f1 * 2.0F;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ww.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */