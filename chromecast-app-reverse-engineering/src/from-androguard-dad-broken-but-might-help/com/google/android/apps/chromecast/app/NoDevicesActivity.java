	private static java.lang.String e
	private static java.lang.String f
	
	    public NoDevicesActivity()
	    {
	        return;
	    }
	
	
	    public static final android.content.Intent a(android.content.Context p3, boolean p4)
	    {
	        android.content.Intent v0_1;
	        android.content.Intent v1_1 = new android.content.Intent(p3, com.google.android.apps.chromecast.app.NoDevicesActivity);
	        if (!p4) {
	            v0_1 = com.google.android.apps.chromecast.app.NoDevicesActivity.e;
	        } else {
	            v0_1 = com.google.android.apps.chromecast.app.NoDevicesActivity.f;
	        }
	        return v1_1.putExtra("fragmentType", v0_1);
	    }
	
	
	    public void onCreate(android.os.Bundle p4)
	    {
	        af v0_12;
	        super.onCreate(p4);
	        this.setContentView(a.gm);
	        blx.g(this);
	        this.a(((android.support.v7.widget.Toolbar) this.findViewById(f.cs)));
	        this.d().a().b(1);
	        this.d().a().a(b.bW);
	        if (!this.getIntent().getStringExtra("fragmentType").equals("chromecast")) {
	            v0_12 = new aml();
	        } else {
	            v0_12 = new amm();
	        }
	        this.b.a().a(f.cm, v0_12).b();
	        return;
	    }
	
	
	    public void onGetHelpClicked(android.view.View p2)
	    {
	        this.startActivity(com.google.android.apps.chromecast.app.HelpActivity.a(this, blf.Q(this)));
	        return;
	    }
	
	
	    public boolean onOptionsItemSelected(android.view.MenuItem p2)
	    {
	        this.finish();
	        return 1;
	    }
	
