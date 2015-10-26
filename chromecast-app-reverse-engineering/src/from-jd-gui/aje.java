import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

final class aje
  extends Handler
{
  aje(ajd paramajd) {}
  
  public final void handleMessage(Message paramMessage)
  {
    ajd localajd = this.a;
    if (paramMessage.what == localajd.d)
    {
      paramMessage = paramMessage.getData();
      if (paramMessage.getString("com.facebook.platform.status.ERROR_TYPE") == null) {
        break label44;
      }
      localajd.a(null);
    }
    for (;;)
    {
      localajd.a.unbindService(localajd);
      return;
      label44:
      localajd.a(paramMessage);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */