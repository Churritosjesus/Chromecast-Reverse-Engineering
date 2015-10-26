import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

public abstract class bxu
  implements bxv
{
  public final DataHolder a;
  
  public bxu(DataHolder paramDataHolder)
  {
    this.a = paramDataHolder;
    if (this.a != null) {
      this.a.i = this;
    }
  }
  
  public final void a()
  {
    if (this.a != null) {
      this.a.c();
    }
  }
  
  public final int b()
  {
    if (this.a == null) {}
    for (int i = 0;; i = this.a.h) {
      return i;
    }
  }
  
  public Iterator iterator()
  {
    return new bxz(this);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */