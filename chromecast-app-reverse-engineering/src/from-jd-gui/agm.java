import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class agm
  extends AbstractList
{
  private static AtomicInteger e = new AtomicInteger();
  Handler a;
  List b = new ArrayList();
  final String c = Integer.valueOf(e.incrementAndGet()).toString();
  List d = new ArrayList();
  private int f = 0;
  
  public agm()
  {
    this.b = new ArrayList();
  }
  
  public agm(Collection paramCollection)
  {
    this.b = new ArrayList(paramCollection);
  }
  
  public agm(aga... paramVarArgs)
  {
    this.b = Arrays.asList(paramVarArgs);
  }
  
  public final aga a(int paramInt)
  {
    return (aga)this.b.get(paramInt);
  }
  
  public final void clear()
  {
    this.b.clear();
  }
  
  public final int size()
  {
    return this.b.size();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */