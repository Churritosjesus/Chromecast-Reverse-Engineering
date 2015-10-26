	public final android.os.Handler a
	public final java.lang.Runnable b
	final bdm c
	final bdn d
	public  e
	private final blp f
	
	    public bje(bdm p3)
	    {
	        this.f = new blp("SoundPlayerRefresher");
	        this.c = p3;
	        this.a = new android.os.Handler();
	        this.d = new bjf(this);
	        this.b = new bjg(this);
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.e = 0;
	        this.a.removeCallbacks(this.b);
	        return;
	    }
	
