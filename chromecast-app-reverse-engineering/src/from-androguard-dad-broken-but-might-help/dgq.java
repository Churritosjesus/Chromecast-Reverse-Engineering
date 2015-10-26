	private final java.util.List a
	private  b
	private java.lang.String c
	
	    public dgq(java.util.List p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    static synthetic boolean a(dgq p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic String b(dgq p1)
	    {
	        return p1.c;
	    }
	
	
	    public final Object invoke(Object p7, reflect.Method p8, Object[] p9)
	    {
	        String v0_0 = p8.getName();
	        int v3_0 = p8.getReturnType();
	        if (p9 == null) {
	            p9 = dgs.b;
	        }
	        if ((!v0_0.equals("supports")) || (Boolean.TYPE != v3_0)) {
	            if ((!v0_0.equals("unsupported")) || (Void.TYPE != v3_0)) {
	                if ((!v0_0.equals("protocols")) || (p9.length != 0)) {
	                    if (((!v0_0.equals("selectProtocol")) && (!v0_0.equals("select"))) || ((String != v3_0) || ((p9.length != 1) || (!(p9[0] instanceof java.util.List))))) {
	                        if (((!v0_0.equals("protocolSelected")) && (!v0_0.equals("selected"))) || (p9.length != 1)) {
	                            String v0_3 = p8.invoke(this, p9);
	                        } else {
	                            this.c = ((String) p9[0]);
	                            v0_3 = 0;
	                        }
	                    } else {
	                        String v0_7 = ((java.util.List) p9[0]);
	                        int v3_7 = v0_7.size();
	                        int v1_1 = 0;
	                        while (v1_1 < v3_7) {
	                            if (!this.a.contains(v0_7.get(v1_1))) {
	                                v1_1++;
	                            } else {
	                                v0_3 = ((String) v0_7.get(v1_1));
	                                this.c = v0_3;
	                            }
	                        }
	                        v0_3 = ((String) this.a.get(0));
	                        this.c = v0_3;
	                    }
	                } else {
	                    v0_3 = this.a;
	                }
	            } else {
	                this.b = 1;
	                v0_3 = 0;
	            }
	        } else {
	            v0_3 = Boolean.valueOf(1);
	        }
	        return v0_3;
	    }
	
