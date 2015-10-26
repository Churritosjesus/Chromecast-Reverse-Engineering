import java.io.Serializable;

final class ahl
  implements Serializable
{
  private static final long serialVersionUID = -2488473066578201069L;
  private final String a;
  private final String b;
  
  ahl(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  private Object readResolve()
  {
    return new ahk(this.a, this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */