import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class to
{
  final Bundle a;
  private ArrayList b;
  
  public to(String paramString1, String paramString2)
  {
    this.a = new Bundle();
    this.a.putString("id", paramString1);
    this.a.putString("name", paramString2);
  }
  
  public to(tn paramtn)
  {
    if (paramtn == null) {
      throw new IllegalArgumentException("descriptor must not be null");
    }
    this.a = new Bundle(paramtn.a);
    paramtn.i();
    if (!paramtn.b.isEmpty()) {
      this.b = new ArrayList(paramtn.b);
    }
  }
  
  public final tn a()
  {
    if (this.b != null) {
      this.a.putParcelableArrayList("controlFilters", this.b);
    }
    return new tn(this.a, this.b);
  }
  
  public final to a(int paramInt)
  {
    this.a.putInt("playbackType", paramInt);
    return this;
  }
  
  public final to a(Collection paramCollection)
  {
    if (paramCollection == null) {
      throw new IllegalArgumentException("filters must not be null");
    }
    if (!paramCollection.isEmpty())
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        paramCollection = (IntentFilter)localIterator.next();
        if (paramCollection == null) {
          throw new IllegalArgumentException("filter must not be null");
        }
        if (this.b == null) {
          this.b = new ArrayList();
        }
        if (!this.b.contains(paramCollection)) {
          this.b.add(paramCollection);
        }
      }
    }
    return this;
  }
  
  public final to b(int paramInt)
  {
    this.a.putInt("playbackStream", paramInt);
    return this;
  }
  
  public final to c(int paramInt)
  {
    this.a.putInt("volume", paramInt);
    return this;
  }
  
  public final to d(int paramInt)
  {
    this.a.putInt("volumeMax", paramInt);
    return this;
  }
  
  public final to e(int paramInt)
  {
    this.a.putInt("volumeHandling", paramInt);
    return this;
  }
  
  public final to f(int paramInt)
  {
    this.a.putInt("presentationDisplayId", paramInt);
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\to.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */