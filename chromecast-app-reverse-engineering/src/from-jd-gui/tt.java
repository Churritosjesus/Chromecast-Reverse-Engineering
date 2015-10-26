import android.content.ComponentName;

public final class tt
{
  final ComponentName a;
  
  tt(ComponentName paramComponentName)
  {
    if (paramComponentName == null) {
      throw new IllegalArgumentException("componentName must not be null");
    }
    this.a = paramComponentName;
  }
  
  public final String toString()
  {
    return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */