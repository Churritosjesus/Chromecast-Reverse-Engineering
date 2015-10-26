	
	    public cov()
	    {
	        return;
	    }
	
	
	    public static String a(Object p1)
	    {
	        return cov.a(p1, 0);
	    }
	
	
	    public static String a(Object p7, int p8)
	    {
	        int v0_1;
	        if (p8 <= 10) {
	            if (p7 != null) {
	                if (!(p7 instanceof String)) {
	                    if (!(p7 instanceof Integer)) {
	                        if (!(p7 instanceof Long)) {
	                            if (!(p7 instanceof Double)) {
	                                if (!(p7 instanceof Boolean)) {
	                                    if (!(p7 instanceof java.util.List)) {
	                                        if (!(p7 instanceof java.util.Map)) {
	                                            v0_1 = p7.toString();
	                                        } else {
	                                            String v3_1 = new StringBuffer();
	                                            int v4_0 = new java.util.TreeMap(((java.util.Map) p7)).entrySet().iterator();
	                                            int v1_11 = 0;
	                                            int v2_0 = 0;
	                                            while (v4_0.hasNext()) {
	                                                int v0_5 = ((java.util.Map$Entry) v4_0.next());
	                                                String v5_1 = cov.a(v0_5.getValue(), (p8 + 1));
	                                                if (!android.text.TextUtils.isEmpty(v5_1)) {
	                                                    if ((p8 > 0) && (v2_0 == 0)) {
	                                                        v3_1.append("{");
	                                                        v2_0 = 1;
	                                                        v1_11 = v3_1.length();
	                                                    }
	                                                    if (v3_1.length() > v1_11) {
	                                                        v3_1.append(", ");
	                                                    }
	                                                    v3_1.append(((String) v0_5.getKey()));
	                                                    v3_1.append(61);
	                                                    v3_1.append(v5_1);
	                                                }
	                                            }
	                                            if (v2_0 != 0) {
	                                                v3_1.append("}");
	                                            }
	                                            v0_1 = v3_1.toString();
	                                        }
	                                    } else {
	                                        int v0_10 = new StringBuffer();
	                                        if (p8 > 0) {
	                                            v0_10.append("[");
	                                        }
	                                        int v1_14 = v0_10.length();
	                                        int v2_1 = ((java.util.List) p7).iterator();
	                                        while (v2_1.hasNext()) {
	                                            String v3_3 = v2_1.next();
	                                            if (v0_10.length() > v1_14) {
	                                                v0_10.append(", ");
	                                            }
	                                            v0_10.append(cov.a(v3_3, (p8 + 1)));
	                                        }
	                                        if (p8 > 0) {
	                                            v0_10.append("]");
	                                        }
	                                        v0_1 = v0_10.toString();
	                                    }
	                                } else {
	                                    if (((Boolean) p7).booleanValue()) {
	                                        v0_1 = p7.toString();
	                                    } else {
	                                        v0_1 = "";
	                                    }
	                                }
	                            } else {
	                                if (((Double) p7).doubleValue() != 0) {
	                                    v0_1 = p7.toString();
	                                } else {
	                                    v0_1 = "";
	                                }
	                            }
	                        } else {
	                            if (((Long) p7).longValue() != 0) {
	                                v0_1 = p7.toString();
	                            } else {
	                                v0_1 = "";
	                            }
	                        }
	                    } else {
	                        if (((Integer) p7).intValue() != 0) {
	                            v0_1 = p7.toString();
	                        } else {
	                            v0_1 = "";
	                        }
	                    }
	                } else {
	                    if (!android.text.TextUtils.isEmpty(((String) p7))) {
	                        v0_1 = p7.toString();
	                    } else {
	                        v0_1 = "";
	                    }
	                }
	            } else {
	                v0_1 = "";
	            }
	        } else {
	            v0_1 = "ERROR: Recursive toString calls";
	        }
	        return v0_1;
	    }
	
	
	    public static String a(java.util.Map p1)
	    {
	        return cov.a(p1, 1);
	    }
	
