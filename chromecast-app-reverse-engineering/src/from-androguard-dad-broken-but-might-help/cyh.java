	private static final java.lang.Object a
	private static java.lang.Long b
	private static cyg c
	private static java.lang.String d
	private static java.lang.Boolean e
	private static cje f
	
	    static cyh()
	    {
	        cyh.a = 0;
	        cyh.b = new Long(0);
	        new Double(0);
	        cyh.c = cyg.a(0);
	        cyh.d = new String("");
	        cyh.e = new Boolean(0);
	        new java.util.ArrayList(0);
	        new java.util.HashMap();
	        cyh.f = cyh.a(cyh.d);
	        return;
	    }
	
	
	    public static cje a(Object p10)
	    {
	        cje v10_1;
	        int v2 = 0;
	        cje v4_1 = new cje();
	        if (!(p10 instanceof cje)) {
	            if (!(p10 instanceof String)) {
	                if (!(p10 instanceof java.util.List)) {
	                    if (!(p10 instanceof java.util.Map)) {
	                        if (!cyh.c(p10)) {
	                            if (!cyh.d(p10)) {
	                                if (!(p10 instanceof Boolean)) {
	                                    int v0_9;
	                                    boolean v1_1 = new StringBuilder("Converting to Value from unknown object type: ");
	                                    if (p10 != null) {
	                                        v0_9 = p10.getClass().toString();
	                                    } else {
	                                        v0_9 = "null";
	                                    }
	                                    cuh.a(v1_1.append(v0_9).toString());
	                                    v10_1 = cyh.f;
	                                    return v10_1;
	                                } else {
	                                    v4_1.a = 8;
	                                    v4_1.i = ((Boolean) p10).booleanValue();
	                                }
	                            } else {
	                                v4_1.a = 6;
	                                v4_1.h = cyh.e(p10);
	                            }
	                        } else {
	                            v4_1.a = 1;
	                            v4_1.b = p10.toString();
	                        }
	                    } else {
	                        v4_1.a = 3;
	                        int v0_18 = ((java.util.Map) p10).entrySet();
	                        java.util.ArrayList v5_1 = new java.util.ArrayList(v0_18.size());
	                        java.util.ArrayList v6_1 = new java.util.ArrayList(v0_18.size());
	                        cje v7_0 = v0_18.iterator();
	                        boolean v1_4 = 0;
	                        while (v7_0.hasNext()) {
	                            int v0_27 = ((java.util.Map$Entry) v7_0.next());
	                            cje v8_1 = cyh.a(v0_27.getKey());
	                            cje v9 = cyh.a(v0_27.getValue());
	                            if ((v8_1 != cyh.f) && (v9 != cyh.f)) {
	                                if ((!v1_4) && ((!v8_1.l) && (!v9.l))) {
	                                    int v0_33 = 0;
	                                } else {
	                                    v0_33 = 1;
	                                }
	                                v5_1.add(v8_1);
	                                v6_1.add(v9);
	                                v1_4 = v0_33;
	                            } else {
	                                v10_1 = cyh.f;
	                                return v10_1;
	                            }
	                        }
	                        int v0_20 = new cje[0];
	                        v4_1.d = ((cje[]) v5_1.toArray(v0_20));
	                        int v0_23 = new cje[0];
	                        v4_1.e = ((cje[]) v6_1.toArray(v0_23));
	                        v2 = v1_4;
	                    }
	                } else {
	                    v4_1.a = 2;
	                    java.util.ArrayList v5_3 = new java.util.ArrayList(((java.util.List) p10).size());
	                    java.util.ArrayList v6_2 = ((java.util.List) p10).iterator();
	                    boolean v1_5 = 0;
	                    while (v6_2.hasNext()) {
	                        cje v7_1 = cyh.a(v6_2.next());
	                        if (v7_1 != cyh.f) {
	                            if ((!v1_5) && (!v7_1.l)) {
	                                int v0_43 = 0;
	                            } else {
	                                v0_43 = 1;
	                            }
	                            v5_3.add(v7_1);
	                            v1_5 = v0_43;
	                        } else {
	                            v10_1 = cyh.f;
	                            return v10_1;
	                        }
	                    }
	                    int v0_37 = new cje[0];
	                    v4_1.c = ((cje[]) v5_3.toArray(v0_37));
	                    v2 = v1_5;
	                }
	            } else {
	                v4_1.a = 1;
	                v4_1.b = ((String) p10);
	            }
	            v4_1.l = v2;
	            v10_1 = v4_1;
	        } else {
	            v10_1 = ((cje) p10);
	        }
	        return v10_1;
	    }
	
	
	    public static cje a(String p2)
	    {
	        cje v0_1 = new cje();
	        v0_1.a = 5;
	        v0_1.g = p2;
	        return v0_1;
	    }
	
	
	    public static Object a()
	    {
	        return 0;
	    }
	
	
	    public static String a(cje p1)
	    {
	        return cyh.b(cyh.e(p1));
	    }
	
	
	    public static cyg b(cje p2)
	    {
	        cyg v0_2;
	        cyg v0_0 = cyh.e(p2);
	        if (!(v0_0 instanceof cyg)) {
	            if (!cyh.d(v0_0)) {
	                if (!cyh.c(v0_0)) {
	                    v0_2 = cyh.b(cyh.b(v0_0));
	                } else {
	                    cyg v0_4;
	                    if (!(v0_0 instanceof Number)) {
	                        cuh.a("getDouble received non-Number");
	                        v0_4 = 0;
	                    } else {
	                        v0_4 = ((Number) v0_0).doubleValue();
	                    }
	                    v0_2 = cyg.a(Double.valueOf(v0_4));
	                }
	            } else {
	                v0_2 = cyg.a(cyh.e(v0_0));
	            }
	        } else {
	            v0_2 = ((cyg) v0_0);
	        }
	        return v0_2;
	    }
	
	
	    private static cyg b(String p2)
	    {
	        try {
	            cyg v0_0 = cyg.a(p2);
	        } catch (cyg v0) {
	            cuh.a(new StringBuilder("Failed to convert \'").append(p2).append("\' to a number.").toString());
	            v0_0 = cyh.c;
	        }
	        return v0_0;
	    }
	
	
	    public static Long b()
	    {
	        return cyh.b;
	    }
	
	
	    private static String b(Object p1)
	    {
	        String v0;
	        if (p1 != null) {
	            v0 = p1.toString();
	        } else {
	            v0 = cyh.d;
	        }
	        return v0;
	    }
	
	
	    public static Boolean c()
	    {
	        return cyh.e;
	    }
	
	
	    public static Long c(cje p2)
	    {
	        Long v0_4;
	        Long v0_0 = cyh.e(p2);
	        if (!cyh.d(v0_0)) {
	            Long v0_2 = cyh.b(cyh.b(v0_0));
	            if (v0_2 != cyh.c) {
	                v0_4 = Long.valueOf(v0_2.longValue());
	            } else {
	                v0_4 = cyh.b;
	            }
	        } else {
	            v0_4 = Long.valueOf(cyh.e(v0_0));
	        }
	        return v0_4;
	    }
	
	
	    private static boolean c(Object p3)
	    {
	        int v0 = 0;
	        if (((p3 instanceof Double)) || ((p3 instanceof Float))) {
	            v0 = 1;
	        } else {
	            if ((p3 instanceof cyg)) {
	                int v2_4;
	                if (((cyg) p3).a) {
	                    v2_4 = 0;
	                } else {
	                    v2_4 = 1;
	                }
	                if (v2_4 != 0) {
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public static cyg d()
	    {
	        return cyh.c;
	    }
	
	
	    public static Boolean d(cje p2)
	    {
	        Boolean v0_3;
	        Boolean v0_0 = cyh.e(p2);
	        if (!(v0_0 instanceof Boolean)) {
	            Boolean v0_1 = cyh.b(v0_0);
	            if (!"true".equalsIgnoreCase(v0_1)) {
	                if (!"false".equalsIgnoreCase(v0_1)) {
	                    v0_3 = cyh.e;
	                } else {
	                    v0_3 = Boolean.FALSE;
	                }
	            } else {
	                v0_3 = Boolean.TRUE;
	            }
	        } else {
	            v0_3 = ((Boolean) v0_0);
	        }
	        return v0_3;
	    }
	
	
	    private static boolean d(Object p1)
	    {
	        if ((!(p1 instanceof Byte)) && ((!(p1 instanceof Short)) && ((!(p1 instanceof Integer)) && ((!(p1 instanceof Long)) && ((!(p1 instanceof cyg)) || (!((cyg) p1).a)))))) {
	            int v0_6 = 0;
	        } else {
	            v0_6 = 1;
	        }
	        return v0_6;
	    }
	
	
	    private static long e(Object p2)
	    {
	        long v0_2;
	        if (!(p2 instanceof Number)) {
	            cuh.a("getInt64 received non-Number");
	            v0_2 = 0;
	        } else {
	            v0_2 = ((Number) p2).longValue();
	        }
	        return v0_2;
	    }
	
	
	    public static Object e(cje p7)
	    {
	        int v0_2;
	        int v0_0 = 0;
	        if (p7 != null) {
	            switch (p7.a) {
	                case 1:
	                    v0_2 = p7.b;
	                    break;
	                case 2:
	                    java.util.HashMap v2_10 = new java.util.ArrayList(p7.c.length);
	                    Object v3_12 = p7.c;
	                    Object v4_4 = v3_12.length;
	                    while (v0_0 < v4_4) {
	                        String v5_3 = cyh.e(v3_12[v0_0]);
	                        if (v5_3 != null) {
	                            v2_10.add(v5_3);
	                            v0_0++;
	                        } else {
	                            v0_2 = 0;
	                        }
	                    }
	                    v0_2 = v2_10;
	                    break;
	                case 3:
	                    if (p7.d.length == p7.e.length) {
	                        java.util.HashMap v2_6 = new java.util.HashMap(p7.e.length);
	                        while (v0_0 < p7.d.length) {
	                            Object v3_9 = cyh.e(p7.d[v0_0]);
	                            Object v4_3 = cyh.e(p7.e[v0_0]);
	                            if ((v3_9 != null) && (v4_3 != null)) {
	                                v2_6.put(v3_9, v4_3);
	                                v0_0++;
	                            } else {
	                                v0_2 = 0;
	                            }
	                        }
	                        v0_2 = v2_6;
	                    } else {
	                        cuh.a(new StringBuilder("Converting an invalid value to object: ").append(p7.toString()).toString());
	                        v0_2 = 0;
	                    }
	                    break;
	                case 4:
	                    cuh.a("Trying to convert a macro reference to object");
	                    v0_2 = 0;
	                    break;
	                case 5:
	                    cuh.a("Trying to convert a function id to object");
	                    v0_2 = 0;
	                    break;
	                case 6:
	                    v0_2 = Long.valueOf(p7.h);
	                    break;
	                case 7:
	                    java.util.HashMap v2_2 = new StringBuffer();
	                    Object v3_0 = p7.j;
	                    Object v4_0 = v3_0.length;
	                    while (v0_0 < v4_0) {
	                        String v5_1 = cyh.a(v3_0[v0_0]);
	                        if (v5_1 != cyh.d) {
	                            v2_2.append(v5_1);
	                            v0_0++;
	                        } else {
	                            v0_2 = 0;
	                        }
	                    }
	                    v0_2 = v2_2.toString();
	                    break;
	                case 8:
	                    v0_2 = Boolean.valueOf(p7.i);
	                    break;
	                default:
	                    cuh.a(new StringBuilder("Failed to convert a value of type: ").append(p7.a).toString());
	                    v0_2 = 0;
	            }
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public static String e()
	    {
	        return cyh.d;
	    }
	
	
	    public static cje f()
	    {
	        return cyh.f;
	    }
	
