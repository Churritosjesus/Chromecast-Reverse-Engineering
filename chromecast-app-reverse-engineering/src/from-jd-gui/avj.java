import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.json.JSONException;

final class avj
  extends Handler
{
  avj(ava paramava, Looper paramLooper, bdn parambdn)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return;
      paramMessage = (String)paramMessage.obj;
      try
      {
        paramMessage = bdr.a(paramMessage);
        this.a.a(paramMessage);
      }
      catch (JSONException paramMessage)
      {
        this.a.b_(-3);
      }
      continue;
      this.a.b_(-1);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\avj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */