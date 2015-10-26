import android.os.Handler;
import android.os.Message;
import android.widget.ListPopupWindow;

final class aci
  extends Handler
{
  aci(acb paramacb) {}
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == acb.h()) {
      ((ListPopupWindow)paramMessage.obj).dismiss();
    }
    for (;;)
    {
      return;
      super.handleMessage(paramMessage);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */