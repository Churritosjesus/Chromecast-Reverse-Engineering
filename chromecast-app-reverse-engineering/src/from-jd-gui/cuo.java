import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

final class cuo
  implements Handler.Callback
{
  cuo(cum paramcum) {}
  
  public final boolean handleMessage(Message paramMessage)
  {
    if ((1 == paramMessage.what) && (cum.e().equals(paramMessage.obj)))
    {
      this.a.c();
      if ((cum.b(this.a) > 0) && (!cum.c(this.a))) {
        cum.d(this.a).sendMessageDelayed(cum.d(this.a).obtainMessage(1, cum.e()), cum.b(this.a));
      }
    }
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cuo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */