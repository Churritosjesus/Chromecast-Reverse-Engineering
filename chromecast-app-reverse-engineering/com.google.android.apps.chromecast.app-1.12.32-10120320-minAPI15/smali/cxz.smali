.class abstract Lcxz;
.super Lcuj;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcuj;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final a(Lcje;Lcje;Ljava/util/Map;)Z
    .locals 3

    invoke-static {p1}, Lcyh;->a(Lcje;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lcyh;->a(Lcje;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcyh;->e()Ljava/lang/String;

    move-result-object v2

    if-eq v0, v2, :cond_0

    invoke-static {}, Lcyh;->e()Ljava/lang/String;

    move-result-object v2

    if-ne v1, v2, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0, v0, v1, p3}, Lcxz;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v0

    goto :goto_0
.end method

.method protected abstract a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z
.end method
