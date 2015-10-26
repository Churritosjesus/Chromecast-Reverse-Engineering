	
	    public ApplicationSettingsActivity()
	    {
	        return;
	    }
	
	
	    protected void onCreate(android.os.Bundle p4)
	    {
	        super.onCreate(p4);
	        blx.g(this);
	        this.addPreferencesFromResource(a.hl);
	        this.findPreference("privacy_link").setIntent(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(blx.a(this))));
	        this.findPreference("software_version").setSummary(com.google.android.apps.chromecast.app.SetupApplication.a().e());
	        return;
	    }
	
	
	    public boolean onOptionsItemSelected(android.view.MenuItem p2)
	    {
	        int v0_3;
	        switch (p2.getItemId()) {
	            case 16908332:
	                this.startActivity(com.google.android.apps.chromecast.app.SetupApplication.a(this, ana.a));
	                v0_3 = 1;
	                break;
	            default:
	                v0_3 = super.onOptionsItemSelected(p2);
	        }
	        return v0_3;
	    }
	
