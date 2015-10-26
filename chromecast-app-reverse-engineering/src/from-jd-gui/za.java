import android.database.Observable;
import java.util.ArrayList;

public final class za
  extends Observable
{
  public final void a()
  {
    for (int i = this.mObservers.size() - 1; i >= 0; i--) {
      ((zb)this.mObservers.get(i)).a();
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    for (paramInt2 = this.mObservers.size() - 1; paramInt2 >= 0; paramInt2--) {
      ((zb)this.mObservers.get(paramInt2)).a(paramInt1, 1);
    }
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    for (paramInt2 = this.mObservers.size() - 1; paramInt2 >= 0; paramInt2--) {
      ((zb)this.mObservers.get(paramInt2)).b(paramInt1, 1);
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    for (paramInt2 = this.mObservers.size() - 1; paramInt2 >= 0; paramInt2--) {
      ((zb)this.mObservers.get(paramInt2)).c(paramInt1, 1);
    }
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    for (int i = this.mObservers.size() - 1; i >= 0; i--) {
      ((zb)this.mObservers.get(i)).a(paramInt1, paramInt2, 1);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */