import java.util.ArrayList;
import java.util.List;

public final class bzr
{
  private final List a;
  private final Object b;
  
  public bzr(Object paramObject)
  {
    this.b = a.c(paramObject);
    this.a = new ArrayList();
  }
  
  public final bzr a(String paramString, Object paramObject)
  {
    this.a.add((String)a.c(paramString) + "=" + String.valueOf(paramObject));
    return this;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
    int j = this.a.size();
    for (int i = 0; i < j; i++)
    {
      localStringBuilder.append((String)this.a.get(i));
      if (i < j - 1) {
        localStringBuilder.append(", ");
      }
    }
    return '}';
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */