.class public final Lamx;
.super Landroid/content/BroadcastReceiver;
.source "PG"


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/MainActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V
    .locals 0

    .prologue
    .line 483
    iput-object p1, p0, Lamx;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 486
    const-string v0, "networkInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/NetworkInfo;

    .line 488
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v0

    .line 489
    iget-object v1, p0, Lamx;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v1}, Lblr;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 490
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/net/NetworkInfo$State;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    aput-object v1, v2, v5

    .line 491
    iget-object v2, p0, Lamx;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v2}, Lcom/google/android/apps/chromecast/app/MainActivity;->e(Lcom/google/android/apps/chromecast/app/MainActivity;)Lalm;

    move-result-object v2

    invoke-virtual {v2, v1}, Lalm;->a(Ljava/lang/String;)V

    .line 492
    iget-object v2, p0, Lamx;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v2}, Lcom/google/android/apps/chromecast/app/MainActivity;->f(Lcom/google/android/apps/chromecast/app/MainActivity;)Lbcn;

    move-result-object v2

    invoke-virtual {v2, v1}, Lbcn;->a(Ljava/lang/String;)V

    .line 493
    sget-object v1, Lamp;->a:[I

    invoke-virtual {v0}, Landroid/net/NetworkInfo$State;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 502
    iget-object v0, p0, Lamx;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0, v4}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;Z)Z

    .line 506
    :goto_0
    iget-object v0, p0, Lamx;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->i(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    .line 507
    return-void

    .line 495
    :pswitch_0
    iget-object v0, p0, Lamx;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->g(Lcom/google/android/apps/chromecast/app/MainActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 496
    iget-object v0, p0, Lamx;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->h(Lcom/google/android/apps/chromecast/app/MainActivity;)Layz;

    move-result-object v0

    .line 1181
    iput-boolean v4, v0, Layz;->c:Z

    .line 1182
    invoke-virtual {v0, v4}, Layz;->a(Z)V

    .line 1183
    iput-boolean v5, v0, Layz;->b:Z

    .line 1184
    invoke-virtual {v0}, Layz;->p()V

    .line 498
    :cond_0
    iget-object v0, p0, Lamx;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0, v5}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;Z)Z

    goto :goto_0

    .line 493
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
