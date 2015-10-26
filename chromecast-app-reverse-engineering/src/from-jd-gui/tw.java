import android.os.Bundle;
import java.util.ArrayList;

public final class tw
{
  private final Bundle a = new Bundle();
  private ArrayList b;
  
  public final tv a()
  {
    if (this.b != null)
    {
      int j = this.b.size();
      ArrayList localArrayList = new ArrayList(j);
      for (int i = 0; i < j; i++) {
        localArrayList.add(((tn)this.b.get(i)).a);
      }
      this.a.putParcelableArrayList("routes", localArrayList);
    }
    return new tv(this.a, this.b);
  }
  
  public final tw a(tn paramtn)
  {
    if (paramtn == null) {
      throw new IllegalArgumentException("route must not be null");
    }
    if (this.b == null) {
      this.b = new ArrayList();
    }
    while (!this.b.contains(paramtn))
    {
      this.b.add(paramtn);
      return this;
    }
    throw new IllegalArgumentException("route descriptor already added");
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */