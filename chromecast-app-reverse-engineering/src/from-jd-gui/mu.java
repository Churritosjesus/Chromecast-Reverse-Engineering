import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class mu
  implements mo
{
  private Activity a;
  
  mu(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  public final Drawable a()
  {
    TypedArray localTypedArray = b().obtainStyledAttributes(null, new int[] { 16843531 }, 16843470, 0);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }
  
  public final void a(int paramInt)
  {
    ActionBar localActionBar = this.a.getActionBar();
    if (localActionBar != null) {
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this.a.getActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public final Context b()
  {
    Object localObject = this.a.getActionBar();
    if (localObject != null) {}
    for (localObject = ((ActionBar)localObject).getThemedContext();; localObject = this.a) {
      return (Context)localObject;
    }
  }
  
  public final boolean c()
  {
    ActionBar localActionBar = this.a.getActionBar();
    if ((localActionBar != null) && ((localActionBar.getDisplayOptions() & 0x4) != 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */