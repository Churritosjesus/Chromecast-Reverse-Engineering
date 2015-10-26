import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.chromecast.app.MainActivity;

public final class amz
  extends BroadcastReceiver
{
  public amz(MainActivity paramMainActivity) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!paramIntent.getBooleanExtra("connected", false))
    {
      paramIntent = this.a;
      paramContext = this.a.getString(b.ee);
      if (!paramIntent.isFinishing())
      {
        paramIntent.e = new AlertDialog.Builder(paramIntent).setMessage(paramContext).setPositiveButton(b.I, null).create();
        paramIntent.e.setOnDismissListener(new amy(paramIntent));
        paramIntent.e.show();
      }
    }
    this.a.unregisterReceiver(this);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\amz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */