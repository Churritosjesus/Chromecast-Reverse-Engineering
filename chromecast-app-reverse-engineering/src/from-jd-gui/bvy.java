import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

public final class bvy
  extends Handler
{
  public bvy()
  {
    this(Looper.getMainLooper());
  }
  
  public bvy(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void a(bwn parambwn, bwm parambwm)
  {
    sendMessage(obtainMessage(1, new Pair(parambwn, parambwm)));
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
    }
    for (;;)
    {
      return;
      paramMessage = (Pair)paramMessage.obj;
      bwn localbwn = (bwn)paramMessage.first;
      paramMessage = (bwm)paramMessage.second;
      try
      {
        localbwn.a(paramMessage);
      }
      catch (RuntimeException localRuntimeException)
      {
        bvx.b(paramMessage);
        throw localRuntimeException;
      }
      ((bvx)paramMessage.obj).c(Status.c);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */