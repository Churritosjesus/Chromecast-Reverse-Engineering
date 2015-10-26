	final android.os.Bundle a
	 java.util.List b
	
	    tn(android.os.Bundle p1, java.util.List p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final String a()
	    {
	        return this.a.getString("id");
	    }
	
	
	    public final String b()
	    {
	        return this.a.getString("name");
	    }
	
	
	    public final String c()
	    {
	        return this.a.getString("status");
	    }
	
	
	    public final boolean d()
	    {
	        return this.a.getBoolean("enabled", 1);
	    }
	
	
	    public final boolean e()
	    {
	        return this.a.getBoolean("connecting", 0);
	    }
	
	
	    public final boolean f()
	    {
	        return this.a.getBoolean("canDisconnect", 0);
	    }
	
	
	    public final android.content.IntentSender g()
	    {
	        return ((android.content.IntentSender) this.a.getParcelable("settingsIntent"));
	    }
	
	
	    public final java.util.List h()
	    {
	        this.i();
	        return this.b;
	    }
	
	
	    void i()
	    {
	        if (this.b == null) {
	            this.b = this.a.getParcelableArrayList("controlFilters");
	            if (this.b == null) {
	                this.b = java.util.Collections.emptyList();
	            }
	        }
	        return;
	    }
	
	
	    public final int j()
	    {
	        return this.a.getInt("playbackType", 1);
	    }
	
	
	    public final int k()
	    {
	        return this.a.getInt("playbackStream", -1);
	    }
	
	
	    public final int l()
	    {
	        return this.a.getInt("volume");
	    }
	
	
	    public final int m()
	    {
	        return this.a.getInt("volumeMax");
	    }
	
	
	    public final int n()
	    {
	        return this.a.getInt("volumeHandling", 0);
	    }
	
	
	    public final int o()
	    {
	        return this.a.getInt("presentationDisplayId", -1);
	    }
	
	
	    public final android.os.Bundle p()
	    {
	        return this.a.getBundle("extras");
	    }
	
	
	    public final boolean q()
	    {
	        int v0_6;
	        this.i();
	        if ((!android.text.TextUtils.isEmpty(this.a())) && ((!android.text.TextUtils.isEmpty(this.b())) && (!this.b.contains(0)))) {
	            v0_6 = 1;
	        } else {
	            v0_6 = 0;
	        }
	        return v0_6;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder();
	        v0_1.append("MediaRouteDescriptor{ ");
	        v0_1.append("id=").append(this.a());
	        v0_1.append(", name=").append(this.b());
	        v0_1.append(", description=").append(this.c());
	        v0_1.append(", isEnabled=").append(this.d());
	        v0_1.append(", isConnecting=").append(this.e());
	        v0_1.append(", controlFilters=").append(java.util.Arrays.toString(this.h().toArray()));
	        v0_1.append(", playbackType=").append(this.j());
	        v0_1.append(", playbackStream=").append(this.k());
	        v0_1.append(", volume=").append(this.l());
	        v0_1.append(", volumeMax=").append(this.m());
	        v0_1.append(", volumeHandling=").append(this.n());
	        v0_1.append(", presentationDisplayId=").append(this.o());
	        v0_1.append(", extras=").append(this.p());
	        v0_1.append(", isValid=").append(this.q());
	        v0_1.append(" }");
	        return v0_1.toString();
	    }
	
