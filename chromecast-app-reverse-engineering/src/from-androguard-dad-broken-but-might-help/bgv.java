	private android.widget.Spinner Z
	private java.lang.String aa
	private bgz ab
	
	    public bgv()
	    {
	        return;
	    }
	
	
	    static synthetic String a(bgv p1)
	    {
	        return p1.aa;
	    }
	
	
	    static synthetic String a(bgv p0, String p1)
	    {
	        p0.aa = p1;
	        return p1;
	    }
	
	
	    static synthetic bgz b(bgv p1)
	    {
	        return p1.ab;
	    }
	
	
	    static synthetic android.widget.Spinner c(bgv p1)
	    {
	        return p1.Z;
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
	        this.ab = ((bgz) p1);
	        return;
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p6)
	    {
	        int v1_1 = this.y.getLayoutInflater().inflate(a.gM, 0);
	        ((android.widget.TextView) v1_1.findViewById(f.bY)).setText(b.cU);
	        this.Z = ((android.widget.Spinner) v1_1.findViewById(f.aN));
	        if (p6 != null) {
	            this.aa = p6.getString("setupCountry");
	        }
	        android.widget.Spinner v2_2 = blj.e();
	        android.widget.ArrayAdapter v3_1 = new android.widget.ArrayAdapter(this.y, 17367048, v2_2);
	        v3_1.setDropDownViewResource(17367049);
	        this.Z.setAdapter(v3_1);
	        android.app.AlertDialog v0_14 = blj.a(v2_2, this.aa);
	        if (v0_14 == null) {
	            v0_14 = blj.a(v2_2);
	        }
	        if (v0_14 != null) {
	            android.app.AlertDialog v0_15 = v3_1.getPosition(v0_14);
	            if (v0_15 != -1) {
	                this.Z.setSelection(v0_15);
	            }
	        }
	        this.Z.setOnItemSelectedListener(new bgy(this));
	        return new android.app.AlertDialog$Builder(this.y).setTitle(b.cV).setView(v1_1).setNegativeButton(b.H, new bgx(this)).setPositiveButton(b.I, new bgw(this)).create();
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putString("setupCountry", this.aa);
	        return;
	    }
	
	
	    public final void onCancel(android.content.DialogInterface p2)
	    {
	        super.onCancel(p2);
	        this.ab.a();
	        return;
	    }
	
