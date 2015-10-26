	private android.widget.EditText Z
	private com.google.android.apps.chromecast.app.DeviceSettingsActivity aa
	private java.lang.String ab
	
	    public bmg()
	    {
	        return;
	    }
	
	
	    static synthetic android.widget.EditText a(bmg p1)
	    {
	        return p1.Z;
	    }
	
	
	    public static bmg a(String p3)
	    {
	        bmg v0_1 = new bmg();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("oldName", p3);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic String b(bmg p1)
	    {
	        return p1.ab;
	    }
	
	
	    static synthetic com.google.android.apps.chromecast.app.DeviceSettingsActivity c(bmg p1)
	    {
	        return p1.aa;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.aa = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.aa = ((com.google.android.apps.chromecast.app.DeviceSettingsActivity) p1);
	        return;
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p8)
	    {
	        this.ab = this.m.getString("oldName");
	        android.view.Window v1_2 = this.y.getLayoutInflater().inflate(a.fZ, 0);
	        this.Z = ((android.widget.EditText) v1_2.findViewById(f.bl));
	        this.Z.setText(this.ab);
	        this.Z.selectAll();
	        android.app.AlertDialog v0_11 = new android.app.AlertDialog$Builder(this.aa).setInverseBackgroundForced(1);
	        Object[] v3_1 = new Object[1];
	        v3_1[0] = this.ab;
	        android.app.AlertDialog v0_16 = v0_11.setTitle(this.a(b.cW, v3_1)).setView(v1_2).setNegativeButton(b.H, 0).setPositiveButton(b.I, new bmh(this)).create();
	        v0_16.getWindow().setSoftInputMode(5);
	        return v0_16;
	    }
	
