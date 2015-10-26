import android.os.Handler;
import android.os.Message;

final class aay
  extends Handler
{
  aay(aav paramaav) {}
  
  public final void a()
  {
    sendMessageDelayed(obtainMessage(1, 0, 0, null), 1000L);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (aav.e(this.a) > 0) {
      this.a.a(this.a.a());
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */