	private static final java.lang.String b
	private static final java.lang.String c
	private static final java.lang.String d
	private final czd e
	
	    static czc()
	    {
	        czc.b = cip.k.toString();
	        czc.c = cit.q.toString();
	        czc.d = cit.b.toString();
	        return;
	    }
	
	
	    public czc(czd p5)
	    {
	        String[] v1_1 = new String[1];
	        v1_1[0] = czc.c;
	        this(czc.b, v1_1);
	        this.e = p5;
	        return;
	    }
	
	
	    public final cje a(java.util.Map p6)
	    {
	        Object v0_12;
	        StringBuilder v1_0 = cyh.a(((cje) p6.get(czc.c)));
	        String v2_1 = new java.util.HashMap();
	        Object v0_5 = ((cje) p6.get(czc.d));
	        if (v0_5 == null) {
	            try {
	                v0_12 = cyh.a(this.e.a(v1_0, v2_1));
	            } catch (Object v0_13) {
	                cuh.b(new StringBuilder("Custom macro/tag ").append(v1_0).append(" threw exception ").append(v0_13.getMessage()).toString());
	                v0_12 = cyh.f();
	            }
	        } else {
	            Object v0_6 = cyh.e(v0_5);
	            if ((v0_6 instanceof java.util.Map)) {
	                String v3_1 = ((java.util.Map) v0_6).entrySet().iterator();
	                while (v3_1.hasNext()) {
	                    Object v0_18 = ((java.util.Map$Entry) v3_1.next());
	                    v2_1.put(v0_18.getKey().toString(), v0_18.getValue());
	                }
	            } else {
	                cuh.b("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
	                v0_12 = cyh.f();
	            }
	        }
	        return v0_12;
	    }
	
	
	    public final boolean a()
	    {
	        return 0;
	    }
	
