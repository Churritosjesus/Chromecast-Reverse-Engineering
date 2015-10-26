import java.util.LinkedHashSet;
import java.util.Set;

public final class dgr
{
  private final Set a = new LinkedHashSet();
  
  public final void a(dgf paramdgf)
  {
    try
    {
      this.a.add(paramdgf);
      return;
    }
    finally
    {
      paramdgf = finally;
      throw paramdgf;
    }
  }
  
  public final void b(dgf paramdgf)
  {
    try
    {
      this.a.remove(paramdgf);
      return;
    }
    finally
    {
      paramdgf = finally;
      throw paramdgf;
    }
  }
  
  public final boolean c(dgf paramdgf)
  {
    try
    {
      boolean bool = this.a.contains(paramdgf);
      return bool;
    }
    finally
    {
      paramdgf = finally;
      throw paramdgf;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */