.class public final Lbir;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbln;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 0

    .prologue
    .line 690
    iput-object p1, p0, Lbir;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 694
    iget-object v0, p0, Lbir;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->y()V

    .line 695
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 696
    :goto_0
    if-eqz v0, :cond_2

    .line 697
    iget-object v0, p0, Lbir;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-virtual {v0, p1}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->a_(Ljava/lang/String;)V

    .line 704
    :cond_0
    :goto_1
    return-void

    .line 695
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 698
    :cond_2
    iget-object v0, p0, Lbir;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 701
    new-instance v0, Lbgv;

    invoke-direct {v0}, Lbgv;-><init>()V

    .line 702
    iget-object v1, p0, Lbir;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    .line 1808
    iget-object v1, v1, Lm;->b:Lt;

    .line 702
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbgv;->a(Lr;Ljava/lang/String;)V

    goto :goto_1
.end method
