	private synthetic android.app.Activity a
	
	    bma(android.app.Activity p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.content.DialogInterface p5, int p6)
	    {
	        this.a.startActivity(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(blf.T(this.a))));
	        return;
	    }
	
