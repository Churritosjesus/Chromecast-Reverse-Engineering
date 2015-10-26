import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;

public final class bvz
{
  final ArrayList a;
  private final bwd b;
  private final s c;
  private final bwe d;
  private final a e;
  
  public bvz(String paramString, bwd parambwd, bwe parambwe, Scope... paramVarArgs)
  {
    a.f(parambwd, "Cannot construct an Api with a null ClientBuilder");
    a.f(parambwe, "Cannot construct an Api with a null ClientKey");
    this.b = parambwd;
    this.c = null;
    this.d = parambwe;
    this.e = null;
    this.a = new ArrayList(Arrays.asList(paramVarArgs));
  }
  
  public final bwd a()
  {
    if (this.b != null) {}
    for (boolean bool = true;; bool = false)
    {
      a.a(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return this.b;
    }
  }
  
  public final bwe b()
  {
    if (this.d != null) {}
    for (boolean bool = true;; bool = false)
    {
      a.a(bool, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
      return this.d;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */