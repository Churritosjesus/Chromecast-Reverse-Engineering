import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class ii
  implements iq
{
  private WeakHashMap a = null;
  
  private void d(ih paramih, View paramView)
  {
    Runnable localRunnable = null;
    if (this.a != null) {
      localRunnable = (Runnable)this.a.get(paramView);
    }
    Object localObject = localRunnable;
    if (localRunnable == null)
    {
      localObject = new ij(this, paramih, paramView);
      if (this.a == null) {
        this.a = new WeakHashMap();
      }
      this.a.put(paramView, localObject);
    }
    paramView.removeCallbacks((Runnable)localObject);
    paramView.post((Runnable)localObject);
  }
  
  public void a(View paramView, long paramLong) {}
  
  public void a(View paramView, Interpolator paramInterpolator) {}
  
  public void a(View paramView, iw paramiw) {}
  
  public void a(ih paramih, View paramView)
  {
    d(paramih, paramView);
  }
  
  public void a(ih paramih, View paramView, float paramFloat)
  {
    d(paramih, paramView);
  }
  
  public void a(ih paramih, View paramView, iu paramiu)
  {
    paramView.setTag(2113929216, paramiu);
  }
  
  public void b(ih paramih, View paramView)
  {
    if (this.a != null)
    {
      Runnable localRunnable = (Runnable)this.a.get(paramView);
      if (localRunnable != null) {
        paramView.removeCallbacks(localRunnable);
      }
    }
    c(paramih, paramView);
  }
  
  public void b(ih paramih, View paramView, float paramFloat)
  {
    d(paramih, paramView);
  }
  
  void c(ih paramih, View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof iu)) {}
    for (localObject = (iu)localObject;; localObject = null)
    {
      Runnable localRunnable = ih.a(paramih);
      paramih = ih.b(paramih);
      if (localRunnable != null) {
        localRunnable.run();
      }
      if (localObject != null)
      {
        ((iu)localObject).a(paramView);
        ((iu)localObject).b(paramView);
      }
      if (paramih != null) {
        paramih.run();
      }
      if (this.a != null) {
        this.a.remove(paramView);
      }
      return;
    }
  }
  
  public void c(ih paramih, View paramView, float paramFloat)
  {
    d(paramih, paramView);
  }
  
  public void d(ih paramih, View paramView, float paramFloat)
  {
    d(paramih, paramView);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */