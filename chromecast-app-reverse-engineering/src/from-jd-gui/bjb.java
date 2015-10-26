import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;

final class bjb
  implements MediaPlayer.OnErrorListener
{
  bjb(biy parambiy) {}
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    if (biy.a(this.a) != null) {
      biy.a(this.a).a(paramInt1, paramInt2);
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */