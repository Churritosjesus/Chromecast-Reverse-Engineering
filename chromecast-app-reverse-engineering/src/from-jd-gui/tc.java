import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

public final class tc
  extends ContextWrapper
{
  private Resources a;
  
  private tc(Context paramContext)
  {
    super(paramContext);
  }
  
  public static Context a(Context paramContext)
  {
    Object localObject = paramContext;
    if (!(paramContext instanceof tc)) {
      localObject = new tc(paramContext);
    }
    return (Context)localObject;
  }
  
  public final Resources getResources()
  {
    if (this.a == null) {
      this.a = new td(super.getResources(), tf.a(this));
    }
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */