import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class cv
  extends Handler
{
  public cv(cu paramcu, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    obtainMessage(paramInt, paramObject).sendToTarget();
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (!cu.b(this.a)) {}
    for (;;)
    {
      return;
      switch (paramMessage.what)
      {
      default: 
        break;
      case 1: 
        Object localObject = paramMessage.obj;
        paramMessage.getData();
        break;
      case 2: 
        this.a.a((dq)paramMessage.obj);
        break;
      case 3: 
        this.a.a((ci)paramMessage.obj);
        break;
      case 5: 
        paramMessage = paramMessage.obj;
        break;
      case 6: 
        paramMessage = paramMessage.obj;
        break;
      case 7: 
        paramMessage = paramMessage.obj;
        break;
      case 4: 
        paramMessage = paramMessage.obj;
        break;
      case 8: 
        this.a.a();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */