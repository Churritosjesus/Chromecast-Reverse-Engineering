.class public final Lbiu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V
    .locals 0

    .prologue
    .line 828
    iput-object p1, p0, Lbiu;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 832
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbiu;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    .line 2915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 3443
    iget-boolean v0, v0, Lbdf;->w:Z

    .line 832
    if-eqz v0, :cond_1

    .line 833
    :cond_0
    iget-object v0, p0, Lbiu;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->k(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    .line 837
    :goto_0
    return-void

    .line 835
    :cond_1
    iget-object v0, p0, Lbiu;->a:Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;->l(Lcom/google/android/apps/chromecast/app/setup/DeviceSetupActivity;)V

    goto :goto_0
.end method
