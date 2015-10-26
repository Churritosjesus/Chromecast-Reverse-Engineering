	public java.lang.String a
	public java.util.List b
	public java.lang.String c
	public atv d
	public dbw e
	public java.lang.String f
	public java.lang.String g
	public java.lang.String h
	public java.lang.String i
	
	    public atu()
	    {
	        return;
	    }
	
	
	    public final String a()
	    {
	        String v0_4;
	        if (this.d != null) {
	            String v0_1 = this.d;
	            switch (v0_1.a) {
	                case 0:
	                    v0_4 = new StringBuilder(38).append("CANT_TOGGLE - ").append(v0_1.b).toString();
	                    break;
	                case 1:
	                    v0_4 = new StringBuilder(34).append("PLAYING - ").append(v0_1.b).toString();
	                    break;
	                case 2:
	                    v0_4 = new StringBuilder(33).append("PAUSED - ").append(v0_1.b).toString();
	                    break;
	                default:
	                    v0_4 = new StringBuilder(34).append("UNKNOWN - ").append(v0_1.b).toString();
	            }
	        } else {
	            v0_4 = "null";
	        }
	        return v0_4;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != null) {
	            if (p4 != this) {
	                if ((p4 instanceof atu)) {
	                    v0 = 0.equals(0);
	                }
	            } else {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return 0.hashCode();
	    }
	
