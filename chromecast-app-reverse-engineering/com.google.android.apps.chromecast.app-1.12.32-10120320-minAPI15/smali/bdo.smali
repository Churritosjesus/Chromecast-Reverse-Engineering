.class public final Lbdo;
.super Lbfp;
.source "PG"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field private final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 21
    iput-object p2, p0, Lbdo;->j:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    const/4 v0, -0x3

    .line 27
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 30
    :try_start_0
    const-string v2, "app_id"

    iget-object v3, p0, Lbdo;->j:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    .line 34
    :goto_0
    :try_start_1
    const-string v2, "get_app_device_id"

    .line 35
    invoke-static {v1}, Lbfc;->a(Lorg/json/JSONObject;)Lbfc;

    move-result-object v1

    sget v3, Lbdo;->c:I

    .line 34
    invoke-virtual {p0, v2, v1, v3}, Lbdo;->a(Ljava/lang/String;Lbfc;I)Lbfq;

    move-result-object v1

    .line 36
    invoke-interface {v1}, Lbfq;->c()Lbfc;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 44
    if-eqz v1, :cond_0

    const-string v2, "application/json"

    .line 1092
    iget-object v3, v1, Lbfc;->b:Ljava/lang/String;

    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 59
    :cond_0
    :goto_1
    return v0

    .line 38
    :catch_0
    move-exception v0

    const/4 v0, -0x1

    goto :goto_1

    .line 40
    :catch_1
    move-exception v0

    const/4 v0, -0x2

    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v1}, Lbfc;->a()Ljava/lang/String;

    move-result-object v1

    .line 48
    if-eqz v1, :cond_0

    .line 53
    :try_start_2
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 54
    const-string v1, "app_device_id"

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbdo;->a:Ljava/lang/String;

    .line 55
    const-string v1, "certificate"

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbdo;->b:Ljava/lang/String;

    .line 56
    const-string v1, "signed_data"

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 57
    const/4 v0, 0x0

    goto :goto_1

    .line 59
    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v2

    goto :goto_0
.end method
