	private  a
	private  b
	private apd c
	
	    public bgt()
	    {
	        this.a = 0;
	        this.b = 0;
	        return;
	    }
	
	
	    private void p()
	    {
	        boolean v1_2;
	        int v3 = 0;
	        if (!this.a) {
	            v1_2 = b.dq;
	        } else {
	            v1_2 = b.dp;
	        }
	        boolean v1_7;
	        ((android.widget.TextView) this.N.findViewById(f.cT)).setText(v1_2);
	        ((android.widget.Button) this.N.findViewById(f.cR)).setText(b.dw);
	        if (!this.a) {
	            v1_7 = 0;
	        } else {
	            v1_7 = 8;
	        }
	        boolean v1_10;
	        ((android.widget.Button) this.N.findViewById(f.cR)).setVisibility(v1_7);
	        if (!this.a) {
	            v1_10 = b.dr;
	        } else {
	            v1_10 = b.dA;
	        }
	        android.view.View v0_14;
	        ((android.widget.TextView) this.N.findViewById(f.dM)).setText(v1_10);
	        boolean v1_12 = this.N.findViewById(f.dU);
	        if (!this.a) {
	            v0_14 = 8;
	        } else {
	            v0_14 = 0;
	        }
	        v1_12.setVisibility(v0_14);
	        android.view.View v0_16 = this.N.findViewById(f.dV);
	        if (!this.a) {
	            v3 = 8;
	        }
	        v0_16.setVisibility(v3);
	        this.N.findViewById(f.cS).setClickable(this.a);
	        return;
	    }
	
	
	    private aph q()
	    {
	        int v0_1;
	        if (this.y == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = ((com.google.android.apps.chromecast.app.setup.DeviceSetupActivity) this.y).f;
	        }
	        return v0_1;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p3, android.view.ViewGroup p4, android.os.Bundle p5)
	    {
	        this.c = new apd(57);
	        android.view.View v0_3 = p3.inflate(a.gy, p4, 0);
	        v0_3.findViewById(f.cR).setOnClickListener(this);
	        v0_3.findViewById(f.dU).setOnClickListener(this);
	        v0_3.findViewById(f.dV).setOnClickListener(this);
	        v0_3.findViewById(f.cS).setOnClickListener(this);
	        return v0_3;
	    }
	
	
	    public final void a(android.os.Bundle p3)
	    {
	        super.a(p3);
	        if (p3 != null) {
	            this.a = p3.getBoolean("playedSound", 0);
	            this.b = p3.getInt("noSoundCount");
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putBoolean("playedSound", this.a);
	        p3.putInt("noSoundCount", this.b);
	        return;
	    }
	
	
	    public final void g_()
	    {
	        super.g_();
	        this.p();
	        return;
	    }
	
	
	    public final void onClick(android.view.View p5)
	    {
	        bgu v0_0 = p5.getId();
	        if (v0_0 != f.cR) {
	            if (v0_0 != f.dU) {
	                if (v0_0 != f.dV) {
	                    if (v0_0 == f.cS) {
	                        ((bgu) this.y).a_(1);
	                    }
	                } else {
	                    bgu v0_9;
	                    bgu v0_3 = ape.a();
	                    int v1_5 = this.c.a(0);
	                    v1_5.h = this.q();
	                    v0_3.a(v1_5);
	                    this.b = (this.b + 1);
	                    int v1_6 = this.x.a();
	                    if (this.b >= 3) {
	                        v0_9 = bok.b(a.fu);
	                    } else {
	                        v0_9 = new biw();
	                    }
	                    v0_9.n = this;
	                    v0_9.p = 0;
	                    v1_6.a(0);
	                    v1_6.a(f.ai, v0_9);
	                    v1_6.b();
	                }
	            } else {
	                bgu v0_11 = ape.a();
	                int v1_8 = this.c.a(1);
	                v1_8.h = this.q();
	                v0_11.a(v1_8);
	                ((bjn) this.y).a(bjo.c);
	            }
	        } else {
	            ((bgu) this.y).a_(0);
	            this.a = 1;
	            this.p();
	        }
	        return;
	    }
	
