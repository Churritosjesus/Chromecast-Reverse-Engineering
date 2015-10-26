.class public final Lbfl;
.super Lbfp;
.source "PG"


# instance fields
.field a:Lbdj;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lbfl;->a:Lbdj;

    .line 20
    return-void
.end method

.method public static a(Lbdf;)Z
    .locals 2

    .prologue
    .line 64
    .line 1239
    iget v0, p0, Lbdf;->a:I

    .line 64
    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 26
    :try_start_0
    const-string v2, "save_wifi"

    const/4 v3, 0x0

    sget v4, Lbfl;->c:I

    invoke-virtual {p0, v2, v3, v4}, Lbfl;->a(Ljava/lang/String;Lbfc;I)Lbfq;

    move-result-object v2

    .line 27
    invoke-interface {v2}, Lbfq;->b()I

    move-result v3

    const/16 v4, 0xc8

    if-eq v3, v4, :cond_0

    .line 57
    :goto_0
    return v0

    .line 30
    :cond_0
    invoke-interface {v2}, Lbfq;->c()Lbfc;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 39
    if-eqz v0, :cond_1

    const-string v2, "application/json"

    .line 1092
    iget-object v3, v0, Lbfc;->b:Ljava/lang/String;

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    move v0, v1

    .line 40
    goto :goto_0

    .line 34
    :catch_0
    move-exception v0

    const/4 v0, -0x2

    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v0}, Lbfc;->a()Ljava/lang/String;

    move-result-object v0

    .line 43
    if-nez v0, :cond_3

    move v0, v1

    .line 44
    goto :goto_0

    .line 48
    :cond_3
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 49
    const-string v0, "setup_state"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 50
    const-string v0, "setup_state"

    sget-object v3, Lbdj;->a:Lbdj;

    iget v3, v3, Lbdj;->r:I

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Lbdj;->a(I)Lbdj;

    move-result-object v0

    iput-object v0, p0, Lbfl;->a:Lbdj;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_4
    :goto_1
    move v0, v1

    .line 57
    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    .line 32
    :catch_2
    move-exception v1

    goto :goto_0
.end method
