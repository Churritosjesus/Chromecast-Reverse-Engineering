import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class byq
  extends Handler
{
  public byq(byo parambyo, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (((paramMessage.what == 1) || (paramMessage.what == 5) || (paramMessage.what == 6)) && (!this.a.m())) {
      ((byr)paramMessage.obj).c();
    }
    for (;;)
    {
      return;
      if (paramMessage.what == 3)
      {
        paramMessage = new ConnectionResult(((Integer)paramMessage.obj).intValue(), null);
        if (byo.a(this.a)) {
          byo.b(this.a).a(paramMessage);
        } else {
          byo.c(this.a).a(paramMessage);
        }
      }
      else if (paramMessage.what == 4)
      {
        byo.a(this.a, 4, null);
        byo.c(this.a).a(((Integer)paramMessage.obj).intValue());
        byo.a(this.a, 4, 1, null);
      }
      else if ((paramMessage.what == 2) && (!this.a.k()))
      {
        ((byr)paramMessage.obj).c();
      }
      else if ((paramMessage.what == 2) || (paramMessage.what == 1) || (paramMessage.what == 5) || (paramMessage.what == 6))
      {
        ((byr)paramMessage.obj).b();
      }
      else
      {
        Log.wtf("GmsClient", "Don't know how to handle this message.");
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */