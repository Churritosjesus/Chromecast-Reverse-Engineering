.class public final Lbbk;
.super Lua;
.source "PG"


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V
    .locals 0

    .prologue
    .line 259
    iput-object p1, p0, Lbbk;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-direct {p0}, Lua;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 280
    iget-object v0, p0, Lbbk;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->disconnectMirroring(Landroid/view/View;)V

    .line 281
    return-void
.end method

.method public final a(Ltz;Luh;)V
    .locals 0

    .prologue
    .line 263
    return-void
.end method

.method public final a(Luh;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 271
    iget-object v0, p0, Lbbk;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->b(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    .line 272
    iget-object v0, p0, Lbbk;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    iget-object v1, p0, Lbbk;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    sget v2, Lb;->ao:I

    invoke-virtual {v1, v2}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->a(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Ljava/lang/String;I)V

    .line 273
    iget-object v0, p0, Lbbk;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->d(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Lbbn;

    move-result-object v0

    .line 2231
    iget-object v1, p1, Luh;->m:Landroid/os/Bundle;

    .line 273
    invoke-static {v1}, Lcom/google/android/gms/cast/CastDevice;->a(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    move-result-object v1

    iget-object v2, p0, Lbbk;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    .line 274
    invoke-static {v2}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->c(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Landroid/app/PendingIntent;

    move-result-object v2

    .line 3168
    iget-object v3, v0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v3, :cond_0

    iget-object v3, v0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v3}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 3169
    sget-object v3, Lbvc;->c:Lbvf;

    iget-object v4, v0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 4000
    iget-object v5, v1, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 3169
    invoke-virtual {v3, v4, v5, v2}, Lbvf;->startMirroring(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Landroid/app/PendingIntent;)Lbwj;

    move-result-object v2

    new-instance v3, Lbbq;

    invoke-direct {v3, v0, v1}, Lbbq;-><init>(Lbbn;Lcom/google/android/gms/cast/CastDevice;)V

    .line 3170
    invoke-interface {v2, v3}, Lbwj;->a(Lbwn;)V

    .line 275
    :cond_0
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 4363
    iget-boolean v1, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->d:Z

    if-eq v6, v1, :cond_1

    .line 4364
    iput-boolean v6, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->d:Z

    .line 4370
    iget-object v1, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 4371
    const-string v2, "CAST_SCREEN_LAUNCHED"

    iget-boolean v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->d:Z

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 4372
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 276
    :cond_1
    return-void
.end method

.method public final b(Ltz;Luh;)V
    .locals 0

    .prologue
    .line 267
    return-void
.end method
