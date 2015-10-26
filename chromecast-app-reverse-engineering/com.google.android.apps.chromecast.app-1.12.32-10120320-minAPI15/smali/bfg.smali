.class public final Lbfg;
.super Lbfp;
.source "PG"


# instance fields
.field a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 18
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    const/4 v0, -0x3

    .line 23
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 25
    :try_start_0
    const-string v1, "offer"

    sget v2, Lbfg;->c:I

    invoke-virtual {p0, v1, v2}, Lbfg;->a(Ljava/lang/String;I)Lbfq;

    move-result-object v1

    .line 26
    invoke-interface {v1}, Lbfq;->c()Lbfc;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    const-string v2, "application/json"

    .line 1092
    iget-object v3, v1, Lbfc;->b:Ljava/lang/String;

    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 47
    :cond_0
    :goto_0
    return v0

    .line 28
    :catch_0
    move-exception v0

    const/4 v0, -0x1

    goto :goto_0

    .line 30
    :catch_1
    move-exception v0

    const/4 v0, -0x2

    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v1}, Lbfc;->a()Ljava/lang/String;

    move-result-object v1

    .line 38
    if-eqz v1, :cond_0

    .line 43
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 44
    const-string v1, "token"

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbfg;->a:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    .line 45
    const/4 v0, 0x0

    goto :goto_0

    .line 47
    :catch_2
    move-exception v1

    goto :goto_0
.end method
