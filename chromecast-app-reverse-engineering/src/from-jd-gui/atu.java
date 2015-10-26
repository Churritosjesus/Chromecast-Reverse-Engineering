import java.io.Serializable;
import java.util.List;

public final class atu
  implements Serializable
{
  public String a;
  public List b;
  public String c;
  public atv d;
  public dbw e;
  public String f;
  public String g;
  public String h;
  public String i;
  
  public final String a()
  {
    Object localObject;
    if (this.d == null) {
      localObject = "null";
    }
    for (;;)
    {
      return (String)localObject;
      localObject = this.d;
      double d1;
      switch (((atv)localObject).a)
      {
      default: 
        d1 = ((atv)localObject).b;
        localObject = 34 + "UNKNOWN - " + d1;
        break;
      case 0: 
        d1 = ((atv)localObject).b;
        localObject = 38 + "CANT_TOGGLE - " + d1;
        break;
      case 1: 
        d1 = ((atv)localObject).b;
        localObject = 34 + "PLAYING - " + d1;
        break;
      case 2: 
        d1 = ((atv)localObject).b;
        localObject = 33 + "PAUSED - " + d1;
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (paramObject == null) {}
    do
    {
      for (;;)
      {
        return bool;
        if (paramObject != this) {
          break;
        }
        bool = true;
      }
    } while (!(paramObject instanceof atu));
    throw new NullPointerException();
  }
  
  public final int hashCode()
  {
    throw new NullPointerException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\atu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */