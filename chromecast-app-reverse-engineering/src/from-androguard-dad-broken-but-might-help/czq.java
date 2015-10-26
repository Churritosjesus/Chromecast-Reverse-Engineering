	final synthetic android.content.ContentResolver a
	
	    czq(String p1, android.content.ContentResolver p2)
	    {
	        this.a = p2;
	        this(p1);
	        return;
	    }
	
	
	    public final void run()
	    {
	        android.os.Looper.prepare();
	        this.a.registerContentObserver(czp.a, 1, new czr(this, new android.os.Handler(android.os.Looper.myLooper())));
	        android.os.Looper.loop();
	        return;
	    }
	
