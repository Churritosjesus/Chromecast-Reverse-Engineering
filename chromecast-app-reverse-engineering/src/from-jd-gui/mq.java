import android.app.Activity;
import android.content.Context;
import android.view.Window;

final class mq
  extends nz
  implements mr
{
  private final Activity c;
  
  public mq(Activity paramActivity, Context paramContext)
  {
    super(paramContext);
    this.c = paramActivity;
  }
  
  public final void a(float paramFloat)
  {
    if (paramFloat == 1.0F) {
      this.a = true;
    }
    for (;;)
    {
      this.b = paramFloat;
      invalidateSelf();
      return;
      if (paramFloat == 0.0F) {
        this.a = false;
      }
    }
  }
  
  final boolean a()
  {
    boolean bool = true;
    if (gt.g(this.c.getWindow().getDecorView()) == 1) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */