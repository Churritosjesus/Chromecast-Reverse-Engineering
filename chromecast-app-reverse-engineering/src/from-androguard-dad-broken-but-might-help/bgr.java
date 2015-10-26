	public bos a
	private bjn b
	private android.widget.TextView c
	private android.widget.Button d
	
	    public bgr()
	    {
	        return;
	    }
	
	
	    public static bgr a(bfs p3, boolean p4)
	    {
	        bgr v0_1 = new bgr();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putParcelable("androidWifiNetwork", p3);
	        v1_1.putBoolean("supporteGetLicense", p4);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic void a(bgr p0)
	    {
	        p0.p();
	        return;
	    }
	
	
	    private void p()
	    {
	        int v0 = 0;
	        android.widget.Button v1 = this.d;
	        boolean v2_0 = this.a;
	        boolean v3_0 = v2_0.a();
	        if ((v3_0) && ((!android.text.TextUtils.isEmpty(v3_0.a)) && ((!v3_0.b.k) || (!android.text.TextUtils.isEmpty(v2_0.b.getText().toString().trim()))))) {
	            v0 = 1;
	        }
	        v1.setEnabled(v0);
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p9, android.view.ViewGroup p10, android.os.Bundle p11)
	    {
	        android.view.View v1 = p9.inflate(a.fL, p10, 0);
	        this.a = new bos(((android.view.ViewGroup) v1.findViewById(f.ad)));
	        this.a.a = new bgs(this);
	        this.c = ((android.widget.TextView) v1.findViewById(f.aD));
	        this.d = ((android.widget.Button) v1.findViewById(f.bi));
	        this.d.setOnClickListener(this);
	        android.widget.TextView v0_14 = ((bfs) this.m.get("androidWifiNetwork"));
	        if (v0_14 == null) {
	            this.a.a(this.b.u(), 0, 0, 0);
	        } else {
	            this.a.a(this.b.u(), v0_14.a, v0_14.b, v0_14.g);
	        }
	        if (android.text.TextUtils.isEmpty(this.b.F().p)) {
	            this.c.setText("");
	        } else {
	            android.widget.TextView v0_22 = this.c;
	            Object[] v3_3 = new Object[1];
	            v3_3[0] = this.b.F().p;
	            v0_22.setText(this.a(b.aV, v3_3));
	        }
	        this.d(1);
	        return v1;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.b = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.b = ((bjn) p1);
	        return;
	    }
	
	
	    public final void a(android.view.Menu p3)
	    {
	        super.a(p3);
	        if (!this.m.getBoolean("supporteGetLicense")) {
	            p3.findItem(f.bM).setVisible(0);
	        }
	        return;
	    }
	
	
	    public final void a(android.view.Menu p2, android.view.MenuInflater p3)
	    {
	        super.a(p2, p3);
	        p3.inflate(a.gX, p2);
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        this.p();
	        return;
	    }
	
	
	    public final void onClick(android.view.View p4)
	    {
	        if (p4 == this.d) {
	            ((android.view.inputmethod.InputMethodManager) this.y.getSystemService("input_method")).hideSoftInputFromWindow(this.y.getWindow().getDecorView().getRootView().getWindowToken(), 0);
	            this.b.a(bjo.e);
	        }
	        return;
	    }
	
