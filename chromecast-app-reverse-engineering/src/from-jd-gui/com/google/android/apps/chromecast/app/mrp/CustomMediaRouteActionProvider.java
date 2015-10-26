package com.google.android.apps.chromecast.app.mrp;

import android.content.Context;
import android.support.v7.app.MediaRouteActionProvider;
import android.view.View;
import bbv;
import ob;

public class CustomMediaRouteActionProvider
  extends MediaRouteActionProvider
{
  private bbv d;
  
  public CustomMediaRouteActionProvider(Context paramContext)
  {
    super(paramContext);
  }
  
  public final View a()
  {
    View localView = super.a();
    this.d = new bbv();
    this.c.a(this.d);
    return localView;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\mrp\CustomMediaRouteActionProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */