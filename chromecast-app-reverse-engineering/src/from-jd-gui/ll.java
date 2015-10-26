import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

final class ll
  implements Drawable.Callback
{
  ll(li paramli) {}
  
  public final void invalidateDrawable(Drawable paramDrawable)
  {
    this.a.invalidateSelf();
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    this.a.scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    this.a.unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */