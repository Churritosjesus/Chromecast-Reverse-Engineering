.class public final Lakt;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Lahe;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p2, p0, Lakt;->b:Ljava/lang/String;

    .line 67
    invoke-static {p1, p2}, Lahe;->a(Landroid/content/Context;Ljava/lang/String;)Lahe;

    move-result-object v0

    iput-object v0, p0, Lakt;->a:Lahe;

    .line 68
    return-void
.end method

.method static a(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    .prologue
    .line 77
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 78
    const-string v1, "1_timestamp_ms"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 79
    const-string v1, "0_auth_logger_id"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string v1, "3_method"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string v1, "2_result"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const-string v1, "5_error_message"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v1, "4_error_code"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v1, "6_extras"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    return-object v0
.end method


# virtual methods
.method public final a(Lakl;)V
    .locals 5

    .prologue
    .line 89
    .line 1470
    iget-object v0, p1, Lakl;->e:Ljava/lang/String;

    .line 89
    invoke-static {v0}, Lakt;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 93
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 94
    const-string v2, "login_behavior"

    .line 2458
    iget-object v3, p1, Lakl;->a:Lakg;

    .line 95
    invoke-virtual {v3}, Lakg;->toString()Ljava/lang/String;

    move-result-object v3

    .line 94
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    const-string v2, "request_code"

    invoke-static {}, Lakh;->b()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 97
    const-string v2, "permissions"

    const-string v3, ","

    .line 3449
    iget-object v4, p1, Lakl;->b:Ljava/util/Set;

    .line 98
    invoke-static {v3, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    .line 97
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    const-string v2, "default_audience"

    .line 3462
    iget-object v3, p1, Lakl;->c:Lajy;

    .line 100
    invoke-virtual {v3}, Lajy;->toString()Ljava/lang/String;

    move-result-object v3

    .line 99
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    const-string v2, "isReauthorize"

    .line 3474
    iget-boolean v3, p1, Lakl;->f:Z

    .line 101
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 102
    const-string v2, "6_extras"

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    :goto_0
    iget-object v1, p0, Lakt;->a:Lahe;

    const-string v2, "fb_mobile_login_start"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lahe;->a(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 107
    return-void

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 178
    const-string v0, ""

    invoke-static {v0}, Lakt;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 179
    const-string v1, "2_result"

    sget-object v2, Lakp;->c:Lakp;

    .line 3546
    iget-object v2, v2, Lakp;->d:Ljava/lang/String;

    .line 179
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    const-string v1, "5_error_message"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    const-string v1, "3_method"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    iget-object v1, p0, Lakt;->a:Lahe;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2, v0}, Lahe;->a(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 185
    return-void
.end method
