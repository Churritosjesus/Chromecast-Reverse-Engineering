	final synthetic android.view.View a
	final synthetic com.google.android.apps.chromecast.app.MainActivity b
	private synthetic android.widget.ImageView c
	
	    public ams(com.google.android.apps.chromecast.app.MainActivity p1, android.widget.ImageView p2, android.view.View p3)
	    {
	        this.b = p1;
	        this.c = p2;
	        this.a = p3;
	        return;
	    }
	
	
	    public final void onFocusChange(android.view.View p4, boolean p5)
	    {
	        if (!p5) {
	            com.google.android.apps.chromecast.app.MainActivity.d(this.b).a.a(0);
	            this.c.setImageResource(a.eF);
	            this.c.setOnClickListener(new amu(this));
	            this.a.setVisibility(8);
	        } else {
	            com.google.android.apps.chromecast.app.MainActivity.d(this.b).a.a(1);
	            this.c.setImageResource(a.eC);
	            this.c.setOnClickListener(new amt(this));
	            this.a.setVisibility(0);
	        }
	        return;
	    }
	
