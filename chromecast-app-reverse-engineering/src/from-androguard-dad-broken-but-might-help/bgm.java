	
	    public bgm()
	    {
	        return;
	    }
	
	
	    public final void onCreate(android.os.Bundle p5)
	    {
	        super.onCreate(p5);
	        android.content.Intent v0_1 = this.getActivity().getApplicationContext();
	        this.addPreferencesFromResource(a.hl);
	        this.findPreference("software_version").setSummary(com.google.android.apps.chromecast.app.SetupApplication.a().e());
	        this.findPreference("privacy_link").setIntent(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(blx.a(v0_1))));
	        return;
	    }
	
