.class public final Lbbg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V
    .locals 0

    .prologue
    .line 436
    iput-object p1, p0, Lbbg;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 439
    iget-object v0, p0, Lbbg;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->f(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    .line 442
    iget-object v0, p0, Lbbg;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->d(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Lbbn;

    move-result-object v0

    invoke-virtual {v0}, Lbbn;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbbg;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->g(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 443
    iget-object v0, p0, Lbbg;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->h(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    .line 444
    iget-object v0, p0, Lbbg;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->i(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 445
    iget-object v0, p0, Lbbg;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->a(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;Z)Z

    .line 448
    :cond_0
    return-void
.end method
