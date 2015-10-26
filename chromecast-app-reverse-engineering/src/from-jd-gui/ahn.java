import java.io.Serializable;

final class ahn
  implements Serializable
{
  private static final long serialVersionUID = -2488473066578201069L;
  private final String a;
  private final boolean b;
  
  ahn(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }
  
  private Object readResolve()
  {
    return new ahm(this.a, this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */