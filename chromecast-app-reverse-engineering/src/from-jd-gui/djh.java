import java.io.IOException;
import java.util.Set;

final class djh
  extends dgj
{
  djh(djb paramdjb, String paramString, Object[] paramArrayOfObject, int paramInt1, djz paramdjz, int paramInt2, boolean paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public final void a()
  {
    for (;;)
    {
      try
      {
        djb.h(this.e).a(this.b, this.c);
        this.e.i.a(this.a, dia.h);
      }
      catch (IOException localIOException)
      {
        continue;
      }
      synchronized (this.e)
      {
        djb.i(this.e).remove(Integer.valueOf(this.a));
        return;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */