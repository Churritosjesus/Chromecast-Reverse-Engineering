	private final android.os.Bundle a
	private java.util.List b
	
	    tv(android.os.Bundle p1, java.util.List p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public static tv a(android.os.Bundle p2)
	    {
	        int v0_0;
	        if (p2 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = new tv(p2, 0);
	        }
	        return v0_0;
	    }
	
	
	    private void c()
	    {
	        if (this.b == null) {
	            java.util.ArrayList v4 = this.a.getParcelableArrayList("routes");
	            if ((v4 != null) && (!v4.isEmpty())) {
	                int v5 = v4.size();
	                this.b = new java.util.ArrayList(v5);
	                int v3 = 0;
	                while (v3 < v5) {
	                    int v0_8;
	                    int v0_7 = ((android.os.Bundle) v4.get(v3));
	                    if (v0_7 == 0) {
	                        v0_8 = 0;
	                    } else {
	                        v0_8 = new tn(v0_7, 0);
	                    }
	                    this.b.add(v0_8);
	                    v3++;
	                }
	            } else {
	                this.b = java.util.Collections.emptyList();
	            }
	        }
	        return;
	    }
	
	
	    public final java.util.List a()
	    {
	        this.c();
	        return this.b;
	    }
	
	
	    public final boolean b()
	    {
	        this.c();
	        int v3 = this.b.size();
	        int v2 = 0;
	        while (v2 < v3) {
	            int v0_4 = ((tn) this.b.get(v2));
	            if ((v0_4 != 0) && (v0_4.q())) {
	                v2++;
	            } else {
	                int v0_1 = 0;
	            }
	            return v0_1;
	        }
	        v0_1 = 1;
	        return v0_1;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder();
	        v0_1.append("MediaRouteProviderDescriptor{ ");
	        v0_1.append("routes=").append(java.util.Arrays.toString(this.a().toArray()));
	        v0_1.append(", isValid=").append(this.b());
	        v0_1.append(" }");
	        return v0_1.toString();
	    }
	
