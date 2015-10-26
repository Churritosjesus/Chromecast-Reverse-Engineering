import android.database.ContentObserver;
import android.os.Handler;
import java.util.HashMap;

final class czr
  extends ContentObserver
{
  czr(czq paramczq, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    try
    {
      czp.a().clear();
      Object localObject1 = new java/lang/Object;
      localObject1.<init>();
      czp.a(localObject1);
      if (czp.b().length > 0) {
        czp.a(this.a.a, czp.b());
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */