	private android.widget.TextView Z
	private bjn a
	private android.widget.TextView aa
	private android.widget.ImageView b
	private android.widget.TextView d
	
	    public bix()
	    {
	        return;
	    }
	
	
	    public static bix a(boolean p3)
	    {
	        bix v0_1 = new bix();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putBoolean("waitForOta", p3);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p9, android.view.ViewGroup p10, android.os.Bundle p11)
	    {
	        android.view.View v1 = p9.inflate(a.gz, p10, 0);
	        this.b = ((android.widget.ImageView) v1.findViewById(f.bw));
	        this.b.setImageResource(a.eE);
	        this.d = ((android.widget.TextView) v1.findViewById(f.bq));
	        this.d.setText(b.cF);
	        this.Z = ((android.widget.TextView) v1.findViewById(f.I));
	        this.Z.setText(b.cE);
	        int v2_3 = v1.findViewById(f.dc);
	        android.view.View v3 = v1.findViewById(f.aR);
	        this.aa = ((android.widget.TextView) v1.findViewById(f.cE));
	        if (!this.m.getBoolean("waitForOta")) {
	            v2_3.setVisibility(8);
	            v3.setVisibility(0);
	            v3.setOnClickListener(this);
	            this.aa.setVisibility(8);
	            this.aa = 0;
	        } else {
	            v2_3.setVisibility(0);
	            v3.setVisibility(8);
	            this.aa.setVisibility(4);
	            if (this.a.F().h) {
	                this.aa = 0;
	            }
	        }
	        return v1;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.a = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.a = ((bjn) p1);
	        return;
	    }
	
	
	    public final void b(int p3)
	    {
	        super.b(p3);
	        if ((p3 != -1) && (this.aa != null)) {
	            this.aa.setVisibility(0);
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        this.aa = 0;
	        super.d();
	        return;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        if (p3.getId() == f.aR) {
	            this.a.a(bjo.g);
	        }
	        return;
	    }
	
	
	    protected final android.widget.TextView p()
	    {
	        return this.aa;
	    }
	
