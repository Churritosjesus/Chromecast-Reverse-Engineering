import java.util.Collections;
import java.util.List;

public final class cmb
{
  public final List a;
  public final List b;
  public final List c;
  public final List d;
  public final List e;
  public final List f;
  private final List g;
  private final List h;
  private final List i;
  private final List j;
  
  public cmb(List paramList1, List paramList2, List paramList3, List paramList4, List paramList5, List paramList6, List paramList7, List paramList8, List paramList9, List paramList10)
  {
    this.a = Collections.unmodifiableList(paramList1);
    this.b = Collections.unmodifiableList(paramList2);
    this.c = Collections.unmodifiableList(paramList3);
    this.d = Collections.unmodifiableList(paramList4);
    this.e = Collections.unmodifiableList(paramList5);
    this.f = Collections.unmodifiableList(paramList6);
    this.g = Collections.unmodifiableList(paramList7);
    this.h = Collections.unmodifiableList(paramList8);
    this.i = Collections.unmodifiableList(paramList9);
    this.j = Collections.unmodifiableList(paramList10);
  }
  
  public final String toString()
  {
    return "Positive predicates: " + this.a + "  Negative predicates: " + this.b + "  Add tags: " + this.c + "  Remove tags: " + this.d + "  Add macros: " + this.e + "  Remove macros: " + this.f;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */