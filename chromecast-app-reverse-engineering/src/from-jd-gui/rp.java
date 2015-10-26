import android.content.ComponentName;
import java.math.BigDecimal;

public final class rp
{
  public final ComponentName a;
  public final long b;
  public final float c;
  
  public rp(ComponentName paramComponentName, long paramLong, float paramFloat)
  {
    this.a = paramComponentName;
    this.b = paramLong;
    this.c = paramFloat;
  }
  
  public rp(String paramString, long paramLong, float paramFloat)
  {
    this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
  }
  
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
        paramObject = (rp)paramObject;
        if (this.a == null)
        {
          if (((rp)paramObject).a != null) {
            bool = false;
          }
        }
        else if (!this.a.equals(((rp)paramObject).a))
        {
          bool = false;
          continue;
        }
        if (this.b != ((rp)paramObject).b) {
          bool = false;
        } else if (Float.floatToIntBits(this.c) != Float.floatToIntBits(((rp)paramObject).c)) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    if (this.a == null) {}
    for (int i = 0;; i = this.a.hashCode()) {
      return ((i + 31) * 31 + (int)(this.b ^ this.b >>> 32)) * 31 + Float.floatToIntBits(this.c);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("; activity:").append(this.a);
    localStringBuilder.append("; time:").append(this.b);
    localStringBuilder.append("; weight:").append(new BigDecimal(this.c));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */