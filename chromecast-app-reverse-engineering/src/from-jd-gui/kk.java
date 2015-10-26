import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

final class kk
  extends ContentObserver
{
  public kk(kj paramkj)
  {
    super(new Handler());
  }
  
  public final boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public final void onChange(boolean paramBoolean)
  {
    kj localkj = this.a;
    if ((localkj.b) && (localkj.c != null) && (!localkj.c.isClosed())) {
      localkj.a = localkj.c.requery();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\kk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */