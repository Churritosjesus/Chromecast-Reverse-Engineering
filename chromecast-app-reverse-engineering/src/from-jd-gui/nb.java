import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class nb
  extends Handler
{
  private WeakReference a;
  
  public nb(DialogInterface paramDialogInterface)
  {
    this.a = new WeakReference(paramDialogInterface);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return;
      ((DialogInterface.OnClickListener)paramMessage.obj).onClick((DialogInterface)this.a.get(), paramMessage.what);
      continue;
      ((DialogInterface)paramMessage.obj).dismiss();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */