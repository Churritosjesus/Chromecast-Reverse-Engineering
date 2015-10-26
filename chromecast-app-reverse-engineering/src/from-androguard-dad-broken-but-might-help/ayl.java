	private android.net.Uri a
	private aym b
	private java.util.List g
	private final blp h
	
	    public ayl(android.net.Uri p4, aym p5)
	    {
	        this.a = p4;
	        this.b = p5;
	        this.h = new blp("GetDeviceDescriptorRequest", 0);
	        return;
	    }
	
	
	    private void a(org.xmlpull.v1.XmlPullParser p6)
	    {
	        p6.require(2, 0, "root");
	        while (p6.next() != 3) {
	            if (p6.getEventType() == 2) {
	                if (!p6.getName().equals("device")) {
	                    a.a(p6);
	                } else {
	                    p6.require(2, 0, "device");
	                    while (p6.next() != 3) {
	                        if (p6.getEventType() == 2) {
	                            boolean v0_8 = p6.getName();
	                            if (!v0_8.equalsIgnoreCase("friendlyName")) {
	                                if (!v0_8.equalsIgnoreCase("modelName")) {
	                                    if (!v0_8.equalsIgnoreCase("UDN")) {
	                                        if (!v0_8.equalsIgnoreCase("serviceList")) {
	                                            if (!v0_8.equalsIgnoreCase("iconList")) {
	                                                a.a(p6);
	                                            } else {
	                                                this.c(p6);
	                                            }
	                                        } else {
	                                            this.g = new java.util.ArrayList();
	                                            p6.require(2, 0, "serviceList");
	                                            while (p6.next() != 3) {
	                                                if (p6.getEventType() == 2) {
	                                                    if (!p6.getName().equalsIgnoreCase("service")) {
	                                                        a.a(p6);
	                                                    } else {
	                                                        this.b(p6);
	                                                    }
	                                                }
	                                            }
	                                        }
	                                    } else {
	                                        boolean v0_17 = a.b(p6);
	                                        if (v0_17.startsWith("uuid:")) {
	                                            v0_17 = v0_17.substring(5);
	                                        }
	                                        this.b.a = v0_17;
	                                    }
	                                } else {
	                                    this.b.d = a.b(p6);
	                                }
	                            } else {
	                                this.b.c = a.b(p6);
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    private void b(org.xmlpull.v1.XmlPullParser p4)
	    {
	        p4.require(2, 0, "service");
	        while (p4.next() != 3) {
	            if (p4.getEventType() == 2) {
	                aym v0_3 = p4.getName();
	                if (!v0_3.equalsIgnoreCase("serviceType")) {
	                    if (!v0_3.equalsIgnoreCase("SCPDURL")) {
	                        a.a(p4);
	                    } else {
	                        a.b(p4);
	                    }
	                } else {
	                    this.g.add(a.b(p4));
	                }
	            }
	        }
	        return;
	    }
	
	
	    private void c(org.xmlpull.v1.XmlPullParser p5)
	    {
	        p5.require(2, 0, "iconList");
	        java.util.ArrayList v0_2 = new java.util.ArrayList(1);
	        while (p5.next() != 3) {
	            if (p5.getEventType() == 2) {
	                if (!p5.getName().equalsIgnoreCase("icon")) {
	                    a.a(p5);
	                } else {
	                    ayo v1_7 = this.d(p5);
	                    if (v1_7 != null) {
	                        v0_2.add(v1_7);
	                    }
	                }
	            }
	        }
	        this.b.f = v0_2;
	        return;
	    }
	
	
	    private ayo d(org.xmlpull.v1.XmlPullParser p9)
	    {
	        ayo v4_0 = 0;
	        android.net.Uri v0_0 = 0;
	        p9.require(2, 0, "icon");
	        int v1_1 = 0;
	        int v2_0 = 0;
	        String v3 = 0;
	        while (p9.next() != 3) {
	            if (p9.getEventType() == 2) {
	                boolean v5_3 = p9.getName();
	                if (!v5_3.equalsIgnoreCase("width")) {
	                    if (!v5_3.equalsIgnoreCase("height")) {
	                        if (!v5_3.equalsIgnoreCase("depth")) {
	                            if (!v5_3.equalsIgnoreCase("url")) {
	                                a.a(p9);
	                            } else {
	                                v3 = a.b(p9);
	                            }
	                        } else {
	                            v0_0 = Integer.parseInt(a.b(p9));
	                        }
	                    } else {
	                        v1_1 = Integer.parseInt(a.b(p9));
	                    }
	                } else {
	                    v2_0 = Integer.parseInt(a.b(p9));
	                }
	            }
	        }
	        if ((!android.text.TextUtils.isEmpty(v3)) && ((v2_0 > 0) && ((v1_1 > 0) && (v0_0 > null)))) {
	            v4_0 = new ayo(v2_0, v1_1, android.net.Uri.parse(java.net.URI.create(this.a.toString()).resolve(v3).toString()));
	        }
	        return v4_0;
	    }
	
	
	    public final int a()
	    {
	        java.io.IOException v0_0 = -1;
	        try {
	            java.io.StringReader v2_1 = this.a(this.a, ayl.c);
	        } catch (java.io.IOException v1) {
	            return v0_0;
	        } catch (java.io.IOException v1) {
	            return v0_0;
	        } catch (java.io.IOException v0) {
	            v0_0 = -2;
	            return v0_0;
	        }
	        if (v2_1.b() == 200) {
	            String v3_2 = v2_1.c();
	            java.io.StringReader v2_2 = v2_1.a("application-url");
	            if (v2_2 != null) {
	                this.b.e = android.net.Uri.parse(v2_2);
	                if (!this.f) {
	                    if ((v3_2 != null) && ("application/xml".equals(v3_2.b))) {
	                        if (v3_2.a() != null) {
	                            try {
	                                java.io.IOException v0_5 = android.util.Xml.newPullParser();
	                                v0_5.setInput(new java.io.StringReader(v3_2.a()));
	                                v0_5.nextTag();
	                                this.a(v0_5);
	                                v0_0 = 0;
	                            } catch (java.io.IOException v0) {
	                                v0_0 = -3;
	                            } catch (java.io.IOException v0) {
	                                v0_0 = -3;
	                            }
	                            return v0_0;
	                        } else {
	                            v0_0 = -3;
	                            return v0_0;
	                        }
	                    } else {
	                        v0_0 = -3;
	                        return v0_0;
	                    }
	                } else {
	                    v0_0 = -99;
	                    return v0_0;
	                }
	            } else {
	                v0_0 = -3;
	                return v0_0;
	            }
	        } else {
	            return v0_0;
	        }
	    }
	
