.class public abstract Latb;
.super Lads;
.source "PG"


# instance fields
.field l:Ljava/lang/String;

.field m:Ladz;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ladz;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3}, Lads;-><init>(ILjava/lang/String;Ladz;)V

    .line 39
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 8

    .prologue
    .line 66
    const/4 v0, 0x3

    .line 67
    invoke-virtual {p0}, Latb;->h()Ljava/lang/String;

    move-result-object v1

    .line 68
    iget-object v2, p0, Latb;->l:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 69
    const/4 v0, 0x4

    .line 71
    :cond_0
    if-eqz v1, :cond_1

    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 74
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 78
    const-string v0, "Accept"

    invoke-virtual {p0}, Latb;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    const-string v0, "IMAX_PROTOCOL_VERSION"

    const-string v3, "3"

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    const-string v0, "CAST_APP_TYPE"

    const-string v3, "ANDROID"

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    iget-object v0, p0, Latb;->l:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 83
    const-string v0, "Authorization"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Bearer %s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Latb;->l:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    :cond_2
    if-eqz v1, :cond_3

    .line 86
    const-string v0, "CAST-APP-DEVICE-ID"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    :cond_3
    return-object v2
.end method

.method public final b(Laef;)V
    .locals 1

    .prologue
    .line 58
    invoke-super {p0, p1}, Lads;->b(Laef;)V

    .line 59
    iget-object v0, p0, Latb;->m:Ladz;

    if-eqz v0, :cond_0

    instance-of v0, p1, Ladf;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Latb;->m:Ladz;

    invoke-interface {v0, p1}, Ladz;->a(Laef;)V

    .line 62
    :cond_0
    return-void
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Ljava/lang/String;
.end method
