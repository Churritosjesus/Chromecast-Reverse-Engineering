import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class vn
  extends BroadcastReceiver
{
  vn(vl paramvl) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) && (paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3))
    {
      int i = paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
      if ((i >= 0) && (i != vl.c(this.a))) {
        vl.b(this.a);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */