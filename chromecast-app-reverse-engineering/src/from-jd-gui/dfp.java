import java.util.ArrayList;
import java.util.List;

public final class dfp
{
  public final List a = new ArrayList(20);
  
  public final dfo a()
  {
    return new dfo(this);
  }
  
  public final dfp a(String paramString)
  {
    int j;
    for (int i = 0; i < this.a.size(); i = j + 2)
    {
      j = i;
      if (paramString.equalsIgnoreCase((String)this.a.get(i)))
      {
        this.a.remove(i);
        this.a.remove(i);
        j = i - 2;
      }
    }
    return this;
  }
  
  public final dfp a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new IllegalArgumentException("name == null");
    }
    if (paramString2 == null) {
      throw new IllegalArgumentException("value == null");
    }
    if ((paramString1.length() == 0) || (paramString1.indexOf(0) != -1) || (paramString2.indexOf(0) != -1)) {
      throw new IllegalArgumentException("Unexpected header: " + paramString1 + ": " + paramString2);
    }
    return b(paramString1, paramString2);
  }
  
  final dfp b(String paramString1, String paramString2)
  {
    this.a.add(paramString1);
    this.a.add(paramString2.trim());
    return this;
  }
  
  public final dfp c(String paramString1, String paramString2)
  {
    a(paramString1);
    a(paramString1, paramString2);
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */