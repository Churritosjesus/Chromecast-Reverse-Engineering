import java.io.IOException;
import java.util.List;
import java.util.Set;

final class djg
  extends dgj
{
  djg(djb paramdjb, String paramString, Object[] paramArrayOfObject, int paramInt, List paramList, boolean paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public final void a()
  {
    djb.h(this.d).b();
    for (;;)
    {
      try
      {
        this.d.i.a(this.a, dia.h);
      }
      catch (IOException localIOException)
      {
        continue;
      }
      synchronized (this.d)
      {
        djb.i(this.d).remove(Integer.valueOf(this.a));
        return;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */