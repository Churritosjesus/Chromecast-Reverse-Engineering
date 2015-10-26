import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class dfo
{
  public final String[] a;
  
  dfo(dfp paramdfp)
  {
    this.a = ((String[])paramdfp.a.toArray(new String[paramdfp.a.size()]));
  }
  
  public final dfp a()
  {
    dfp localdfp = new dfp();
    Collections.addAll(localdfp.a, this.a);
    return localdfp;
  }
  
  public final String a(int paramInt)
  {
    paramInt <<= 1;
    if ((paramInt < 0) || (paramInt >= this.a.length)) {}
    for (String str = null;; str = this.a[paramInt]) {
      return str;
    }
  }
  
  public final String a(String paramString)
  {
    String[] arrayOfString = this.a;
    int i = arrayOfString.length - 2;
    if (i >= 0) {
      if (!paramString.equalsIgnoreCase(arrayOfString[i])) {}
    }
    for (paramString = arrayOfString[(i + 1)];; paramString = null)
    {
      return paramString;
      i -= 2;
      break;
    }
  }
  
  public final String b(int paramInt)
  {
    paramInt = (paramInt << 1) + 1;
    if ((paramInt < 0) || (paramInt >= this.a.length)) {}
    for (String str = null;; str = this.a[paramInt]) {
      return str;
    }
  }
  
  public final Date b(String paramString)
  {
    paramString = a(paramString);
    if (paramString != null) {}
    for (paramString = dhe.a(paramString);; paramString = null) {
      return paramString;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int j = this.a.length / 2;
    while (i < j)
    {
      localStringBuilder.append(a(i)).append(": ").append(b(i)).append("\n");
      i++;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */