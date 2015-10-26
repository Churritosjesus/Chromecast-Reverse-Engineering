	private android.widget.TextView Z
	public android.media.MediaPlayer a
	private android.view.SurfaceHolder aa
	private bjd ab
	private  ac
	public  b
	private final blp d
	
	    public biy()
	    {
	        this.d = new blp("OtaWaitVideoFragment");
	        return;
	    }
	
	
	    public static biy a(String p3)
	    {
	        biy v0_1 = new biy();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("videoUrl", p3);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic bjd a(biy p1)
	    {
	        return p1.ab;
	    }
	
	
	    static synthetic boolean a(biy p1, boolean p2)
	    {
	        p1.b = 1;
	        return 1;
	    }
	
	
	    static synthetic android.media.MediaPlayer b(biy p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic blp c(biy p1)
	    {
	        return p1.d;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p4, android.view.ViewGroup p5, android.os.Bundle p6)
	    {
	        android.view.View v1_1 = p4.inflate(a.gr, p5, 0);
	        this.aa = ((android.view.SurfaceView) v1_1.findViewById(f.es)).getHolder();
	        this.aa.addCallback(this);
	        v1_1.findViewById(f.dR).setOnClickListener(new bjc(this));
	        this.Z = ((android.widget.TextView) v1_1.findViewById(f.cE));
	        return v1_1;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.ab = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.ab = ((bjd) p1);
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p6)
	    {
	        android.media.MediaPlayer v0_0 = 0;
	        super.a(p6);
	        this.c(1);
	        this.a = new android.media.MediaPlayer();
	        this.a.setAudioStreamType(3);
	        try {
	            this.a.setDataSource(this.m.getString("videoUrl"));
	        } catch (bjb v1_4) {
	            biz v2_3 = this.d;
	            Object[] v4_1 = new Object[1];
	            v4_1[0] = v1_4;
	            v2_3.a("Issue playing video: %s", v4_1);
	            this.ab.a(0, 0);
	            return;
	        }
	        if (p6 != null) {
	            v0_0 = p6.getInt("playbackPosition");
	        }
	        this.a.setOnPreparedListener(new biz(this, v0_0));
	        this.a.setOnCompletionListener(new bja(this));
	        this.a.setOnErrorListener(new bjb(this));
	        this.a.prepareAsync();
	        return;
	    }
	
	
	    public final void d()
	    {
	        this.Z = 0;
	        super.d();
	        return;
	    }
	
	
	    public final void d(android.os.Bundle p2)
	    {
	        super.d(p2);
	        if (p2 != null) {
	            this.ac = p2.getBoolean("shouldPlay");
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putInt("playbackPosition", this.a.getCurrentPosition());
	        p3.putBoolean("shouldPlay", this.ac);
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        if ((this.ac) && (!this.a.isPlaying())) {
	            this.a.start();
	            this.ac = 0;
	        }
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        if ((!this.y.isChangingConfigurations()) && (this.a.isPlaying())) {
	            this.ac = 1;
	            this.a.pause();
	        }
	        return;
	    }
	
	
	    public final void l()
	    {
	        super.l();
	        if (this.a.isPlaying()) {
	            this.a.stop();
	        }
	        this.a.release();
	        this.a = 0;
	        return;
	    }
	
	
	    protected final android.widget.TextView p()
	    {
	        return this.Z;
	    }
	
	
	    public void q()
	    {
	        int v0_1 = this.a.getVideoWidth();
	        if (v0_1 > 0) {
	            android.view.SurfaceHolder v1_1 = this.a.getVideoHeight();
	            int v2_1 = blx.a(this.y);
	            this.aa.setFixedSize(v2_1, ((v1_1 * v2_1) / v0_1));
	        }
	        return;
	    }
	
	
	    public final void surfaceChanged(android.view.SurfaceHolder p1, int p2, int p3, int p4)
	    {
	        return;
	    }
	
	
	    public final void surfaceCreated(android.view.SurfaceHolder p2)
	    {
	        this.a.setDisplay(p2);
	        if (this.b) {
	            this.q();
	        }
	        return;
	    }
	
	
	    public final void surfaceDestroyed(android.view.SurfaceHolder p3)
	    {
	        this.a.setDisplay(0);
	        p3.removeCallback(this);
	        return;
	    }
	
