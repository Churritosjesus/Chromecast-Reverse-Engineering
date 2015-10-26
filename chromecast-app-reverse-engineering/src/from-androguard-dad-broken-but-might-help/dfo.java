	public final Ljava.lang.String a
	
	    dfo(dfp p3)
	    {
	        String[] v1_2 = new String[p3.a.size()];
	        this.a = ((String[]) p3.a.toArray(v1_2));
	        return;
	    }
	
	
	    public final dfp a()
	    {
	        dfp v0_1 = new dfp();
	        java.util.Collections.addAll(v0_1.a, this.a);
	        return v0_1;
	    }
	
	
	    public final String a(int p3)
	    {
	        String v0_1;
	        String v0_0 = (p3 << 1);
	        if ((v0_0 >= null) && (v0_0 < this.a.length)) {
	            v0_1 = this.a[v0_0];
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final String a(String p4)
	    {
	        String[] v1 = this.a;
	        int v0_1 = (v1.length - 2);
	        while (v0_1 >= 0) {
	            if (!p4.equalsIgnoreCase(v1[v0_1])) {
	                v0_1 -= 2;
	            } else {
	                int v0_2 = v1[(v0_1 + 1)];
	            }
	            return v0_2;
	        }
	        v0_2 = 0;
	        return v0_2;
	    }
	
	
	    public final String b(int p3)
	    {
	        String v0_2;
	        String v0_1 = ((p3 << 1) + 1);
	        if ((v0_1 >= null) && (v0_1 < this.a.length)) {
	            v0_2 = this.a[v0_1];
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final java.util.Date b(String p2)
	    {
	        int v0_1;
	        int v0_0 = this.a(p2);
	        if (v0_0 == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = dhe.a(v0_0);
	        }
	        return v0_1;
	    }
	
	
	    public final String toString()
	    {
	        StringBuilder v1_1 = new StringBuilder();
	        String v0_0 = 0;
	        int v2_2 = (this.a.length / 2);
	        while (v0_0 < v2_2) {
	            v1_1.append(this.a(v0_0)).append(": ").append(this.b(v0_0)).append("\n");
	            v0_0++;
	        }
	        return v1_1.toString();
	    }
	
