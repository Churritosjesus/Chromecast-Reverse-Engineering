import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class mt
  implements mo
{
  private Activity a;
  private mw b;
  
  mt(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  public final Drawable a()
  {
    return mv.a(this.a);
  }
  
  public final void a(int paramInt)
  {
    this.b = mv.a(this.b, this.a, paramInt);
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    this.a.getActionBar().setDisplayShowHomeEnabled(true);
    this.b = mv.a(this.a, paramDrawable, paramInt);
    this.a.getActionBar().setDisplayShowHomeEnabled(false);
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */