import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class ai
  extends Transition.EpicenterCallback
{
  private Rect a;
  
  ai(ak paramak) {}
  
  public final Rect onGetEpicenter(Transition paramTransition)
  {
    if ((this.a == null) && (this.b.a != null)) {
      this.a = a.a(this.b.a);
    }
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */