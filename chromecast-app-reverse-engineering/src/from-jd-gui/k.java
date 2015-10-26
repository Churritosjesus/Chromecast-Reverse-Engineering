import android.view.View;

final class k
  implements q
{
  k(j paramj) {}
  
  public final View a(int paramInt)
  {
    if (this.a.N == null) {
      throw new IllegalStateException("Fragment does not have a view");
    }
    return this.a.N.findViewById(paramInt);
  }
  
  public final boolean a()
  {
    if (this.a.N != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */