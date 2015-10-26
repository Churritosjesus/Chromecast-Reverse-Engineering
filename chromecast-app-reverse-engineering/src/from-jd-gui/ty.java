import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ty
{
  private ArrayList a;
  
  public ty() {}
  
  public ty(tx paramtx)
  {
    if (paramtx == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    tx.a(paramtx);
    if (!tx.b(paramtx).isEmpty()) {
      this.a = new ArrayList(tx.b(paramtx));
    }
  }
  
  private ty a(Collection paramCollection)
  {
    if (paramCollection == null) {
      throw new IllegalArgumentException("categories must not be null");
    }
    if (!paramCollection.isEmpty())
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        a((String)paramCollection.next());
      }
    }
    return this;
  }
  
  public final tx a()
  {
    if (this.a == null) {}
    for (Object localObject = tx.c;; localObject = new tx((Bundle)localObject, this.a))
    {
      return (tx)localObject;
      localObject = new Bundle();
      ((Bundle)localObject).putStringArrayList("controlCategories", this.a);
    }
  }
  
  public final ty a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("category must not be null");
    }
    if (this.a == null) {
      this.a = new ArrayList();
    }
    if (!this.a.contains(paramString)) {
      this.a.add(paramString);
    }
    return this;
  }
  
  public final ty a(tx paramtx)
  {
    if (paramtx == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    a(paramtx.a());
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */