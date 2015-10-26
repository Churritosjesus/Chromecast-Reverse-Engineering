import android.content.Context;

public final class brd
{
  final Context a;
  final Context b;
  
  public brd(Context paramContext)
  {
    a.c(paramContext);
    paramContext = paramContext.getApplicationContext();
    a.f(paramContext, "Application context can't be null");
    this.a = paramContext;
    this.b = paramContext;
  }
  
  protected static brt a(brb parambrb)
  {
    return new brt(parambrb);
  }
  
  protected static brz b(brb parambrb)
  {
    return new brz(parambrb);
  }
  
  public static brf d(brb parambrb)
  {
    return new brf(parambrb);
  }
  
  public static bse e(brb parambrb)
  {
    return new bse(parambrb);
  }
  
  public static bqp f(brb parambrb)
  {
    return new bqp(parambrb);
  }
  
  final brn c(brb parambrb)
  {
    return new brn(parambrb, this);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */