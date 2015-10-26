	private synthetic com.google.android.apps.chromecast.app.MainActivity a
	
	    public amz(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onReceive(android.content.Context p5, android.content.Intent p6)
	    {
	        if (!p6.getBooleanExtra("connected", 0)) {
	            android.app.AlertDialog v0_2 = this.a;
	            android.app.AlertDialog v1_2 = this.a.getString(b.ee);
	            if (!v0_2.isFinishing()) {
	                v0_2.e = new android.app.AlertDialog$Builder(v0_2).setMessage(v1_2).setPositiveButton(b.I, 0).create();
	                v0_2.e.setOnDismissListener(new amy(v0_2));
	                v0_2.e.show();
	            }
	        }
	        this.a.unregisterReceiver(this);
	        return;
	    }
	
