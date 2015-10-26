	public java.lang.String a
	public java.lang.String b
	public java.lang.String c
	public java.lang.String d
	public  e
	public java.lang.String f
	public  g
	public  h
	
	    public bpy()
	    {
	        return;
	    }
	
	
	    public final synthetic void a(cov p7)
	    {
	        int v0 = 1;
	        if (!android.text.TextUtils.isEmpty(this.a)) {
	            ((bpy) p7).a = this.a;
	        }
	        if (!android.text.TextUtils.isEmpty(this.b)) {
	            ((bpy) p7).b = this.b;
	        }
	        if (!android.text.TextUtils.isEmpty(this.c)) {
	            ((bpy) p7).c = this.c;
	        }
	        if (!android.text.TextUtils.isEmpty(this.d)) {
	            ((bpy) p7).d = this.d;
	        }
	        if (this.e) {
	            ((bpy) p7).e = 1;
	        }
	        if (!android.text.TextUtils.isEmpty(this.f)) {
	            ((bpy) p7).f = this.f;
	        }
	        if (this.g) {
	            ((bpy) p7).g = this.g;
	        }
	        if (this.h != 0) {
	            double v2_1 = this.h;
	            if ((v2_1 < 0) || (v2_1 > 100.0)) {
	                v0 = 0;
	            }
	            a.b(v0, "Sample rate must be between 0% and 100%");
	            ((bpy) p7).h = v2_1;
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new java.util.HashMap();
	        v0_1.put("hitType", this.a);
	        v0_1.put("clientId", this.b);
	        v0_1.put("userId", this.c);
	        v0_1.put("androidAdId", this.d);
	        v0_1.put("AdTargetingEnabled", Boolean.valueOf(this.e));
	        v0_1.put("sessionControl", this.f);
	        v0_1.put("nonInteraction", Boolean.valueOf(this.g));
	        v0_1.put("sampleRate", Double.valueOf(this.h));
	        return bpy.a(v0_1);
	    }
	
