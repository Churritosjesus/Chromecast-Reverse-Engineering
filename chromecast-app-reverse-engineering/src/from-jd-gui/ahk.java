import java.io.Serializable;

final class ahk
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  final String a;
  final String b;
  
  ahk(afb paramafb)
  {
    this(paramafb.d, afv.h());
  }
  
  ahk(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (aji.a(paramString1)) {
      str = null;
    }
    this.a = str;
    this.b = paramString2;
  }
  
  private Object writeReplace()
  {
    return new ahl(this.a, this.b);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!(paramObject instanceof ahk)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      paramObject = (ahk)paramObject;
      bool1 = bool2;
      if (aji.a(((ahk)paramObject).a, this.a))
      {
        bool1 = bool2;
        if (aji.a(((ahk)paramObject).b, this.b)) {
          bool1 = true;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int j = 0;
    int i;
    if (this.a == null)
    {
      i = 0;
      if (this.b != null) {
        break label33;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = this.a.hashCode();
      break;
      label33:
      j = this.b.hashCode();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */