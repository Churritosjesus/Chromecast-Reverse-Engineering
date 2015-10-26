import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class tx
{
  public static final tx c = new tx(new Bundle(), null);
  public final Bundle a;
  List b;
  
  tx(Bundle paramBundle, List paramList)
  {
    this.a = paramBundle;
    this.b = paramList;
  }
  
  public static tx a(Bundle paramBundle)
  {
    if (paramBundle != null) {}
    for (paramBundle = new tx(paramBundle, null);; paramBundle = null) {
      return paramBundle;
    }
  }
  
  public final List a()
  {
    b();
    return this.b;
  }
  
  public final boolean a(List paramList)
  {
    int i;
    int j;
    if (paramList != null)
    {
      b();
      int k = this.b.size();
      if (k != 0)
      {
        int m = paramList.size();
        i = 0;
        if (i < m)
        {
          IntentFilter localIntentFilter = (IntentFilter)paramList.get(i);
          if (localIntentFilter != null)
          {
            j = 0;
            label58:
            if (j < k) {
              if (!localIntentFilter.hasCategory((String)this.b.get(j))) {}
            }
          }
        }
      }
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      j++;
      break label58;
      i++;
      break;
    }
  }
  
  void b()
  {
    if (this.b == null)
    {
      this.b = this.a.getStringArrayList("controlCategories");
      if ((this.b == null) || (this.b.isEmpty())) {
        this.b = Collections.emptyList();
      }
    }
  }
  
  public final boolean c()
  {
    b();
    return this.b.isEmpty();
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof tx))
    {
      paramObject = (tx)paramObject;
      b();
      ((tx)paramObject).b();
    }
    for (boolean bool = this.b.equals(((tx)paramObject).b);; bool = false) {
      return bool;
    }
  }
  
  public final int hashCode()
  {
    b();
    return this.b.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MediaRouteSelector{ ");
    localStringBuilder.append("controlCategories=").append(Arrays.toString(a().toArray()));
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */