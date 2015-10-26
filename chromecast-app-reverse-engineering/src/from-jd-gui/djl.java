import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

final class djl
  extends dgj
{
  djl(djk paramdjk, String paramString, Object[] paramArrayOfObject, djn paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public final void a()
  {
    try
    {
      djb.f(this.b.a).a(this.a);
      return;
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        dgi.a.log(Level.INFO, "StreamHandler failure for " + djb.a(this.b.a), localIOException1);
        try
        {
          this.a.a(dia.b);
        }
        catch (IOException localIOException2) {}
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */