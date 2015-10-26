import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.PlaybackState;
import android.os.Bundle;

public final class dg
  extends MediaController.Callback
{
  private df a;
  
  public dg(df paramdf)
  {
    this.a = paramdf;
  }
  
  public final void onMetadataChanged(MediaMetadata paramMediaMetadata)
  {
    this.a.b(paramMediaMetadata);
  }
  
  public final void onPlaybackStateChanged(PlaybackState paramPlaybackState)
  {
    this.a.a(paramPlaybackState);
  }
  
  public final void onSessionDestroyed()
  {
    this.a.a();
  }
  
  public final void onSessionEvent(String paramString, Bundle paramBundle) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */