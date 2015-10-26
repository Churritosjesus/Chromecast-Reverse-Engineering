import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class tv
{
  private final Bundle a;
  private List b;
  
  tv(Bundle paramBundle, List paramList)
  {
    this.a = paramBundle;
    this.b = paramList;
  }
  
  public static tv a(Bundle paramBundle)
  {
    if (paramBundle != null) {}
    for (paramBundle = new tv(paramBundle, null);; paramBundle = null) {
      return paramBundle;
    }
  }
  
  private void c()
  {
    ArrayList localArrayList;
    if (this.b == null)
    {
      localArrayList = this.a.getParcelableArrayList("routes");
      if ((localArrayList == null) || (localArrayList.isEmpty())) {
        this.b = Collections.emptyList();
      }
    }
    else
    {
      return;
    }
    int j = localArrayList.size();
    this.b = new ArrayList(j);
    int i = 0;
    label58:
    List localList;
    if (i < j)
    {
      localList = this.b;
      localObject = (Bundle)localArrayList.get(i);
      if (localObject == null) {
        break label108;
      }
    }
    label108:
    for (Object localObject = new tn((Bundle)localObject, null);; localObject = null)
    {
      localList.add(localObject);
      i++;
      break label58;
      break;
    }
  }
  
  public final List a()
  {
    c();
    return this.b;
  }
  
  public final boolean b()
  {
    c();
    int j = this.b.size();
    int i = 0;
    if (i < j)
    {
      tn localtn = (tn)this.b.get(i);
      if ((localtn != null) && (localtn.q())) {}
    }
    for (boolean bool = false;; bool = true)
    {
      return bool;
      i++;
      break;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MediaRouteProviderDescriptor{ ");
    localStringBuilder.append("routes=").append(Arrays.toString(a().toArray()));
    localStringBuilder.append(", isValid=").append(b());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */