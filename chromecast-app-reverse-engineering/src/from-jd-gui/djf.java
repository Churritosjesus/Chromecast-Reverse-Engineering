import java.io.IOException;
import java.util.List;
import java.util.Set;

final class djf
  extends dgj
{
  djf(djb paramdjb, String paramString, Object[] paramArrayOfObject, int paramInt, List paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public final void a()
  {
    djb.h(this.c).a();
    for (;;)
    {
      try
      {
        this.c.i.a(this.a, dia.h);
      }
      catch (IOException localIOException)
      {
        continue;
      }
      synchronized (this.c)
      {
        djb.i(this.c).remove(Integer.valueOf(this.a));
        return;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */