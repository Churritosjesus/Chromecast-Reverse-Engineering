	private  a
	private apd b
	private android.widget.TextView c
	private bjn d
	
	    public bhd()
	    {
	        this.a = 0;
	        return;
	    }
	
	
	    static synthetic android.widget.TextView a(bhd p1)
	    {
	        return p1.c;
	    }
	
	
	    public static bhd a(String p2)
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putString("pincodeKey", p2);
	        bhd v1_2 = new bhd();
	        v1_2.f(v0_1);
	        return v1_2;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p5, android.view.ViewGroup p6, android.os.Bundle p7)
	    {
	        android.view.View v1_1 = p5.inflate(a.fI, p6, 0);
	        this.c = ((android.widget.TextView) v1_1.findViewById(f.dr));
	        this.c.setText(this.m.getString("pincodeKey"));
	        int v0_6 = new apd(57);
	        v0_6.h = this.d.A();
	        this.b = v0_6;
	        int v0_9 = ((android.widget.ImageView) v1_1.findViewById(f.ac));
	        v0_9.getViewTreeObserver().addOnPreDrawListener(new bhe(this, v0_9));
	        v1_1.findViewById(f.cN).setOnClickListener(this);
	        v1_1.findViewById(f.cO).setOnClickListener(this);
	        this.d(1);
	        return v1_1;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.d = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.d = ((bjn) p1);
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p2)
	    {
	        super.a(p2);
	        if (p2 != null) {
	            this.a = p2.getInt("mismatchCountKey");
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putInt("mismatchCountKey", this.a);
	        return;
	    }
	
	
	    public final void onClick(android.view.View p4)
	    {
	        bok v0_0 = p4.getId();
	        if (v0_0 != f.cN) {
	            if (v0_0 == f.cO) {
	                ape.a().a(this.b.a(0));
	                if (!this.y.isFinishing()) {
	                    bok v0_9;
	                    this.a = (this.a + 1);
	                    af v1_4 = this.x.a();
	                    if (this.a >= 3) {
	                        v0_9 = bok.b(a.gI);
	                    } else {
	                        v0_9 = new bjr();
	                    }
	                    v1_4.a(0);
	                    v1_4.a(f.ai, v0_9);
	                    v1_4.b();
	                }
	            }
	        } else {
	            ape.a().a(this.b.a(1));
	            this.d.a(bjo.c);
	        }
	        return;
	    }
	
