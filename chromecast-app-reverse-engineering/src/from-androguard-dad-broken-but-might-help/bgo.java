	private bjn Z
	public android.widget.CheckBox a
	public android.widget.CheckBox b
	private android.widget.EditText c
	private android.widget.Button d
	
	    public bgo()
	    {
	        return;
	    }
	
	
	    public static bgo a(boolean p3)
	    {
	        bgo v0_1 = new bgo();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putBoolean("supportsGetLicense", p3);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic void a(bgo p0)
	    {
	        p0.q();
	        return;
	    }
	
	
	    private void q()
	    {
	        int v0_2;
	        if (android.text.TextUtils.isEmpty(this.p())) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        this.d.setEnabled(v0_2);
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p8, android.view.ViewGroup p9, android.os.Bundle p10)
	    {
	        int v2 = 0;
	        android.view.View v3 = p8.inflate(a.fK, p9, 0);
	        int v0_3 = ((android.widget.TextView) v3.findViewById(f.cf));
	        android.widget.CheckBox v5_0 = new Object[1];
	        v5_0[0] = this.Z.E();
	        v0_3.setText(this.a(b.bN, v5_0));
	        this.d = ((android.widget.Button) v3.findViewById(f.aa));
	        this.d.setOnClickListener(this);
	        this.c = ((android.widget.EditText) v3.findViewById(f.ar));
	        this.c.addTextChangedListener(new bgp(this));
	        this.c.setText(this.Z.D());
	        if ((this.Z.F().e()) && (blf.K(this.y))) {
	            int v4_6 = blf.M(this.y);
	            switch (bgq.a[v4_6.ordinal()]) {
	                case 1:
	                case 2:
	                    int v0_27;
	                    v3.findViewById(f.cA).setVisibility(0);
	                    this.a = ((android.widget.CheckBox) v3.findViewById(f.cz));
	                    if (v4_6 != blg.b) {
	                        v0_27 = 0;
	                    } else {
	                        v0_27 = 1;
	                    }
	                    this.a.setChecked(v0_27);
	                    break;
	                default:
	                    v3.findViewById(f.cA).setVisibility(8);
	            }
	        }
	        this.b = ((android.widget.CheckBox) v3.findViewById(f.ea));
	        switch (bgq.b[(blf.N(this.y) - 1)]) {
	            case 1:
	                v2 = 1;
	            case 2:
	                break;
	            default:
	                v2 = this.Z.F().O;
	        }
	        this.b.setChecked(v2);
	        this.d(1);
	        return v3;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.Z = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.Z = ((bjn) p1);
	        return;
	    }
	
	
	    public final void a(android.view.Menu p3)
	    {
	        super.a(p3);
	        if (!this.m.getBoolean("supportsGetLicense")) {
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
	        this.q();
	        return;
	    }
	
	
	    public final void onClick(android.view.View p4)
	    {
	        if (p4 == this.d) {
	            ((android.view.inputmethod.InputMethodManager) this.y.getSystemService("input_method")).hideSoftInputFromWindow(this.y.getWindow().getDecorView().getRootView().getWindowToken(), 0);
	            this.Z.a(bjo.d);
	        }
	        return;
	    }
	
	
	    public final String p()
	    {
	        return this.c.getText().toString().trim();
	    }
	
