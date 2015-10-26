	public static final cpq a
	private  b
	
	    static cpq()
	    {
	        cpq.a = new cpq();
	        return;
	    }
	
	
	    public cpq()
	    {
	        this.b = 0;
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_0 = 0;
	        Object[] v2 = new Object[4];
	        v2[0] = "mIncludePlusPages";
	        v2[1] = Boolean.valueOf(0);
	        v2[2] = "mSortOrder";
	        v2[3] = Integer.valueOf(0);
	        StringBuilder v3_3 = new StringBuilder();
	        a.b(1);
	        String v1_4 = "";
	        while (v0_0 < 4) {
	            v3_3.append(v1_4);
	            v3_3.append(v2[v0_0]);
	            v3_3.append("=");
	            v3_3.append(v2[(v0_0 + 1)]);
	            v1_4 = ", ";
	            v0_0 += 2;
	        }
	        return v3_3.toString();
	    }
	
