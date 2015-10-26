import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ass
{
  public final Map a = new ConcurrentHashMap();
  public final blp b = new blp("CastConnectionManager");
  
  public final aqj a(aow paramaow)
  {
    if (paramaow.a == null) {}
    for (paramaow = null;; paramaow = (aqj)this.a.get(paramaow.a)) {
      return paramaow;
    }
  }
  
  public final void b(aow paramaow)
  {
    aqj localaqj = a(paramaow);
    if (localaqj != null)
    {
      paramaow.g();
      localaqj.g();
      localaqj.c();
      this.a.remove(paramaow.a);
      paramaow.b(null, null);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */