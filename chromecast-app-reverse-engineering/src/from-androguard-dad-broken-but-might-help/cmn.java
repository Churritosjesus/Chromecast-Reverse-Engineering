	public final java.lang.Class a
	public final  b
	public final  c
	private  d
	
	    cmn(int p2, Class p3, int p4, boolean p5)
	    {
	        this.d = p2;
	        this.a = p3;
	        this.b = p4;
	        this.c = 0;
	        return;
	    }
	
	
	    private Object a(cmj p6)
	    {
	        IllegalArgumentException v1_0;
	        if (!this.c) {
	            v1_0 = this.a;
	        } else {
	            v1_0 = this.a.getComponentType();
	        }
	        try {
	            cmr v0_6;
	            switch (this.d) {
	                case 10:
	                    v0_6 = ((cms) v1_0.newInstance());
	                    int v2_1 = cmu.b(this.b);
	                    if (p6.c < p6.d) {
	                        p6.c = (p6.c + 1);
	                        v0_6.a(p6);
	                        p6.a(cmu.a(v2_1, 4));
	                        p6.c = (p6.c - 1);
	                        return v0_6;
	                    } else {
	                        throw cmr.g();
	                    }
	                case 11:
	                    v0_6 = ((cms) v1_0.newInstance());
	                    p6.a(v0_6);
	                    return v0_6;
	                default:
	                    throw new IllegalArgumentException(new StringBuilder("Unknown type ").append(this.d).toString());
	            }
	        } catch (cmr v0_12) {
	            throw new IllegalArgumentException(new StringBuilder("Error creating instance of class ").append(v1_0).toString(), v0_12);
	        } catch (cmr v0_11) {
	            throw new IllegalArgumentException("Error reading extension field", v0_11);
	        } catch (cmr v0_13) {
	        }
	        throw new IllegalArgumentException(new StringBuilder("Error creating instance of class ").append(v1_0).toString(), v0_13);
	    }
	
	
	    private int b(Object p4)
	    {
	        int v0_2;
	        int v0_1 = cmu.b(this.b);
	        switch (this.d) {
	            case 10:
	                v0_2 = ((cmk.c(v0_1) << 1) + ((cms) p4).f());
	                break;
	            case 11:
	                v0_2 = cmk.b(v0_1, ((cms) p4));
	                break;
	            default:
	                throw new IllegalArgumentException(new StringBuilder("Unknown type ").append(this.d).toString());
	        }
	        return v0_2;
	    }
	
	
	    private void b(Object p4, cmk p5)
	    {
	        try {
	            p5.d(this.b);
	            switch (this.d) {
	                case 10:
	                    int v0_3 = cmu.b(this.b);
	                    ((cms) p4).a(p5);
	                    p5.c(v0_3, 4);
	                    return;
	                case 11:
	                    p5.a(((cms) p4));
	                    return;
	                default:
	                    throw new IllegalArgumentException(new StringBuilder("Unknown type ").append(this.d).toString());
	            }
	        } catch (int v0_6) {
	        }
	        throw new IllegalStateException(v0_6);
	    }
	
	
	    final int a(Object p5)
	    {
	        int v0 = 0;
	        if (!this.c) {
	            v0 = this.b(p5);
	        } else {
	            int v2 = reflect.Array.getLength(p5);
	            int v1_1 = 0;
	            while (v1_1 < v2) {
	                if (reflect.Array.get(p5, v1_1) != null) {
	                    v0 += this.b(reflect.Array.get(p5, v1_1));
	                }
	                v1_1++;
	            }
	        }
	        return v0;
	    }
	
	
	    Object a(java.util.List p6)
	    {
	        int v2 = 0;
	        java.util.ArrayList v3_1 = new java.util.ArrayList();
	        int v1_0 = 0;
	        while (v1_0 < p6.size()) {
	            Object v0_4 = ((cmt) p6.get(v1_0));
	            if (v0_4.b.length != 0) {
	                Object v0_5 = v0_4.b;
	                v3_1.add(this.a(cmj.a(v0_5, 0, v0_5.length)));
	            }
	            v1_0++;
	        }
	        Object v0_2;
	        int v1_1 = v3_1.size();
	        if (v1_1 != 0) {
	            v0_2 = this.a.cast(reflect.Array.newInstance(this.a.getComponentType(), v1_1));
	            while (v2 < v1_1) {
	                reflect.Array.set(v0_2, v2, v3_1.get(v2));
	                v2++;
	            }
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    final void a(Object p4, cmk p5)
	    {
	        if (!this.c) {
	            this.b(p4, p5);
	        } else {
	            int v1 = reflect.Array.getLength(p4);
	            int v0_1 = 0;
	            while (v0_1 < v1) {
	                Object v2 = reflect.Array.get(p4, v0_1);
	                if (v2 != null) {
	                    this.b(v2, p5);
	                }
	                v0_1++;
	            }
	        }
	        return;
	    }
	
	
	    Object b(java.util.List p5)
	    {
	        Object v0_8;
	        if (!p5.isEmpty()) {
	            Object v0_5 = ((cmt) p5.get((p5.size() - 1))).b;
	            v0_8 = this.a.cast(this.a(cmj.a(v0_5, 0, v0_5.length)));
	        } else {
	            v0_8 = 0;
	        }
	        return v0_8;
	    }
	
