import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class rm
  implements Comparable
{
  public final ResolveInfo a;
  public float b;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else if (getClass() != paramObject.getClass())
      {
        bool = false;
      }
      else
      {
        paramObject = (rm)paramObject;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(((rm)paramObject).b)) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Float.floatToIntBits(this.b) + 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("resolveInfo:").append(this.a.toString());
    localStringBuilder.append("; weight:").append(new BigDecimal(this.b));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */