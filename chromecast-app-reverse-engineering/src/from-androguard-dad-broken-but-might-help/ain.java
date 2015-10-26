	public android.app.Dialog Z
	
	    public ain()
	    {
	        return;
	    }
	
	
	    static synthetic void a(ain p3, android.os.Bundle p4)
	    {
	        m v0 = p3.y;
	        android.content.Intent v1_1 = new android.content.Intent();
	        if (p4 == null) {
	            p4 = new android.os.Bundle();
	        }
	        v1_1.putExtras(p4);
	        v0.setResult(-1, v1_1);
	        v0.finish();
	        return;
	    }
	
	
	    static synthetic void a(ain p0, android.os.Bundle p1, afq p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    private void a(android.os.Bundle p4, afq p5)
	    {
	        int v0_1;
	        m v1 = this.y;
	        android.content.Intent v2 = aix.a(v1.getIntent(), p4, p5);
	        if (p5 != null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = -1;
	        }
	        v1.setResult(v0_1, v2);
	        v1.finish();
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p7)
	    {
	        super.a(p7);
	        if (this.Z == null) {
	            aiu v0_6;
	            aip v1_0 = this.y;
	            aiu v0_2 = aix.a(v1_0.getIntent());
	            if (v0_2.getBoolean("is_fallback", 0)) {
	                String v2_3 = v0_2.getString("url");
	                if (!aji.a(v2_3)) {
	                    String v3_1 = new Object[1];
	                    v3_1[0] = afv.h();
	                    v0_6 = new aiu(v1_0, v2_3, String.format("fb%s://bridge/", v3_1));
	                    v0_6.b = new aip(this);
	                } else {
	                    aji.a("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing \'url\'");
	                    v1_0.finish();
	                    return;
	                }
	            } else {
	                String v2_6 = v0_2.getString("action");
	                aiu v0_8 = v0_2.getBundle("params");
	                if (!aji.a(v2_6)) {
	                    String v3_6 = new ajv(v1_0, v2_6, v0_8);
	                    v3_6.d = new aio(this);
	                    v0_6 = v3_6.a();
	                } else {
	                    aji.a("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing \'actionName\'");
	                    v1_0.finish();
	                    return;
	                }
	            }
	            this.Z = v0_6;
	        }
	        return;
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p3)
	    {
	        if (this.Z == null) {
	            this.a(0, 0);
	            this.c = 0;
	        }
	        return this.Z;
	    }
	
	
	    public final void d()
	    {
	        if ((this.d != null) && (this.G)) {
	            this.d.setDismissMessage(0);
	        }
	        super.d();
	        return;
	    }
	
	
	    public final void onConfigurationChanged(android.content.res.Configuration p2)
	    {
	        super.onConfigurationChanged(p2);
	        if ((this.Z instanceof ajq)) {
	            ((ajq) this.Z).a();
	        }
	        return;
	    }
	
