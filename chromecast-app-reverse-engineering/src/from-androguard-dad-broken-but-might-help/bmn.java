	private aow Z
	private android.widget.SeekBar aa
	private android.widget.TextView ab
	private android.widget.TextView ac
	private android.widget.ImageButton ad
	private blp ae
	
	    public bmn()
	    {
	        this.ae = new blp("RemoteControlDialogFragment", 0);
	        return;
	    }
	
	
	    static synthetic double a(bmn p4, int p5)
	    {
	        return (((double) p5) / 100.0);
	    }
	
	
	    static synthetic aow a(bmn p1)
	    {
	        return p1.Z;
	    }
	
	
	    public static bmn a(String p3)
	    {
	        bmn v0_1 = new bmn();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("deviceKey", p3);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p4, android.view.ViewGroup p5, android.os.Bundle p6)
	    {
	        android.view.View v0_24;
	        if (this.Z != null) {
	            android.view.View v1 = p4.inflate(a.fS, p5);
	            ((android.widget.TextView) v1.findViewById(f.aF)).setText(this.Z.g());
	            this.ab = ((android.widget.TextView) v1.findViewById(f.em));
	            this.ac = ((android.widget.TextView) v1.findViewById(f.t));
	            v1.findViewById(f.Z).setOnClickListener(new bmo(this));
	            v1.findViewById(f.eb).setOnClickListener(new bmp(this));
	            this.ad = ((android.widget.ImageButton) v1.findViewById(f.cQ));
	            this.ad.setOnClickListener(new bmq(this));
	            this.aa = ((android.widget.SeekBar) v1.findViewById(f.W));
	            this.aa.setMax(100);
	            this.aa.setOnSeekBarChangeListener(new bmr(this));
	            v0_24 = v1;
	        } else {
	            v0_24 = 0;
	        }
	        return v0_24;
	    }
	
	
	    public final void a(android.os.Bundle p4)
	    {
	        super.a(p4);
	        this.Z = com.google.android.apps.chromecast.app.SetupApplication.a().b().c(this.m.getString("deviceKey"));
	        if (this.Z == null) {
	            this.a(0);
	        }
	        this.a = 1;
	        if ((this.a == 2) || (this.a == 3)) {
	            this.b = 16973913;
	        }
	        return;
	    }
	
	
	    public final void a(aow p5)
	    {
	        if ((!android.text.TextUtils.isEmpty(p5.o)) && ((!p5.d()) && (!p5.e()))) {
	            int v0_4 = p5.o();
	            android.widget.SeekBar v1_0 = v0_4.f;
	            if (!android.text.TextUtils.isEmpty(v1_0)) {
	                this.ab.setText(v1_0);
	            } else {
	                this.ab.setText(b.bX);
	            }
	            blx.a(this.ac, v0_4.g);
	            android.widget.SeekBar v1_3 = v0_4.d;
	            if (v1_3 != null) {
	                if (v1_3.a()) {
	                    int v0_8;
	                    this.ad.setVisibility(0);
	                    if (!v1_3.b()) {
	                        v0_8 = a.eI;
	                    } else {
	                        v0_8 = a.eK;
	                    }
	                    this.ad.setImageResource(v0_8);
	                } else {
	                    this.ad.setVisibility(8);
	                }
	                int v0_12 = ((int) (v1_3.b * 100.0));
	                if (v0_12 != this.aa.getProgress()) {
	                    this.aa.setProgress(v0_12);
	                }
	            }
	        } else {
	            this.a(0);
	        }
	        return;
	    }
	
	
	    public final void b(aow p5)
	    {
	        int v0_1 = p5.o().d;
	        if (v0_1 != 0) {
	            int v0_4 = ((int) (v0_1.b * 100.0));
	            if (v0_4 != this.aa.getProgress()) {
	                this.aa.setProgress(v0_4);
	            }
	        }
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        if (this.Z != null) {
	            this.a(this.Z);
	            this.Z.a(this);
	            this.Z.i.add(this);
	        }
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        if (this.Z != null) {
	            this.Z.h.remove(this);
	            this.Z.i.remove(this);
	        }
	        return;
	    }
	
