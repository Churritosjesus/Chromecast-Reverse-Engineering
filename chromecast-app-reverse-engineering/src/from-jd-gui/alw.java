import android.app.AlertDialog;
import android.widget.TextView;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;
import java.util.ArrayList;

public final class alw
  implements aop
{
  public alw(DeviceSettingsActivity paramDeviceSettingsActivity, bfs parambfs, AlertDialog paramAlertDialog) {}
  
  public final void a()
  {
    this.c.w();
    this.c.j = this.c.k;
    this.c.i.u = this.c.j;
    this.c.i.y = this.a.a;
    Object localObject1;
    Object localObject2;
    if (DeviceSettingsActivity.a(this.c))
    {
      localObject1 = DeviceSettingsActivity.b(this.c);
      localObject2 = this.c.i.y;
      ((bhf)localObject1).c.setText((CharSequence)localObject2);
      localObject2 = DeviceSettingsActivity.b(this.c);
      localObject1 = this.a;
    }
    for (int i = 0;; i++) {
      if (i < ((bhf)localObject2).a.size())
      {
        if (((bfs)((bhf)localObject2).a.get(i)).a.equals(((bfs)localObject1).a)) {
          ((bhf)localObject2).a.remove(i);
        }
      }
      else
      {
        ((bhf)localObject2).a.add(localObject1);
        return;
      }
    }
  }
  
  public final void b()
  {
    this.c.w();
    if (!this.c.isFinishing()) {
      this.b.show();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\alw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */