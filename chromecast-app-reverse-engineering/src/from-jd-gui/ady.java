public final class ady
{
  public final Object a;
  public final adh b;
  public final aef c;
  public boolean d = false;
  
  private ady(aef paramaef)
  {
    this.a = null;
    this.b = null;
    this.c = paramaef;
  }
  
  private ady(Object paramObject, adh paramadh)
  {
    this.a = paramObject;
    this.b = paramadh;
    this.c = null;
  }
  
  public static ady a(aef paramaef)
  {
    return new ady(paramaef);
  }
  
  public static ady a(Object paramObject, adh paramadh)
  {
    return new ady(paramObject, paramadh);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ady.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */