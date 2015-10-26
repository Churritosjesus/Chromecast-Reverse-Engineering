import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class auq
{
  final blp a = new blp("UserSettings");
  private Map b = new HashMap();
  
  public auq() {}
  
  public auq(dck paramdck)
  {
    a(paramdck);
  }
  
  public final dck a()
  {
    dci[] arrayOfdci = new dci[this.b.size()];
    dck localdck = new dck();
    localdck.a = ((dci[])this.b.values().toArray(arrayOfdci));
    return localdck;
  }
  
  public final void a(dck paramdck)
  {
    for (Object localObject : paramdck.a) {
      if ((localObject != null) && (((dci)localObject).c != null)) {
        this.b.put(((dci)localObject).c, localObject);
      }
    }
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    c(paramString).a = Boolean.valueOf(paramBoolean);
  }
  
  public final boolean a(int paramInt)
  {
    if (c(String.valueOf(paramInt)).a == Boolean.TRUE) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean a(String paramString)
  {
    if (c(paramString).a == Boolean.TRUE) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final dca[] b(String paramString)
  {
    return c(paramString).b;
  }
  
  public dci c(String paramString)
  {
    dci localdci2 = (dci)this.b.get(paramString);
    dci localdci1 = localdci2;
    if (localdci2 == null)
    {
      localdci1 = new dci();
      localdci1.c = paramString;
      this.b.put(localdci1.c, localdci1);
    }
    return localdci1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\auq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */