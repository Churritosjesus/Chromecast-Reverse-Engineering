.class public final Lbbh;
.super Landroid/content/BroadcastReceiver;
.source "PG"


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V
    .locals 0

    .prologue
    .line 452
    iput-object p1, p0, Lbbh;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 455
    const-string v0, "wifi_state"

    const/4 v1, 0x4

    .line 456
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 457
    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 458
    iget-object v0, p0, Lbbh;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-virtual {v0, p0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 459
    iget-object v0, p0, Lbbh;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->d(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Lbbn;

    move-result-object v0

    invoke-virtual {v0}, Lbbn;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbbh;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->d(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Lbbn;

    move-result-object v0

    invoke-virtual {v0}, Lbbn;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbbh;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    .line 460
    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->g(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 461
    iget-object v0, p0, Lbbh;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0, v2}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->b(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Z)Z

    .line 462
    iget-object v0, p0, Lbbh;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->h(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    .line 463
    iget-object v0, p0, Lbbh;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0, v2}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->a(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Z)Z

    .line 466
    :cond_0
    return-void
.end method
